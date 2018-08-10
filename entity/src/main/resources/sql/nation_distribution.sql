CREATE TABLE NATION_DISTRIBUTION (
  `ID` CHAR(32) NOT NULL COMMENT '主键',
  `NATION_NAME` VARCHAR(20) NOT NULL COMMENT '民族',
  `DISTRIBUTION` DOUBLE(10,8) NOT NULL COMMENT '民族',
  `CREATE_DATETIME` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建日期时间',
  `UPDATE_DATETIME` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新日期时间',
  PRIMARY KEY (`ID`),
  UNIQUE KEY `NATION_NAME` (`NATION_NAME`)
) ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT='民族人口分布表';