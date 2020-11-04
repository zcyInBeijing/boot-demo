package com.xfs.service.impl;

import com.xfs.annotation.MonitorLog;
import com.xfs.entity.Order;
import com.xfs.mapper.OrderMapper;
import com.xfs.service.IOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import groovy.util.logging.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xfs.base.PageVo;
import java.util.List;

/**
* <p>
    *  服务实现类
    * </p>
*
* @author mybatis-plus
* @since 2020-11-04
*/
@Service
@Slf4j
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {

    /**
    * 分页列表
    * @param param 根据需要进行传值
    * @return
    */
    @Override
    public IPage<Order> page(PageVo param) {
        QueryWrapper<Order> queryWrapper = new QueryWrapper<>();
        Page<Order> pageInfo = new Page<Order>(param.getPageNum(),param.getPageSize());
        IPage<Order> page = page(pageInfo, queryWrapper);
        return page;
    }

    /**
    * 详情
    * @param id
    * @return
    */
    @Override
    @MonitorLog
    public Order info(Long id) {
        return getById(id);
    }

    /**
    * 新增
    * @param param 根据需要进行传值
    * @return
    */
    @Override
    @MonitorLog
    public void add(Order param) {
        save(param);
    }

    /**
    * 修改
    * @param param 根据需要进行传值
    * @return
    */
    @Override
    public void modify(Order param) {
        updateById(param);
    }

    /**
    * 删除(单个条目)
    * @param id
    * @return
    */
    @Override
    public void remove(Long id) {
        removeById(id);
    }

    /**
    * 删除(多个条目)
    * @param ids
    * @return
    */
    @Override
    public void removes(List<Long> ids) {
        removeByIds(ids);
    }

    @Override
    public Order detail(Order order) {
        QueryWrapper<Order> orderQueryWrapper = new QueryWrapper<>();
        Order one = getOne(orderQueryWrapper.setEntity(order));
        System.out.println(one);
        return one;
    }
}
