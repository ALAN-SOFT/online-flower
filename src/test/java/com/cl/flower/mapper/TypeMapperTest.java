package com.cl.flower.mapper;

import com.cl.flower.ProgramApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(classes = ProgramApplication.class)
class TypeMapperTest {

    @Autowired
    private  TypeMapper typeMapper;

    @Test
    void selectAllType() {
        System.out.println(typeMapper.selectAllType());
    }
}