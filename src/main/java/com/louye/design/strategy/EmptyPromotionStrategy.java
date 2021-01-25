package com.louye.design.strategy;

/**
 * @Auther: louye
 * @Date: 2021/1/25 10:55
 * @Description:
 */
public class EmptyPromotionStrategy implements PromotionStrategy{
    public void doPromotion() {
        System.out.println("空营销策略");
    }
}
