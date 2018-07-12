package cn.leafw.zone.dms.dao.repository;

import cn.leafw.zone.dms.dao.entity.DicInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author CareyWYR
 * @description
 * @date 2018/7/11 17:39
 */
@Repository
public interface DicInfoRepository extends JpaRepository<DicInfo,String> {

    List<DicInfo> findByKey(String key);
}
