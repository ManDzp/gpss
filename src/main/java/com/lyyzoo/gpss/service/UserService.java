package com.lyyzoo.gpss.service;

import com.lyyzoo.gpss.moder.LzSysUser;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: dzp
 * @Description: demo
 * @Date: 2018/12/6
 */
public interface UserService {

    LzSysUser login(@Param("username")String username, @Param("password")String password);

}