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
     * 地区
     */
    @ExcelProperty(value = "地区", index = 0)
    private String dq;
    /**
     * 区县
     */
    @ExcelProperty(value = "区县", index = 1)
    private String qx;
    /**
     * 小区ID
     */
    @ExcelProperty(value = "小区ID", index = 2)
    private String xqId;
    /**
     * 小区名称
     */
    @ExcelProperty(value = "小区名称", index = 3)
    private String xqmc;
    /**
     * 客户表宽带账号
     */
    @ExcelProperty(value = "客户表宽带账号", index = 4)
    private String khbkdzh;
    /**
     * 话单宽带账号
     */
    @ExcelProperty(value = "话单宽带账号", index = 5)
    private String hdkdzh;
    /**
     * 话单IP
     */
    @ExcelProperty(value = "话单IP", index = 6)
    private String hdIp;
    /**
     * 话单PON口
     */
    @ExcelProperty(value = "话单PON口", index = 7)
    private String hdPon;
    /**
     * IP
     */
    @ExcelProperty(value = "IP", index = 8)
    private String ip;
    /**
     * PON口
     */
    @ExcelProperty(value = "PON口", index = 9)
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
}
