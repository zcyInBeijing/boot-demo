package com.xfs.service;

import com.xfs.entity.Order;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xfs.base.PageVo;
import java.util.List;

/**
* <p>
 *  服务类
 * </p>
*
* @author mybatis-plus
* @since 2020-11-04
*/
public interface IOrderService extends IService<Order> {

   /**
   * 分页列表
   * @param param 根据需要进行传值
   * @return
   */
   IPage<Order> page(PageVo param);

   /**
   * 详情
   * @param id
   * @return
   */
   Order info(Long id);

   /**
   * 新增
   * @param param 根据需要进行传值
   * @return
   */
   void add(Order param);

   /**
   * 修改
   * @param param 根据需要进行传值
   * @return
   */
   void modify(Order param);

   /**
   * 删除(单个条目)
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


   Order detail(Order order);
}
