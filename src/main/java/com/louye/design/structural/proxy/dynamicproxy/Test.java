package com.louye.design.structural.proxy.dynamicproxy;

import com.louye.design.structural.proxy.IOrderService;
import com.louye.design.structural.proxy.Order;
import com.louye.design.structural.proxy.OrderServiceImpl;

/**
 * @Auther: louye
 * @Date: 2021/1/11 11:11
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(1);
        IOrderService iOrderService = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
        iOrderService.saveOrder(order);
    }
}
