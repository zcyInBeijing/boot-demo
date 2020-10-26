package ${package.ServiceImpl};

import ${package.Entity}.${entity};
import ${package.Mapper}.${table.mapperName};
import ${package.Service}.${table.serviceName};
import ${superServiceImplClassPackage};
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xfs.base.PageVo;
import java.util.List;

/**
* <p>
    * ${table.comment!} 服务实现类
    * </p>
*
* @author ${author}
* @since ${date}
*/
@Service
<#if kotlin>
    open class ${table.serviceImplName} : ${superServiceImplClass}<${table.mapperName}, ${entity}>(), ${table.serviceName} {

    }
<#else>
    public class ${table.serviceImplName} extends ${superServiceImplClass}<${table.mapperName}, ${entity}> implements ${table.serviceName} {

    /**
    * ${table.comment!}分页列表
    * @param param 根据需要进行传值
    * @return
    */
    @Override
    public IPage<${entity}> page(PageVo param) {

    QueryWrapper<${entity}> queryWrapper = new QueryWrapper<>();
    Page<${entity}> pageInfo = new Page<${entity}>(param.getPageNum(),param.getPageSize());
    IPage<${entity}> page = page(pageInfo, queryWrapper);

    return page;
    }

    /**
    * ${table.comment!}详情
    * @param id
    * @return
    */
    @Override
    public ${entity} info(Long id) {

    return getById(id);
    }

    /**
    * ${table.comment!}新增
    * @param param 根据需要进行传值
    * @return
    */
    @Override
    public void add(${entity} param) {

    save(param);
    }

    /**
    * ${table.comment!}修改
    * @param param 根据需要进行传值
    * @return
    */
    @Override
    public void modify(${entity} param) {

    updateById(param);
    }

    /**
    * ${table.comment!}删除(单个条目)
    * @param id
    * @return
    */
    @Override
    public void remove(Long id) {
    removeById(id);
    }

    /**
    * ${table.comment!}删除(多个条目)
    * @param ids
    * @return
    */
    @Override
    public void removes(List<Long> ids) {

    removeByIds(ids);
    }
    }
</#if>