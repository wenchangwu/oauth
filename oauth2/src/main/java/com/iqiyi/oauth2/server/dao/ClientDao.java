package com.iqiyi.oauth2.server.dao;

import com.iqiyi.oauth2.server.pojo.Client;

/**
 * 
 * @Title: ClientDao.java
 * @Copyright: Copyright (c) 2012
 * @Description: <br>
 * 客户端DAO接口
 *               <br>
 * @Company: iqiyi.com
 * @Created on 2013-1-14 下午1:20:22
 * @author shuhuan@qiyi.com
 */
public interface ClientDao  {
	
	/**
	 * 保存客户端
	 * 
	 * @param client 客户端对象
	 * @return
	 */
	public boolean saveClient(Client client);
	
	/**
	 * 查询客户端
	 * 
	 * @param clientId 客户端ID
	 * @return
	 */
	public Client findByClientId(String clientId);

	
}
