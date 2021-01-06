package com.louye.design.structural.facade;

/**
 * @Auther: louye
 * @Date: 2021/1/6 15:39
 * @Description:
 */
public class PointsPaymentService {
    public boolean pay(PointGift pointGift) {
        //扣积分
        System.out.println("支付" + pointGift.getName() + "成功");
        return true;
    }
}
