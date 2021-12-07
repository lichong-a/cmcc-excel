package work.lichong.cmcc.excel.bussiness.pppoe.service;

import com.alibaba.excel.EasyExcelFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import work.lichong.cmcc.excel.bussiness.pppoe.dao.*;
import work.lichong.cmcc.excel.bussiness.pppoe.entity.*;
import work.lichong.cmcc.excel.common.exception.ExportException;
import work.lichong.cmcc.excel.common.result.ResponseStatus;

import javax.servlet.http.HttpServletResponse;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * @author ric
 * @date 2021年12月06日 23:19
 * @website https://lichong.work
 */
@Service
public class ExportExcelService {

    @Autowired
    PppoeRepository pppoeRepository;
    @Autowired
    OltResultRepository oltResultRepository;
    @Autowired
    OnuResultRepository onuResultRepository;
    @Autowired
    FgqResultRepository fgqResultRepository;
    @Autowired
    FgqPortResultRepository fgqPortResultRepository;

    private Set<ResultEntity> computeResults() {
        Set<ResultEntity> results = new HashSet<>();
        List<PppoeEntity> pppoes = pppoeRepository.findAll();
        pppoes.forEach(pppoe -> {
            ResultEntity result = new ResultEntity();
            // 地市
            result.setDs(pppoe.getDs());
            // 宽带账号
            result.setKdzh(pppoe.getKhbkdzh());
            // 话单ip
            String hdIp = pppoe.getHdIp();
            // 话单PON口
            String hdPon = pppoe.getHdPon();
            // 根据话单ip在第二个表格找到中文名称
            Example<OltResultEntity> oltResultEntityExample = Example.of(OltResultEntity
                    .builder()
                    .ip(hdIp)
                    .build());
            Optional<OltResultEntity> oltOptional = oltResultRepository.findOne(oltResultEntityExample);
            oltOptional.ifPresent(olt -> {
                // 中文名称
                String zwmc = olt.getZwmc();
                // 在第三步Excel中，根据《之前的中文名称》《话单PON口》得出《端口名称》
                Example<OnuResultEntity> onuResultEntityExample = Example.of(OnuResultEntity
                        .builder()
                        .sssbmc(zwmc)
                        .dkbh(hdPon)
                        .build());
                Optional<OnuResultEntity> onuOptional = onuResultRepository.findOne(onuResultEntityExample);
                onuOptional.ifPresent(onu -> {
                    // 端口名称
                    String dkmc = onu.getDkmc();
                    // 在第四步Excel中，根据《端口名称》查询《网元状态》（在网）并且《级别》（二级）的《资管中文名称》和《网元编码》，得出任意一个即可
                    Example<FgqResultEntity> fgqResultEntityExample = Example.of(FgqResultEntity
                            .builder()
                            .zyoltPon(dkmc)
                            .wyzt("在网")
                            .jb("二级")
                            .build());
                    Optional<FgqResultEntity> fgqOptional = fgqResultRepository.findOne(fgqResultEntityExample);
                    fgqOptional.ifPresent(fgq -> {
                        // 资管中文名称
                        String zgzwmc = fgq.getZgzwmc();
                        // 网元内部编码
                        String wynbbm = fgq.getWynbbm();
                        result.setFgqmc(zgzwmc);
                        result.setFgqwynbbm(wynbbm);
                        // 根据找到的分光器，在第五步Excel中筛选其中《端口状态》为空闲的分光器端口，最终得出任意一空闲端口即可。得到《名称》和《网元编码》。如果没有空闲口，返回上一步重新运行
                        Example<FgqPortResultEntity> fgqPortResultEntityExample = Example.of(FgqPortResultEntity
                                .builder()
                                .wynbbm(wynbbm)
                                .dkzt("空闲")
                                .build());
                        Optional<FgqPortResultEntity> fgqPortOptional = fgqPortResultRepository.findOne(fgqPortResultEntityExample);
                        fgqPortOptional.ifPresent(fgqPort -> {
                            result.setFgqdkmc(fgqPort.getMc());
                            result.setFgqdkwynbbm(fgqPort.getWynbbm());
                            results.add(result);
                        });
                    });
                });
            });
        });
        return results;
    }
    
    public void exportPppoeResult(HttpServletResponse response) throws ExportException {
    	try {
	    	response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
	        response.setCharacterEncoding("utf-8");
	        // 这里URLEncoder.encode可以防止中文乱码
	        String fileName;
			fileName = URLEncoder.encode("结果", StandardCharsets.UTF_8).replace("\\+", "%20");
	        response.setHeader("Content-disposition", "attachment;filename*=" + fileName + ".xlsx");
            EasyExcelFactory.write(response.getOutputStream(), ResultEntity.class).sheet("结果").doWrite(computeResults());
    	} catch (Exception e) {
			throw new ExportException(ResponseStatus.RESPONSE_5XX_INTERNAL_SERVER_ERROR, e);
		}
    }
}
