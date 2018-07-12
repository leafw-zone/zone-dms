CREATE TABLE `dic_info` (
  `dic_id` varchar(30) NOT NULL COMMENT '编号',
  `key` varchar(30) DEFAULT NULL COMMENT '键',
  `code` varchar(30) DEFAULT NULL COMMENT '值对应code',
  `name` varchar(30) DEFAULT NULL COMMENT '值',
  `parent_id` varchar(30) DEFAULT NULL COMMENT '父键id',
  `sys_id` varchar(30) DEFAULT NULL COMMENT '系统id',
  `is_deleted` varchar(1) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `create_by` varchar(30) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `update_by` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`dic_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;