package com.vanish.orange.controller;

import com.vanish.orange.entity.UserDO;
import com.vanish.orange.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class UserController {
    @Autowired
    private UserService userService;


    /**
     * 注册页面
     * @return
     */
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String userRegPage() {
        System.out.println("index!!!!!!!!!!!!!!!!!!!");
        return "userRegPage";
    }

    @ResponseBody
    @RequestMapping("userReg")
    public String userReg(UserDO userDO){
        userService.userReg(userDO);
        return "success";
    }
}
