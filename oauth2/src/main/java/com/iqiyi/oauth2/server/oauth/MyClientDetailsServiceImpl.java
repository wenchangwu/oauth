package com.iqiyi.oauth2.server.oauth;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.provider.BaseClientDetails;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;

import com.iqiyi.oauth2.server.dao.ClientDao;
import com.iqiyi.oauth2.server.pojo.Client;

/**
 * 
 * @Title: MyClientDetailsServiceImpl.java
 * @Copyright: Copyright (c) 2012
 * @Description: <br>
 * 客户端（Consumer）信息服务实现
 *               <br>
 * @Company: iqiyi.com
 * @Created on 2013-1-14 下午2:01:04
 * @author shuhuan@qiyi.com
 */
public class MyClientDetailsServiceImpl implements ClientDetailsService {

	@Resource(name="clientDao")
	private ClientDao clientDao;
	
	@Override
	public ClientDetails loadClientByClientId(String clientId)
			throws ClientRegistrationException {
		
		Client client = clientDao.findByClientId(clientId);
		
		// 客户端为空，则提示OAuth2 ERROR
		if( null == client ) {
			throw new ClientRegistrationException("invalid_client");
		}
		
		BaseClientDetails clientDetails = new BaseClientDetails();
		
		// 客户端ID
		clientDetails.setClientId(clientId);
		
		// 客户端密钥secret
		clientDetails.setClientSecret(StringUtils.trim(client.getClient_secret()));
		
		// 获得客户端scope
		String scope = StringUtils.trim(client.getScope());
		
		Set<String> scopeSet = this.getClientConfigInfo(scope);
		
		clientDetails.setScope(scopeSet);
		
		// 获得客户端redirect_uri
		String registeredRedirectUris = StringUtils.trim(client.getWeb_server_redirect_uri());
				
		Set<String> uriSet = this.getClientConfigInfo(registeredRedirectUris);
		
		clientDetails.setRegisteredRedirectUri(uriSet);
		
		// 客户端角色
		String authoritieStr = StringUtils.trim(client.getAuthorities());
		
		Set<String> authoritySet = this.getClientConfigInfo(authoritieStr);
		
		Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
		
		for(String item : authoritySet) {
			authorities.add(new SimpleGrantedAuthority(item));
		}
		
		clientDetails.setAuthorities(authorities);
		
		// 获得客户端Grant type
		String grantTypes = StringUtils.trim(client.getAuthorized_grant_types());
								
		Set<String> grantTypeSet = this.getClientConfigInfo(grantTypes);
		
		clientDetails.setAuthorizedGrantTypes(grantTypeSet);
		
		// 访问令牌过期时间
		clientDetails.setAccessTokenValiditySeconds(client.getAccess_token_validity());
		
		// 刷新令牌过期时间
		clientDetails.setRefreshTokenValiditySeconds(client.getRefresh_token_validity());
		
		// 获得客户端redirect_uri
		String resourceIds = StringUtils.trim(client.getResource_ids());
						
		Set<String> resourceIdSet = this.getClientConfigInfo(resourceIds);
		
		clientDetails.setResourceIds(resourceIdSet);
		
		return clientDetails;
	}
	
	/**
	 * 集中处理客户端数据表各项中含有(,)逗号
	 * 
	 * @param config
	 * @return
	 */
	private Set<String> getClientConfigInfo( String config ) {
		
		if( StringUtils.isBlank(config) ) {
			return null;
		}
		
		String[] configArr = config.split(",");
		
		Set<String> configSet = new HashSet<String>();
		
		for( String item : configArr ) {
			configSet.add(item);
		}
		
		return configSet;
	}

}
