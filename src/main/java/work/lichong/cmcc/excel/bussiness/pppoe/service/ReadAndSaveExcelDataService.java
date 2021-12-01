package work.lichong.cmcc.excel.bussiness.pppoe.service;

import com.alibaba.excel.EasyExcelFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import work.lichong.cmcc.excel.bussiness.pppoe.dao.PppoeRepository;
import work.lichong.cmcc.excel.bussiness.pppoe.entity.PppoeEntity;
import work.lichong.cmcc.excel.bussiness.pppoe.listener.PppoeExcelDataListener;

import java.io.File;

/**
 * @author ric
 * @date 2021年12月01日 23:13
 * @website https://lichong.work
 */
@Service
public class ReadAndSaveExcelDataService {

    @Autowired
    PppoeRepository repository;

    public void readPppoe() {
        repository.deleteAll();
        String fileName = "D:" + File.separator +
                "李冲" + File.separator +
                "Documents" + File.separator +
                "work" + File.separator +
                "中移铁通Excel数据处理并整合导出研发项目" + File.separator +
                "PPPOE+差异" + File.separator +
                "第一步，PPPOE+和综资差异明细.xls";
        // 这里 需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭
        EasyExcelFactory.read(fileName, PppoeEntity.class, new PppoeExcelDataListener(repository)).sheet().doRead();
    }
}
