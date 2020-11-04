package com.xfs.controller;

import com.xfs.entity.Order;
import com.xfs.service.IOrderService;
import com.xfs.base.ResultVOUtil;
import com.xfs.base.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.xfs.base.PageVo;


import com.xfs.annotation.ParamValid;

import javax.validation.Valid;
import java.util.List;

/**
* <p>
    *  前端控制器
    * </p>
*
* @author mybatis-plus
* @since 2020-11-04
*/
@Api(tags = "")
@RestController
@RequestMapping("/orderController")
public class OrderController {

    @Autowired
    private IOrderService orderService;

    @ApiOperation(value = "分页查询", response = Order.class)
    @PostMapping("/page")
    @ResponseBody
    public ResultVO queryWithPage (@RequestBody PageVo param){
        Object data = orderService.page(param);
        return ResultVOUtil.success(data);
    }

    @ApiOperation(value = "详情", response = Order.class)
    @GetMapping(value = "/info/{id}")
    @ResponseBody
    public  ResultVO info(@PathVariable Long id) {
        Object data = orderService.info(id);
        return ResultVOUtil.success(data);
    }


    @ApiOperation(value = "详情", response = Order.class)
    @GetMapping(value = "/info/")
    @ResponseBody
    public  ResultVO info(@Valid Order order) {
        Order detail = orderService.detail(order);
        return ResultVOUtil.success(detail);
    }

    @ApiOperation(value = "新增")
    @PostMapping(value = "/add")
    @ResponseBody
    public  ResultVO add(@RequestBody @ParamValid Order param) {
        orderService.add(param);
        return ResultVOUtil.success();
    }

    @ApiOperation(value = "修改")
    @PostMapping(value = "/modify")
    @ResponseBody
    public  ResultVO modify(@RequestBody Order param) {
        orderService.modify(param);
        return ResultVOUtil.success();
    }

    @ApiOperation(value = "删除(单个条目)")
    @GetMapping(value = "/remove/{id}")
    @ResponseBody
    public  ResultVO remove(@PathVariable Long id) {
        orderService.remove(id);
        return ResultVOUtil.success();
    }

    @ApiOperation(value = "删除(多个条目)")
    @PostMapping(value = "/removes")
    @ResponseBody
    public  ResultVO removes(@RequestBody List<Long> ids) {
        orderService.removes(ids);
        return ResultVOUtil.success();
    }
}
