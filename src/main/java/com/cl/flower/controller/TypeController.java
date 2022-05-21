package com.cl.flower.controller;

import com.cl.flower.domain.Type;
import com.cl.flower.enums.Result;
import com.cl.flower.enums.ResultCode;
import com.cl.flower.service.TypeService;
import io.netty.util.internal.ObjectUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(tags = {"鲜花种类接口"})
@RequestMapping("/api/type")
public class TypeController {
    @Resource
    private TypeService typeService;

    @ApiOperation("获取鲜花种类")
    @PostMapping(value = "/selectAllType")
    public Result selectAllType() {
        List<Type> types = typeService.selectAllType();
        return Result.success(types);
    }

    @ApiOperation("删除鲜花种类")
    @PostMapping(value = "/deleteType")
    public Result deleteType(Integer id) {
        int i = typeService.deleteType(id);
        if (i == 1) {
            return Result.success(i);
        } else {
            return Result.failure(ResultCode.SPECIFIED_DELETE_FAIL);
        }
    }

    @ApiOperation("新增种类")
    @PostMapping(value = "/insertType")
    public Result insertType(String name, String color) {
        int i = typeService.insertType(name, color);
        if (i == 1) {
            return Result.success(i);
        } else {
            return Result.failure(ResultCode.SPECIFIED_INSERT_FAIL);
        }
    }

}
