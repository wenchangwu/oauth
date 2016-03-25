package com.oauth.sh.sqlmap.mybatis.mapper;

import com.oauth.sh.sqlmap.mybatis.model.RefreshToken;
import com.oauth.sh.sqlmap.mybatis.model.RefreshTokenExample;
import com.oauth.sh.sqlmap.mybatis.model.RefreshTokenWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RefreshTokenMapper {
    int countByExample(RefreshTokenExample example);

    int deleteByExample(RefreshTokenExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RefreshTokenWithBLOBs record);

    int insertSelective(RefreshTokenWithBLOBs record);

    List<RefreshTokenWithBLOBs> selectByExampleWithBLOBs(RefreshTokenExample example);

    List<RefreshToken> selectByExample(RefreshTokenExample example);

    RefreshTokenWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RefreshTokenWithBLOBs record, @Param("example") RefreshTokenExample example);

    int updateByExampleWithBLOBs(@Param("record") RefreshTokenWithBLOBs record, @Param("example") RefreshTokenExample example);

    int updateByExample(@Param("record") RefreshToken record, @Param("example") RefreshTokenExample example);

    int updateByPrimaryKeySelective(RefreshTokenWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(RefreshTokenWithBLOBs record);

    int updateByPrimaryKey(RefreshToken record);
}