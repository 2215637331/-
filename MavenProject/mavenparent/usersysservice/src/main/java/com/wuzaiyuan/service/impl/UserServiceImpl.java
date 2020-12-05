package com.wuzaiyuan.service.impl;

import com.wuzaiyuan.mapper.UserMapper;
import com.wuzaiyuan.pojo.User;
import com.wuzaiyuan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }
}
