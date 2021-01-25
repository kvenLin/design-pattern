package com.louye.design.strategy;

/**
 * @Auther: louye
 * @Date: 2021/1/25 10:55
 * @Description:
 */
public class FanXianPromotionStrategy implements PromotionStrategy{
    public void doPromotion() {
        System.out.println("返现促销, 返回的金额放到用户余额中");
    }
}
