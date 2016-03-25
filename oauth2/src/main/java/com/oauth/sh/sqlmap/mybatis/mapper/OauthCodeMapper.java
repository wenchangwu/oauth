package com.oauth.sh.sqlmap.mybatis.mapper;

import com.oauth.sh.sqlmap.mybatis.model.OauthCode;
import com.oauth.sh.sqlmap.mybatis.model.OauthCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OauthCodeMapper {
    int countByExample(OauthCodeExample example);

    int deleteByExample(OauthCodeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OauthCode record);

    int insertSelective(OauthCode record);

    List<OauthCode> selectByExampleWithBLOBs(OauthCodeExample example);

    List<OauthCode> selectByExample(OauthCodeExample example);

    OauthCode selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OauthCode record, @Param("example") OauthCodeExample example);

    int updateByExampleWithBLOBs(@Param("record") OauthCode record, @Param("example") OauthCodeExample example);

    int updateByExample(@Param("record") OauthCode record, @Param("example") OauthCodeExample example);

    int updateByPrimaryKeySelective(OauthCode record);

    int updateByPrimaryKeyWithBLOBs(OauthCode record);

    int updateByPrimaryKey(OauthCode record);
}