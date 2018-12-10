package com.lyyzoo.gpss.mapper;

import com.lyyzoo.gpss.moder.LzSaleCustomer;

public interface LzSaleCustomerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LzSaleCustomer record);

    int insertSelective(LzSaleCustomer record);

    LzSaleCustomer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LzSaleCustomer record);

    int updateByPrimaryKey(LzSaleCustomer record);
}