package work.lichong.cmcc.excel.bussiness.fgqrepeat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import work.lichong.cmcc.excel.bussiness.fgqrepeat.service.ReadAndSaveFgqExcelDataService;
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
public class ReadAndSaveFgqExcelDataController {

    @Autowired
    ReadAndSaveFgqExcelDataService service;

    @PostMapping("/fgqPortRepeat/1")
    public String readFgqPortRepeatExcel(HttpServletResponse response, @RequestParam("file") MultipartFile file) throws ExportException {
        service.readFgqPortRepeat(file);
        return ResponseUtil.toString(new Result<>(ResponseStatus.RESPONSE_2XX_OK, "1"));
    }

}
