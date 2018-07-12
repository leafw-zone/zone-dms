package cn.leafw.zone.dms.service.impl;

import cn.leafw.zone.dms.api.dto.DicDto;
import cn.leafw.zone.dms.api.dto.DicQueryDto;
import cn.leafw.zone.dms.api.service.DicService;
import cn.leafw.zone.dms.dao.entity.DicInfo;
import cn.leafw.zone.dms.dao.repository.DicInfoRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CareyWYR
 * @description
 * @date 2018/7/12 10:26
 */
@Service
public class DicServiceImpl implements DicService {

    @Autowired
    private DicInfoRepository dicInfoRepository;

    @Override
    public List<DicDto> queryDicListByKey(DicQueryDto dicQueryDto){
        List<DicInfo> dicInfos = dicInfoRepository.findByKey(dicQueryDto.getKey());
        List<DicDto> dicDtoList = new ArrayList<>();
        for (DicInfo dicInfo : dicInfos) {
            DicDto dicDto = new DicDto();
            BeanUtils.copyProperties(dicInfo,dicDto);
            dicDtoList.add(dicDto);
        }
        return dicDtoList;
    }
}
