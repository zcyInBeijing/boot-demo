package com.xfs.service;

import com.xfs.entity.UserInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xfs.base.PageVo;
import java.util.List;

/**
* <p>
 * 用户信息 服务类
 * </p>
*
* @author zhucy
* @since 2020-10-26
*/
 public interface IUserInfoService extends IService<UserInfo> {

 /**
 * 用户信息分页列表
 * @param param 根据需要进行传值
 * @return
 */
 IPage<UserInfo> page(PageVo param);

 /**
 * 用户信息详情
 * @param id
 * @return
 */
 UserInfo info(Long id);

 /**
 * 用户信息新增
 * @param param 根据需要进行传值
 * @return
 */
 void add(UserInfo param);

 /**
 * 用户信息修改
 * @param param 根据需要进行传值
 * @return
 */
 void modify(UserInfo param);

 /**
 * 用户信息删除(单个条目)
 * @param id
 * @return
 */
 void remove(Long id);

 /**
 * 删除(多个条目)
 * @param ids
 * @return
 */
 void removes(List<Long> ids);
 }
