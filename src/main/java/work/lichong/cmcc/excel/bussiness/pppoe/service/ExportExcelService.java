package work.lichong.cmcc.excel.bussiness.pppoe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import work.lichong.cmcc.excel.bussiness.pppoe.dao.*;

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

}
