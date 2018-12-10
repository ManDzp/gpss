package com.lyyzoo.gpss.service.ImpI;

import com.lyyzoo.gpss.mapper.LzSysUserMapper;
import com.lyyzoo.gpss.moder.LzSysUser;
import com.lyyzoo.gpss.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: dzp
 * @Description: demo
 * @Date: 2018/12/6
 */

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    LzSysUserMapper lzSysUserMapper;

    @Override
    public LzSysUser login(String username, String password) {
        return lzSysUserMapper.login(username,password);
    }
}