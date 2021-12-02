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
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
public class FgqPortResultEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ExcelIgnore
    private Long id;
    /**
     * 所属地市
     */
    @ExcelProperty(value = "所属地市", index = 0)
    private String ssds;
    /**
     * 所属区县
     */
    @ExcelProperty(value = "所属区县", index = 1)
    private String ssqx;
    /**
     * 所属营销区域
     */
    @ExcelProperty(value = "所属营销区域", index = 2)
    private String ssyxqy;
    /**
     * 所属设备名称
     */
    @ExcelProperty(value = "所属设备名称", index = 3)
    private String sssbmc;
    /**
     * 名称
     */
    @ExcelProperty(value = "名称", index = 4)
    private String mc;
    /**
     * 端口编号
     */
    @ExcelProperty(value = "端口编号", index = 5)
    private String dkbh;
    /**
     * 端口序列号
     */
    @ExcelProperty(value = "端口序列号", index = 6)
    private String dkxlh;
    /**
     * 行
     */
    @ExcelProperty(value = "行", index = 7)
    private String hang;
    /**
     * 列
     */
    @ExcelProperty(value = "列", index = 8)
    private String lie;
    /**
     * 资管中文名称
     */
    @ExcelProperty(value = "资管中文名称", index = 9)
    private String zglwmc;
    /**
     * 端口用途
     */
    @ExcelProperty(value = "端口用途", index = 10)
    private String dkyt;
    /**
     * 端口状态
     */
    @ExcelProperty(value = "端口状态", index = 11)
    private String dkzt;
    /**
     * 端口维护状态
     */
    @ExcelProperty(value = "端口维护状态", index = 12)
    private String dkwhzt;
    /**
     * 清查次数
     */
    @ExcelProperty(value = "清查次数", index = 13)
    private String qccs;
    /**
     * 采集名称
     */
    @ExcelProperty(value = "采集名称", index = 14)
    private String sjmc;
    /**
     * 时间戳
     */
    @ExcelProperty(value = "时间戳", index = 15)
    private String sjc;
    /**
     * 网元内部编码
     */
    @ExcelProperty(value = "网元内部编码", index = 16)
    private String wynbbm;
    /**
     * 创建人
     */
    @ExcelProperty(value = "创建人", index = 17)
    private String cjr;
    /**
     * 创建时间
     */
    @ExcelProperty(value = "创建时间", index = 18)
    private String cjsj;
    /**
     * 修改人
     */
    @ExcelProperty(value = "修改人", index = 19)
    private String xgr;
    /**
     * 修改时间
     */
    @ExcelProperty(value = "修改时间", index = 20)
    private String xgsj;
    /**
     * 是否合格
     */
    @ExcelProperty(value = "是否合格", index = 21)
    private String sfsd;
    /**
     * 错误类型
     */
    @ExcelProperty(value = "错误类型", index = 22)
    private String cwlx;
    /**
     * 数据质量责任人(工程)
     */
    @ExcelProperty(value = "数据质量责任人(工程)", index = 23)
    private String sjzlzrrgc;
    /**
     * 数据质量责任人(地市)
     */
    @ExcelProperty(value = "数据质量责任人(地市)", index = 24)
    private String sjzlzrrds;
    /**
     * 数据质量责任人(区县)
     */
    @ExcelProperty(value = "数据质量责任人(区县)", index = 25)
    private String sjzlzrrqx;
    /**
     * 是否有过拆机
     */
    @ExcelProperty(value = "是否有过拆机", index = 26)
    private String sfygcj;
    /**
     * 一线数据维护人（代维一线）
     */
    @ExcelProperty(value = "一线数据维护人（代维一线）", index = 27)
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
}
