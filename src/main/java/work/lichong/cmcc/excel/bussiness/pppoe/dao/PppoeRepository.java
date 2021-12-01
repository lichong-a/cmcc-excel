package work.lichong.cmcc.excel.bussiness.pppoe.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import work.lichong.cmcc.excel.bussiness.pppoe.entity.PppoeEntity;

/**
 * @author ric
 * @date 2021年12月01日 22:53
 * @website https://lichong.work
 */
@Repository
public interface PppoeRepository extends JpaRepository<PppoeEntity, Long> {
}
