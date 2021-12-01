package work.lichong.cmcc.excel.bussiness.pppoe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import work.lichong.cmcc.excel.bussiness.pppoe.service.ReadAndSaveExcelDataService;

/**
 * @author ric
 * @date 2021年12月01日 23:21
 * @website https://lichong.work
 */
@RestController
@RequestMapping("/read")
public class ReadAndSaveExcelDataController {

    @Autowired
    ReadAndSaveExcelDataService service;

    @GetMapping("/pppoe/1")
    public String readPppoeExcel(){
        service.readPppoe();
        return "success";
    }
}
