package com.xfs.controller;

import com.xfs.entity.UserInfo;
import com.xfs.service.IUserInfoService;
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
import java.util.List;

/**
* <p>
    * 用户信息 前端控制器
    * </p>
*
* @author mybatis-plus
* @since 2020-10-27
*/
@Api(tags = "用户信息")
@RestController
@RequestMapping("/userInfoController")
public class UserInfoController {

    @Autowired
    private IUserInfoService iUserInfoService;

    @ApiOperation(value = "用户信息分页查询", response = UserInfo.class)
    @PostMapping("/page")
    @ResponseBody
    public ResultVO queryWithPage (@RequestBody PageVo param){
        Object data = iUserInfoService.page(param);
        return ResultVOUtil.success(data);
    }

    @ApiOperation(value = "用户信息详情", response = UserInfo.class)
    @GetMapping(value = "/info/{id}")
    @ResponseBody
    public  ResultVO info(@PathVariable Long id) {
        Object data = iUserInfoService.info(id);
        return ResultVOUtil.success(data);
    }

    @ApiOperation(value = "用户信息新增")
    @PostMapping(value = "/add")
    @ResponseBody
    public  ResultVO add(@RequestBody UserInfo param) {
        iUserInfoService.add(param);
        return ResultVOUtil.success();
    }

    @ApiOperation(value = "用户信息修改")
    @PostMapping(value = "/modify")
    @ResponseBody
    public  ResultVO modify(@RequestBody UserInfo param) {
        iUserInfoService.modify(param);
        return ResultVOUtil.success();
    }

    @ApiOperation(value = "用户信息删除(单个条目)")
    @GetMapping(value = "/remove/{id}")
    @ResponseBody
    public  ResultVO remove(@PathVariable Long id) {
        iUserInfoService.remove(id);
        return ResultVOUtil.success();
    }

    @ApiOperation(value = "用户信息删除(多个条目)")
    @PostMapping(value = "/removes")
    @ResponseBody
    public  ResultVO removes(@RequestBody List<Long> ids) {
        iUserInfoService.removes(ids);
        return ResultVOUtil.success();
    }
}
