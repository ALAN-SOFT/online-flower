package com.cl.flower.mapper;

import com.cl.flower.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


/**
 * @description:
 * @author: Xup
 * @create: 2022-02-18
 **/
@Mapper
public interface UserMapper {
    /**
     * 用户登录 #{}
     * @param userName
     * @return
     */
    @Select("SELECT * FROM `user` WHERE user_name=#{userName}")
    User login(String userName);
}
