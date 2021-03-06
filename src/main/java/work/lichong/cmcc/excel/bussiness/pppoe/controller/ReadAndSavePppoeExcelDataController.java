package work.lichong.cmcc.excel.bussiness.pppoe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import work.lichong.cmcc.excel.bussiness.pppoe.service.ReadAndSaveExcelDataService;
import work.lichong.cmcc.excel.common.bean.Result;
import work.lichong.cmcc.excel.common.exception.ExportException;
import work.lichong.cmcc.excel.common.result.ResponseStatus;
import work.lichong.cmcc.excel.common.utils.ResponseUtil;

import javax.servlet.http.HttpServletResponse;

/**
 * @author ric
 * @date 2021年12月01日 23:21
 * @website https://lichong.work
 */
@RestController
@RequestMapping("/api/read")
public class ReadAndSavePppoeExcelDataController {

    @Autowired
    ReadAndSaveExcelDataService service;

    @PostMapping("/pppoe/1")
    public String readPppoeExcel(HttpServletResponse response, @RequestParam("file") MultipartFile file) throws ExportException {
        service.readPppoe(file);
        return ResponseUtil.toString(new Result<>(ResponseStatus.RESPONSE_2XX_OK, "1"));
    }

    @PostMapping("/pppoe/2")
    public String readOltResultExcel(HttpServletResponse response, @RequestParam("file") MultipartFile file) throws ExportException {
        service.readOltResult(file);
        return ResponseUtil.toString(new Result<>(ResponseStatus.RESPONSE_2XX_OK, "2"));
    }

    @PostMapping("/pppoe/3")
    public String readOnuResultExcel(HttpServletResponse response, @RequestParam("file") MultipartFile file) throws ExportException {
        service.readOnuResult(file);
        return ResponseUtil.toString(new Result<>(ResponseStatus.RESPONSE_2XX_OK, "3"));
    }

    @PostMapping("/pppoe/4")
    public String readFgqResultExcel(HttpServletResponse response, @RequestParam("file") MultipartFile file) throws ExportException {
        service.readFgqResult(file);
        return ResponseUtil.toString(new Result<>(ResponseStatus.RESPONSE_2XX_OK, "4"));
    }

    @PostMapping("/pppoe/5")
    public String readFgqPortResultExcel(HttpServletResponse response, @RequestParam("file") MultipartFile file) throws ExportException {
        service.readFgqPortResult(file);
        return ResponseUtil.toString(new Result<>(ResponseStatus.RESPONSE_2XX_OK, "5"));
    }
}
