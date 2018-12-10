package com.lyyzoo.gpss.mapper;

import com.lyyzoo.gpss.moder.LzBaseRepo;

public interface LzBaseRepoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LzBaseRepo record);

    int insertSelective(LzBaseRepo record);

    LzBaseRepo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LzBaseRepo record);

    int updateByPrimaryKey(LzBaseRepo record);
}