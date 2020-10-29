package ${package.Controller};

import ${package.Entity}.${entity};
import ${package.Service}.${table.serviceName};
import com.xfs.base.ResultVOUtil;
import com.xfs.base.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.xfs.base.PageVo;
<#if restControllerStyle>
<#else>
    import org.springframework.stereotype.Controller;
</#if>
<#if superControllerClassPackage??>
    import ${superControllerClassPackage};
</#if>


import com.xfs.annotation.ParamValid;
import java.util.List;

/**
* <p>
    * ${table.comment} 前端控制器
    * </p>
*
* @author ${author}
* @since ${date}
*/
@Api(tags = "${table.comment}")
<#if restControllerStyle>
@RestController
<#else>
@Controller
</#if>
@RequestMapping("/${table.controllerName?uncap_first}")
<#if kotlin>
class ${table.controllerName}<#if superControllerClass??> : ${superControllerClass}()</#if>
<#else>
<#if superControllerClass??>
public class ${table.controllerName} extends ${superControllerClass} {
<#else>
public class ${table.controllerName} {
</#if>

    @Autowired
    private ${table.serviceName} ${table.entityPath}Service;

    @ApiOperation(value = "${table.comment}分页查询", response = ${entity}.class)
    @PostMapping("/page")
    @ResponseBody
    public ResultVO queryWithPage (@RequestBody PageVo param){
        Object data = ${table.entityPath}Service.page(param);
        return ResultVOUtil.success(data);
    }

    @ApiOperation(value = "${table.comment}详情", response = ${entity}.class)
    @GetMapping(value = "/info/{id}")
    @ResponseBody
    public  ResultVO info(@PathVariable Long id) {
        Object data = ${table.entityPath}Service.info(id);
        return ResultVOUtil.success(data);
    }

    @ApiOperation(value = "${table.comment}新增")
    @PostMapping(value = "/add")
    @ResponseBody
    public  ResultVO add(@RequestBody ${entity} param) {
        ${table.entityPath}Service.add(param);
        return ResultVOUtil.success();
    }

    @ApiOperation(value = "${table.comment}修改")
    @PostMapping(value = "/modify")
    @ResponseBody
    public  ResultVO modify(@RequestBody ${entity} param) {
        ${table.entityPath}Service.modify(param);
        return ResultVOUtil.success();
    }

    @ApiOperation(value = "${table.comment}删除(单个条目)")
    @GetMapping(value = "/remove/{id}")
    @ResponseBody
    public  ResultVO remove(@PathVariable Long id) {
        ${table.entityPath}Service.remove(id);
        return ResultVOUtil.success();
    }

    @ApiOperation(value = "${table.comment}删除(多个条目)")
    @PostMapping(value = "/removes")
    @ResponseBody
    public  ResultVO removes(@RequestBody List<Long> ids) {
        ${table.entityPath}Service.removes(ids);
        return ResultVOUtil.success();
    }
}
        </#if>
