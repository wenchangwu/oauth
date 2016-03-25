package com.iqiyi.oauth2.server.dao.impl;

import java.util.List;

import com.iqiyi.oauth2.server.dao.UsersDao;
import com.iqiyi.oauth2.server.pojo.Users;

/**
 * 
 * @Title: UsersDaoImpl.java
 * @Copyright: Copyright (c) 2012
 * @Description: <br>
 * 奇艺用户DAO实现
 *               <br>
 * @Company: iqiyi.com
 * @Created on 2013-1-15 下午6:26:59
 * @author shuhuan@qiyi.com
 */
public class UsersDaoImpl extends BaseDao implements UsersDao {

	@Override
	public Users findByEmailOrUsername(String emailOrUsername) {

		Users users = (Users) getSqlMapClientTemplate().queryForObject("Users.findByEmail", emailOrUsername);
		
		if( null == users ) {
			users = (Users) getSqlMapClientTemplate().queryForObject("Users.findByUsername", emailOrUsername);
		}
		
		return users;
	}

	@Override
	public List<String> findRolesByUsersId(String suid) {

		@SuppressWarnings("unchecked")
		List<String> roles = getSqlMapClientTemplate().queryForList("Users.findRolesByUsersId", suid);
		
		return roles;
	}

}
