package com.cl.flower.controller;

import com.cl.flower.domain.Goods;
import com.cl.flower.enums.Result;
import com.cl.flower.enums.ResultCode;
import com.cl.flower.mapper.GoodsMapper;
import com.cl.flower.service.GoodsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(tags = {"鲜花商品类"})
@RequestMapping("/api/goods")
public class GoodsController {
    @Resource
    private GoodsService goodsService;
    @Resource
    private GoodsMapper goodsMapper;

    @ApiOperation("获取商品")
    @PostMapping(value = "/selectAllGoods")
    public Result selectAllGoods() {
        List<Goods> goods = goodsService.selectAllGoods();
        return Result.success(goods);
    }

    @ApiOperation("删除鲜花商品")
    @PostMapping(value = "/deleteGoods")
    public Result deleteGoods(Integer id) {
        int i = goodsService.deleteGoods(id);
        if (i == 1) {
            return Result.success(i);
        } else {
            return Result.failure(ResultCode.SPECIFIED_DELETE_FAIL);
        }
    }

    @ApiOperation("更新商品信息")
    @PostMapping(value = "/updateGoods")
    public Result updateGoods(Integer number, Double price, Integer typeId, Integer id) {
        int i = goodsService.updateGoods(number, price, typeId, id);
        if (i == 1) {
            return Result.success(i);
        } else {
            return Result.failure(ResultCode.SPECIFIED_UPDATE_FAIL);
        }
    }
}
