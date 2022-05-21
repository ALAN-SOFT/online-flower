package com.cl.flower.service;

import com.cl.flower.domain.Type;

import java.util.List;

public interface TypeService {
    List<Type> selectAllType();
    int deleteType(Integer id);
    int insertType(String name,String color);
    Type select();
}
