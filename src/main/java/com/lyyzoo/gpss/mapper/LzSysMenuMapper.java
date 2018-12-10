package com.lyyzoo.gpss.mapper;

import com.lyyzoo.gpss.moder.LzSysMenu;

public interface LzSysMenuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LzSysMenu record);

    int insertSelective(LzSysMenu record);

    LzSysMenu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LzSysMenu record);

    int updateByPrimaryKey(LzSysMenu record);
}