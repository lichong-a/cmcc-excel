package work.lichong.cmcc.excel.bussiness.fgqrepeat.service;

import com.alibaba.excel.EasyExcelFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import work.lichong.cmcc.excel.bussiness.fgqrepeat.dao.FgqPortRepeatRepository;
import work.lichong.cmcc.excel.bussiness.fgqrepeat.entity.FgqPortRepeatEntity;
import work.lichong.cmcc.excel.bussiness.fgqrepeat.listener.FgqPortRepeatExcelDataListener;
import work.lichong.cmcc.excel.common.exception.ExportException;
import work.lichong.cmcc.excel.common.result.ResponseStatus;

/**
 * @author ric
 * @date 2021年12月01日 23:13
 * @website https://lichong.work
 */
@Service
public class ReadAndSaveFgqExcelDataService {

    @Autowired
    FgqPortRepeatRepository fgqPortRepeatRepository;

    public void readFgqPortRepeat(MultipartFile file) throws ExportException {
        try {
            fgqPortRepeatRepository.deleteAll();
            EasyExcelFactory.read(file.getInputStream(), FgqPortRepeatEntity.class, new FgqPortRepeatExcelDataListener(fgqPortRepeatRepository)).sheet().doRead();
        } catch (Exception e) {
            throw new ExportException(ResponseStatus.RESPONSE_5XX_INTERNAL_SERVER_ERROR, e);
        }
    }
}
