package com.lyyzoo.gpss.mapper;

import com.lyyzoo.gpss.moder.LzSysRole;

public interface LzSysRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LzSysRole record);

    int insertSelective(LzSysRole record);

    LzSysRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LzSysRole record);

    int updateByPrimaryKey(LzSysRole record);
}