CREATE TABLE IF NOT EXISTS game_chatfriend(
  `id` varchar(36) NOT NULL COMMENT '玩家id',
  `tempFriend` MEDIUMBLOB COMMENT '临时好友',
  `friend` MEDIUMBLOB COMMENT '好友',
  `black` MEDIUMBLOB COMMENT '黑名单',
  `enmey` MEDIUMBLOB COMMENT '仇人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=16;