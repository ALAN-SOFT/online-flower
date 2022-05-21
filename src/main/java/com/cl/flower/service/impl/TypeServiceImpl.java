package com.cl.flower.service.impl;

import com.cl.flower.domain.Type;
import com.cl.flower.mapper.TypeMapper;
import com.cl.flower.service.TypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {
    @Resource
    private TypeMapper typeMapper;

    @Override
    public List<Type> selectAllType() {
        return typeMapper.selectAllType();
    }

    @Override
    public int deleteType(Integer id) {
        return typeMapper.deleteType(id);
    }

    @Override
    public int insertType(String name, String color) {
        return typeMapper.insertType(name,color);
    }

    @Override
    public Type select() {
        return null;
    }
}
