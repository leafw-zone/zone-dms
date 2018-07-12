package cn.leafw.zone.dms.api.service;

import cn.leafw.zone.dms.api.dto.DicDto;
import cn.leafw.zone.dms.api.dto.DicQueryDto;

import java.util.List;

/**
 * @author CareyWYR
 * @description
 * @date 2018/7/11 17:39
 */
public interface DicService {

    List<DicDto> queryDicListByKey(DicQueryDto dicQueryDto);
}
