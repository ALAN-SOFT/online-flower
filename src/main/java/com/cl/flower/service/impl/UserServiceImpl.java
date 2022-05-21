package com.cl.flower.service.impl;

import com.cl.flower.domain.User;
import com.cl.flower.mapper.UserMapper;
import com.cl.flower.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User login(String userName) {
        return userMapper.login(userName);
    }
}
