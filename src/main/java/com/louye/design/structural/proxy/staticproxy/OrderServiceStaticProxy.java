package com.louye.design.structural.proxy.staticproxy;

import com.louye.design.structural.proxy.IOrderService;
import com.louye.design.structural.proxy.Order;
import com.louye.design.structural.proxy.OrderServiceImpl;
import com.louye.design.structural.proxy.db.DataSourceContextHolder;

/**
 * @Auther: louye
 * @Date: 2021/1/8 14:49
 * @Description:
 */
public class OrderServiceStaticProxy {
    private IOrderService iOrderService;

    public int saveOrder(Order order) {
        beforeMethod(order);
        iOrderService = new OrderServiceImpl();
        int result = iOrderService.saveOrder(order);
        afterMethod();
        return result;
    }

    private void beforeMethod(Order order) {
        System.out.println("静态代理before code");
        int dbRouter = order.getUserId() % 2;
        System.out.println("静态代理分配到 [db" + dbRouter + "] 处理数据");
        // TODO: 2021/1/8 设置DataSource
        DataSourceContextHolder.setDBType("db" + dbRouter);
    }

    private void afterMethod() {
        System.out.println("静态代理after code");
    }
}
