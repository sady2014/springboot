package com.springboot.dao;

import com.springboot.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 扫描包
 */
@Mapper
public interface UserInfoMapper {
    int deleteByPrimaryKey(@Param("id") Integer id, @Param("userid") Integer userid);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(@Param("id") Integer id, @Param("userid") Integer userid);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);

    List<UserInfo> getUserInfo();
}