package com.iqiyi.oauth2.server.test.dao;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.oauth.sh.sqlmap.mybatis.mapper.ClientDetailsMapper;
import com.oauth.sh.sqlmap.mybatis.model.ClientDetails;

/**
 *  
 * @Title: ClientDaoTest.java
 * @Copyright: Copyright (c) 2012
 * @Description: <br>
 * 客户端DAO测试用例
 * @Company: iqiyi.com
 * @Created on 2013-1-14 下午2:14:28
 * @author shuhuan@qiyi.com
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:conf/spring/spring-main.xml" })

public class ClientDaoTest  {

	@Resource
	private ClientDetailsMapper clientDetailsMapper;
	
	@Test
    public void testSaveClient() {  
		ClientDetails clientDetail =new ClientDetails();
		clientDetail.setId(1);
		clientDetail.setClientId("client01");
		clientDetailsMapper.insert(clientDetail);
    }
	
	@Test
    public void testFindByClientId() {
		clientDetailsMapper.selectByPrimaryKey(1);
	}
	
}
