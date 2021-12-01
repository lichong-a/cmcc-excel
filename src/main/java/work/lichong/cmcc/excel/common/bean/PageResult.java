package work.lichong.cmcc.excel.common.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 统一分页处理
 *
 * @author ric
 * @date 2021/9/4 16:44
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageResult <T>{

    private long total;

    private List<T> rows;
}
