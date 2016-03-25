package com.iqiyi.oauth2.server.oauth;

import org.springframework.security.authentication.dao.SaltSource;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * 
 * @Title: MySaltSource.java
 * @Copyright: Copyright (c) 2012
 * @Description: <br>
 * MD5密码加密salt
 *               <br>
 * @Company: iqiyi.com
 * @Created on 2013-1-15 下午6:24:31
 * @author shuhuan@qiyi.com
 */
public class MySaltSource implements SaltSource {

	// 奇艺用户密码SALT---PASS_KEY
	final private static String PASS_KEY ="qiyi_psk_2010_08_05_4c5a1875201";
	
	@Override
	public Object getSalt(UserDetails user) {
		return PASS_KEY;
	}

}
