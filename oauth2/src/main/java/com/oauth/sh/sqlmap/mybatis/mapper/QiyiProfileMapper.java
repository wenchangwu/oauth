package com.oauth.sh.sqlmap.mybatis.mapper;

import com.oauth.sh.sqlmap.mybatis.model.QiyiProfile;
import com.oauth.sh.sqlmap.mybatis.model.QiyiProfileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QiyiProfileMapper {
    int countByExample(QiyiProfileExample example);

    int deleteByExample(QiyiProfileExample example);

    int deleteByPrimaryKey(Integer suid);

    int insert(QiyiProfile record);

    int insertSelective(QiyiProfile record);

    List<QiyiProfile> selectByExample(QiyiProfileExample example);

    QiyiProfile selectByPrimaryKey(Integer suid);

    int updateByExampleSelective(@Param("record") QiyiProfile record, @Param("example") QiyiProfileExample example);

    int updateByExample(@Param("record") QiyiProfile record, @Param("example") QiyiProfileExample example);

    int updateByPrimaryKeySelective(QiyiProfile record);

    int updateByPrimaryKey(QiyiProfile record);
}