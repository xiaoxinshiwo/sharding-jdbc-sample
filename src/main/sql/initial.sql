CREATE DATABASE IF NOT EXISTS `db_0`;
DROP TABLE IF EXISTS `db_0`.`t_order_0`;
CREATE TABLE IF NOT EXISTS `db_0`.`t_order_0` (
  `order_id` bigint(20) unsigned NOT NULL  ,
  `user_id`  INT NOT NULL,
  `status`   VARCHAR(50),
  PRIMARY KEY (`order_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `db_0`.`t_order_1`;
CREATE TABLE IF NOT EXISTS `db_0`.`t_order_1` (
  `order_id` bigint(20) unsigned NOT NULL  ,
  `user_id`  INT NOT NULL,
  `status`   VARCHAR(50),
  PRIMARY KEY (`order_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `db_0`.`t_order_item_0`;
CREATE TABLE IF NOT EXISTS `db_0`.`t_order_item_0` (
  `order_item_id` bigint(20) unsigned NOT NULL,
  `order_id` bigint(20) unsigned NOT NULL,
  `item_id`   INT NOT NULL,
  `price` INT NOT NULL,
  PRIMARY KEY (`order_item_id`),
  KEY `order_id_idx` (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `db_0`.`t_order_item_1`;
CREATE TABLE IF NOT EXISTS `db_0`.`t_order_item_1` (
  `order_item_id` bigint(20) unsigned NOT NULL,
  `order_id` bigint(20) unsigned NOT NULL,
  `item_id`   INT NOT NULL,
  `price` INT NOT NULL,
  PRIMARY KEY (`order_item_id`),
  KEY `order_id_idx` (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `db_1`.`t_order_0`;
CREATE TABLE IF NOT EXISTS `db_1`.`t_order_0` (
  `order_id` bigint(20) unsigned NOT NULL  ,
  `user_id`  INT NOT NULL,
  `status`   VARCHAR(50),
  PRIMARY KEY (`order_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `db_1`.`t_order_1`;
CREATE TABLE IF NOT EXISTS `db_1`.`t_order_1` (
  `order_id` bigint(20) unsigned NOT NULL  ,
  `user_id`  INT NOT NULL,
  `status`   VARCHAR(50),
  PRIMARY KEY (`order_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `db_1`.`t_order_item_0`;
CREATE TABLE IF NOT EXISTS `db_1`.`t_order_item_0` (
  `order_item_id` bigint(20) unsigned NOT NULL,
  `order_id` bigint(20) unsigned NOT NULL,
  `item_id`   INT NOT NULL,
  `price` INT NOT NULL,
  PRIMARY KEY (`order_item_id`),
  KEY `order_id_idx` (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `db_1`.`t_order_item_1`;
CREATE TABLE IF NOT EXISTS `db_1`.`t_order_item_1` (
  `order_item_id` bigint(20) unsigned NOT NULL,
  `order_id` bigint(20) unsigned NOT NULL,
  `item_id`   INT NOT NULL,
  `price` INT NOT NULL,
  PRIMARY KEY (`order_item_id`),
  KEY `order_id_idx` (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;