package com.wuzaiyuan.controller;

import com.wuzaiyuan.pojo.User;
import com.wuzaiyuan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUserById")
    @ResponseBody
    public User getUserById(Integer id){
        User user = userService.getUserById(id);
        return user;
    }
}
