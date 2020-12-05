package com.wuzaiyuan.front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//   http://localhost:8087/userService/getUserById?id={id}
@Controller
@RequestMapping("/userService")
public class UserFront {

//    @RequestMapping("/getUserById")
//    @ResponseBody
//    public String test(Integer id){
//        System.out.println("userService得到的id是："+id);
//        return "userService's Data";
//    }

    @RequestMapping("/getUserById")
    @ResponseBody
    public String test(Integer id){
        System.out.println("userService得到的id是："+id);
        return "userService's Data";
    }
}
