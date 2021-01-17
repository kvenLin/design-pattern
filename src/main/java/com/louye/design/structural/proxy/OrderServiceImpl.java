package com.louye.design.structural.proxy;

/**
 * @Auther: louye
 * @Date: 2021/1/8 14:45
 * @Description:
 */
public class OrderServiceImpl implements IOrderService {
    private IOrderDao iOrderDao;
    public int saveOrder(Order order) {
        //Spring中会自己注入, 这里直接new
        iOrderDao = new OrderDaoImpl();
        System.out.println("Service层调用DAO层添加Order");
        return iOrderDao.insert(order);
    }
}
