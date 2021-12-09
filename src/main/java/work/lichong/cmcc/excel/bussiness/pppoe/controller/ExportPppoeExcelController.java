package work.lichong.cmcc.excel.bussiness.pppoe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import work.lichong.cmcc.excel.bussiness.pppoe.service.ExportExcelService;
import work.lichong.cmcc.excel.common.bean.Result;
import work.lichong.cmcc.excel.common.exception.ExportException;
import work.lichong.cmcc.excel.common.result.ResponseStatus;
import work.lichong.cmcc.excel.common.utils.ResponseUtil;

import javax.servlet.http.HttpServletResponse;

/**
 * @author ric
 * @date 2021年12月07日 23:24
 * @website https://lichong.work
 */
@RestController
@RequestMapping("/api/export")
public class ExportPppoeExcelController {

    @Autowired
    ExportExcelService exportExcelService;

    @PostMapping("/pppoe")
    public String exportPppoeExcel(HttpServletResponse response) throws ExportException {
        exportExcelService.exportPppoeResult(response);
        return ResponseUtil.toString(new Result<>(ResponseStatus.RESPONSE_2XX_OK));
    }
}
