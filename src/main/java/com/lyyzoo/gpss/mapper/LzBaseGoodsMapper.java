package com.lyyzoo.gpss.mapper;

import com.lyyzoo.gpss.moder.LzBaseGoods;

public interface LzBaseGoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LzBaseGoods record);

    int insertSelective(LzBaseGoods record);

    LzBaseGoods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LzBaseGoods record);

    int updateByPrimaryKeyWithBLOBs(LzBaseGoods record);

    int updateByPrimaryKey(LzBaseGoods record);
}