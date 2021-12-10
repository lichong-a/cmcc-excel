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
 * 第四步、分光器的配置查询结果
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
public class FgqResultEntity {

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
     * 所属营销区域
     */
    @ExcelProperty(value = "所属营销区域")
    private String ssyxqy;
    /**
     * 所属小区
     */
    @ExcelProperty(value = "所属小区")
    private String ssxq;
    /**
     * 资管中文名称
     */
    @ExcelProperty(value = "资管中文名称")
    private String zgzwmc;
    /**
     * 业务类型
     */
    @ExcelProperty(value = "业务类型")
    private String ywlx;
    /**
     * 安装位置
     */
    @ExcelProperty(value = "安装位置")
    private String azwz;
    /**
     * 所属对象名称
     */
    @ExcelProperty(value = "所属对象名称")
    private String ssdxmc;
    /**
     * 所属对象类型
     */
    @ExcelProperty(value = "所属对象类型")
    private String ssdxlx;
    /**
     * 名称
     */
    @ExcelProperty(value = "名称")
    private String mc;
    /**
     * 项目编号
     */
    @ExcelProperty(value = "项目编号")
    private String xmbh;
    /**
     * 任务名称
     */
    @ExcelProperty(value = "任务名称")
    private String rwmc;
    /**
     * 分光比
     */
    @ExcelProperty(value = "分光比")
    private String fgb;
    /**
     * 主用OLT
     */
    @ExcelProperty(value = "主用OLT")
    private String zyolt;
    /**
     * 主用OLT的PON端口
     */
    @ExcelProperty(value = "主用OLT的PON端口")
    private String zyoltPon;
    /**
     * 网元状态
     */
    @ExcelProperty(value = "网元状态")
    private String wyzt;
    /**
     * 产权归属
     */
    @ExcelProperty(value = "产权归属")
    private String cqgs;
    /**
     * 管理单位
     */
    @ExcelProperty(value = "管理单位")
    private String gldw;
    /**
     * 设备型号
     */
    @ExcelProperty(value = "设备型号")
    private String sbxh;
    /**
     * 上级POS名称
     */
    @ExcelProperty(value = "上级POS名称")
    private String sjPosMc;
    /**
     * 上级设备是否为POS
     */
    @ExcelProperty(value = "上级设备是否为POS")
    private String sjsbsfwPos;
    /**
     * 上级POS端口
     */
    @ExcelProperty(value = "上级POS端口")
    private String sjPosPort;
    /**
     * 级别
     */
    @ExcelProperty(value = "级别")
    private String jb;
    /**
     * 厂商
     */
    @ExcelProperty(value = "厂商")
    private String cs;
    /**
     * 覆盖区域
     */
    @ExcelProperty(value = "覆盖区域")
    private String fgqy;
    /**
     * 备用OLT
     */
    @ExcelProperty(value = "备用OLT")
    private String byOlt;
    /**
     * 备用OLT的PON口
     */
    @ExcelProperty(value = "备用OLT的PON口")
    private String byOltPon;
    /**
     * 资产编号
     */
    @ExcelProperty(value = "资产编号")
    private String zcbh;
    /**
     * 位置描述
     */
    @ExcelProperty(value = "位置描述")
    private String wzms;
    /**
     * 二维码
     */
    @ExcelProperty(value = "二维码")
    private String ewm;
    /**
     * 采集名称
     */
    @ExcelProperty(value = "采集名称")
    private String cjmc;
    /**
     * 验收状态
     */
    @ExcelProperty(value = "验收状态")
    private String yszt;
    /**
     * 未通过原因
     */
    @ExcelProperty(value = "未通过原因")
    private String wtgyy;
    /**
     * 时间戳
     */
    @ExcelProperty(value = "时间戳")
    private String sjc;
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
     * 纬度
     */
    @ExcelProperty(value = "纬度")
    private String jw;
    /**
     * 经度
     */
    @ExcelProperty(value = "经度")
    private String jd;
    /**
     * 数据质量责任人(工程)
     */
    @ExcelProperty(value = "数据质量责任人(工程)")
    private String sjzlzrrgc;
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
     * change_task_id
     */
    @ExcelProperty(value = "change_task_id")
    private String changeTaskId;
    /**
     * 一线数据维护人（代维/一线）
     */
    @ExcelProperty(value = "一线数据维护人（代维/一线）")
    private String yxsjwhr;
    /**
     * 上联PON口是否为10GE
     */
    @ExcelProperty(value = "上联PON口是否为10GE")
    private String slPonSf10Ge;
    /**
     * 维护地市
     */
    @ExcelProperty(value = "维护地市")
    private String whds;
    /**
     * 维护区县
     */
    @ExcelProperty(value = "维护区县")
    private String whqx;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) {
            return false;
        }
        FgqResultEntity that = (FgqResultEntity) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

    public void setWynbbm(String wynbbm) {
        this.wynbbm = Objects.nonNull(wynbbm) ? wynbbm.trim() : "";
    }

    public void setSsds(String ssds) {
        this.ssds = Objects.nonNull(ssds) ? ssds.trim() : "";
    }

    public void setSsqx(String ssqx) {
        this.ssqx = Objects.nonNull(ssqx) ? ssqx.trim() : "";
    }

    public void setSsyxqy(String ssyxqy) {
        this.ssyxqy = Objects.nonNull(ssyxqy) ? ssyxqy.trim() : "";
    }

    public void setSsxq(String ssxq) {
        this.ssxq = Objects.nonNull(ssxq) ? ssxq.trim() : "";
    }

    public void setZgzwmc(String zgzwmc) {
        this.zgzwmc = Objects.nonNull(zgzwmc) ? zgzwmc.trim() : "";
    }

    public void setYwlx(String ywlx) {
        this.ywlx = Objects.nonNull(ywlx) ? ywlx.trim() : "";
    }

    public void setAzwz(String azwz) {
        this.azwz = Objects.nonNull(azwz) ? azwz.trim() : "";
    }

    public void setSsdxmc(String ssdxmc) {
        this.ssdxmc = Objects.nonNull(ssdxmc) ? ssdxmc.trim() : "";
    }

    public void setSsdxlx(String ssdxlx) {
        this.ssdxlx = Objects.nonNull(ssdxlx) ? ssdxlx.trim() : "";
    }

    public void setMc(String mc) {
        this.mc = Objects.nonNull(mc) ? mc.trim() : "";
    }

    public void setXmbh(String xmbh) {
        this.xmbh = Objects.nonNull(xmbh) ? xmbh.trim() : "";
    }

    public void setRwmc(String rwmc) {
        this.rwmc = Objects.nonNull(rwmc) ? rwmc.trim() : "";
    }

    public void setFgb(String fgb) {
        this.fgb = Objects.nonNull(fgb) ? fgb.trim() : "";
    }

    public void setZyolt(String zyolt) {
        this.zyolt = Objects.nonNull(zyolt) ? zyolt.trim() : "";
    }

    public void setZyoltPon(String zyoltPon) {
        this.zyoltPon = Objects.nonNull(zyoltPon) ? zyoltPon.trim() : "";
    }

    public void setWyzt(String wyzt) {
        this.wyzt = Objects.nonNull(wyzt) ? wyzt.trim() : "";
    }

    public void setCqgs(String cqgs) {
        this.cqgs = Objects.nonNull(cqgs) ? cqgs.trim() : "";
    }

    public void setGldw(String gldw) {
        this.gldw = Objects.nonNull(gldw) ? gldw.trim() : "";
    }

    public void setSbxh(String sbxh) {
        this.sbxh = Objects.nonNull(sbxh) ? sbxh.trim() : "";
    }

    public void setSjPosMc(String sjPosMc) {
        this.sjPosMc = Objects.nonNull(sjPosMc) ? sjPosMc.trim() : "";
    }

    public void setSjsbsfwPos(String sjsbsfwPos) {
        this.sjsbsfwPos = Objects.nonNull(sjsbsfwPos) ? sjsbsfwPos.trim() : "";
    }

    public void setSjPosPort(String sjPosPort) {
        this.sjPosPort = Objects.nonNull(sjPosPort) ? sjPosPort.trim() : "";
    }

    public void setJb(String jb) {
        this.jb = Objects.nonNull(jb) ? jb.trim() : "";
    }

    public void setCs(String cs) {
        this.cs = Objects.nonNull(cs) ? cs.trim() : "";
    }

    public void setFgqy(String fgqy) {
        this.fgqy = Objects.nonNull(fgqy) ? fgqy.trim() : "";
    }

    public void setByOlt(String byOlt) {
        this.byOlt = Objects.nonNull(byOlt) ? byOlt.trim() : "";
    }

    public void setByOltPon(String byOltPon) {
        this.byOltPon = Objects.nonNull(byOltPon) ? byOltPon.trim() : "";
    }

    public void setZcbh(String zcbh) {
        this.zcbh = Objects.nonNull(zcbh) ? zcbh.trim() : "";
    }

    public void setWzms(String wzms) {
        this.wzms = Objects.nonNull(wzms) ? wzms.trim() : "";
    }

    public void setEwm(String ewm) {
        this.ewm = Objects.nonNull(ewm) ? ewm.trim() : "";
    }

    public void setCjmc(String cjmc) {
        this.cjmc = Objects.nonNull(cjmc) ? cjmc.trim() : "";
    }

    public void setYszt(String yszt) {
        this.yszt = Objects.nonNull(yszt) ? yszt.trim() : "";
    }

    public void setWtgyy(String wtgyy) {
        this.wtgyy = Objects.nonNull(wtgyy) ? wtgyy.trim() : "";
    }

    public void setSjc(String sjc) {
        this.sjc = Objects.nonNull(sjc) ? sjc.trim() : "";
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

    public void setJw(String jw) {
        this.jw = Objects.nonNull(jw) ? jw.trim() : "";
    }

    public void setJd(String jd) {
        this.jd = Objects.nonNull(jd) ? jd.trim() : "";
    }

    public void setSjzlzrrgc(String sjzlzrrgc) {
        this.sjzlzrrgc = Objects.nonNull(sjzlzrrgc) ? sjzlzrrgc.trim() : "";
    }

    public void setSjzlzrrds(String sjzlzrrds) {
        this.sjzlzrrds = Objects.nonNull(sjzlzrrds) ? sjzlzrrds.trim() : "";
    }

    public void setSjzlzrrqx(String sjzlzrrqx) {
        this.sjzlzrrqx = Objects.nonNull(sjzlzrrqx) ? sjzlzrrqx.trim() : "";
    }

    public void setChangeTaskId(String changeTaskId) {
        this.changeTaskId = Objects.nonNull(changeTaskId) ? changeTaskId.trim() : "";
    }

    public void setYxsjwhr(String yxsjwhr) {
        this.yxsjwhr = Objects.nonNull(yxsjwhr) ? yxsjwhr.trim() : "";
    }

    public void setSlPonSf10Ge(String slPonSf10Ge) {
        this.slPonSf10Ge = Objects.nonNull(slPonSf10Ge) ? slPonSf10Ge.trim() : "";
    }

    public void setWhds(String whds) {
        this.whds = Objects.nonNull(whds) ? whds.trim() : "";
    }

    public void setWhqx(String whqx) {
        this.whqx = Objects.nonNull(whqx) ? whqx.trim() : "";
    }
}
