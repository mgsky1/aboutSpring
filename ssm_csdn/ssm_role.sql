/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50536
Source Host           : localhost
Source Database       : mydb

Target Server Type    : MYSQL
Target Server Version : 50536
File Encoding         : 65001

Date: 2018-07-02 11:26:32
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `ssm_role`
-- ----------------------------
DROP TABLE IF EXISTS `ssm_role`;
CREATE TABLE `ssm_role` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `ROLENAME` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ssm_role
-- ----------------------------
INSERT INTO `ssm_role` VALUES ('1', '学生');
INSERT INTO `ssm_role` VALUES ('2', '老师');
INSERT INTO `ssm_role` VALUES ('3', '公务员');
INSERT INTO `ssm_role` VALUES ('4', '技术员');
INSERT INTO `ssm_role` VALUES ('5', '保安');
INSERT INTO `ssm_role` VALUES ('6', 'CEO');
INSERT INTO `ssm_role` VALUES ('7', '司机');
INSERT INTO `ssm_role` VALUES ('8', '保洁员');
INSERT INTO `ssm_role` VALUES ('9', '医生');
INSERT INTO `ssm_role` VALUES ('10', '护士');
INSERT INTO `ssm_role` VALUES ('32', '宇航员');
INSERT INTO `ssm_role` VALUES ('33', '交警');
INSERT INTO `ssm_role` VALUES ('34', '法官');
INSERT INTO `ssm_role` VALUES ('35', '侦察员');
