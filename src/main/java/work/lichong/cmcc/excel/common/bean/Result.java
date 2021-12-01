package work.lichong.cmcc.excel.common.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import work.lichong.cmcc.excel.common.result.ResponseStatus;

/**
 * 统一返回结果
 *
 * @author ric
 * @date 2021/9/4 16:45
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Result<T> {

    public Result(ResponseStatus status){
        this(status.getStatus(), status.getMessage());
    }

    public Result(ResponseStatus status, T data){
        this(status.getStatus(), status.getMessage(), data);
    }

    public Result(ResponseStatus status, String message){
        this(status.getStatus(), message);
    }

    public Result(ResponseStatus status, String message, T data){
        this(status.getStatus(), message, data);
    }

    @NonNull
    private Integer code;

    @NonNull
    private String message;

    private T data;

}
