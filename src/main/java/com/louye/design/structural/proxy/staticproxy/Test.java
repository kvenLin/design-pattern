package com.louye.design.structural.proxy.staticproxy;

import com.louye.design.structural.proxy.Order;

/**
 * @Auther: louye
 * @Date: 2021/1/8 15:12
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);
        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);
    }
}
