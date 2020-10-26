package com.xfs.serviceImpl;

import com.xfs.entity.UserInfo;
import com.xfs.mapper.UserInfoMapper;
import com.xfs.service.IUserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
    * 用户信息 服务实现类
    * </p>
*
* @author zhucy
* @since 2020-10-26
*/
@Service
    public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

    /**
    * 用户信息分页列表
    * @param param 根据需要进行传值
    * @return
    */
    @Override
    public IPage<UserInfo> page(PageVo param) {

    QueryWrapper<UserInfo> queryWrapper = new QueryWrapper<>();
    Page<UserInfo> pageInfo = new Page<UserInfo>(param.getPageNum(),param.getPageSize());
    IPage<UserInfo> page = page(pageInfo, queryWrapper);

    return page;
    }

    /**
    * 用户信息详情
    * @param id
    * @return
    */
    @Override
    public UserInfo info(Long id) {

    return getById(id);
    }

    /**
    * 用户信息新增
    * @param param 根据需要进行传值
    * @return
    */
    @Override
    public void add(UserInfo param) {

    save(param);
    }

    /**
    * 用户信息修改
    * @param param 根据需要进行传值
    * @return
    */
    @Override
    public void modify(UserInfo param) {

    updateById(param);
    }

    /**
    * 用户信息删除(单个条目)
    * @param id
    * @return
    */
    @Override
    public void remove(Long id) {
    removeById(id);
    }

    /**
    * 用户信息删除(多个条目)
    * @param ids
    * @return
    */
    @Override
    public void removes(List<Long> ids) {

    removeByIds(ids);
    }
    }
