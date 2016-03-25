package com.iqiyi.oauth2.server.dao;

import java.util.List;

import com.iqiyi.oauth2.server.pojo.Users;

/**
 * 
 * @Title: ClientDao.java
 * @Copyright: Copyright (c) 2012
 * @Description: <br>
 * 奇艺用户DAO接口
 *               <br>
 * @Company: iqiyi.com
 * @Created on 2013-1-14 下午1:20:22
 * @author shuhuan@qiyi.com
 */
public interface UsersDao extends BaseDao {
	
	/**
	 * 查询奇艺用户
	 * 
	 * @param emailOrUsername 邮箱或者用户名
	 * @return
	 */
	public Users findByEmailOrUsername(String emailOrUsername);

	/**
	 * 查询用户角色
	 * 
	 * @param suid 奇艺用户uid
	 * @return
	 */
	public List<String> findRolesByUsersId(String suid);

	
}
