/*
SQLyog Ultimate v10.00 Beta1
MySQL - 5.5.28 : Database - mutipcai
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`mutipcai` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `mutipcai`;

/*Table structure for table `oauserinfomst` */

DROP TABLE IF EXISTS `oauserinfomst`;

CREATE TABLE `oauserinfomst` (
  `USER_NO` bigint(30) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `USER_ID` varchar(100) DEFAULT NULL COMMENT '用户编号',
  `USER_NAM` varchar(200) DEFAULT NULL COMMENT '用户名称',
  `PASSWORD` varchar(100) DEFAULT NULL COMMENT '密码',
  `CREATE_DTM` date DEFAULT NULL COMMENT '注册时间',
  `PHONE_VAL` varchar(50) DEFAULT NULL COMMENT '手机号码',
  `MAIL_VAL` varchar(50) DEFAULT NULL COMMENT '邮箱',
  PRIMARY KEY (`USER_NO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `oauserinfomst` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
