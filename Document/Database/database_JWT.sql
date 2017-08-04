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
  PRIMARY KEY (`user_id`),
  CONSTRAINT `AddressParty_FK1` FOREIGN KEY (`user_id`) REFERENCES `adddressparty1` (`AddressId`),
  CONSTRAINT `AddressParty_FK2` FOREIGN KEY (`user_id`) REFERENCES `adddressparty2` (`AddressId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;