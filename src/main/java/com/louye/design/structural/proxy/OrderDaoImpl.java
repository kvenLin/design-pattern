package com.louye.design.structural.proxy;

/**
 * @Auther: louye
 * @Date: 2021/1/8 14:44
 * @Description:
 */
public class OrderDaoImpl implements IOrderDao{
    public int insert(Order order) {
        System.out.println("DAO层添加order成功");
        return 1;
    }
}
