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
 * 第五步、分光器端口的配置查询结果
 *
 * @author ric
 * @date 2021年12月02日 20:10
 * @website https://lichong.work
 */
@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FgqPortResultEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ExcelIgnore
    private Long id;
    /**
     * 网元内部编码
     */
    @ExcelProperty(value = "网元内部编码", index = 0)
    private String wynbbm;
    /**
     * 所属地市
     */
    @ExcelProperty(value = "所属地市", index = 1)
    private String ssds;
    /**
     * 所属区县
     */
    @ExcelProperty(value = "所属区县", index = 2)
    private String ssqx;
    /**
     * 所属营销区域
     */
    @ExcelProperty(value = "所属营销区域", index = 3)
    private String ssyxqy;
    /**
     * 所属设备名称
     */
    @ExcelProperty(value = "所属设备名称", index = 4)
    private String sssbmc;
    /**
     * 名称
     */
    @ExcelProperty(value = "名称", index = 5)
    private String mc;
    /**
     * 端口编号
     */
    @ExcelProperty(value = "端口编号", index = 6)
    private String dkbh;
    /**
     * 端口序列号
     */
    @ExcelProperty(value = "端口序列号", index = 7)
    private String dkxlh;
    /**
     * 行
     */
    @ExcelProperty(value = "行", index = 8)
    private String hang;
    /**
     * 列
     */
    @ExcelProperty(value = "列", index = 9)
    private String lie;
    /**
     * 资管中文名称
     */
    @ExcelProperty(value = "资管中文名称", index = 10)
    private String zgzwmc;
    /**
     * 端口用途
     */
    @ExcelProperty(value = "端口用途", index = 11)
    private String dkyt;
    /**
     * 端口状态
     */
    @ExcelProperty(value = "端口状态", index = 12)
    private String dkzt;
    /**
     * 端口维护状态
     */
    @ExcelProperty(value = "端口维护状态", index = 13)
    private String dkwhzt;
    /**
     * 清查次数
     */
    @ExcelProperty(value = "清查次数", index = 14)
    private String qccs;
    /**
     * 采集名称
     */
    @ExcelProperty(value = "采集名称", index = 15)
    private String sjmc;
    /**
     * 时间戳
     */
    @ExcelProperty(value = "时间戳", index = 16)
    private String sjc;
    /**
     * 网元内部编码
     */
    @ExcelProperty(value = "网元内部编码", index = 17)
    private String wynbbm2;
    /**
     * 创建人
     */
    @ExcelProperty(value = "创建人", index = 18)
    private String cjr;
    /**
     * 创建时间
     */
    @ExcelProperty(value = "创建时间", index = 19)
    private String cjsj;
    /**
     * 修改人
     */
    @ExcelProperty(value = "修改人", index = 20)
    private String xgr;
    /**
     * 修改时间
     */
    @ExcelProperty(value = "修改时间", index = 21)
    private String xgsj;
    /**
     * 是否合格
     */
    @ExcelProperty(value = "是否合格", index = 22)
    private String sfsd;
    /**
     * 错误类型
     */
    @ExcelProperty(value = "错误类型", index = 23)
    private String cwlx;
    /**
     * 数据质量责任人(工程)
     */
    @ExcelProperty(value = "数据质量责任人(工程)", index = 24)
    private String sjzlzrrgc;
    /**
     * 数据质量责任人(地市)
     */
    @ExcelProperty(value = "数据质量责任人(地市)", index = 25)
    private String sjzlzrrds;
    /**
     * 数据质量责任人(区县)
     */
    @ExcelProperty(value = "数据质量责任人(区县)", index = 26)
    private String sjzlzrrqx;
    /**
     * 是否有过拆机
     */
    @ExcelProperty(value = "是否有过拆机", index = 27)
    private String sfygcj;
    /**
     * 一线数据维护人（代维一线）
     */
    @ExcelProperty(value = "一线数据维护人（代维一线）", index = 28)
    private String yxsjwhr;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) {
            return false;
        }
        FgqPortResultEntity that = (FgqPortResultEntity) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

    public void setSsds(String ssds) {
        this.ssds = ssds.trim();
    }

    public void setSsqx(String ssqx) {
        this.ssqx = ssqx.trim();
    }

    public void setSsyxqy(String ssyxqy) {
        this.ssyxqy = ssyxqy.trim();
    }

    public void setSssbmc(String sssbmc) {
        this.sssbmc = sssbmc.trim();
    }

    public void setMc(String mc) {
        this.mc = mc.trim();
    }

    public void setDkbh(String dkbh) {
        this.dkbh = dkbh.trim();
    }

    public void setDkxlh(String dkxlh) {
        this.dkxlh = dkxlh.trim();
    }

    public void setHang(String hang) {
        this.hang = hang.trim();
    }

    public void setLie(String lie) {
        this.lie = lie.trim();
    }

    public void setZgzwmc(String zgzwmc) {
        this.zgzwmc = zgzwmc.trim();
    }

    public void setDkyt(String dkyt) {
        this.dkyt = dkyt.trim();
    }

    public void setDkzt(String dkzt) {
        this.dkzt = dkzt.trim();
    }

    public void setDkwhzt(String dkwhzt) {
        this.dkwhzt = dkwhzt.trim();
    }

    public void setQccs(String qccs) {
        this.qccs = qccs.trim();
    }

    public void setSjmc(String sjmc) {
        this.sjmc = sjmc.trim();
    }

    public void setSjc(String sjc) {
        this.sjc = sjc.trim();
    }

    public void setWynbbm(String wynbbm) {
        this.wynbbm = wynbbm.trim();
    }

    public void setCjr(String cjr) {
        this.cjr = cjr.trim();
    }

    public void setCjsj(String cjsj) {
        this.cjsj = cjsj.trim();
    }

    public void setXgr(String xgr) {
        this.xgr = xgr.trim();
    }

    public void setXgsj(String xgsj) {
        this.xgsj = xgsj.trim();
    }

    public void setSfsd(String sfsd) {
        this.sfsd = sfsd.trim();
    }

    public void setCwlx(String cwlx) {
        this.cwlx = cwlx.trim();
    }

    public void setSjzlzrrgc(String sjzlzrrgc) {
        this.sjzlzrrgc = sjzlzrrgc.trim();
    }

    public void setSjzlzrrds(String sjzlzrrds) {
        this.sjzlzrrds = sjzlzrrds.trim();
    }

    public void setSjzlzrrqx(String sjzlzrrqx) {
        this.sjzlzrrqx = sjzlzrrqx.trim();
    }

    public void setSfygcj(String sfygcj) {
        this.sfygcj = sfygcj.trim();
    }

    public void setYxsjwhr(String yxsjwhr) {
        this.yxsjwhr = yxsjwhr.trim();
    }
}
