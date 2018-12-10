package com.lyyzoo.gpss.control;

import com.lyyzoo.gpss.com.JsonResult;
import com.lyyzoo.gpss.moder.LzSysUser;
import com.lyyzoo.gpss.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: dzp
 * @Description:
 * @Date: 2018/12/6
 */
@Controller
public class UserServiceController {
    //日志文件配置
    private static Logger logger = LoggerFactory.getLogger(UserServiceController.class);

    @Autowired
    UserService userService;
    //1.登录
    @RequestMapping(value = "login",method = RequestMethod.POST)
    @ResponseBody
    public  Object login(String username,String password){
        JsonResult result;
        try{
            LzSysUser user = userService.login(username,password);
            result = new JsonResult("200","success",user);
            //打印日志文件
            logger.debug("username：{}, password：{}",username,password);
        }catch (Exception ex){
            //打印日志文件
            logger.error(ex.getLocalizedMessage());
            result = new JsonResult("500","登录失败");
        }
        return result;
    }
}