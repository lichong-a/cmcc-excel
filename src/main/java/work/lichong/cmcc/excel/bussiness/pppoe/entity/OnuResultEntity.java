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
 * 第三步、端口ONU的配置查询结果
 *
 * @author ric
 * @date 2021年12月01日 23:40
 * @website https://lichong.work
 */
@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OnuResultEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ExcelIgnore
    private Long id;
    /**
     * 网元内部编码
     */
    @ExcelProperty(value = "网元内部编码")
    private String wynbbm;
    /**
     * 是否10GE
     */
    @ExcelProperty(value = "是否10GE")
    private String sf10ge;
    /**
     * 所属地市
     */
    @ExcelProperty(value = "所属地市")
    private String ssds;
    /**
     * 所属区县
     */
    @ExcelProperty(value = "所属区县")
    private String ssqx;
    /**
     * 端口名称
     */
    @ExcelProperty(value = "端口名称")
    private String dkmc;
    /**
     * 所属设备类型
     */
    @ExcelProperty(value = "所属设备类型")
    private String sssblx;
    /**
     * 端口状态
     */
    @ExcelProperty(value = "端口状态")
    private String dkzt;
    /**
     * 端口用途
     */
    @ExcelProperty(value = "端口用途")
    private String dkyt;
    /**
     * 端口类型
     */
    @ExcelProperty(value = "端口类型")
    private String dklx;
    /**
     * 采集名称
     */
    @ExcelProperty(value = "采集名称")
    private String cjmc;
    /**
     * 所属设备名称
     */
    @ExcelProperty(value = "所属设备名称")
    private String sssbmc;
    /**
     * 物理特性
     */
    @ExcelProperty(value = "物理特性")
    private String wltx;
    /**
     * 速率
     */
    @ExcelProperty(value = "速率")
    private String sl;
    /**
     * 所属板卡
     */
    @ExcelProperty(value = "所属板卡")
    private String ssbk;
    /**
     * 端口编号
     */
    @ExcelProperty(value = "端口编号")
    private String dkbh;
    /**
     * 承载家客用户数量
     */
    @ExcelProperty(value = "承载家客用户数量")
    private String czjkyhl;
    /**
     * 下联FTTB ONU数量
     */
    @ExcelProperty(value = "下联FTTB ONU数量")
    private String xlfttbonusl;
    /**
     * 下联FTTH ONU数量
     */
    @ExcelProperty(value = "下联FTTH ONU数量")
    private String xlftthonusl;
    /**
     * 是否上联口
     */
    @ExcelProperty(value = "是否上联口")
    private String sfslk;
    /**
     * 端口业务类型
     */
    @ExcelProperty(value = "端口业务类型")
    private String dkywlx;
    /**
     * 子网掩码
     */
    @ExcelProperty(value = "子网掩码")
    private String zwym;
    /**
     * 是否支持复用
     */
    @ExcelProperty(value = "是否支持复用")
    private String sfzcfy;
    /**
     * 收发标识
     */
    @ExcelProperty(value = "收发标识")
    private String sfbs;
    /**
     * IP地址
     */
    @ExcelProperty(value = "IP地址")
    private String ip;
    /**
     * 接口类型
     */
    @ExcelProperty(value = "接口类型")
    private String jklx;
    /**
     * 数据质量责任人(工程)
     */
    @ExcelProperty(value = "数据质量责任人(工程) ")
    private String sjzlzrrgc;
    /**
     * 一线数据维护人（代维）
     */
    @ExcelProperty(value = "一线数据维护人（代维）")
    private String yxsjwhrdw;
    /**
     * 数据质量责任人(区县)
     */
    @ExcelProperty(value = "数据质量责任人(区县)")
    private String sjzlzrrqx;
    /**
     * 数据质量责任人（在网）
     */
    @ExcelProperty(value = "数据质量责任人（在网）")
    private String sjzlzrrzw;
    /**
     * 时间戳
     */
    @ExcelProperty(value = "时间戳")
    private String sjc;
    /**
     * 创建人
     */
    @ExcelProperty(value = "创建人")
    private String csr;
    /**
     * 创建时间
     */
    @ExcelProperty(value = "创建时间")
    private String cjsj;
    /**
     * 修改人
     */
    @ExcelProperty(value = "修改人")
    private String xgr;
    /**
     * 修改时间
     */
    @ExcelProperty(value = "修改时间")
    private String xgsj;
    /**
     * 是否合格
     */
    @ExcelProperty(value = "是否合格")
    private String sfhg;
    /**
     * 错误类型
     */
    @ExcelProperty(value = "错误类型")
    private String cwlx;
    /**
     * 是否有过拆机
     */
    @ExcelProperty(value = "是否有过拆机")
    private String sfygcj;
    /**
     * ODF_DDF端子
     */
    @ExcelProperty(value = "ODF_DDF端子")
    private String odfddfdz;
    /**
     * change_task_id
     */
    @ExcelProperty(value = "change_task_id")
    private String changeTaskId;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) {
            return false;
        }
        OnuResultEntity that = (OnuResultEntity) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

    public void setWynbbm(String wynbbm) {
        this.wynbbm = Objects.nonNull(wynbbm) ? wynbbm.trim() : "";
    }

    public void setSf10ge(String sf10ge) {
        this.sf10ge = Objects.nonNull(sf10ge) ? sf10ge.trim() : "";
    }

    public void setSsds(String ssds) {
        this.ssds = Objects.nonNull(ssds) ? ssds.trim() : "";
    }

    public void setSsqx(String ssqx) {
        this.ssqx = Objects.nonNull(ssqx) ? ssqx.trim() : "";
    }

    public void setDkmc(String dkmc) {
        this.dkmc = Objects.nonNull(dkmc) ? dkmc.trim() : "";
    }

    public void setSssblx(String sssblx) {
        this.sssblx = Objects.nonNull(sssblx) ? sssblx.trim() : "";
    }

    public void setDkzt(String dkzt) {
        this.dkzt = Objects.nonNull(dkzt) ? dkzt.trim() : "";
    }

    public void setDkyt(String dkyt) {
        this.dkyt = Objects.nonNull(dkyt) ? dkyt.trim() : "";
    }

    public void setDklx(String dklx) {
        this.dklx = Objects.nonNull(dklx) ? dklx.trim() : "";
    }

    public void setCjmc(String cjmc) {
        this.cjmc = Objects.nonNull(cjmc) ? cjmc.trim() : "";
    }

    public void setSssbmc(String sssbmc) {
        this.sssbmc = Objects.nonNull(sssbmc) ? sssbmc.trim() : "";
    }

    public void setWltx(String wltx) {
        this.wltx = Objects.nonNull(wltx) ? wltx.trim() : "";
    }

    public void setSl(String sl) {
        this.sl = Objects.nonNull(sl) ? sl.trim() : "";
    }

    public void setSsbk(String ssbk) {
        this.ssbk = Objects.nonNull(ssbk) ? ssbk.trim() : "";
    }

    public void setDkbh(String dkbh) {
        this.dkbh = Objects.nonNull(dkbh) ? dkbh.trim() : "";
    }

    public void setCzjkyhl(String czjkyhl) {
        this.czjkyhl = Objects.nonNull(czjkyhl) ? czjkyhl.trim() : "";
    }

    public void setXlfttbonusl(String xlfttbonusl) {
        this.xlfttbonusl = Objects.nonNull(xlfttbonusl) ? xlfttbonusl.trim() : "";
    }

    public void setXlftthonusl(String xlftthonusl) {
        this.xlftthonusl = Objects.nonNull(xlftthonusl) ? xlftthonusl.trim() : "";
    }

    public void setSfslk(String sfslk) {
        this.sfslk = Objects.nonNull(sfslk) ? sfslk.trim() : "";
    }

    public void setDkywlx(String dkywlx) {
        this.dkywlx = Objects.nonNull(dkywlx) ? dkywlx.trim() : "";
    }

    public void setZwym(String zwym) {
        this.zwym = Objects.nonNull(zwym) ? zwym.trim() : "";
    }

    public void setSfzcfy(String sfzcfy) {
        this.sfzcfy = Objects.nonNull(sfzcfy) ? sfzcfy.trim() : "";
    }

    public void setSfbs(String sfbs) {
        this.sfbs = Objects.nonNull(sfbs) ? sfbs.trim() : "";
    }

    public void setIp(String ip) {
        this.ip = Objects.nonNull(ip) ? ip.trim() : "";
    }

    public void setJklx(String jklx) {
        this.jklx = Objects.nonNull(jklx) ? jklx.trim() : "";
    }

    public void setSjzlzrrgc(String sjzlzrrgc) {
        this.sjzlzrrgc = Objects.nonNull(sjzlzrrgc) ? sjzlzrrgc.trim() : "";
    }

    public void setYxsjwhrdw(String yxsjwhrdw) {
        this.yxsjwhrdw = Objects.nonNull(yxsjwhrdw) ? yxsjwhrdw.trim() : "";
    }

    public void setSjzlzrrqx(String sjzlzrrqx) {
        this.sjzlzrrqx = Objects.nonNull(sjzlzrrqx) ? sjzlzrrqx.trim() : "";
    }

    public void setSjzlzrrzw(String sjzlzrrzw) {
        this.sjzlzrrzw = Objects.nonNull(sjzlzrrzw) ? sjzlzrrzw.trim() : "";
    }

    public void setSjc(String sjc) {
        this.sjc = Objects.nonNull(sjc) ? sjc.trim() : "";
    }

    public void setCsr(String csr) {
        this.csr = Objects.nonNull(csr) ? csr.trim() : "";
    }

    public void setCjsj(String cjsj) {
        this.cjsj = Objects.nonNull(cjsj) ? cjsj.trim() : "";
    }

    public void setXgr(String xgr) {
        this.xgr = Objects.nonNull(xgr) ? xgr.trim() : "";
    }

    public void setXgsj(String xgsj) {
        this.xgsj = Objects.nonNull(xgsj) ? xgsj.trim() : "";
    }

    public void setSfhg(String sfhg) {
        this.sfhg = Objects.nonNull(sfhg) ? sfhg.trim() : "";
    }

    public void setCwlx(String cwlx) {
        this.cwlx = Objects.nonNull(cwlx) ? cwlx.trim() : "";
    }

    public void setSfygcj(String sfygcj) {
        this.sfygcj = Objects.nonNull(sfygcj) ? sfygcj.trim() : "";
    }

    public void setOdfddfdz(String odfddfdz) {
        this.odfddfdz = Objects.nonNull(odfddfdz) ? odfddfdz.trim() : "";
    }

    public void setChangeTaskId(String changeTaskId) {
        this.changeTaskId = Objects.nonNull(changeTaskId) ? changeTaskId.trim() : "";
    }
}
