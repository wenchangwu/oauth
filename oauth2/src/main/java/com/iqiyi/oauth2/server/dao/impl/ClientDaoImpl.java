package com.iqiyi.oauth2.server.dao.impl;

import com.iqiyi.oauth2.server.dao.ClientDao;
import com.iqiyi.oauth2.server.pojo.Client;

/**
 * 
 * @Title: ClientDaoImpl.java
 * @Copyright: Copyright (c) 2012
 * @Description: <br>
 * 客户端DAO实现
 *               <br>
 * @Company: iqiyi.com
 * @Created on 2013-1-15 下午6:26:38
 * @author shuhuan@qiyi.com
 */
public class ClientDaoImpl  implements ClientDao {

	@Override
	public boolean saveClient(Client client) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Client findByClientId(String clientId) {
		return (Client) getSqlMapClientTemplate().queryForObject("Client.findByClientId", clientId);
	}

}
