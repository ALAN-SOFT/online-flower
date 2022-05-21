package com.cl.flower.mapper;

import com.cl.flower.domain.Type;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface TypeMapper {
    /**
     * 查询所有花的种类
     * @return
     */
    @Select("SELECT * FROM `type`")
    List<Type> selectAllType();

    /**
     * 根据id 删除种类
     * @param id
     * @return
     */
    @Delete("DELETE FROM type WHERE id=#{id}")
    int deleteType(Integer id);

    /**
     * 新增商品种类
     * @param name
     * @param color
     * @return
     */
    @Update("INSERT INTO type SET name=#{name},color=#{color}")
    int insertType(String name,String color);

    @Select("     ")
    Type select();
}
