package com.lyyzoo.gpss.mapper;

import com.lyyzoo.gpss.moder.LzPurchaseSupplier;

public interface LzPurchaseSupplierMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LzPurchaseSupplier record);

    int insertSelective(LzPurchaseSupplier record);

    LzPurchaseSupplier selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LzPurchaseSupplier record);

    int updateByPrimaryKey(LzPurchaseSupplier record);
}