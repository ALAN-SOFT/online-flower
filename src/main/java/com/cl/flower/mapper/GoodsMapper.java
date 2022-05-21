package com.cl.flower.mapper;

import com.cl.flower.domain.Goods;
import com.cl.flower.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface GoodsMapper {
    /**
     * 查询所有商品
     * @return
     */
    @Select("SELECT * FROM `goods`")
    List<Goods> selectAllGoods();

    /**
     * 删除商品
     * @param id
     * @return
     */
    @Delete("DELETE FROM goods WHERE id=#{id}")
    int deleteGoods(Integer id);

    /**
     * 修改商品信息
     * @param number
     * @param price
     * @param typeId
     * @param id
     * @return
     */
    @Update("UPDATE goods SET number=#{number}," +
            "price=#{price},type_id=#{typeId} WHERE id=#{id}")
    int updateGoods(Integer number,Double price,Integer typeId,Integer id);
}