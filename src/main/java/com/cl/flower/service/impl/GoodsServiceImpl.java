package com.cl.flower.service.impl;

import com.cl.flower.domain.Goods;
import com.cl.flower.mapper.GoodsMapper;
import com.cl.flower.service.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Resource
    private GoodsMapper goodsMapper;

    @Override
    public List<Goods> selectAllGoods() {
        return goodsMapper.selectAllGoods();
    }

    @Override
    public int deleteGoods(Integer id) {
        return goodsMapper.deleteGoods(id);
    }

    @Override
    public int updateGoods(Integer number, Double price, Integer typeId, Integer id) {
        return goodsMapper.updateGoods(number,price,typeId,id);
    }
}
