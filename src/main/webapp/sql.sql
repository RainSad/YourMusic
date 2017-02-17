/*
Navicat MySQL Data Transfer

Source Server         : jfinal
Source Server Version : 50551
Source Host           : localhost:3306
Source Database       : yourmusic

Target Server Type    : MYSQL
Target Server Version : 50551
File Encoding         : 65001

Date: 2017-02-17 15:21:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user_login
-- ----------------------------
DROP TABLE IF EXISTS `user_login`;
CREATE TABLE `user_login` (
  `user_id` varchar(10) NOT NULL,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for index_music_info
-- ----------------------------
DROP TABLE IF EXISTS `index_music_info`;
CREATE TABLE `index_music_info` (
  `user_id` varchar(10) NOT NULL,
  `music_discription` varchar(1000) DEFAULT NULL,
  `music_img_src` varchar(20) DEFAULT NULL,
  `music_company` varchar(20) DEFAULT NULL,
  `music_paly_info` varchar(30) DEFAULT NULL,
  `time` varchar(10) DEFAULT NULL,
  `click_num` varchar(13) DEFAULT NULL,
  `support_num` varchar(13) DEFAULT NULL,
  `is_top` varchar(2) DEFAULT NULL,
  `yuliu1` varchar(255) DEFAULT NULL,
  `yuliu2` varchar(255) DEFAULT NULL,
  `yuliu3` varchar(255) DEFAULT NULL,
  `yuliu4` varchar(255) DEFAULT NULL,
  `yuliu5` varchar(255) DEFAULT NULL,
  `yuliu6` varchar(255) DEFAULT NULL,
  `yuliu7` varchar(255) DEFAULT NULL,
  `yuliu8` varchar(255) DEFAULT NULL,
  `yuliu9` varchar(255) DEFAULT NULL,
  `yuliu10` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `user_id` varchar(10) NOT NULL,
  `user_name` varchar(20) DEFAULT NULL,
  `user_key` varchar(20) DEFAULT NULL,
  `user_sex` varchar(2) DEFAULT NULL,
  `user_birthday` varchar(10) DEFAULT NULL,
  `user_qq` varchar(13) DEFAULT NULL,
  `user_wechat` varchar(20) DEFAULT NULL,
  `user_scope` varchar(10) DEFAULT NULL,
  `user_login_times` varchar(10) DEFAULT NULL,
  `user_reg_ip` varchar(20) DEFAULT NULL,
  `user_reg_time` varchar(10) DEFAULT NULL,
  `user_last_login_ip` varchar(20) DEFAULT NULL,
  `user_last_login_time` varchar(10) DEFAULT NULL,
  `user_status` varchar(2) DEFAULT NULL,
  `user_weibo` varchar(20) DEFAULT NULL,
  `user_discription` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
