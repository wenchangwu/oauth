package com.oauth.sh.sqlmap.mybatis.mapper;

import com.oauth.sh.sqlmap.mybatis.model.ClientDetails;
import com.oauth.sh.sqlmap.mybatis.model.ClientDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClientDetailsMapper {
    int countByExample(ClientDetailsExample example);

    int deleteByExample(ClientDetailsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClientDetails record);

    int insertSelective(ClientDetails record);

    List<ClientDetails> selectByExample(ClientDetailsExample example);

    ClientDetails selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ClientDetails record, @Param("example") ClientDetailsExample example);

    int updateByExample(@Param("record") ClientDetails record, @Param("example") ClientDetailsExample example);

    int updateByPrimaryKeySelective(ClientDetails record);

    int updateByPrimaryKey(ClientDetails record);
}