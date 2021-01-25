package com.louye.design.strategy;

/**
 * @Auther: louye
 * @Date: 2021/1/25 10:55
 * @Description:
 */
public class ManJianPromotionStrategy implements PromotionStrategy{
    public void doPromotion() {
        System.out.println("满减促销, 满200减20");
    }
}
