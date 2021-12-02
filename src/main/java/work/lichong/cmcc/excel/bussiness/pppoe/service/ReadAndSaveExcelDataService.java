package work.lichong.cmcc.excel.bussiness.pppoe.service;

import com.alibaba.excel.EasyExcelFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import work.lichong.cmcc.excel.bussiness.pppoe.dao.*;
import work.lichong.cmcc.excel.bussiness.pppoe.entity.*;
import work.lichong.cmcc.excel.bussiness.pppoe.listener.*;
import work.lichong.cmcc.excel.common.exception.ExportException;
import work.lichong.cmcc.excel.common.result.ResponseStatus;

/**
 * @author ric
 * @date 2021年12月01日 23:13
 * @website https://lichong.work
 */
@Service
public class ReadAndSaveExcelDataService {

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


    public void readPppoe(MultipartFile file) throws ExportException {
        try {
            pppoeRepository.deleteAll();
            // 这里 需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭
            EasyExcelFactory.read(file.getInputStream(), PppoeEntity.class, new PppoeExcelDataListener(pppoeRepository)).sheet().doRead();
        } catch (Exception e) {
            throw new ExportException(ResponseStatus.RESPONSE_5XX_INTERNAL_SERVER_ERROR, e);
        }
    }

    public void readOltResult(MultipartFile file) throws ExportException {
        try {
            oltResultRepository.deleteAll();
            // 这里 需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭
            EasyExcelFactory.read(file.getInputStream(), OltResultEntity.class, new OltResultExcelDataListener(oltResultRepository)).sheet().doRead();
        } catch (Exception e) {
            throw new ExportException(ResponseStatus.RESPONSE_5XX_INTERNAL_SERVER_ERROR, e);
        }
    }

    public void readOnuResult(MultipartFile file) throws ExportException {
        try {
            onuResultRepository.deleteAll();
            // 这里 需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭
            EasyExcelFactory.read(file.getInputStream(), OnuResultEntity.class, new OnuResultExcelDataListener(onuResultRepository)).sheet().doRead();
        } catch (Exception e) {
            throw new ExportException(ResponseStatus.RESPONSE_5XX_INTERNAL_SERVER_ERROR, e);
        }
    }

    public void readFgqResult(MultipartFile file) throws ExportException {
        try {
            fgqResultRepository.deleteAll();
            // 这里 需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭
            EasyExcelFactory.read(file.getInputStream(), FgqResultEntity.class, new FgpResultExcelDataListener(fgqResultRepository)).sheet().doRead();
        } catch (Exception e) {
            throw new ExportException(ResponseStatus.RESPONSE_5XX_INTERNAL_SERVER_ERROR, e);
        }
    }

    public void readFgqPortResult(MultipartFile file) throws ExportException {
        try {
            fgqPortResultRepository.deleteAll();
            // 这里 需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭
            EasyExcelFactory.read(file.getInputStream(), FgqPortResultEntity.class, new FgpPortResultExcelDataListener(fgqPortResultRepository)).sheet().doRead();
        } catch (Exception e) {
            throw new ExportException(ResponseStatus.RESPONSE_5XX_INTERNAL_SERVER_ERROR, e);
        }
    }
}
