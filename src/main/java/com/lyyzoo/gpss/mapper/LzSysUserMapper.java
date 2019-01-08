package com.lyyzoo.gpss.mapper;

import com.lyyzoo.gpss.moder.LzSysUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LzSysUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LzSysUser record);

    int insertSelective(LzSysUser record);

    LzSysUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LzSysUser record);

    int updateByPrimaryKey(LzSysUser record);
    //登陆
    LzSysUser login(@Param("username")String username, @Param("password")String password);

}