package com.lyyzoo.gpss.mapper;

import com.lyyzoo.gpss.moder.LzBaseParam;

public interface LzBaseParamMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LzBaseParam record);

    int insertSelective(LzBaseParam record);

    LzBaseParam selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LzBaseParam record);

    int updateByPrimaryKey(LzBaseParam record);
}