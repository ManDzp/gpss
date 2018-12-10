package com.lyyzoo.gpss.mapper;

import com.lyyzoo.gpss.moder.LzSaleOrder;

public interface LzSaleOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LzSaleOrder record);

    int insertSelective(LzSaleOrder record);

    LzSaleOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LzSaleOrder record);

    int updateByPrimaryKey(LzSaleOrder record);
}