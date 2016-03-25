package com.oauth.sh.sqlmap.mybatis.model;

public class RefreshToken {
    private Integer id;

    private String tokenId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId == null ? null : tokenId.trim();
    }
}