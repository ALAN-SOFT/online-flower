package com.cl.flower.mapper;

import com.cl.flower.ProgramApplication;
import com.cl.flower.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(classes = ProgramApplication.class)

class UserMapperTest {
    @Autowired
    private  UserMapper userMapper;
    @Test
    void login() {
        User admin = userMapper.login("admin");
        System.out.println(admin);
    }
}