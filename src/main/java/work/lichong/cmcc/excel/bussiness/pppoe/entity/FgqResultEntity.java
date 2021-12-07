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
     * 所属小区
     */
    @ExcelProperty(value = "所属小区", index = 4)
    private String ssxq;
    /**
     * 资管中文名称
     */
    @ExcelProperty(value = "资管中文名称", index = 5)
    private String zgzwmc;
    /**
     * 业务类型
     */
    @ExcelProperty(value = "业务类型", index = 6)
    private String ywlx;
    /**
     * 安装位置
     */
    @ExcelProperty(value = "安装位置", index = 7)
    private String azwz;
    /**
     * 所属对象名称
     */
    @ExcelProperty(value = "所属对象名称", index = 8)
    private String ssdxmc;
    /**
     * 所属对象类型
     */
    @ExcelProperty(value = "所属对象类型", index = 9)
    private String ssdxlx;
    /**
     * 名称
     */
    @ExcelProperty(value = "名称", index = 10)
    private String mc;
    /**
     * 项目编号
     */
    @ExcelProperty(value = "项目编号", index = 11)
    private String xmbh;
    /**
     * 任务名称
     */
    @ExcelProperty(value = "任务名称", index = 12)
    private String rwmc;
    /**
     * 分光比
     */
    @ExcelProperty(value = "分光比", index = 13)
    private String fgb;
    /**
     * 主用OLT
     */
    @ExcelProperty(value = "主用OLT", index = 14)
    private String zyolt;
    /**
     * 主用OLT的PON端口
     */
    @ExcelProperty(value = "主用OLT的PON端口", index = 15)
    private String zyoltPon;
    /**
     * 网元状态
     */
    @ExcelProperty(value = "网元状态", index = 16)
    private String wyzt;
    /**
     * 产权归属
     */
    @ExcelProperty(value = "产权归属", index = 17)
    private String cqgs;
    /**
     * 管理单位
     */
    @ExcelProperty(value = "管理单位", index = 18)
    private String gldw;
    /**
     * 设备型号
     */
    @ExcelProperty(value = "设备型号", index = 19)
    private String sbxh;
    /**
     * 上级POS名称
     */
    @ExcelProperty(value = "上级POS名称", index = 20)
    private String sjPosMc;
    /**
     * 上级设备是否为POS
     */
    @ExcelProperty(value = "上级设备是否为POS", index = 21)
    private String sjsbsfwPos;
    /**
     * 上级POS端口
     */
    @ExcelProperty(value = "上级POS端口", index = 22)
    private String sjPosPort;
    /**
     * 级别
     */
    @ExcelProperty(value = "级别", index = 23)
    private String jb;
    /**
     * 厂商
     */
    @ExcelProperty(value = "厂商", index = 24)
    private String cs;
    /**
     * 覆盖区域
     */
    @ExcelProperty(value = "覆盖区域", index = 25)
    private String fgqy;
    /**
     * 备用OLT
     */
    @ExcelProperty(value = "备用OLT", index = 26)
    private String byOlt;
    /**
     * 备用OLT的PON口
     */
    @ExcelProperty(value = "备用OLT的PON口", index = 27)
    private String byOltPon;
    /**
     * 资产编号
     */
    @ExcelProperty(value = "资产编号", index = 28)
    private String zcbh;
    /**
     * 位置描述
     */
    @ExcelProperty(value = "位置描述", index = 29)
    private String wzms;
    /**
     * 二维码
     */
    @ExcelProperty(value = "二维码", index = 30)
    private String ewm;
    /**
     * 采集名称
     */
    @ExcelProperty(value = "采集名称", index = 31)
    private String cjmc;
    /**
     * 验收状态
     */
    @ExcelProperty(value = "验收状态", index = 32)
    private String yszt;
    /**
     * 未通过原因
     */
    @ExcelProperty(value = "未通过原因", index = 33)
    private String wtgyy;
    /**
     * 时间戳
     */
    @ExcelProperty(value = "时间戳", index = 34)
    private String sjc;
    /**
     * 修改时间
     */
    @ExcelProperty(value = "修改时间", index = 35)
    private String xgsj;
    /**
     * 网元内部编码
     */
    @ExcelProperty(value = "网元内部编码", index = 36)
    private String wynbbm2;
    /**
     * 创建人
     */
    @ExcelProperty(value = "创建人", index = 37)
    private String cjr;
    /**
     * 创建时间
     */
    @ExcelProperty(value = "创建时间", index = 38)
    private String cjsj;
    /**
     * 修改人
     */
    @ExcelProperty(value = "修改人", index = 39)
    private String xgr;
    /**
     * 是否合格
     */
    @ExcelProperty(value = "是否合格", index = 40)
    private String sfhg;
    /**
     * 错误类型
     */
    @ExcelProperty(value = "错误类型", index = 41)
    private String cwlx;
    /**
     * 纬度
     */
    @ExcelProperty(value = "纬度", index = 42)
    private String jw;
    /**
     * 经度
     */
    @ExcelProperty(value = "经度", index = 43)
    private String jd;
    /**
     * 数据质量责任人(工程)
     */
    @ExcelProperty(value = "数据质量责任人(工程)", index = 44)
    private String sjzlzrrgc;
    /**
     * 数据质量责任人(地市)
     */
    @ExcelProperty(value = "数据质量责任人(地市)", index = 45)
    private String sjzlzrrds;
    /**
     * 数据质量责任人(区县)
     */
    @ExcelProperty(value = "数据质量责任人(区县)", index = 46)
    private String sjzlzrrqx;
    /**
     * change_task_id
     */
    @ExcelProperty(value = "change_task_id", index = 47)
    private String changeTaskId;
    /**
     * 一线数据维护人（代维/一线）
     */
    @ExcelProperty(value = "一线数据维护人（代维/一线）", index = 48)
    private String yxsjwhr;
    /**
     * 上联PON口是否为10GE
     */
    @ExcelProperty(value = "上联PON口是否为10GE", index = 49)
    private String slPonSf10Ge;
    /**
     * 维护地市
     */
    @ExcelProperty(value = "维护地市", index = 50)
    private String whds;
    /**
     * 维护区县
     */
    @ExcelProperty(value = "维护区县", index = 51)
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
        this.wynbbm = wynbbm.trim();
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

    public void setSsxq(String ssxq) {
        this.ssxq = ssxq.trim();
    }

    public void setZgzwmc(String zgzwmc) {
        this.zgzwmc = zgzwmc.trim();
    }

    public void setYwlx(String ywlx) {
        this.ywlx = ywlx.trim();
    }

    public void setAzwz(String azwz) {
        this.azwz = azwz.trim();
    }

    public void setSsdxmc(String ssdxmc) {
        this.ssdxmc = ssdxmc.trim();
    }

    public void setSsdxlx(String ssdxlx) {
        this.ssdxlx = ssdxlx.trim();
    }

    public void setMc(String mc) {
        this.mc = mc.trim();
    }

    public void setXmbh(String xmbh) {
        this.xmbh = xmbh.trim();
    }

    public void setRwmc(String rwmc) {
        this.rwmc = rwmc.trim();
    }

    public void setFgb(String fgb) {
        this.fgb = fgb.trim();
    }

    public void setZyolt(String zyolt) {
        this.zyolt = zyolt.trim();
    }

    public void setZyoltPon(String zyoltPon) {
        this.zyoltPon = zyoltPon.trim();
    }

    public void setWyzt(String wyzt) {
        this.wyzt = wyzt.trim();
    }

    public void setCqgs(String cqgs) {
        this.cqgs = cqgs.trim();
    }

    public void setGldw(String gldw) {
        this.gldw = gldw.trim();
    }

    public void setSbxh(String sbxh) {
        this.sbxh = sbxh.trim();
    }

    public void setSjPosMc(String sjPosMc) {
        this.sjPosMc = sjPosMc.trim();
    }

    public void setSjsbsfwPos(String sjsbsfwPos) {
        this.sjsbsfwPos = sjsbsfwPos.trim();
    }

    public void setSjPosPort(String sjPosPort) {
        this.sjPosPort = sjPosPort.trim();
    }

    public void setJb(String jb) {
        this.jb = jb.trim();
    }

    public void setCs(String cs) {
        this.cs = cs.trim();
    }

    public void setFgqy(String fgqy) {
        this.fgqy = fgqy.trim();
    }

    public void setByOlt(String byOlt) {
        this.byOlt = byOlt.trim();
    }

    public void setByOltPon(String byOltPon) {
        this.byOltPon = byOltPon.trim();
    }

    public void setZcbh(String zcbh) {
        this.zcbh = zcbh.trim();
    }

    public void setWzms(String wzms) {
        this.wzms = wzms.trim();
    }

    public void setEwm(String ewm) {
        this.ewm = ewm.trim();
    }

    public void setCjmc(String cjmc) {
        this.cjmc = cjmc.trim();
    }

    public void setYszt(String yszt) {
        this.yszt = yszt.trim();
    }

    public void setWtgyy(String wtgyy) {
        this.wtgyy = wtgyy.trim();
    }

    public void setSjc(String sjc) {
        this.sjc = sjc.trim();
    }

    public void setXgsj(String xgsj) {
        this.xgsj = xgsj.trim();
    }

    public void setWynbbm2(String wynbbm2) {
        this.wynbbm2 = wynbbm2.trim();
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

    public void setSfhg(String sfhg) {
        this.sfhg = sfhg.trim();
    }

    public void setCwlx(String cwlx) {
        this.cwlx = cwlx.trim();
    }

    public void setJw(String jw) {
        this.jw = jw.trim();
    }

    public void setJd(String jd) {
        this.jd = jd.trim();
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

    public void setChangeTaskId(String changeTaskId) {
        this.changeTaskId = changeTaskId.trim();
    }

    public void setYxsjwhr(String yxsjwhr) {
        this.yxsjwhr = yxsjwhr.trim();
    }

    public void setSlPonSf10Ge(String slPonSf10Ge) {
        this.slPonSf10Ge = slPonSf10Ge.trim();
    }

    public void setWhds(String whds) {
        this.whds = whds.trim();
    }

    public void setWhqx(String whqx) {
        this.whqx = whqx.trim();
    }
}
