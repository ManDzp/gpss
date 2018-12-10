package com.lyyzoo.gpss.mapper;

import com.lyyzoo.gpss.moder.LzBaseEmployee;

public interface LzBaseEmployeeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LzBaseEmployee record);

    int insertSelective(LzBaseEmployee record);

    LzBaseEmployee selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LzBaseEmployee record);

    int updateByPrimaryKey(LzBaseEmployee record);
}