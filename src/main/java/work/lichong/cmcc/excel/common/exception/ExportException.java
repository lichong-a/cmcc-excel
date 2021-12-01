package work.lichong.cmcc.excel.common.exception;

import work.lichong.cmcc.excel.common.result.ResponseStatus;

/**
 * excel操作统一异常
 *
 * @author lchong
 * @date 2021/10/28 16:24
 */
public class ExportException extends Exception {

    private final int status;

    public ExportException(ResponseStatus responseStatus) {
        super(responseStatus.getMessage());
        this.status = responseStatus.getStatus();
    }

    public ExportException(ResponseStatus responseStatus, Throwable cause) {
        super(responseStatus.getMessage(), cause);
        this.status = responseStatus.getStatus();
    }

    public int getStatus() {
        return status;
    }

}
