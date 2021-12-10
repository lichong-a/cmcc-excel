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
 * 第二步、OLT的配置查询结果
 *
 * @author ric
 * @date 2021年12月01日 21:40
 * @website https://lichong.work
 */
@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OltResultEntity {

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
     * 是否锁定
     */
    @ExcelProperty(value = "是否锁定")
    private String sfsd;
    /**
     * 所属营销区域
     */
    @ExcelProperty(value = "所属营销区域")
    private String ssyxqy;
    /**
     * 所属省份
     */
    @ExcelProperty(value = "所属省份")
    private String sssf;
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
     * 所属站点
     */
    @ExcelProperty(value = "所属站点")
    private String sszd;
    /**
     * 所属机房
     */
    @ExcelProperty(value = "所属机房")
    private String ssjf;
    /**
     * 所属机架
     */
    @ExcelProperty(value = "所属机架")
    private String ssjj;
    /**
     * 中文名称
     */
    @ExcelProperty(value = "中文名称")
    private String zwmc;
    /**
     * 项目编号
     */
    @ExcelProperty(value = "项目编号")
    private String xmbh;
    /**
     * 项目名称
     */
    @ExcelProperty(value = "项目名称")
    private String xmmc;
    /**
     * 管理单位
     */
    @ExcelProperty(value = "管理单位")
    private String gldw;
    /**
     * 所属EMS
     */
    @ExcelProperty(value = "所属EMS")
    private String ssEms;
    /**
     * 厂商
     */
    @ExcelProperty(value = "厂商")
    private String cs;
    /**
     * ip地址
     */
    @ExcelProperty(value = "ip地址")
    private String ip;
    /**
     * 网元状态
     */
    @ExcelProperty(value = "网元状态")
    private String wyzt;
    /**
     * 别名
     */
    @ExcelProperty(value = "别名")
    private String bm;
    /**
     * 承载家客用户数量
     */
    @ExcelProperty(value = "承载家客用户数量")
    private String czjkyhsl;
    /**
     * 下连FTTB ONU数量
     */
    @ExcelProperty(value = "下连FTTB ONU数量")
    private String lxfttb;
    /**
     * 下连FTTH ONU数量
     */
    @ExcelProperty(value = "下连FTTH ONU数量")
    private String xlftth;
    /**
     * 是否为双上行链路
     */
    @ExcelProperty(value = "是否为双上行链路")
    private String sfwssxll;
    /**
     * 备注
     */
    @ExcelProperty(value = "备注")
    private String bz;
    /**
     * 备注1
     */
    @ExcelProperty(value = "备注1")
    private String bz1;
    /**
     * 上联主设备ID
     */
    @ExcelProperty(value = "上联主设备ID")
    private String slzsbId;
    /**
     * 上联主设备端口ID
     */
    @ExcelProperty(value = "上联主设备端口ID")
    private String slzsbdkId;
    /**
     * 上联主设备类型
     */
    @ExcelProperty(value = "上联主设备类型")
    private String slzsblx;
    /**
     * 上联备设备ID
     */
    @ExcelProperty(value = "上联备设备ID")
    private String slbsbId;
    /**
     * 上联备设备端口ID
     */
    @ExcelProperty(value = "上联备设备端口ID")
    private String slbsbdkId;
    /**
     * 上联备设备类型
     */
    @ExcelProperty(value = "上联备设备类型")
    private String slbsblx;
    /**
     * 资产编号
     */
    @ExcelProperty(value = "资产编号")
    private String zcbh;
    /**
     * 覆盖区域
     */
    @ExcelProperty(value = "覆盖区域")
    private String fgqy;
    /**
     * 与ONU间最大传输距离（公里）
     */
    @ExcelProperty(value = "与ONU间最大传输距离（公里）")
    private String yonujzdcsjl;
    /**
     * 产权归属
     */
    @ExcelProperty(value = "产权归属")
    private String cqgs;
    /**
     * 软件版本
     */
    @ExcelProperty(value = "软件版本")
    private String rjbb;
    /**
     * 设备型号
     */
    @ExcelProperty(value = "设备型号")
    private String sbxh;
    /**
     * 采集名称
     */
    @ExcelProperty(value = "采集名称")
    private String cjmc;
    /**
     * 修改时间
     */
    @ExcelProperty(value = "修改时间")
    private String xgsj;
    /**
     * 创建人
     */
    @ExcelProperty(value = "创建人")
    private String cjr;
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
     * 时间戳
     */
    @ExcelProperty(value = "时间戳")
    private String sjc;
    /**
     * 本端传输网元名称（备用电路）
     */
    @ExcelProperty(value = "本端传输网元名称（备用电路）")
    private String bdcswymcby;
    /**
     * 本端传输网元端口（备用电路）
     */
    @ExcelProperty(value = "本端传输网元端口（备用电路）")
    private String bdcswydkby;
    /**
     * 对端传输网元端口（主用电路）
     */
    @ExcelProperty(value = "对端传输网元端口（主用电路）")
    private String ddcswydkzy;
    /**
     * 对端传输网元名称（主用电路）
     */
    @ExcelProperty(value = "对端传输网元名称（主用电路）")
    private String ddcswymczy;
    /**
     * 对端传输网元名称（备用电路）
     */
    @ExcelProperty(value = "对端传输网元名称（备用电路）")
    private String ddcswymcby;
    /**
     * 对端传输网元端口（备用电路）
     */
    @ExcelProperty(value = "对端传输网元端口（备用电路）")
    private String ddcswydkby;
    /**
     * (OTN|PTN)本端传输网元名称（主用电路）
     */
    @ExcelProperty(value = "(OTN|PTN)本端传输网元名称（主用电路）")
    private String otnptnbdcswymczy;
    /**
     * 本端传输网元端口（主用电路）
     */
    @ExcelProperty(value = "本端传输网元端口（主用电路）")
    private String bdcswydkzy;
    /**
     * 上联至BRAS是否经过传输链路（是/否）
     */
    @ExcelProperty(value = "上联至BRAS是否经过传输链路（是/否）")
    private String slzbrassfjgcsll;
    /**
     * 上传传输链路备用电路号
     */
    @ExcelProperty(value = "上传传输链路备用电路号")
    private String sccsllbydlh;
    /**
     * 上联传输链路主用电路号
     */
    @ExcelProperty(value = "上联传输链路主用电路号")
    private String sccsllzydlh;
    /**
     * 业务类型
     */
    @ExcelProperty(value = "业务类型")
    private String ywlx;
    /**
     * 一线数据维护人（代维/一线）
     */
    @ExcelProperty(value = "一线数据维护人（代维/一线）")
    private String yxsjwhr;
    /**
     * 数据质量责任人(地市)
     */
    @ExcelProperty(value = "数据质量责任人(地市)")
    private String sjzlzrrds;
    /**
     * 数据质量责任人(区县)
     */
    @ExcelProperty(value = "数据质量责任人(区县)")
    private String sjzlzrrqx;
    /**
     * 数据质量责任人(工程)
     */
    @ExcelProperty(value = "数据质量责任人(工程)")
    private String sjzlzrrgc;
    /**
     * 任务图纸名称
     */
    @ExcelProperty(value = "任务图纸名称")
    private String rwtzmc;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) {
            return false;
        }
        OltResultEntity that = (OltResultEntity) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

    public void setWynbbm(String wynbbm) {
        this.wynbbm = Objects.nonNull(wynbbm) ? wynbbm.trim() : "";
    }

    public void setSfsd(String sfsd) {
        this.sfsd = Objects.nonNull(sfsd) ? sfsd.trim() : "";
    }

    public void setSsyxqy(String ssyxqy) {
        this.ssyxqy = Objects.nonNull(ssyxqy) ? ssyxqy.trim() : "";
    }

    public void setSssf(String sssf) {
        this.sssf = Objects.nonNull(sssf) ? sssf.trim() : "";
    }

    public void setSsds(String ssds) {
        this.ssds = Objects.nonNull(ssds) ? ssds.trim() : "";
    }

    public void setSsqx(String ssqx) {
        this.ssqx = Objects.nonNull(ssqx) ? ssqx.trim() : "";
    }

    public void setSszd(String sszd) {
        this.sszd = Objects.nonNull(sszd) ? sszd.trim() : "";
    }

    public void setSsjf(String ssjf) {
        this.ssjf = Objects.nonNull(ssjf) ? ssjf.trim() : "";
    }

    public void setSsjj(String ssjj) {
        this.ssjj = Objects.nonNull(ssjj) ? ssjj.trim() : "";
    }

    public void setZwmc(String zwmc) {
        this.zwmc = Objects.nonNull(zwmc) ? zwmc.trim() : "";
    }

    public void setXmbh(String xmbh) {
        this.xmbh = Objects.nonNull(xmbh) ? xmbh.trim() : "";
    }

    public void setXmmc(String xmmc) {
        this.xmmc = Objects.nonNull(xmmc) ? xmmc.trim() : "";
    }

    public void setGldw(String gldw) {
        this.gldw = Objects.nonNull(gldw) ? gldw.trim() : "";
    }

    public void setSsEms(String ssEms) {
        this.ssEms = Objects.nonNull(ssEms) ? ssEms.trim() : "";
    }

    public void setCs(String cs) {
        this.cs = Objects.nonNull(cs) ? cs.trim() : "";
    }

    public void setIp(String ip) {
        this.ip = Objects.nonNull(ip) ? ip.trim() : "";
    }

    public void setWyzt(String wyzt) {
        this.wyzt = Objects.nonNull(wyzt) ? wyzt.trim() : "";
    }

    public void setBm(String bm) {
        this.bm = Objects.nonNull(bm) ? bm.trim() : "";
    }

    public void setCzjkyhsl(String czjkyhsl) {
        this.czjkyhsl = Objects.nonNull(czjkyhsl) ? czjkyhsl.trim() : "";
    }

    public void setLxfttb(String lxfttb) {
        this.lxfttb = Objects.nonNull(lxfttb) ? lxfttb.trim() : "";
    }

    public void setXlftth(String xlftth) {
        this.xlftth = Objects.nonNull(xlftth) ? xlftth.trim() : "";
    }

    public void setSfwssxll(String sfwssxll) {
        this.sfwssxll = Objects.nonNull(sfwssxll) ? sfwssxll.trim() : "";
    }

    public void setBz(String bz) {
        this.bz = Objects.nonNull(bz) ? bz.trim() : "";
    }

    public void setBz1(String bz1) {
        this.bz1 = Objects.nonNull(bz1) ? bz1.trim() : "";
    }

    public void setSlzsbId(String slzsbId) {
        this.slzsbId = Objects.nonNull(slzsbId) ? slzsbId.trim() : "";
    }

    public void setSlzsbdkId(String slzsbdkId) {
        this.slzsbdkId = Objects.nonNull(slzsbdkId) ? slzsbdkId.trim() : "";
    }

    public void setSlzsblx(String slzsblx) {
        this.slzsblx = Objects.nonNull(slzsblx) ? slzsblx.trim() : "";
    }

    public void setSlbsbId(String slbsbId) {
        this.slbsbId = Objects.nonNull(slbsbId) ? slbsbId.trim() : "";
    }

    public void setSlbsbdkId(String slbsbdkId) {
        this.slbsbdkId = Objects.nonNull(slbsbdkId) ? slbsbdkId.trim() : "";
    }

    public void setSlbsblx(String slbsblx) {
        this.slbsblx = Objects.nonNull(slbsblx) ? slbsblx.trim() : "";
    }

    public void setZcbh(String zcbh) {
        this.zcbh = Objects.nonNull(zcbh) ? zcbh.trim() : "";
    }

    public void setFgqy(String fgqy) {
        this.fgqy = Objects.nonNull(fgqy) ? fgqy.trim() : "";
    }

    public void setYonujzdcsjl(String yonujzdcsjl) {
        this.yonujzdcsjl = Objects.nonNull(yonujzdcsjl) ? yonujzdcsjl.trim() : "";
    }

    public void setCqgs(String cqgs) {
        this.cqgs = Objects.nonNull(cqgs) ? cqgs.trim() : "";
    }

    public void setRjbb(String rjbb) {
        this.rjbb = Objects.nonNull(rjbb) ? rjbb.trim() : "";
    }

    public void setSbxh(String sbxh) {
        this.sbxh = Objects.nonNull(sbxh) ? sbxh.trim() : "";
    }

    public void setCjmc(String cjmc) {
        this.cjmc = Objects.nonNull(cjmc) ? cjmc.trim() : "";
    }

    public void setXgsj(String xgsj) {
        this.xgsj = Objects.nonNull(xgsj) ? xgsj.trim() : "";
    }

    public void setCjr(String cjr) {
        this.cjr = Objects.nonNull(cjr) ? cjr.trim() : "";
    }

    public void setCjsj(String cjsj) {
        this.cjsj = Objects.nonNull(cjsj) ? cjsj.trim() : "";
    }

    public void setXgr(String xgr) {
        this.xgr = Objects.nonNull(xgr) ? xgr.trim() : "";
    }

    public void setSfhg(String sfhg) {
        this.sfhg = Objects.nonNull(sfhg) ? sfhg.trim() : "";
    }

    public void setCwlx(String cwlx) {
        this.cwlx = Objects.nonNull(cwlx) ? cwlx.trim() : "";
    }

    public void setSjc(String sjc) {
        this.sjc = Objects.nonNull(sjc) ? sjc.trim() : "";
    }

    public void setBdcswymcby(String bdcswymcby) {
        this.bdcswymcby = Objects.nonNull(bdcswymcby) ? bdcswymcby.trim() : "";
    }

    public void setBdcswydkby(String bdcswydkby) {
        this.bdcswydkby = Objects.nonNull(bdcswydkby) ? bdcswydkby.trim() : "";
    }

    public void setDdcswydkzy(String ddcswydkzy) {
        this.ddcswydkzy = Objects.nonNull(ddcswydkzy) ? ddcswydkzy.trim() : "";
    }

    public void setDdcswymczy(String ddcswymczy) {
        this.ddcswymczy = Objects.nonNull(ddcswymczy) ? ddcswymczy.trim() : "";
    }

    public void setDdcswymcby(String ddcswymcby) {
        this.ddcswymcby = Objects.nonNull(ddcswymcby) ? ddcswymcby.trim() : "";
    }

    public void setDdcswydkby(String ddcswydkby) {
        this.ddcswydkby = Objects.nonNull(ddcswydkby) ? ddcswydkby.trim() : "";
    }

    public void setOtnptnbdcswymczy(String otnptnbdcswymczy) {
        this.otnptnbdcswymczy = Objects.nonNull(otnptnbdcswymczy) ? otnptnbdcswymczy.trim() : "";
    }

    public void setBdcswydkzy(String bdcswydkzy) {
        this.bdcswydkzy = Objects.nonNull(bdcswydkzy) ? bdcswydkzy.trim() : "";
    }

    public void setSlzbrassfjgcsll(String slzbrassfjgcsll) {
        this.slzbrassfjgcsll = Objects.nonNull(slzbrassfjgcsll) ? slzbrassfjgcsll.trim() : "";
    }

    public void setSccsllbydlh(String sccsllbydlh) {
        this.sccsllbydlh = Objects.nonNull(sccsllbydlh) ? sccsllbydlh.trim() : "";
    }

    public void setSccsllzydlh(String sccsllzydlh) {
        this.sccsllzydlh = Objects.nonNull(sccsllzydlh) ? sccsllzydlh.trim() : "";
    }

    public void setYwlx(String ywlx) {
        this.ywlx = Objects.nonNull(ywlx) ? ywlx.trim() : "";
    }

    public void setYxsjwhr(String yxsjwhr) {
        this.yxsjwhr = Objects.nonNull(yxsjwhr) ? yxsjwhr.trim() : "";
    }

    public void setSjzlzrrds(String sjzlzrrds) {
        this.sjzlzrrds = Objects.nonNull(sjzlzrrds) ? sjzlzrrds.trim() : "";
    }

    public void setSjzlzrrqx(String sjzlzrrqx) {
        this.sjzlzrrqx = Objects.nonNull(sjzlzrrqx) ? sjzlzrrqx.trim() : "";
    }

    public void setSjzlzrrgc(String sjzlzrrgc) {
        this.sjzlzrrgc = Objects.nonNull(sjzlzrrgc) ? sjzlzrrgc.trim() : "";
    }

    public void setRwtzmc(String rwtzmc) {
        this.rwtzmc = Objects.nonNull(rwtzmc) ? rwtzmc.trim() : "";
    }
}
