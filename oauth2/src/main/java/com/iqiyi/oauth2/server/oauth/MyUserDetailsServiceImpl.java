package com.iqiyi.oauth2.server.oauth;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.iqiyi.oauth2.server.dao.UsersDao;
import com.iqiyi.oauth2.server.pojo.Users;

/**
 * 
 * @Title: MyUserDetailsServiceImpl.java
 * @Copyright: Copyright (c) 2012
 * @Description: <br>
 *               <br>
 * @Company: iqiyi.com
 * @Created on 2013-1-15 下午6:26:04
 * @author shuhuan@qiyi.com
 */
public class MyUserDetailsServiceImpl implements UserDetailsService {
	
	private UsersDao usersDao;
	
	@Autowired
	public void setUsersDao(UsersDao usersDao) {
		this.usersDao = usersDao;
	}

	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		
		// 查找奇艺用户
		Users users = usersDao.findByEmailOrUsername(username);
		
		System.out.println("UserDetails:" + users);
		
		if( null == users ) {
			throw new UsernameNotFoundException("Invalid User");
		}
		
		// 获取用户角色
		Collection<GrantedAuthority> grantedAuths = this.obtionGrantedAuthorities(users);
		
		boolean enabled = true;
		boolean accountNonExpired = true;
		boolean credentialsNonExpired = true;
		boolean accountNonLocked = true;
		
		User userDetail = new User(username, users.getPasswd(), enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, grantedAuths);
		
		return userDetail;
	}
	
	/**
	 * 取得用户的权限
	 * 
	 * @param users
	 * @return
	 */
	private Set<GrantedAuthority> obtionGrantedAuthorities(Users users) {
		
		if( null == users ) {
			return null;
		}
		
		Set<GrantedAuthority> authSet = new HashSet<GrantedAuthority>();
		
		List<String> roles = usersDao.findRolesByUsersId( users.getSuid() );
		
		for(String role : roles) {
			authSet.add(new SimpleGrantedAuthority(role));
		}
		
		return authSet;
	}
	
}
