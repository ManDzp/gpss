package com.lyyzoo.gpss.mapper;

import com.lyyzoo.gpss.moder.LzStock;

public interface LzStockMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LzStock record);

    int insertSelective(LzStock record);

    LzStock selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LzStock record);

    int updateByPrimaryKey(LzStock record);
}