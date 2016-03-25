package com.iqiyi.oauth2.server.pojo;

/**
 * 
 * @Title: Client.java
 * @Copyright: Copyright (c) 2012
 * @Description: <br>
 * 客户端信息
 * 对于数据表：oauth_client_details
 *               <br>
 * @Company: iqiyi.com
 * @Created on 2013-1-14 下午1:18:35
 * @author shuhuan@qiyi.com
 */
@SuppressWarnings("serial")
public class Client extends BaseObject {

	private int id;
	
	private String client_id;
	
	private String resource_ids;
	
	private String client_secret;
	
	private String scope;
	
	private String authorized_grant_types;
	
	private String web_server_redirect_uri;
	
	private String authorities;
	
	private int access_token_validity;
	
	private int refresh_token_validity;
	
	private String additional_information;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClient_id() {
		return client_id;
	}

	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}

	public String getResource_ids() {
		return resource_ids;
	}

	public void setResource_ids(String resource_ids) {
		this.resource_ids = resource_ids;
	}

	public String getClient_secret() {
		return client_secret;
	}

	public void setClient_secret(String client_secret) {
		this.client_secret = client_secret;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getAuthorized_grant_types() {
		return authorized_grant_types;
	}

	public void setAuthorized_grant_types(String authorized_grant_types) {
		this.authorized_grant_types = authorized_grant_types;
	}

	public String getWeb_server_redirect_uri() {
		return web_server_redirect_uri;
	}

	public void setWeb_server_redirect_uri(String web_server_redirect_uri) {
		this.web_server_redirect_uri = web_server_redirect_uri;
	}

	public String getAuthorities() {
		return authorities;
	}

	public void setAuthorities(String authorities) {
		this.authorities = authorities;
	}

	public int getAccess_token_validity() {
		return access_token_validity;
	}

	public void setAccess_token_validity(int access_token_validity) {
		this.access_token_validity = access_token_validity;
	}

	public int getRefresh_token_validity() {
		return refresh_token_validity;
	}

	public void setRefresh_token_validity(int refresh_token_validity) {
		this.refresh_token_validity = refresh_token_validity;
	}

	public String getAdditional_information() {
		return additional_information;
	}

	public void setAdditional_information(String additional_information) {
		this.additional_information = additional_information;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + access_token_validity;
		result = prime
				* result
				+ ((additional_information == null) ? 0
						: additional_information.hashCode());
		result = prime * result
				+ ((authorities == null) ? 0 : authorities.hashCode());
		result = prime
				* result
				+ ((authorized_grant_types == null) ? 0
						: authorized_grant_types.hashCode());
		result = prime * result
				+ ((client_id == null) ? 0 : client_id.hashCode());
		result = prime * result
				+ ((client_secret == null) ? 0 : client_secret.hashCode());
		result = prime * result + id;
		result = prime * result + refresh_token_validity;
		result = prime * result
				+ ((resource_ids == null) ? 0 : resource_ids.hashCode());
		result = prime * result + ((scope == null) ? 0 : scope.hashCode());
		result = prime
				* result
				+ ((web_server_redirect_uri == null) ? 0
						: web_server_redirect_uri.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		if (access_token_validity != other.access_token_validity)
			return false;
		if (additional_information == null) {
			if (other.additional_information != null)
				return false;
		} else if (!additional_information.equals(other.additional_information))
			return false;
		if (authorities == null) {
			if (other.authorities != null)
				return false;
		} else if (!authorities.equals(other.authorities))
			return false;
		if (authorized_grant_types == null) {
			if (other.authorized_grant_types != null)
				return false;
		} else if (!authorized_grant_types.equals(other.authorized_grant_types))
			return false;
		if (client_id == null) {
			if (other.client_id != null)
				return false;
		} else if (!client_id.equals(other.client_id))
			return false;
		if (client_secret == null) {
			if (other.client_secret != null)
				return false;
		} else if (!client_secret.equals(other.client_secret))
			return false;
		if (id != other.id)
			return false;
		if (refresh_token_validity != other.refresh_token_validity)
			return false;
		if (resource_ids == null) {
			if (other.resource_ids != null)
				return false;
		} else if (!resource_ids.equals(other.resource_ids))
			return false;
		if (scope == null) {
			if (other.scope != null)
				return false;
		} else if (!scope.equals(other.scope))
			return false;
		if (web_server_redirect_uri == null) {
			if (other.web_server_redirect_uri != null)
				return false;
		} else if (!web_server_redirect_uri
				.equals(other.web_server_redirect_uri))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", client_id=" + client_id
				+ ", resource_ids=" + resource_ids + ", client_secret="
				+ client_secret + ", scope=" + scope
				+ ", authorized_grant_types=" + authorized_grant_types
				+ ", web_server_redirect_uri=" + web_server_redirect_uri
				+ ", authorities=" + authorities + ", access_token_validity="
				+ access_token_validity + ", refresh_token_validity="
				+ refresh_token_validity + ", additional_information="
				+ additional_information + "]";
	}

}
