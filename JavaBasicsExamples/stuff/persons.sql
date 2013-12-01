/*
MySQL Backup
Source Host:           localhost
Source Server Version: 5.6.12-log
Source Database:       java_dbcon
Date:                  2013/12/01 15:58:17
*/

SET FOREIGN_KEY_CHECKS=0;
use java_dbcon;
#----------------------------
# Table structure for persons
#----------------------------
CREATE TABLE `persons` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `age` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
#----------------------------
# Records for table persons
#----------------------------


insert  into persons values 
(1, 'panos', '35'), 
(2, 'nikos', '34'), 
(3, 'petros', '33'), 
(4, 'spyros', '35'), 
(5, 'kostas', '32');

