package com.cl.flower.service;

import com.cl.flower.domain.Goods;

import java.util.List;

public interface GoodsService {
    List<Goods> selectAllGoods();
    int deleteGoods(Integer id);
    int updateGoods(Integer number,Double price,Integer typeId,Integer id);
}
