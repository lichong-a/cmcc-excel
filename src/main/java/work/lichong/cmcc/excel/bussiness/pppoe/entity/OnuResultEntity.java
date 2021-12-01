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
public class OnuResultEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ExcelIgnore
    private Long id;
    /**
     * 是否10GE
     */
    @ExcelProperty(value = "是否10GE", index = 0)
    private String sf10ge;
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
     * 端口名称
     */
    @ExcelProperty(value = "端口名称", index = 3)
    private String dkmc;
    /**
     * 所属设备类型
     */
    @ExcelProperty(value = "所属设备类型", index = 4)
    private String sssblx;
    /**
     * 端口状态
     */
    @ExcelProperty(value = "端口状态", index = 5)
    private String dkzt;
    /**
     * 端口用途
     */
    @ExcelProperty(value = "端口用途", index = 6)
    private String dkyt;
    /**
     * 端口类型
     */
    @ExcelProperty(value = "端口类型", index = 7)
    private String dklx;
    /**
     * 采集名称
     */
    @ExcelProperty(value = "采集名称", index = 8)
    private String cjmc;
    /**
     * 所属设备名称
     */
    @ExcelProperty(value = "所属设备名称", index = 9)
    private String sssbmc;
    /**
     * 物理特性
     */
    @ExcelProperty(value = "物理特性", index = 10)
    private String wltx;
    /**
     * 速率
     */
    @ExcelProperty(value = "速率", index = 11)
    private String sl;
    /**
     * 所属板卡
     */
    @ExcelProperty(value = "所属板卡", index = 12)
    private String ssbk;
    /**
     * 端口编号
     */
    @ExcelProperty(value = "端口编号", index = 13)
    private String dkbh;
    /**
     * 承载家客用户数量
     */
    @ExcelProperty(value = "承载家客用户数量", index = 14)
    private String czjkyhl;
    /**
     * 下联FTTB ONU数量
     */
    @ExcelProperty(value = "下联FTTB ONU数量", index = 15)
    private String xlfttbonusl;
    /**
     * 下联FTTH ONU数量
     */
    @ExcelProperty(value = "下联FTTH ONU数量", index = 16)
    private String xlftthonusl;
    /**
     * 是否上联口
     */
    @ExcelProperty(value = "是否上联口", index = 17)
    private String sfslk;
    /**
     * 端口业务类型
     */
    @ExcelProperty(value = "端口业务类型", index = 18)
    private String dkywlx;
    /**
     * 子网掩码
     */
    @ExcelProperty(value = "子网掩码", index = 19)
    private String zwym;
    /**
     * 是否支持复用
     */
    @ExcelProperty(value = "是否支持复用", index = 20)
    private String sfzcfy;
    /**
     * 收发标识
     */
    @ExcelProperty(value = "收发标识", index = 21)
    private String sfbs;
    /**
     * IP地址
     */
    @ExcelProperty(value = "IP地址", index = 22)
    private String ip;
    /**
     * 接口类型
     */
    @ExcelProperty(value = "接口类型", index = 23)
    private String jklx;
    /**
     * 网元内部编码
     */
    @ExcelProperty(value = "网元内部编码", index = 24)
    private String wynbbm;
    /**
     * 数据质量责任人(工程)
     */
    @ExcelProperty(value = "数据质量责任人(工程) ", index = 25)
    private String sjzlzrrgc;
    /**
     * 一线数据维护人（代维）
     */
    @ExcelProperty(value = "一线数据维护人（代维）", index = 26)
    private String yxsjwhrdw;
    /**
     * 数据质量责任人(区县)
     */
    @ExcelProperty(value = "数据质量责任人(区县)", index = 27)
    private String sjzlzrrqx;
    /**
     * 数据质量责任人（在网）
     */
    @ExcelProperty(value = "数据质量责任人（在网）", index = 28)
    private String sjzlzrrzw;
    /**
     * 时间戳
     */
    @ExcelProperty(value = "时间戳", index = 29)
    private String sjc;
    /**
     * 创建人
     */
    @ExcelProperty(value = "创建人", index = 30)
    private String csr;
    /**
     * 创建时间
     */
    @ExcelProperty(value = "创建时间", index = 31)
    private String cjsj;
    /**
     * 修改人
     */
    @ExcelProperty(value = "修改人", index = 32)
    private String xgr;
    /**
     * 修改时间
     */
    @ExcelProperty(value = "修改时间", index = 33)
    private String xgsj;
    /**
     * 是否合格
     */
    @ExcelProperty(value = "是否合格", index = 34)
    private String sfhg;
    /**
     * 错误类型
     */
    @ExcelProperty(value = "错误类型", index = 35)
    private String cwlx;
    /**
     * 是否有过拆机
     */
    @ExcelProperty(value = "是否有过拆机", index = 36)
    private String sfygcj;
    /**
     * ODF_DDF端子
     */
    @ExcelProperty(value = "ODF_DDF端子", index = 37)
    private String odfddfdz;
    /**
     * change_task_id
     */
    @ExcelProperty(value = "change_task_id", index = 38)
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
}
