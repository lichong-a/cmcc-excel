package work.lichong.cmcc.excel.common.utils;

import cn.hutool.core.text.CharSequenceUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;
import org.springframework.stereotype.Service;
import work.lichong.cmcc.excel.common.bean.Result;

import java.util.Date;

/**
 * 响应输出工具类
 *
 * @author lchong
 * @date 2021/10/29 15:13
 */
@Service
public final class ResponseUtil {
    private static final String DATAFORMAT = "yyyy-MM-dd";

    private static final String DATAFORMAT_TIME = "yyyy-MM-dd HH:mm:ss.SSS";

    static PropertyFilter profilter = (object, name, value) -> {
        if (value == null) {
            return false;
        }
        if (value instanceof String) {
            return CharSequenceUtil.isNotBlank((String) value);
        }
        return true;
    };

    private static SerializeConfig mapping = new SerializeConfig();

    private ResponseUtil() {
    }

    public static String toString(Result<?> result, boolean isTimeManage) {
        if (result == null) {
            return null;
        }
        String resultStr;
        if (isTimeManage) {
            JSON.DEFFAULT_DATE_FORMAT = DATAFORMAT;
            mapping.put(Date.class, new SimpleDateFormatSerializer(DATAFORMAT_TIME));
            resultStr = JSON.toJSONString(result, mapping, profilter, SerializerFeature.WriteDateUseDateFormat,
                    SerializerFeature.DisableCheckSpecialChar, SerializerFeature.DisableCircularReferenceDetect);
        } else {
            resultStr = JSON.toJSONString(result, profilter);
        }
        return resultStr;
    }

    /**
     * 转化为String的时候，格式化时间并且过滤某些字段
     *
     * @param result 返回值
     * @return String
     */
    public static String toString(Result<?> result) {
        if (result == null) {
            return null;
        }

        JSON.DEFFAULT_DATE_FORMAT = DATAFORMAT;
        mapping.put(Date.class, new SimpleDateFormatSerializer(DATAFORMAT_TIME));
        return JSON.toJSONString(result, mapping, profilter, SerializerFeature.WriteDateUseDateFormat,
                SerializerFeature.DisableCheckSpecialChar, SerializerFeature.DisableCircularReferenceDetect);
    }

    /**
     * 转化为String的时候，格式化时间并且过滤某些字段
     */
    public static String toStringWithOutDataTime(Result<?> result) {
        if (result == null) {
            return null;
        }
        mapping.put(Date.class, new SimpleDateFormatSerializer("yyyy-MM-dd HH:mm:ss"));
        return JSON.toJSONString(result, mapping, SerializerFeature.WriteDateUseDateFormat,
                SerializerFeature.DisableCircularReferenceDetect);
    }

}
