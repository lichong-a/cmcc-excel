package work.lichong.cmcc.excel.bussiness.fgqrepeat.service;

import cn.hutool.core.collection.CollUtil;
import com.alibaba.excel.EasyExcelFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;
import work.lichong.cmcc.excel.bussiness.fgqrepeat.dao.FgqPortRepeatRepository;
import work.lichong.cmcc.excel.bussiness.fgqrepeat.entity.FgqPortRepeatEntity;
import work.lichong.cmcc.excel.bussiness.pppoe.dao.FgqPortResultRepository;
import work.lichong.cmcc.excel.bussiness.pppoe.dao.FgqResultRepository;
import work.lichong.cmcc.excel.bussiness.pppoe.entity.FgqPortResultEntity;
import work.lichong.cmcc.excel.bussiness.pppoe.entity.FgqResultEntity;
import work.lichong.cmcc.excel.bussiness.pppoe.entity.ResultEntity;
import work.lichong.cmcc.excel.common.exception.ExportException;
import work.lichong.cmcc.excel.common.result.ResponseStatus;

import javax.servlet.http.HttpServletResponse;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author ric
 * @date 2021年12月06日 23:19
 * @website https://lichong.work
 */
@Service
public class ExportFgqExcelService {

    @Autowired
    FgqPortRepeatRepository fgqPortRepeatRepository;
    @Autowired
    FgqResultRepository fgqResultRepository;
    @Autowired
    FgqPortResultRepository fgqPortResultRepository;

    private Set<ResultEntity> computeResults() {
        Set<ResultEntity> results = new HashSet<>();
        List<FgqPortRepeatEntity> fgqPortRepeats = fgqPortRepeatRepository.findAll();
        fgqPortRepeats.parallelStream().forEach(fgqPortRepeat -> {
            ResultEntity result = new ResultEntity();
            // 地市
            result.setDs(fgqPortRepeat.getDs());
            // 宽带账号
            result.setKdzh(fgqPortRepeat.getBzymc());
            // 分光器端口名称
            String fgqdkmc = fgqPortRepeat.getFgqdkmc();
            // 根据《分光器端口名称》在第二步Excel中的查到对应的所属设备名称
            Example<FgqPortResultEntity> fgqPortResultEntityExample = Example.of(FgqPortResultEntity
                    .builder()
                    .mc(fgqdkmc)
                    .build());
            List<FgqPortResultEntity> fgqPorts = fgqPortResultRepository.findAll(fgqPortResultEntityExample);
            if (CollUtil.isEmpty(fgqPorts)) {
                return;
            }
            FgqPortResultEntity fgqPort = fgqPorts.get(0);
            // 然后根据查到的分光器资管中文名称（即之前的所属设备名称）确定《主用OLT的PON端口》
            String sssbmc = fgqPort.getSssbmc();
            Example<FgqResultEntity> fgqResultEntityExample = Example.of(FgqResultEntity
                    .builder()
                    .zgzwmc(sssbmc)
                    .build());
            List<FgqResultEntity> fgqs = fgqResultRepository.findAll(fgqResultEntityExample);
            if (CollUtil.isEmpty(fgqs)) {
                return;
            }
            FgqResultEntity fgq = fgqs.get(0);
            // 主用OLT的PON端口
            String zyoltPon = fgq.getZyoltPon();
            // 根据《主用OLT的PON端口》在第三步的Excel里筛选下带的二级分光器《资管中文名称》和对应的《网元编码》
            Example<FgqResultEntity> fgqResultEntityExample2 = Example.of(FgqResultEntity
                    .builder()
                    .zyoltPon(zyoltPon)
                    .jb("二级")
                    .build());
            List<FgqResultEntity> fgqs2 = fgqResultRepository.findAll(fgqResultEntityExample2);
            if (CollUtil.isEmpty(fgqs2)) {
                return;
            }
            for (FgqResultEntity fgq2 : fgqs2) {
                // 资管中文名称
                String zgzwmc = fgq2.getZgzwmc();
                // 分光器的网元内部编码
                String fgqWynbbm = fgq2.getWynbbm();
                result.setFgqmc(zgzwmc);
                result.setFgqwynbbm(fgqWynbbm);
                // 根据找到的分光器，在第五步Excel中筛选其中《端口状态》为空闲的分光器端口，最终得出任意一空闲端口即可。得到《名称》和《网元编码》。如果没有空闲口，返回上一步重新运行
                ExampleMatcher matcher = ExampleMatcher.matching().withMatcher("zgzwmc",ExampleMatcher.GenericPropertyMatchers.startsWith());
                Example<FgqPortResultEntity> fgqPortResultEntityExample2 = Example.of(FgqPortResultEntity
                        .builder()
                        .zgzwmc(zgzwmc)
                        .dkzt("空闲")
                        .build(), matcher);
                List<FgqPortResultEntity> fgqPorts2 = fgqPortResultRepository.findAll(fgqPortResultEntityExample2);
                if (CollUtil.isEmpty(fgqPorts2)) {
                    continue;
                }
                FgqPortResultEntity fgqPort2 = fgqPorts2.get(0);
                result.setFgqdkmc(fgqPort2.getMc());
                result.setFgqdkwynbbm(fgqPort2.getWynbbm());
                results.add(result);
            }
        });
        return results;
    }
    
    public void exportFgqPortRepeatResult(HttpServletResponse response) throws ExportException {
    	try {
	    	response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
	        response.setCharacterEncoding("utf-8");
	        // 这里URLEncoder.encode可以防止中文乱码
	        String fileName;
			fileName = URLEncoder.encode("分光器端口重复-结果", StandardCharsets.UTF_8).replace("\\+", "%20");
	        response.setHeader("Content-disposition", "attachment;filename*=" + fileName + ".xlsx");
            EasyExcelFactory.write(response.getOutputStream(), ResultEntity.class).sheet("结果").doWrite(computeResults());
    	} catch (Exception e) {
			throw new ExportException(ResponseStatus.RESPONSE_5XX_INTERNAL_SERVER_ERROR, e);
		}
    }

}
