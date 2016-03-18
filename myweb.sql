/*
Navicat MySQL Data Transfer

Source Server         : MyWeb
Source Server Version : 50626
Source Host           : localhost:3306
Source Database       : myweb

Target Server Type    : MYSQL
Target Server Version : 50626
File Encoding         : 65001

Date: 2015-12-03 13:27:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for age
-- ----------------------------
DROP TABLE IF EXISTS `age`;
CREATE TABLE `age` (
  `aid` int(11) DEFAULT NULL,
  `age` varchar(255) DEFAULT NULL,
  `agename` varchar(255) CHARACTER SET utf8 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of age
-- ----------------------------
INSERT INTO `age` VALUES ('1', 'baby', 'Baby');
INSERT INTO `age` VALUES ('2', 'children', 'Children');
INSERT INTO `age` VALUES ('3', 'young', 'Young');
INSERT INTO `age` VALUES ('4', 'adult', 'Adult');
INSERT INTO `age` VALUES ('5', 'old', 'Old');

-- ----------------------------
-- Table structure for day
-- ----------------------------
DROP TABLE IF EXISTS `day`;
CREATE TABLE `day` (
  `did` int(11) DEFAULT NULL,
  `day` varchar(255) DEFAULT NULL,
  `dayname` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of day
-- ----------------------------
INSERT INTO `day` VALUES ('2', 'moon', 'Moon Day');
INSERT INTO `day` VALUES ('1', 'spring', 'Spring Festival');
INSERT INTO `day` VALUES ('3', 'birthday', 'Birthday');
INSERT INTO `day` VALUES ('4', 'marry', 'Marry day');
INSERT INTO `day` VALUES ('5', 'love', 'Valentine\'s Day');
INSERT INTO `day` VALUES ('6', 'move', 'Move Home move day');

-- ----------------------------
-- Table structure for gift_age
-- ----------------------------
DROP TABLE IF EXISTS `gift_age`;
CREATE TABLE `gift_age` (
  `gid` int(11) DEFAULT NULL,
  `aid` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of gift_age
-- ----------------------------
INSERT INTO `gift_age` VALUES ('1', '5');
INSERT INTO `gift_age` VALUES ('2', '5');
INSERT INTO `gift_age` VALUES ('3', '5');
INSERT INTO `gift_age` VALUES ('4', '5');
INSERT INTO `gift_age` VALUES ('5', '5');
INSERT INTO `gift_age` VALUES ('6', '5');
INSERT INTO `gift_age` VALUES ('7', '5');
INSERT INTO `gift_age` VALUES ('8', '5');
INSERT INTO `gift_age` VALUES ('9', '5');
INSERT INTO `gift_age` VALUES ('10', '4');
INSERT INTO `gift_age` VALUES ('11', '3');
INSERT INTO `gift_age` VALUES ('12', '4');
INSERT INTO `gift_age` VALUES ('13', '4');
INSERT INTO `gift_age` VALUES ('14', '4');
INSERT INTO `gift_age` VALUES ('15', '4');
INSERT INTO `gift_age` VALUES ('16', '4');
INSERT INTO `gift_age` VALUES ('17', '3');
INSERT INTO `gift_age` VALUES ('18', '3');
INSERT INTO `gift_age` VALUES ('19', '3');
INSERT INTO `gift_age` VALUES ('20', '3');
INSERT INTO `gift_age` VALUES ('21', '3');
INSERT INTO `gift_age` VALUES ('22', '3');
INSERT INTO `gift_age` VALUES ('23', '2');
INSERT INTO `gift_age` VALUES ('24', '2');
INSERT INTO `gift_age` VALUES ('25', '2');
INSERT INTO `gift_age` VALUES ('26', '2');
INSERT INTO `gift_age` VALUES ('27', '2');
INSERT INTO `gift_age` VALUES ('28', '2');
INSERT INTO `gift_age` VALUES ('29', '2');
INSERT INTO `gift_age` VALUES ('30', '1');
INSERT INTO `gift_age` VALUES ('31', '1');
INSERT INTO `gift_age` VALUES ('32', '1');
INSERT INTO `gift_age` VALUES ('33', '1');
INSERT INTO `gift_age` VALUES ('34', '1');
INSERT INTO `gift_age` VALUES ('35', '1');
INSERT INTO `gift_age` VALUES ('36', '1');
INSERT INTO `gift_age` VALUES ('37', '1');
INSERT INTO `gift_age` VALUES ('38', '1');
INSERT INTO `gift_age` VALUES ('39', '4');
INSERT INTO `gift_age` VALUES ('40', '4');
INSERT INTO `gift_age` VALUES ('41', '3');
INSERT INTO `gift_age` VALUES ('42', '3');
INSERT INTO `gift_age` VALUES ('43', '4');
INSERT INTO `gift_age` VALUES ('44', '4');
INSERT INTO `gift_age` VALUES ('45', '4');
INSERT INTO `gift_age` VALUES ('46', '4');
INSERT INTO `gift_age` VALUES ('47', '3');
INSERT INTO `gift_age` VALUES ('48', '3');
INSERT INTO `gift_age` VALUES ('49', '3');
INSERT INTO `gift_age` VALUES ('50', '3');
INSERT INTO `gift_age` VALUES ('51', '3');

-- ----------------------------
-- Table structure for gift_day
-- ----------------------------
DROP TABLE IF EXISTS `gift_day`;
CREATE TABLE `gift_day` (
  `gid` int(11) DEFAULT NULL,
  `did` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of gift_day
-- ----------------------------
INSERT INTO `gift_day` VALUES ('1', '1');
INSERT INTO `gift_day` VALUES ('2', '1');
INSERT INTO `gift_day` VALUES ('3', '1');
INSERT INTO `gift_day` VALUES ('4', '1');
INSERT INTO `gift_day` VALUES ('5', '1');
INSERT INTO `gift_day` VALUES ('6', '1');
INSERT INTO `gift_day` VALUES ('7', '1');
INSERT INTO `gift_day` VALUES ('8', '1');
INSERT INTO `gift_day` VALUES ('9', '2');
INSERT INTO `gift_day` VALUES ('10', '2');
INSERT INTO `gift_day` VALUES ('11', '2');
INSERT INTO `gift_day` VALUES ('12', '2');
INSERT INTO `gift_day` VALUES ('13', '2');
INSERT INTO `gift_day` VALUES ('14', '2');
INSERT INTO `gift_day` VALUES ('15', '2');
INSERT INTO `gift_day` VALUES ('16', '3');
INSERT INTO `gift_day` VALUES ('17', '3');
INSERT INTO `gift_day` VALUES ('18', '3');
INSERT INTO `gift_day` VALUES ('19', '3');
INSERT INTO `gift_day` VALUES ('20', '3');
INSERT INTO `gift_day` VALUES ('21', '3');
INSERT INTO `gift_day` VALUES ('22', '3');
INSERT INTO `gift_day` VALUES ('23', '3');
INSERT INTO `gift_day` VALUES ('24', '4');
INSERT INTO `gift_day` VALUES ('25', '4');
INSERT INTO `gift_day` VALUES ('26', '4');
INSERT INTO `gift_day` VALUES ('27', '4');
INSERT INTO `gift_day` VALUES ('28', '4');
INSERT INTO `gift_day` VALUES ('29', '4');
INSERT INTO `gift_day` VALUES ('30', '4');
INSERT INTO `gift_day` VALUES ('31', '4');
INSERT INTO `gift_day` VALUES ('32', '5');
INSERT INTO `gift_day` VALUES ('33', '5');
INSERT INTO `gift_day` VALUES ('34', '5');
INSERT INTO `gift_day` VALUES ('35', '5');
INSERT INTO `gift_day` VALUES ('36', '5');
INSERT INTO `gift_day` VALUES ('37', '5');
INSERT INTO `gift_day` VALUES ('38', '5');
INSERT INTO `gift_day` VALUES ('39', '5');
INSERT INTO `gift_day` VALUES ('40', '6');
INSERT INTO `gift_day` VALUES ('41', '6');
INSERT INTO `gift_day` VALUES ('42', '6');
INSERT INTO `gift_day` VALUES ('43', '6');
INSERT INTO `gift_day` VALUES ('44', '6');
INSERT INTO `gift_day` VALUES ('45', '6');
INSERT INTO `gift_day` VALUES ('46', '6');
INSERT INTO `gift_day` VALUES ('47', '6');
INSERT INTO `gift_day` VALUES ('48', '6');
INSERT INTO `gift_day` VALUES ('49', '6');
INSERT INTO `gift_day` VALUES ('50', '6');
INSERT INTO `gift_day` VALUES ('51', '6');

-- ----------------------------
-- Table structure for gift_hot
-- ----------------------------
DROP TABLE IF EXISTS `gift_hot`;
CREATE TABLE `gift_hot` (
  `gid` int(11) NOT NULL,
  `ghot` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`gid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of gift_hot
-- ----------------------------
INSERT INTO `gift_hot` VALUES ('1', '3');
INSERT INTO `gift_hot` VALUES ('2', '4');
INSERT INTO `gift_hot` VALUES ('3', '0');
INSERT INTO `gift_hot` VALUES ('4', '0');
INSERT INTO `gift_hot` VALUES ('5', '0');
INSERT INTO `gift_hot` VALUES ('6', '1');
INSERT INTO `gift_hot` VALUES ('7', '0');
INSERT INTO `gift_hot` VALUES ('8', '0');
INSERT INTO `gift_hot` VALUES ('9', '0');
INSERT INTO `gift_hot` VALUES ('10', '0');
INSERT INTO `gift_hot` VALUES ('11', '2');
INSERT INTO `gift_hot` VALUES ('12', '0');
INSERT INTO `gift_hot` VALUES ('13', '0');
INSERT INTO `gift_hot` VALUES ('14', '0');
INSERT INTO `gift_hot` VALUES ('15', '0');
INSERT INTO `gift_hot` VALUES ('16', '2');
INSERT INTO `gift_hot` VALUES ('17', '1');
INSERT INTO `gift_hot` VALUES ('18', '0');
INSERT INTO `gift_hot` VALUES ('19', '0');
INSERT INTO `gift_hot` VALUES ('20', '0');
INSERT INTO `gift_hot` VALUES ('21', '0');
INSERT INTO `gift_hot` VALUES ('22', '0');
INSERT INTO `gift_hot` VALUES ('23', '0');
INSERT INTO `gift_hot` VALUES ('24', '0');
INSERT INTO `gift_hot` VALUES ('25', '0');
INSERT INTO `gift_hot` VALUES ('26', '0');
INSERT INTO `gift_hot` VALUES ('27', '0');
INSERT INTO `gift_hot` VALUES ('28', '0');
INSERT INTO `gift_hot` VALUES ('29', '0');
INSERT INTO `gift_hot` VALUES ('30', '0');
INSERT INTO `gift_hot` VALUES ('31', '0');
INSERT INTO `gift_hot` VALUES ('32', '0');
INSERT INTO `gift_hot` VALUES ('33', '0');
INSERT INTO `gift_hot` VALUES ('34', '0');
INSERT INTO `gift_hot` VALUES ('35', '0');
INSERT INTO `gift_hot` VALUES ('36', '0');
INSERT INTO `gift_hot` VALUES ('37', '0');
INSERT INTO `gift_hot` VALUES ('38', '0');
INSERT INTO `gift_hot` VALUES ('39', '0');
INSERT INTO `gift_hot` VALUES ('40', '0');
INSERT INTO `gift_hot` VALUES ('41', '0');
INSERT INTO `gift_hot` VALUES ('42', '0');
INSERT INTO `gift_hot` VALUES ('43', '0');
INSERT INTO `gift_hot` VALUES ('44', '0');
INSERT INTO `gift_hot` VALUES ('45', '0');
INSERT INTO `gift_hot` VALUES ('46', '0');
INSERT INTO `gift_hot` VALUES ('47', '0');
INSERT INTO `gift_hot` VALUES ('48', '0');
INSERT INTO `gift_hot` VALUES ('49', '0');
INSERT INTO `gift_hot` VALUES ('50', '0');
INSERT INTO `gift_hot` VALUES ('51', '0');

-- ----------------------------
-- Table structure for gift_info
-- ----------------------------
DROP TABLE IF EXISTS `gift_info`;
CREATE TABLE `gift_info` (
  `gid` int(11) NOT NULL,
  `gname` varchar(255) CHARACTER SET latin1 DEFAULT NULL,
  `gpic` varchar(255) CHARACTER SET latin1 DEFAULT NULL,
  `gabout` varchar(255) CHARACTER SET latin1 DEFAULT NULL,
  `glink` varchar(255) CHARACTER SET latin1 DEFAULT NULL,
  PRIMARY KEY (`gid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of gift_info
-- ----------------------------
INSERT INTO `gift_info` VALUES ('1', 'spirit', '01.jpg', '1.txt', 'http://world.taobao.com/');
INSERT INTO `gift_info` VALUES ('2', 'teapot', '02.jpg', '2.txt', 'http://world.taobao.com/');
INSERT INTO `gift_info` VALUES ('3', 'china', '03.jpg', '3.txt', 'http://world.taobao.com/');
INSERT INTO `gift_info` VALUES ('4', 'Buddha bead', '04.jpg', '4.txt', 'http://world.taobao.com/');
INSERT INTO `gift_info` VALUES ('5', 'bathtub', '05.jpg', '5.txt', 'http://world.taobao.com/');
INSERT INTO `gift_info` VALUES ('6', 'fan', '06.jpg', '6.txt', 'http://world.taobao.com/');
INSERT INTO `gift_info` VALUES ('7', 'writing materials', '07.jpg', '7.txt', 'http://world.taobao.com/');
INSERT INTO `gift_info` VALUES ('8', 'pillow', '08.jpg', '8.txt', 'http://world.taobao.com/');
INSERT INTO `gift_info` VALUES ('9', 'tea', '09.jpg', '9.txt', 'http://world.taobao.com/');
INSERT INTO `gift_info` VALUES ('10', 'belt', '10.jpg', '10.txt', 'http://world.taobao.com/');
INSERT INTO `gift_info` VALUES ('11', 'Bracelets', '11.jpg', '11.txt', 'http://world.taobao.com/');
INSERT INTO `gift_info` VALUES ('12', 'apron', '12.jpg', '12.txt', 'http://world.taobao.com/');
INSERT INTO `gift_info` VALUES ('13', 'vacuum cleaner', '13.jpg', '13.txt', 'http://world.taobao.com/');
INSERT INTO `gift_info` VALUES ('14', 'massager', '14.jpg', '14.txt', 'http://world.taobao.com/');
INSERT INTO `gift_info` VALUES ('15', 'pet', '15.jpg', '15.txt', 'http://world.taobao.com/');
INSERT INTO `gift_info` VALUES ('16', 'wallet', '16.jpg', '16.txt', 'http://world.taobao.com/');
INSERT INTO `gift_info` VALUES ('17', 'chocolate', '17.jpg', '17.txt', 'http://world.taobao.com/');
INSERT INTO `gift_info` VALUES ('18', 'watch', '18.jpg', '18.txt', 'http://world.taobao.com/');
INSERT INTO `gift_info` VALUES ('19', 'books', '19.jpg', '19.txt', 'http://world.taobao.com/');
INSERT INTO `gift_info` VALUES ('20', 'camera', '20.jpg', '20.txt', 'http://world.taobao.com/');
INSERT INTO `gift_info` VALUES ('21', 'shoes', '21.jpg', '21.txt', 'http://world.taobao.com/');
INSERT INTO `gift_info` VALUES ('22', 'piggy bank', '22.jpg', '22.txt', 'http://world.taobao.com/');
INSERT INTO `gift_info` VALUES ('23', 'crayon', '23.jpg', '23.txt', 'http://world.taobao.com/');
INSERT INTO `gift_info` VALUES ('24', 'plush toys', '24.jpg', '24.txt', 'http://world.taobao.com/');
INSERT INTO `gift_info` VALUES ('25', 'diary book', '25.jpg', '25.txt', 'http://world.taobao.com/');
INSERT INTO `gift_info` VALUES ('26', 'bag', '26.jpg', '26.txt', 'http://world.taobao.com/');
INSERT INTO `gift_info` VALUES ('27', 'candy', '27.jpg', '27.txt', 'http://world.taobao.com/');
INSERT INTO `gift_info` VALUES ('28', 'clothes', '28.jpg', '28.txt', 'http://world.taobao.com/');
INSERT INTO `gift_info` VALUES ('29', 'toy car', '29.jpg', '29.txt', 'http://world.taobao.com/');
INSERT INTO `gift_info` VALUES ('30', 'Rattle drum', '30.jpg', '30.txt', 'http://world.taobao.com/');
INSERT INTO `gift_info` VALUES ('31', 'bell', '31.jpg', '31.txt', 'http://world.taobao.com/');
INSERT INTO `gift_info` VALUES ('32', 'milk powder', '32.jpg', '32.txt', 'http://world.taobao.com/');
INSERT INTO `gift_info` VALUES ('33', 'Feeding bottle', '33.jpg', '33.txt', 'http://world.taobao.com/');
INSERT INTO `gift_info` VALUES ('34', 'Baby Basin', '34.jpg', '34.txt', 'http://world.taobao.com/');
INSERT INTO `gift_info` VALUES ('35', 'crib', '35.jpg', '35.txt', 'http://world.taobao.com/');
INSERT INTO `gift_info` VALUES ('36', 'stroller', '36.jpg', '36.txt', 'http://world.taobao.com/');
INSERT INTO `gift_info` VALUES ('37', 'baby clothes', '37.jpg', '37.txt', 'http://world.taobao.com/');
INSERT INTO `gift_info` VALUES ('38', 'Music Box', '38.jpg', '38.txt', 'http://world.taobao.com/');
INSERT INTO `gift_info` VALUES ('39', 'pendulum clock', '39.jpg', '39.txt', 'http://world.taobao.com/');
INSERT INTO `gift_info` VALUES ('40', 'tableware', '40.jpg', '40.txt', 'http://world.taobao.com/');
INSERT INTO `gift_info` VALUES ('41', 'cake', '41.jpg', '41.txt', 'http://world.taobao.com/');
INSERT INTO `gift_info` VALUES ('42', 'paintings', '42.jpg', '42.txt', 'http://world.taobao.com/');
INSERT INTO `gift_info` VALUES ('43', 'nut', '43.jpg', '43.txt', 'http://world.taobao.com/');
INSERT INTO `gift_info` VALUES ('44', 'flowers', '44.jpg', '44.txt', 'http://world.taobao.com/');
INSERT INTO `gift_info` VALUES ('45', 'crafts', '45.jpg', '45.txt', 'http://world.taobao.com/');
INSERT INTO `gift_info` VALUES ('46', 'moon cake', '46.jpg', '46.txt', 'http://world.taobao.com/');
INSERT INTO `gift_info` VALUES ('47', 'lamp', '47.jpg', '47.txt', 'http://world.taobao.com/');
INSERT INTO `gift_info` VALUES ('48', 'oven', '48.jpg', '48.txt', 'http://world.taobao.com/');
INSERT INTO `gift_info` VALUES ('49', 'headset', '49.jpg', '49.txt', 'http://world.taobao.com/');
INSERT INTO `gift_info` VALUES ('50', 'keyboard', '50.jpg', '50.txt', 'http://world.taobao.com/');
INSERT INTO `gift_info` VALUES ('51', 'toys', '51.jpg', '51.txt', 'http://world.taobao.com/');

-- ----------------------------
-- Table structure for gift_story
-- ----------------------------
DROP TABLE IF EXISTS `gift_story`;
CREATE TABLE `gift_story` (
  `gid` int(11) DEFAULT NULL,
  `sid` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of gift_story
-- ----------------------------
INSERT INTO `gift_story` VALUES ('1', '1');
INSERT INTO `gift_story` VALUES ('2', '1');
INSERT INTO `gift_story` VALUES ('3', '1');
INSERT INTO `gift_story` VALUES ('4', '2');
INSERT INTO `gift_story` VALUES ('5', '2');
INSERT INTO `gift_story` VALUES ('6', '2');

-- ----------------------------
-- Table structure for gift_tag
-- ----------------------------
DROP TABLE IF EXISTS `gift_tag`;
CREATE TABLE `gift_tag` (
  `gid` int(11) DEFAULT NULL,
  `tid` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of gift_tag
-- ----------------------------
INSERT INTO `gift_tag` VALUES ('1', '1');
INSERT INTO `gift_tag` VALUES ('2', '1');
INSERT INTO `gift_tag` VALUES ('3', '1');
INSERT INTO `gift_tag` VALUES ('4', '1');
INSERT INTO `gift_tag` VALUES ('5', '1');
INSERT INTO `gift_tag` VALUES ('6', '1');
INSERT INTO `gift_tag` VALUES ('7', '1');
INSERT INTO `gift_tag` VALUES ('8', '2');
INSERT INTO `gift_tag` VALUES ('9', '2');
INSERT INTO `gift_tag` VALUES ('10', '2');
INSERT INTO `gift_tag` VALUES ('11', '2');
INSERT INTO `gift_tag` VALUES ('12', '2');
INSERT INTO `gift_tag` VALUES ('13', '2');
INSERT INTO `gift_tag` VALUES ('14', '2');
INSERT INTO `gift_tag` VALUES ('15', '2');
INSERT INTO `gift_tag` VALUES ('16', '3');
INSERT INTO `gift_tag` VALUES ('17', '3');
INSERT INTO `gift_tag` VALUES ('18', '3');
INSERT INTO `gift_tag` VALUES ('19', '3');
INSERT INTO `gift_tag` VALUES ('20', '3');
INSERT INTO `gift_tag` VALUES ('21', '3');
INSERT INTO `gift_tag` VALUES ('22', '3');
INSERT INTO `gift_tag` VALUES ('23', '3');
INSERT INTO `gift_tag` VALUES ('24', '3');
INSERT INTO `gift_tag` VALUES ('25', '4');
INSERT INTO `gift_tag` VALUES ('26', '4');
INSERT INTO `gift_tag` VALUES ('27', '4');
INSERT INTO `gift_tag` VALUES ('28', '4');
INSERT INTO `gift_tag` VALUES ('29', '4');
INSERT INTO `gift_tag` VALUES ('30', '4');
INSERT INTO `gift_tag` VALUES ('31', '4');
INSERT INTO `gift_tag` VALUES ('32', '4');
INSERT INTO `gift_tag` VALUES ('33', '4');
INSERT INTO `gift_tag` VALUES ('34', '5');
INSERT INTO `gift_tag` VALUES ('35', '5');
INSERT INTO `gift_tag` VALUES ('36', '5');
INSERT INTO `gift_tag` VALUES ('37', '5');
INSERT INTO `gift_tag` VALUES ('38', '5');
INSERT INTO `gift_tag` VALUES ('39', '5');
INSERT INTO `gift_tag` VALUES ('40', '5');
INSERT INTO `gift_tag` VALUES ('41', '5');
INSERT INTO `gift_tag` VALUES ('42', '6');
INSERT INTO `gift_tag` VALUES ('43', '6');
INSERT INTO `gift_tag` VALUES ('44', '6');
INSERT INTO `gift_tag` VALUES ('45', '6');
INSERT INTO `gift_tag` VALUES ('46', '6');
INSERT INTO `gift_tag` VALUES ('47', '6');
INSERT INTO `gift_tag` VALUES ('48', '6');
INSERT INTO `gift_tag` VALUES ('49', '6');
INSERT INTO `gift_tag` VALUES ('50', '6');
INSERT INTO `gift_tag` VALUES ('51', '6');
INSERT INTO `gift_tag` VALUES ('51', '1');

-- ----------------------------
-- Table structure for message
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `uname` varchar(255) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of message
-- ----------------------------
INSERT INTO `message` VALUES ('marry', 'Good Website!');
INSERT INTO `message` VALUES ('Jack', 'I agree with marry!');
INSERT INTO `message` VALUES ('jack', 'May you recommend to me a good gift for my father?');
INSERT INTO `message` VALUES ('Alice', 'hello,world');
INSERT INTO `message` VALUES ('Alex', '6666666666');

-- ----------------------------
-- Table structure for story_con
-- ----------------------------
DROP TABLE IF EXISTS `story_con`;
CREATE TABLE `story_con` (
  `sid` int(11) DEFAULT NULL,
  `gid` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of story_con
-- ----------------------------
INSERT INTO `story_con` VALUES ('1', '1');
INSERT INTO `story_con` VALUES ('1', '2');
INSERT INTO `story_con` VALUES ('1', '3');
INSERT INTO `story_con` VALUES ('2', '4');
INSERT INTO `story_con` VALUES ('2', '5');
INSERT INTO `story_con` VALUES ('2', '6');

-- ----------------------------
-- Table structure for story_info
-- ----------------------------
DROP TABLE IF EXISTS `story_info`;
CREATE TABLE `story_info` (
  `sid` int(11) NOT NULL,
  `stitle` varchar(255) CHARACTER SET latin1 DEFAULT NULL,
  `sabout` varchar(255) CHARACTER SET latin1 DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of story_info
-- ----------------------------
INSERT INTO `story_info` VALUES ('1', 'Ad of KFC', '1.txt');
INSERT INTO `story_info` VALUES ('2', 'Ad of Coca cola', '2.txt');

-- ----------------------------
-- Table structure for tag
-- ----------------------------
DROP TABLE IF EXISTS `tag`;
CREATE TABLE `tag` (
  `tid` int(11) DEFAULT NULL,
  `tag` varchar(255) DEFAULT NULL,
  `tagname` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of tag
-- ----------------------------
INSERT INTO `tag` VALUES ('1', 'cute', 'Cute');
INSERT INTO `tag` VALUES ('2', 'eat', 'Eat');
INSERT INTO `tag` VALUES ('3', 'cartoon', 'Cartoon');
INSERT INTO `tag` VALUES ('4', 'tech', 'Technology');
INSERT INTO `tag` VALUES ('5', 'art', 'Art');
INSERT INTO `tag` VALUES ('6', 'beauty', 'Beautiful');

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `uname` varchar(255) CHARACTER SET latin1 DEFAULT NULL,
  `password` varchar(255) CHARACTER SET latin1 DEFAULT NULL,
  `usex` varchar(255) CHARACTER SET latin1 DEFAULT NULL,
  `uage` varchar(255) CHARACTER SET latin1 DEFAULT NULL,
  `utag` varchar(255) CHARACTER SET latin1 DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES ('1', 'jack', '123123', 'male', 'baby', 'cute');
INSERT INTO `user_info` VALUES ('2', 'kkkk', '123123', 'male', 'young', 'cartoon');
INSERT INTO `user_info` VALUES ('3', 'Jerry', '123123', 'female', 'young', 'eat');
INSERT INTO `user_info` VALUES ('4', 'sam', '123123', 'male', 'old', 'eat');
INSERT INTO `user_info` VALUES ('5', 'Marry', '123123', 'female', 'young', 'tech');
INSERT INTO `user_info` VALUES ('6', 'Alice', '123123', 'male', 'young', 'cartoon');
INSERT INTO `user_info` VALUES ('7', 'Alex', '123123', 'male', 'old', 'eat');
INSERT INTO `user_info` VALUES ('8', 'kit', '123123', 'male', 'old', 'eat');
INSERT INTO `user_info` VALUES ('9', 'qwee', 'qweqwe', 'female', 'old', 'beauty');
INSERT INTO `user_info` VALUES ('10', 'qqq', '1231213', 'female', 'old', 'beauty');
INSERT INTO `user_info` VALUES ('11', 'qwe', '123456', 'female', 'old', 'beauty');
INSERT INTO `user_info` VALUES ('12', '123456', '123456', 'male', 'baby', 'eat');

-- ----------------------------
-- Table structure for user_zan
-- ----------------------------
DROP TABLE IF EXISTS `user_zan`;
CREATE TABLE `user_zan` (
  `uid` int(11) DEFAULT NULL,
  `gid` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of user_zan
-- ----------------------------
INSERT INTO `user_zan` VALUES ('2', '11');
INSERT INTO `user_zan` VALUES ('2', '16');
INSERT INTO `user_zan` VALUES ('2', '17');
INSERT INTO `user_zan` VALUES ('1', '1');
INSERT INTO `user_zan` VALUES ('1', '2');
INSERT INTO `user_zan` VALUES ('1', '6');
INSERT INTO `user_zan` VALUES ('3', '1');
INSERT INTO `user_zan` VALUES ('3', '2');
INSERT INTO `user_zan` VALUES ('4', '2');
INSERT INTO `user_zan` VALUES ('5', '1');
INSERT INTO `user_zan` VALUES ('5', '2');
INSERT INTO `user_zan` VALUES ('6', '11');
INSERT INTO `user_zan` VALUES ('6', '16');
