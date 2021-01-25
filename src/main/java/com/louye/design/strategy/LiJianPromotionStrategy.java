package com.louye.design.strategy;

/**
 * @Auther: louye
 * @Date: 2021/1/25 10:55
 * @Description:
 */
public class LiJianPromotionStrategy implements PromotionStrategy{
    public void doPromotion() {
        System.out.println("实现立减促销, 课程的价格直接减去配置的价格");
    }
}
