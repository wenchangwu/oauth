package com.oauth.sh.sqlmap.mybatis.mapper;

import com.oauth.sh.sqlmap.mybatis.model.UsersRoles;
import com.oauth.sh.sqlmap.mybatis.model.UsersRolesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsersRolesMapper {
    int countByExample(UsersRolesExample example);

    int deleteByExample(UsersRolesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UsersRoles record);

    int insertSelective(UsersRoles record);

    List<UsersRoles> selectByExample(UsersRolesExample example);

    UsersRoles selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UsersRoles record, @Param("example") UsersRolesExample example);

    int updateByExample(@Param("record") UsersRoles record, @Param("example") UsersRolesExample example);

    int updateByPrimaryKeySelective(UsersRoles record);

    int updateByPrimaryKey(UsersRoles record);
}