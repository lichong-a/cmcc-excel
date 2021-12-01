package work.lichong.cmcc.excel.bussiness.pppoe.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;
import com.alibaba.excel.util.ListUtils;
import lombok.extern.slf4j.Slf4j;
import work.lichong.cmcc.excel.bussiness.pppoe.dao.OltResultRepository;
import work.lichong.cmcc.excel.bussiness.pppoe.entity.OltResultEntity;

import java.util.List;

/**
 * @author ric
 * @date 2021年12月01日 23:06
 * @website https://lichong.work
 */
@Slf4j
public class OltResultExcelDataListener implements ReadListener<OltResultEntity> {
    /**
     * 每隔5条存储数据库，实际使用中可以100条，然后清理list ，方便内存回收
     */
    private static final int BATCH_COUNT = 200;
    /**
     * 缓存的数据
     */
    private List<OltResultEntity> cachedDataList = ListUtils.newArrayListWithExpectedSize(BATCH_COUNT);

    private OltResultRepository repository;

    public OltResultExcelDataListener(OltResultRepository repository) {
        this.repository = repository;
    }

    /**
     * 这个每一条数据解析都会来调用
     *
     * @param data            one row value. Is is same as {@link AnalysisContext#readRowHolder()}
     * @param analysisContext
     */
    @Override
    public void invoke(OltResultEntity data, AnalysisContext analysisContext) {
        cachedDataList.add(data);
        // 达到BATCH_COUNT了，需要去存储一次数据库，防止数据几万条数据在内存，容易OOM
        if (cachedDataList.size() >= BATCH_COUNT) {
            repository.saveAllAndFlush(cachedDataList);
            // 存储完成清理 list
            cachedDataList = ListUtils.newArrayListWithExpectedSize(BATCH_COUNT);
        }
    }

    /**
     * 所有数据解析完成了 都会来调用
     *
     * @param analysisContext
     */
    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        log.info("PppoeExcel所有数据解析完成！");
    }
}
