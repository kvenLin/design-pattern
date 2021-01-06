package com.louye.design.structural.facade;

/**
 * @Auther: louye
 * @Date: 2021/1/6 15:41
 * @Description:
 */
public class ShippingService {
    public String shipGift(PointGift pointGift) {
        //物流系统的对接逻辑
        System.out.println(pointGift.getName() + "进入物流系统");
        return "213321";
    }
}
