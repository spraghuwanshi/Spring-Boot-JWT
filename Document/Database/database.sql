/*
SQLyog Community v12.1 (32 bit)
MySQL - 5.6.17 : Database - addressbook_team1
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`addressbook_team1` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `addressbook_team1`;

/*Table structure for table `account` */

DROP TABLE IF EXISTS `account`;

CREATE TABLE `account` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `credentialsexpired` bit(1) NOT NULL,
  `enabled` bit(1) NOT NULL,
  `expired` bit(1) NOT NULL,
  `locked` bit(1) NOT NULL,
  `password` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_gex1lmaqpg0ir5g1f5eftyaa1` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=86 DEFAULT CHARSET=latin1;

/*Data for the table `account` */

insert  into `account`(`id`,`credentialsexpired`,`enabled`,`expired`,`locked`,`password`,`username`) values (3,'\0','','\0','\0','papidakos','cpapidas'),(5,'\0','','\0','\0','b8f57d6d6ec0a60dfe2e20182d4615b12e321cad9e2979e0b9f81e0d6eda78ad9b6dcfe53e4e22d1','cpapidas2'),(10,'\0','','\0','\0','$2a$10$h6cO.XkIuJ8I1kS2ZuaW/uRbv67.0ib7xOLdyLhAdWtN5cXRXSatW','cdddddc'),(11,'\0','','\0','\0','$2a$10$gTqi4RDXj5ovC.MoFHEoEOMMhPqjcvF/R49EjxwfUme6PwXhUHMwa','cc'),(13,'\0','','\0','\0','$2a$10$nlGCcuWdRcLDVOFYzudn5.tl4bhH47mkZDB3JubzbZy6obZVxgdmy','cd'),(15,'\0','','\0','\0','$2a$10$jT/N9/TgXnbGpdH0R1lfL.VlCihlR9jY7CBESimbtyAhOAwo9bguu','cs'),(16,'\0','','\0','\0','$2a$10$wupaAG1Cu8rGI4.kapj7rebxjGKfwjBYjkWbq.F.ZQKyiegu0exrq','wesdfsdfsdfs'),(17,'\0','','\0','\0','$2a$10$QufI1ku2vBT1NBCENVAKUeHsaktKTGZPzn/I66WdcTnXqEhbqAaC6','yy'),(18,'\0','','\0','\0','$2a$10$1OOIk5weuiDjS8S9BKpP3uBohiQ/RaLJjUJfiqdn8IIumXQ6hXn3K','mm33'),(19,'\0','','\0','\0','$2a$10$AZJQX.Zppg2.5geTAnC6V.XUJt.NGtYROpxoKpOdBCHoDCtbU/cNa','mm33dfgdfg'),(20,'\0','','\0','\0','$2a$10$lWh.9oyG1fz7NaMrEd32m.hLm4ucEhQdanNO09fmVFZB1YxyRC3ua','wesdfsdllfsdfs'),(21,'\0','','\0','\0','$2a$10$3ybRtrgCf1D.01aeWwheluIaOEJ8FRw0UZ7LBG.yzvY1.2/QTCghK','asdfafsd234'),(22,'\0','','\0','\0','$2a$10$x1loX5n0.b5MHDSfLWEJduhZgNU.6aVlaxAJ57PlWs.B.FlFDhL3K','asdfafsd234e'),(23,'\0','','\0','\0','$2a$10$qSyGWdtTl2w2ubms8P2c1.PR4.QAxFuAaFMyA133XsGXJfPNXnVzi','sdfsdf333'),(24,'\0','','\0','\0','$2a$10$/Dtd5WqgGTmTGDaB8Sd6vOTdyCu4qc9G94Igukv3QONpuB.aUkBue','sdfsdf333s'),(25,'\0','','\0','\0','$2a$10$MA50o0uzuyqERecKD7Rl4uqdlNDAm1x/4nE2.1cJ1DTvsf8799i.O','fasdf3333'),(26,'\0','','\0','\0','$2a$10$KL00afcwiDbq24EBev1Lj.CG5WSgydNra3LlmRu3CWJMIlNF/TQcO','fasdf33332'),(27,'\0','','\0','\0','$2a$10$PY9L787.w5VgoO9ZH0S62OQOz31.yARV6w.F2QfiRxbPTktZ0s9oy','Christost22'),(28,'\0','','\0','\0','$2a$10$Q9XKh8cc4J7qy0cy9OSksuXhOwMgoghPof8ILZxsULuk3gsMr65gC','asdfasdf234'),(29,'\0','','\0','\0','$2a$10$q4FAN8hsZKwEGWWmKUJK4uan4hBHhq2nd.NLm.tc2qDq3COjHfkz6','adsfsda234'),(30,'\0','','\0','\0','$2a$10$oXvocLdaQVC3n4wKYEtON./1EnOn8Jk5E9XTQEYHvJEjD7uj12Pvy','asdfasdf1234'),(31,'\0','','\0','\0','$2a$10$OFLSsg0x5A36HPq3.2wEDexxPlHQzWvQGo5rmfG5P6eeORtaQ/Ubq','asfdasdf3433'),(32,'\0','','\0','\0','$2a$10$XlUPeD83cMNbnjnXnXHcxubm0n9SrBd.LsCB3wxwAge6tYhwhumZq','fasfafd324'),(38,'\0','','\0','\0','$2a$10$SdZfafMVkFopgdvi/JrBn.h1KDIt.3Dfx6lbhLWB/CiGIBNiGGg/i','asdfasdf2344'),(39,'\0','','\0','\0','$2a$10$7sibRze3x6SVstcQYXSDe.LqhE0gUHvSfDTVZKyURr9EzKykw4sry','dsfsdff444'),(40,'\0','','\0','\0','$2a$10$EglFcHZnRyzrlmvb1ldV9e89IL1IqgdLhgeG/WGAR9UeXRP0fNYnW','ddsdsdfffd'),(41,'\0','','\0','\0','$2a$10$5RcLNvOD.r03ZayV53MxVuUQYbJvDtMrRFTTUVL9G2X0S6/ZxEo3S','papidakos'),(42,'\0','','\0','\0','$2a$10$eR.90pak84ipqOq9HVEMq.VgQ8O9JOFGOYROCzNzb7hdRhI/cEmem','papidakos2'),(43,'\0','','\0','\0','spring','roy'),(44,'\0','','\0','\0','$2a$10$FbaEGdHDEEvpPHjSZkWNyecmsL79lH8qzJKexRo5EH4shvZfd4WhG','papapakiki'),(45,'\0','','\0','\0','$2a$10$69qe1gDLxu9T2n6fIV6s3.bY.uvNBEG/GvLcw7enccZ4HFLY2sMHy','papapakiki1'),(46,'\0','','\0','\0','$2a$10$qBQBPCNXVGd5l.qZd47MKuI.M88K8WiwbigPUxpUbx1WJA5b8oK8q','papalolif'),(47,'\0','','\0','\0','$2a$10$6LZfgsqeunoY4gLc1EZbe..6q5seZrA191F6iH81EeI709Y0h.1Py','fafafakoko'),(84,'\0','','\0','\0','$2a$10$UpnAkQrnHxNUlbzZz8sDw.QGyA3TxdDhi.qfBFRwj6VnP5uNzTvGq','suryaprakash');

/*Table structure for table `account_role` */

DROP TABLE IF EXISTS `account_role`;

CREATE TABLE `account_role` (
  `account_id` bigint(20) NOT NULL,
  `role_id` bigint(20) NOT NULL,
  PRIMARY KEY (`account_id`,`role_id`),
  KEY `FK_p2jpuvn8yll7x96rae4hvw3sj` (`role_id`),
  CONSTRAINT `FK_ibmw1g5w37bmuh5fc0db7wn10` FOREIGN KEY (`account_id`) REFERENCES `account` (`id`),
  CONSTRAINT `FK_p2jpuvn8yll7x96rae4hvw3sj` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `account_role` */

insert  into `account_role`(`account_id`,`role_id`) values (3,1),(5,1),(10,1),(11,1),(13,1),(15,1),(16,1),(17,1),(18,1),(19,1),(20,1),(21,1),(22,1),(23,1),(24,1),(25,1),(26,1),(27,1),(28,1),(29,1),(30,1),(31,1),(32,1),(38,1),(39,1),(40,1),(41,1),(42,1),(44,1),(45,1),(46,1),(47,1),(84,1);

/*Table structure for table `adddressparty1` */

DROP TABLE IF EXISTS `adddressparty1`;

CREATE TABLE `adddressparty1` (
  `AddressId` varchar(20) NOT NULL,
  `CompanyName` varchar(20) DEFAULT NULL,
  `PartyName` varchar(10) DEFAULT NULL,
  `WorkPhoneNumber` varchar(20) DEFAULT NULL,
  `MobileNumber` varchar(20) DEFAULT NULL,
  `Email` varchar(20) DEFAULT NULL,
  `PostCode` varchar(20) DEFAULT NULL,
  `State` varchar(20) DEFAULT NULL,
  `CountryCode` varchar(20) DEFAULT NULL,
  `AddressNote` varchar(20) DEFAULT NULL,
  `accountCode` varchar(20) DEFAULT NULL,
  `receiverAddressType` varchar(20) DEFAULT NULL,
  `businesstaxNumber` varchar(20) DEFAULT NULL,
  `addressType` varchar(20) DEFAULT NULL,
  `createdTs` datetime(6) DEFAULT NULL,
  `createdBy` varchar(20) DEFAULT NULL,
  `lastModifiedTs` datetime(6) DEFAULT NULL,
  `lastModifiedBy` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`AddressId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `adddressparty1` */

