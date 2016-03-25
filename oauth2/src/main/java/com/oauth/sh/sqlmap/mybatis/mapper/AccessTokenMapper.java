package com.oauth.sh.sqlmap.mybatis.mapper;

import com.oauth.sh.sqlmap.mybatis.model.AccessToken;
import com.oauth.sh.sqlmap.mybatis.model.AccessTokenExample;
import com.oauth.sh.sqlmap.mybatis.model.AccessTokenWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccessTokenMapper {
    int countByExample(AccessTokenExample example);

    int deleteByExample(AccessTokenExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AccessTokenWithBLOBs record);

    int insertSelective(AccessTokenWithBLOBs record);

    List<AccessTokenWithBLOBs> selectByExampleWithBLOBs(AccessTokenExample example);

    List<AccessToken> selectByExample(AccessTokenExample example);

    AccessTokenWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AccessTokenWithBLOBs record, @Param("example") AccessTokenExample example);

    int updateByExampleWithBLOBs(@Param("record") AccessTokenWithBLOBs record, @Param("example") AccessTokenExample example);

    int updateByExample(@Param("record") AccessToken record, @Param("example") AccessTokenExample example);

    int updateByPrimaryKeySelective(AccessTokenWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(AccessTokenWithBLOBs record);

    int updateByPrimaryKey(AccessToken record);
}