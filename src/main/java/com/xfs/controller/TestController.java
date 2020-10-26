package com.xfs.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xfs.base.ResultVO;
import com.xfs.trade.oms.rpc.OrderRpcService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author zhucy
 *
 */
@Controller
@RequestMapping("/test")
@Api(value = "TEST信息",description = "Test信息相关api",produces = MediaType.APPLICATION_JSON_VALUE)
@Slf4j
public class TestController {


    @Reference(version = "1.0.0")
    private OrderRpcService orderRpcService;


    @GetMapping("/hello")
    @ResponseBody
    @ApiResponses({
            @ApiResponse(code = 200, message = "请求成功"),
            @ApiResponse(code = 500, message = "请求失败"
            )})
    @ApiOperation(value="查询TEST信息", notes="查询TEST信息")
    public ResultVO hello() {
        return ResultVO.createSuccess("hello");
    }

    @PostMapping("/hello2")
    @ResponseBody
    @ApiResponses({
            @ApiResponse(code = 200, message = "请求成功"),
            @ApiResponse(code = 500, message = "请求失败"
            )})
    @ApiOperation(value="查询TEST信息2", notes="查询TEST信息2")
    public ResultVO hello2() {
        return ResultVO.createSuccess("hello2");
    }


    @PostMapping("/dubboTest")
    @ResponseBody
    @ApiResponses({
            @ApiResponse(code = 200, message = "请求成功"),
            @ApiResponse(code = 500, message = "请求失败"
            )})
    @ApiOperation(value="dubboTest", notes="dubboTest")
    public ResultVO dubboTest() {
        log.info("TestController.dubboTest>>>");
        String result = orderRpcService.sayHello();
        log.info("TestController.dubboTest<<<:{}",result);
        return ResultVO.createSuccess(result);
    }
}
