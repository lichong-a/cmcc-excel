package work.lichong.cmcc.excel.bussiness.fgqrepeat.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import work.lichong.cmcc.excel.bussiness.fgqrepeat.entity.FgqPortRepeatEntity;

/**
 * @author ric
 * @date 2021年12月09日 20:30
 * @website https://lichong.work
 */
@Repository
public interface FgqPortRepeatRepository extends JpaRepository<FgqPortRepeatEntity, Long> {
}
