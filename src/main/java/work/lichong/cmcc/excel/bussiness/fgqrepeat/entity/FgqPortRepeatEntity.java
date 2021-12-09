package work.lichong.cmcc.excel.bussiness.fgqrepeat.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

/**
 * @author ric
 * @date 2021年12月09日 20:21
 * @website https://lichong.work
 */
@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FgqPortRepeatEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ExcelIgnore
    private Long id;

    /**
     * 地市
     */
    @ExcelProperty(value = "地市")
    private String ds;
    /**
     * 区县
     */
    @ExcelProperty(value = "区县")
    private String qx;
    /**
     * 营销区域
     */
    @ExcelProperty(value = "营销区域")
    private String yxqy;
    /**
     * 小区ID
     */
    @ExcelProperty(value = "小区ID")
    private String xqId;
    /**
     * 小区名称
     */
    @ExcelProperty(value = "小区名称")
    private String xqmc;
    /**
     * 分光器端口ID
     */
    @ExcelProperty(value = "分光器端口ID")
    private String fgqdkid;
    /**
     * 分光器端口名称
     */
    @ExcelProperty(value = "分光器端口名称")
    private String fgqdkmc;
    /**
     * 被占用名称
     */
    @ExcelProperty(value = "被占用名称")
    private String bzymc;
    /**
     * 被占用ID
     */
    @ExcelProperty(value = "被占用ID")
    private String bzyid;
    /**
     * 被占用的模型
     */
    @ExcelProperty(value = "被占用的模型")
    private String bzydmx;
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) {
            return false;
        }
        FgqPortRepeatEntity that = (FgqPortRepeatEntity) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

    public void setDs(String ds) {
        this.ds = ds.trim();
    }

    public void setQx(String qx) {
        this.qx = qx.trim();
    }

    public void setYxqy(String yxqy) {
        this.yxqy = yxqy.trim();
    }

    public void setXqId(String xqId) {
        this.xqId = xqId.trim();
    }

    public void setXqmc(String xqmc) {
        this.xqmc = xqmc.trim();
    }

    public void setFgqdkid(String fgqdkid) {
        this.fgqdkid = fgqdkid.trim();
    }

    public void setFgqdkmc(String fgqdkmc) {
        this.fgqdkmc = fgqdkmc.trim();
    }

    public void setBzymc(String bzymc) {
        this.bzymc = bzymc.trim();
    }

    public void setBzyid(String bzyid) {
        this.bzyid = bzyid.trim();
    }

    public void setBzydmx(String bzydmx) {
        this.bzydmx = bzydmx.trim();
    }
}
