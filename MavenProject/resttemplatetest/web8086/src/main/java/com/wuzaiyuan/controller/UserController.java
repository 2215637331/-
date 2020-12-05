package com.wuzaiyuan.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/userController")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/getUserById")
    @ResponseBody
    public String getUserById(Integer id){
        String url = "http://localhost:8087/userService/getUserById?id="+id;
        String object = restTemplate.getForObject(url, String.class);
        System.out.println("响应到达web层："+object);
        return object;
    }







}
