package work.lichong.cmcc.excel.bussiness.pppoe.entity;

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
 * 第一步，PPPOE+和综资差异明细表格
 *
 * @author ric
 * @date 2021年11月30日 23:35
 * @website https://lichong.work
 */
@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PppoeEntity {

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
     * 客户表宽带账号
     */
    @ExcelProperty(value = "客户表宽带账号")
    private String khbkdzh;
    /**
     * 话单宽带账号
     */
    @ExcelProperty(value = "话单宽带账号")
    private String hdkdzh;
    /**
     * 话单IP
     */
    @ExcelProperty(value = "话单IP")
    private String hdIp;
    /**
     * 话单PON口
     */
    @ExcelProperty(value = "话单PON口")
    private String hdPon;
    /**
     * IP
     */
    @ExcelProperty(value = "IP")
    private String ip;
    /**
     * PON口
     */
    @ExcelProperty(value = "PON口")
    private String pon;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) {
            return false;
        }
        PppoeEntity that = (PppoeEntity) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

    public void setDs(String ds) {
        this.ds = Objects.nonNull(ds) ? ds.trim() : "";
    }

    public void setQx(String qx) {
        this.qx = Objects.nonNull(qx) ? qx.trim() : "";
    }

    public void setXqId(String xqId) {
        this.xqId = Objects.nonNull(xqId) ? xqId.trim() : "";
    }

    public void setXqmc(String xqmc) {
        this.xqmc = Objects.nonNull(xqmc) ? xqmc.trim() : "";
    }

    public void setKhbkdzh(String khbkdzh) {
        this.khbkdzh = Objects.nonNull(khbkdzh) ? khbkdzh.trim() : "";
    }

    public void setHdkdzh(String hdkdzh) {
        this.hdkdzh = Objects.nonNull(hdkdzh) ? hdkdzh.trim() : "";
    }

    public void setHdIp(String hdIp) {
        this.hdIp = Objects.nonNull(hdIp) ? hdIp.trim() : "";
    }

    public void setHdPon(String hdPon) {
        this.hdPon = Objects.nonNull(hdPon) ? hdPon.trim() : "";
    }

    public void setIp(String ip) {
        this.ip = Objects.nonNull(ip) ? ip.trim() : "";
    }

    public void setPon(String pon) {
        this.pon = Objects.nonNull(pon) ? pon.trim() : "";
    }
}
