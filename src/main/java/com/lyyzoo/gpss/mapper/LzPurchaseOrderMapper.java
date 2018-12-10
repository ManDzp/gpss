package com.lyyzoo.gpss.mapper;

import com.lyyzoo.gpss.moder.LzPurchaseOrder;

public interface LzPurchaseOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LzPurchaseOrder record);

    int insertSelective(LzPurchaseOrder record);

    LzPurchaseOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LzPurchaseOrder record);

    int updateByPrimaryKey(LzPurchaseOrder record);
}