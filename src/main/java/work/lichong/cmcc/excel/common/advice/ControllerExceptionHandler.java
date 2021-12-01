package work.lichong.cmcc.excel.common.advice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import work.lichong.cmcc.excel.common.bean.Result;
import work.lichong.cmcc.excel.common.exception.ExportException;
import work.lichong.cmcc.excel.common.result.ResponseStatus;
import work.lichong.cmcc.excel.common.utils.ResponseUtil;
import work.lichong.cmcc.excel.consts.CheckConstant;

/**
 * 统一异常拦截
 *
 * @author lchong
 * @date 2021/10/28 16:24
 */
@ControllerAdvice
@EnableWebMvc
@Slf4j
public class ControllerExceptionHandler {

    @ExceptionHandler(ExportException.class)
    @ResponseBody
    String handleParseException(ExportException e) {
        log.error(CheckConstant.EXPORT_EXCEL_ERROR, e);
        Result<String> result = new Result<>(ResponseStatus.RESPONSE_5XX_INTERNAL_SERVER_ERROR, CheckConstant.EXPORT_EXCEL_ERROR);
        return ResponseUtil.toString(result, true);
    }

}
