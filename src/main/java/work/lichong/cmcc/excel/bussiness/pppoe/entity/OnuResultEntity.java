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
    @ExcelProperty(value = "网元内部编码", index = 0)
    private String wynbbm;
    /**
     * 是否10GE
     */
    @ExcelProperty(value = "是否10GE", index = 1)
    private String sf10ge;
    /**
     * 所属地市
     */
    @ExcelProperty(value = "所属地市", index = 2)
    private String ssds;
    /**
     * 所属区县
     */
    @ExcelProperty(value = "所属区县", index = 3)
    private String ssqx;
    /**
     * 端口名称
     */
    @ExcelProperty(value = "端口名称", index = 4)
    private String dkmc;
    /**
     * 所属设备类型
     */
    @ExcelProperty(value = "所属设备类型", index = 5)
    private String sssblx;
    /**
     * 端口状态
     */
    @ExcelProperty(value = "端口状态", index = 6)
    private String dkzt;
    /**
     * 端口用途
     */
    @ExcelProperty(value = "端口用途", index = 7)
    private String dkyt;
    /**
     * 端口类型
     */
    @ExcelProperty(value = "端口类型", index = 8)
    private String dklx;
    /**
     * 采集名称
     */
    @ExcelProperty(value = "采集名称", index = 9)
    private String cjmc;
    /**
     * 所属设备名称
     */
    @ExcelProperty(value = "所属设备名称", index = 10)
    private String sssbmc;
    /**
     * 物理特性
     */
    @ExcelProperty(value = "物理特性", index = 11)
    private String wltx;
    /**
     * 速率
     */
    @ExcelProperty(value = "速率", index = 12)
    private String sl;
    /**
     * 所属板卡
     */
    @ExcelProperty(value = "所属板卡", index = 13)
    private String ssbk;
    /**
     * 端口编号
     */
    @ExcelProperty(value = "端口编号", index = 14)
    private String dkbh;
    /**
     * 承载家客用户数量
     */
    @ExcelProperty(value = "承载家客用户数量", index = 15)
    private String czjkyhl;
    /**
     * 下联FTTB ONU数量
     */
    @ExcelProperty(value = "下联FTTB ONU数量", index = 16)
    private String xlfttbonusl;
    /**
     * 下联FTTH ONU数量
     */
    @ExcelProperty(value = "下联FTTH ONU数量", index = 17)
    private String xlftthonusl;
    /**
     * 是否上联口
     */
    @ExcelProperty(value = "是否上联口", index = 18)
    private String sfslk;
    /**
     * 端口业务类型
     */
    @ExcelProperty(value = "端口业务类型", index = 19)
    private String dkywlx;
    /**
     * 子网掩码
     */
    @ExcelProperty(value = "子网掩码", index = 20)
    private String zwym;
    /**
     * 是否支持复用
     */
    @ExcelProperty(value = "是否支持复用", index = 21)
    private String sfzcfy;
    /**
     * 收发标识
     */
    @ExcelProperty(value = "收发标识", index = 22)
    private String sfbs;
    /**
     * IP地址
     */
    @ExcelProperty(value = "IP地址", index = 23)
    private String ip;
    /**
     * 接口类型
     */
    @ExcelProperty(value = "接口类型", index = 24)
    private String jklx;
    /**
     * 网元内部编码
     */
    @ExcelProperty(value = "网元内部编码", index = 25)
    private String wynbbm2;
    /**
     * 数据质量责任人(工程)
     */
    @ExcelProperty(value = "数据质量责任人(工程) ", index = 26)
    private String sjzlzrrgc;
    /**
     * 一线数据维护人（代维）
     */
    @ExcelProperty(value = "一线数据维护人（代维）", index = 27)
    private String yxsjwhrdw;
    /**
     * 数据质量责任人(区县)
     */
    @ExcelProperty(value = "数据质量责任人(区县)", index = 28)
    private String sjzlzrrqx;
    /**
     * 数据质量责任人（在网）
     */
    @ExcelProperty(value = "数据质量责任人（在网）", index = 29)
    private String sjzlzrrzw;
    /**
     * 时间戳
     */
    @ExcelProperty(value = "时间戳", index = 30)
    private String sjc;
    /**
     * 创建人
     */
    @ExcelProperty(value = "创建人", index = 31)
    private String csr;
    /**
     * 创建时间
     */
    @ExcelProperty(value = "创建时间", index = 32)
    private String cjsj;
    /**
     * 修改人
     */
    @ExcelProperty(value = "修改人", index = 33)
    private String xgr;
    /**
     * 修改时间
     */
    @ExcelProperty(value = "修改时间", index = 34)
    private String xgsj;
    /**
     * 是否合格
     */
    @ExcelProperty(value = "是否合格", index = 35)
    private String sfhg;
    /**
     * 错误类型
     */
    @ExcelProperty(value = "错误类型", index = 36)
    private String cwlx;
    /**
     * 是否有过拆机
     */
    @ExcelProperty(value = "是否有过拆机", index = 37)
    private String sfygcj;
    /**
     * ODF_DDF端子
     */
    @ExcelProperty(value = "ODF_DDF端子", index = 38)
    private String odfddfdz;
    /**
     * change_task_id
     */
    @ExcelProperty(value = "change_task_id", index = 39)
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

    public void setSf10ge(String sf10ge) {
        this.sf10ge = sf10ge.trim();
    }

    public void setSsds(String ssds) {
        this.ssds = ssds.trim();
    }

    public void setSsqx(String ssqx) {
        this.ssqx = ssqx.trim();
    }

    public void setDkmc(String dkmc) {
        this.dkmc = dkmc.trim();
    }

    public void setSssblx(String sssblx) {
        this.sssblx = sssblx.trim();
    }

    public void setDkzt(String dkzt) {
        this.dkzt = dkzt.trim();
    }

    public void setDkyt(String dkyt) {
        this.dkyt = dkyt.trim();
    }

    public void setDklx(String dklx) {
        this.dklx = dklx.trim();
    }

    public void setCjmc(String cjmc) {
        this.cjmc = cjmc.trim();
    }

    public void setSssbmc(String sssbmc) {
        this.sssbmc = sssbmc.trim();
    }

    public void setWltx(String wltx) {
        this.wltx = wltx.trim();
    }

    public void setSl(String sl) {
        this.sl = sl.trim();
    }

    public void setSsbk(String ssbk) {
        this.ssbk = ssbk.trim();
    }

    public void setDkbh(String dkbh) {
        this.dkbh = dkbh.trim();
    }

    public void setCzjkyhl(String czjkyhl) {
        this.czjkyhl = czjkyhl.trim();
    }

    public void setXlfttbonusl(String xlfttbonusl) {
        this.xlfttbonusl = xlfttbonusl.trim();
    }

    public void setXlftthonusl(String xlftthonusl) {
        this.xlftthonusl = xlftthonusl.trim();
    }

    public void setSfslk(String sfslk) {
        this.sfslk = sfslk.trim();
    }

    public void setDkywlx(String dkywlx) {
        this.dkywlx = dkywlx.trim();
    }

    public void setZwym(String zwym) {
        this.zwym = zwym.trim();
    }

    public void setSfzcfy(String sfzcfy) {
        this.sfzcfy = sfzcfy.trim();
    }

    public void setSfbs(String sfbs) {
        this.sfbs = sfbs.trim();
    }

    public void setIp(String ip) {
        this.ip = ip.trim();
    }

    public void setJklx(String jklx) {
        this.jklx = jklx.trim();
    }

    public void setWynbbm(String wynbbm) {
        this.wynbbm = wynbbm.trim();
    }

    public void setSjzlzrrgc(String sjzlzrrgc) {
        this.sjzlzrrgc = sjzlzrrgc.trim();
    }

    public void setYxsjwhrdw(String yxsjwhrdw) {
        this.yxsjwhrdw = yxsjwhrdw.trim();
    }

    public void setSjzlzrrqx(String sjzlzrrqx) {
        this.sjzlzrrqx = sjzlzrrqx.trim();
    }

    public void setSjzlzrrzw(String sjzlzrrzw) {
        this.sjzlzrrzw = sjzlzrrzw.trim();
    }

    public void setSjc(String sjc) {
        this.sjc = sjc.trim();
    }

    public void setCsr(String csr) {
        this.csr = csr.trim();
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

    public void setSfhg(String sfhg) {
        this.sfhg = sfhg.trim();
    }

    public void setCwlx(String cwlx) {
        this.cwlx = cwlx.trim();
    }

    public void setSfygcj(String sfygcj) {
        this.sfygcj = sfygcj.trim();
    }

    public void setOdfddfdz(String odfddfdz) {
        this.odfddfdz = odfddfdz.trim();
    }

    public void setChangeTaskId(String changeTaskId) {
        this.changeTaskId = changeTaskId.trim();
    }
}
