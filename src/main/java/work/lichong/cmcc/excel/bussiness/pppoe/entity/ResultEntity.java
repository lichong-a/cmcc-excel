package work.lichong.cmcc.excel.bussiness.pppoe.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ric
 * @date 2021年12月07日 19:58
 * @website https://lichong.work
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResultEntity {

    /**
     * 地市
     */
    @ExcelProperty(value = "地市", index = 0)
    private String ds;
    /**
     * 宽带账号
     */
    @ExcelProperty(value = "宽带账号", index = 1)
    private String kdzh;
    /**
     * 分光器名称
     */
    @ExcelProperty(value = "分光器名称", index = 2)
    private String fgqmc;
    /**
     * 分光器网元内部编码
     */
    @ExcelProperty(value = "分光器网元内部编码", index = 3)
    private String fgqwynbbm;
    /**
     * 分光器端口名称
     */
    @ExcelProperty(value = "分光器端口名称", index = 4)
    private String fgqdkmc;
    /**
     * 分光器端口网元内部编码
     */
    @ExcelProperty(value = "分光器端口网元内部编码", index = 5)
    private String fgqdkwynbbm;

    public void setDs(String ds) {
        this.ds = ds.trim();
    }

    public void setKdzh(String kdzh) {
        this.kdzh = kdzh.trim();
    }

    public void setFgqmc(String fgqmc) {
        this.fgqmc = fgqmc.trim();
    }

    public void setFgqwynbbm(String fgqwynbbm) {
        this.fgqwynbbm = fgqwynbbm.trim();
    }

    public void setFgqdkmc(String fgqdkmc) {
        this.fgqdkmc = fgqdkmc.trim();
    }

    public void setFgqdkwynbbm(String fgqdkwynbbm) {
        this.fgqdkwynbbm = fgqdkwynbbm.trim();
    }
}
