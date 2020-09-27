package com.george.springcloud.alibaba.dao;

import com.george.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Yang Hao
 * @date 2020-09-27 11:24
 */
@Mapper
public interface OrderDao {

    /**
     * 创建订单
     *
     * @param order
     */
    void create(Order order);

    /**
     * 修改订单状态
     *
     * @param userId
     * @param status
     */
    void update(Long userId, Integer status);
}