/*Table structure for table `adddressparty2` */

DROP TABLE IF EXISTS `adddressparty2`;

CREATE TABLE `adddressparty2` (
  `AddressId` varchar(20) NOT NULL,
  `CompanyName` varchar(20) DEFAULT NULL,
  `PartyName` varchar(10) DEFAULT NULL,
  `WorkPhoneNumber` varchar(20) DEFAULT NULL,
  `MobileNumber` varchar(20) DEFAULT NULL,
  `Email` varchar(20) DEFAULT NULL,
  `PostCode` varchar(20) DEFAULT NULL,
  `State` varchar(20) DEFAULT NULL,
  `CountryCode` varchar(20) DEFAULT NULL,
  `AddressNote` varchar(20) DEFAULT NULL,
  `accountCode` varchar(20) DEFAULT NULL,
  `receiverAddressType` varchar(20) DEFAULT NULL,
  `businesstaxNumber` varchar(20) DEFAULT NULL,
  `addressType` varchar(20) DEFAULT NULL,
  `createdTs` datetime(6) DEFAULT NULL,
  `createdBy` varchar(20) DEFAULT NULL,
  `lastModifiedTs` datetime(6) DEFAULT NULL,
  `lastModifiedBy` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`AddressId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `adddressparty2` */

/*Table structure for table `role` */

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `id` bigint(20) NOT NULL,
  `code` varchar(255) NOT NULL,
  `label` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `role` */

insert  into `role`(`id`,`code`,`label`) values (1,'ROLE_USER','User'),(2,'ROLE_USER','Admin');

/*Table structure for table `user_roles` */

DROP TABLE IF EXISTS `user_roles`;

CREATE TABLE `user_roles` (
  `user_role_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `role` varchar(45) NOT NULL,
  PRIMARY KEY (`user_role_id`),
  UNIQUE KEY `uni_username_role` (`role`,`username`),
  KEY `fk_username_idx` (`username`),
  CONSTRAINT `fk_username` FOREIGN KEY (`username`) REFERENCES `users` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `user_roles` */

insert  into `user_roles`(`user_role_id`,`username`,`role`) values (2,'sun','ROLE_ADMIN'),(3,'naveen','ROLE_USER'),(1,'sun','ROLE_USER');

/*Table structure for table `userinfo` */

DROP TABLE IF EXISTS `userinfo`;

CREATE TABLE `userinfo` (
  `user_id` varchar(10) NOT NULL,
  `username` varchar(8) NOT NULL,
  `firstName` varchar(20) DEFAULT NULL,
  `lastName` varchar(20) DEFAULT NULL,
  `email` varchar(20) NOT NULL,
  `password` varchar(100) DEFAULT NULL,
  `phone` varchar(10) DEFAULT NULL,
  `userStatus` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `userinfo` */

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `enabled` tinyint(4) NOT NULL DEFAULT '1',
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `users` */

insert  into `users`(`username`,`password`,`enabled`) values ('naveen','naveen',1),('sun','sun',1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
