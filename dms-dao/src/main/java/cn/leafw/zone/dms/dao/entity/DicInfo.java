package cn.leafw.zone.dms.dao.entity;

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
@Entity
@Table(name = "dic_info")
@Data
public class DicInfo {

    @Id
    @Column(name = "dic_id")
    private String dicId;

    @Column(name = "key")
    private String key;

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    @Column(name = "parent_id")
    private String parentId;

    @Column(name = "sys_id")
    private String sysId;

    @Column(name = "is_deleted")
    private String isDeleted;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "create_by")
    private String createBy;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "update_by")
    private String updateBy;
}
