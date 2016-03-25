package com.oauth.sh.sqlmap.mybatis.mapper;

import com.oauth.sh.sqlmap.mybatis.model.ClientToken;
import com.oauth.sh.sqlmap.mybatis.model.ClientTokenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClientTokenMapper {
    int countByExample(ClientTokenExample example);

    int deleteByExample(ClientTokenExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClientToken record);

    int insertSelective(ClientToken record);

    List<ClientToken> selectByExampleWithBLOBs(ClientTokenExample example);

    List<ClientToken> selectByExample(ClientTokenExample example);

    ClientToken selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ClientToken record, @Param("example") ClientTokenExample example);

    int updateByExampleWithBLOBs(@Param("record") ClientToken record, @Param("example") ClientTokenExample example);

    int updateByExample(@Param("record") ClientToken record, @Param("example") ClientTokenExample example);

    int updateByPrimaryKeySelective(ClientToken record);

    int updateByPrimaryKeyWithBLOBs(ClientToken record);

    int updateByPrimaryKey(ClientToken record);
}