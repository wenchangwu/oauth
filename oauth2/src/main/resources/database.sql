/*==============================================================*/
/* Table: `qiyi_profile`  用户信息表[不用新建]                        */
/*==============================================================*/
CREATE TABLE `qiyi_profile` (
  	`puid` int(11) unsigned NOT NULL,
  	`suid` int(11) unsigned NOT NULL AUTO_INCREMENT,
  	`uname` varchar(50) DEFAULT NULL,
  	`email` varchar(50) NOT NULL,
  	`acode` varchar(10) DEFAULT NULL,
  	`activated` tinyint(4) DEFAULT NULL,
  	`passwd` varchar(32) NOT NULL,
  	`phone` varchar(20) DEFAULT NULL,
  	`gender` tinyint(4) DEFAULT NULL,
  	`birthday` int(11) DEFAULT NULL,
  	`province` tinyint(4) DEFAULT NULL,
  	`city` tinyint(4) DEFAULT NULL,
  	`status` tinyint(4) DEFAULT '0',
  	`icon` varchar(150) DEFAULT NULL,
  	`work` tinyint(4) DEFAULT NULL,
  	`income` tinyint(4) DEFAULT NULL,
  	`regip` varchar(40) DEFAULT NULL,
  	`jointime` int(11) DEFAULT NULL,
  	`extinfo` varchar(512) DEFAULT NULL,
  	`question` varchar(128) DEFAULT NULL,
  	`answer` varchar(128) DEFAULT NULL,
  	`source` tinyint(4) DEFAULT NULL,
  	`fromurl` varchar(500) DEFAULT NULL,
  	`email_or_mobile` tinyint(1) DEFAULT '0',
  	`edu` tinyint(4) DEFAULT NULL,
  	`industry` tinyint(4) DEFAULT NULL,
  	`self_intro` varchar(512) DEFAULT NULL,
  	`real_name` varchar(50) DEFAULT NULL,
  	`personal_url` varchar(512) DEFAULT NULL,
  	PRIMARY KEY (`suid`),
  	UNIQUE KEY `email` (`email`),
  	UNIQUE KEY `uname` (`uname`),
  	KEY `puid` (`puid`),
  	KEY `phone` (`phone`),
  	KEY `gender` (`gender`,`province`,`city`,`birthday`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;  
 
/*==============================================================*/
/* Table: `roles`  用户角色表                               */
/*==============================================================*/
CREATE TABLE `roles` (  
  	`id` int(11) NOT NULL auto_increment,  
  	`name` varchar(255) default NULL,  
  	`enabled` int(1) NOT NULL,  
  	PRIMARY KEY  (`id`)  
)ENGINE=InnoDB DEFAULT CHARSET=utf8;  

/*==============================================================*/
/* Table: `users_roles`  用户角色关系表                               */
/*==============================================================*/ 
CREATE TABLE `users_roles` (  
  	`id` int(11) NOT NULL auto_increment,
  	`user_id` int(11) NOT NULL,  
  	`role_id` int(11) NOT NULL,  
  	PRIMARY KEY  (`id`),  
  	KEY `FK143BF46AF6AD4381` (`user_id`),  
  	KEY `FK143BF46A51827FA1` (`role_id`)  
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 客户端
create table oauth_client_details (
  	id int(11) not null auto_increment,
  	client_id VARCHAR(256) NOT NULL,
  	resource_ids VARCHAR(256),
  	client_secret VARCHAR(256),
  	scope VARCHAR(256),
  	authorized_grant_types VARCHAR(256),
  	web_server_redirect_uri VARCHAR(256),
  	authorities VARCHAR(256),
  	access_token_validity int(11) default 0,
  	refresh_token_validity int(11) default 0,
  	additional_information VARCHAR(256),
  	primary key (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table oauth_client_token (
	id int(11) not null auto_increment,
  	token_id VARCHAR(256),
  	token blob,
  	authentication_id VARCHAR(256),
  	user_name VARCHAR(256),
  	client_id VARCHAR(256),
	primary key (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table oauth_access_token (
	id int(11) not null auto_increment,
  	token_id VARCHAR(256),
  	token blob,
  	authentication_id VARCHAR(256),
  	user_name VARCHAR(256),
  	client_id VARCHAR(256),
  	authentication blob,
  	refresh_token VARCHAR(256),
	primary key (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table oauth_refresh_token (
  	id int(11) not null auto_increment,
  	token_id VARCHAR(256),
  	token blob,
 	authentication blob,
	primary key (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table oauth_code (
	id int(11) not null auto_increment,
  	code VARCHAR(256), authentication blob,
	primary key (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
