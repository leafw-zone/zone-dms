package cn.leafw.zone.dms.api.dto;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author CareyWYR
 * @description
 * @date 2018/7/11 17:35
 */
@Data
public class DicDto {

    private String dicId;

    private String key;

    private String name;

    private String parentId;

    private String sysId;

    private String isDeleted;

    private Date createTime;

    private String createBy;

    private Date updateTime;

    private String updateBy;
}
