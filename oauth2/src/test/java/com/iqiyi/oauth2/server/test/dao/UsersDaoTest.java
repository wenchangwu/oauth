package com.iqiyi.oauth2.server.test.dao;

import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.iqiyi.oauth2.server.pojo.Users;
import com.oauth.sh.sqlmap.mybatis.mapper.QiyiProfileMapper;
import com.oauth.sh.sqlmap.mybatis.model.QiyiProfile;

/**
 *  
 * @Title: ClientDaoTest.java
 * @Copyright: Copyright (c) 2012
 * @Description: <br>
 * 奇艺用户DAO测试用例
 * @Company: iqiyi.com
 * @Created on 2013-1-14 下午2:14:28
 * @author shuhuan@qiyi.com
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:conf/spring/spring-main.xml" })
public class UsersDaoTest {

	@Resource
	private QiyiProfileMapper qiyiProfileMapper;
	
	@Test
	public void testSaveQiyiProfile(){
		QiyiProfile profile=new QiyiProfile();
		profile.setPuid(1);
		profile.setEmail("wwc0524@163.com");
		profile.setPasswd("123456");
		qiyiProfileMapper.insert(profile);
	}
	
	@Test
    public void testFindByEmailOrUsername() {   
	/*	Users users = usersDao.findByEmailOrUsername("shuhuan2009@gmail.com");
		System.out.println(users);
		Assert.assertEquals("shuhuan2009", users.getUname());*/
    }
	
	
}
