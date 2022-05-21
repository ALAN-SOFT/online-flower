package com.cl.flower.controller;

import com.cl.flower.domain.User;
import com.cl.flower.enums.Result;
import com.cl.flower.enums.ResultCode;
import com.cl.flower.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api(tags = {"管理员接口"})
@RequestMapping("/api/user")
public class UserController {
    @Resource
    private UserService userService;

    @ApiOperation("管理员登录")
    @PostMapping(value = "/userLogin")
    public Result userLogin(String userName,String password) {
        User user = userService.login(userName);
        if (ObjectUtils.isEmpty(user)){
            return Result.failure(ResultCode.USER_NOT_EXIST);
        }else {
            String userPassword = user.getPassword();
            if (userPassword.equals(password)){
                return Result.success(user);
            }else {
                return Result.failure(ResultCode.USER_PASSWORD_ERROR);
            }
        }
    }
}
