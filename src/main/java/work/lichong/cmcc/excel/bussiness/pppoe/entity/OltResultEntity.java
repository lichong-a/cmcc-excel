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
public class OltResultEntity {

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
     * 是否锁定
     */
    @ExcelProperty(value = "是否锁定", index = 1)
    private String sfsd;
    /**
     * 所属营销区域
     */
    @ExcelProperty(value = "所属营销区域", index = 2)
    private String ssyxqy;
    /**
     * 所属省份
     */
    @ExcelProperty(value = "所属省份", index = 3)
    private String sssf;
    /**
     * 所属地市
     */
    @ExcelProperty(value = "所属地市", index = 4)
    private String ssds;
    /**
     * 所属区县
     */
    @ExcelProperty(value = "所属区县", index = 5)
    private String ssqx;
    /**
     * 所属站点
     */
    @ExcelProperty(value = "所属站点", index = 6)
    private String sszd;
    /**
     * 所属机房
     */
    @ExcelProperty(value = "所属机房", index = 7)
    private String ssjf;
    /**
     * 所属机架
     */
    @ExcelProperty(value = "所属机架", index = 8)
    private String ssjj;
    /**
     * 中文名称
     */
    @ExcelProperty(value = "中文名称", index = 9)
    private String zwmc;
    /**
     * 项目编号
     */
    @ExcelProperty(value = "项目编号", index = 10)
    private String xmbh;
    /**
     * 项目名称
     */
    @ExcelProperty(value = "项目名称", index = 11)
    private String xmmc;
    /**
     * 管理单位
     */
    @ExcelProperty(value = "管理单位", index = 12)
    private String gldw;
    /**
     * 所属EMS
     */
    @ExcelProperty(value = "所属EMS", index = 13)
    private String ssEms;
    /**
     * 厂商
     */
    @ExcelProperty(value = "厂商", index = 14)
    private String cs;
    /**
     * ip地址
     */
    @ExcelProperty(value = "ip地址", index = 15)
    private String ip;
    /**
     * 网元状态
     */
    @ExcelProperty(value = "网元状态", index = 16)
    private String wyzt;
    /**
     * 别名
     */
    @ExcelProperty(value = "别名", index = 17)
    private String bm;
    /**
     * 承载家客用户数量
     */
    @ExcelProperty(value = "承载家客用户数量", index = 18)
    private String czjkyhsl;
    /**
     * 下连FTTB ONU数量
     */
    @ExcelProperty(value = "下连FTTB ONU数量", index = 19)
    private String lxfttb;
    /**
     * 下连FTTH ONU数量
     */
    @ExcelProperty(value = "下连FTTH ONU数量", index = 20)
    private String xlftth;
    /**
     * 是否为双上行链路
     */
    @ExcelProperty(value = "是否为双上行链路", index = 21)
    private String sfwssxll;
    /**
     * 备注
     */
    @ExcelProperty(value = "备注", index = 22)
    private String bz;
    /**
     * 备注1
     */
    @ExcelProperty(value = "备注1", index = 23)
    private String bz1;
    /**
     * 上联主设备ID
     */
    @ExcelProperty(value = "上联主设备ID", index = 24)
    private String slzsbId;
    /**
     * 上联主设备端口ID
     */
    @ExcelProperty(value = "上联主设备端口ID", index = 25)
    private String slzsbdkId;
    /**
     * 上联主设备类型
     */
    @ExcelProperty(value = "上联主设备类型", index = 26)
    private String slzsblx;
    /**
     * 上联备设备ID
     */
    @ExcelProperty(value = "上联备设备ID", index = 27)
    private String slbsbId;
    /**
     * 上联备设备端口ID
     */
    @ExcelProperty(value = "上联备设备端口ID", index = 28)
    private String slbsbdkId;
    /**
     * 上联备设备类型
     */
    @ExcelProperty(value = "上联备设备类型", index = 29)
    private String slbsblx;
    /**
     * 资产编号
     */
    @ExcelProperty(value = "资产编号", index = 30)
    private String zcbh;
    /**
     * 覆盖区域
     */
    @ExcelProperty(value = "覆盖区域", index = 31)
    private String fgqy;
    /**
     * 与ONU间最大传输距离（公里）
     */
    @ExcelProperty(value = "与ONU间最大传输距离（公里）", index = 32)
    private String yonujzdcsjl;
    /**
     * 产权归属
     */
    @ExcelProperty(value = "产权归属", index = 33)
    private String cqgs;
    /**
     * 软件版本
     */
    @ExcelProperty(value = "软件版本", index = 34)
    private String rjbb;
    /**
     * 设备型号
     */
    @ExcelProperty(value = "设备型号", index = 35)
    private String sbxh;
    /**
     * 采集名称
     */
    @ExcelProperty(value = "采集名称", index = 36)
    private String cjmc;
    /**
     * 修改时间
     */
    @ExcelProperty(value = "修改时间", index = 37)
    private String xgsj;
    /**
     * 网元内部编码
     */
    @ExcelProperty(value = "网元内部编码", index = 38)
    private String wynbbm2;
    /**
     * 创建人
     */
    @ExcelProperty(value = "创建人", index = 39)
    private String cjr;
    /**
     * 创建时间
     */
    @ExcelProperty(value = "创建时间", index = 40)
    private String cjsj;
    /**
     * 修改人
     */
    @ExcelProperty(value = "修改人", index = 41)
    private String xgr;
    /**
     * 是否合格
     */
    @ExcelProperty(value = "是否合格", index = 42)
    private String sfhg;
    /**
     * 错误类型
     */
    @ExcelProperty(value = "错误类型", index = 43)
    private String cwlx;
    /**
     * 时间戳
     */
    @ExcelProperty(value = "时间戳", index = 44)
    private String sjc;
    /**
     * 本端传输网元名称（备用电路）
     */
    @ExcelProperty(value = "本端传输网元名称（备用电路）", index = 45)
    private String bdcswymcby;
    /**
     * 本端传输网元端口（备用电路）
     */
    @ExcelProperty(value = "本端传输网元端口（备用电路）", index = 46)
    private String bdcswydkby;
    /**
     * 对端传输网元端口（主用电路）
     */
    @ExcelProperty(value = "对端传输网元端口（主用电路）", index = 47)
    private String ddcswydkzy;
    /**
     * 对端传输网元名称（主用电路）
     */
    @ExcelProperty(value = "对端传输网元名称（主用电路）", index = 48)
    private String ddcswymczy;
    /**
     * 对端传输网元名称（备用电路）
     */
    @ExcelProperty(value = "对端传输网元名称（备用电路）", index = 49)
    private String ddcswymcby;
    /**
     * 对端传输网元端口（备用电路）
     */
    @ExcelProperty(value = "对端传输网元端口（备用电路）", index = 50)
    private String ddcswydkby;
    /**
     * (OTN|PTN)本端传输网元名称（主用电路）
     */
    @ExcelProperty(value = "(OTN|PTN)本端传输网元名称（主用电路）", index = 51)
    private String otnptnbdcswymczy;
    /**
     * 本端传输网元端口（主用电路）
     */
    @ExcelProperty(value = "本端传输网元端口（主用电路）", index = 52)
    private String bdcswydkzy;
    /**
     * 上联至BRAS是否经过传输链路（是/否）
     */
    @ExcelProperty(value = "上联至BRAS是否经过传输链路（是/否）", index = 53)
    private String slzbrassfjgcsll;
    /**
     * 上传传输链路备用电路号
     */
    @ExcelProperty(value = "上传传输链路备用电路号", index = 54)
    private String sccsllbydlh;
    /**
     * 上联传输链路主用电路号
     */
    @ExcelProperty(value = "上联传输链路主用电路号", index = 55)
    private String sccsllzydlh;
    /**
     * 业务类型
     */
    @ExcelProperty(value = "业务类型", index = 56)
    private String ywlx;
    /**
     * 一线数据维护人（代维/一线）
     */
    @ExcelProperty(value = "一线数据维护人（代维/一线）", index = 57)
    private String yxsjwhr;
    /**
     * 数据质量责任人(地市)
     */
    @ExcelProperty(value = "数据质量责任人(地市)", index = 58)
    private String sjzlzrrds;
    /**
     * 数据质量责任人(区县)
     */
    @ExcelProperty(value = "数据质量责任人(区县)", index = 59)
    private String sjzlzrrqx;
    /**
     * 数据质量责任人(工程)
     */
    @ExcelProperty(value = "数据质量责任人(工程)", index = 60)
    private String sjzlzrrgc;
    /**
     * 任务图纸名称
     */
    @ExcelProperty(value = "任务图纸名称", index = 61)
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
}
