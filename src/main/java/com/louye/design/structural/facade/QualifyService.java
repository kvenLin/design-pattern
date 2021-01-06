package com.louye.design.structural.facade;

/**
 * @Auther: louye
 * @Date: 2021/1/6 15:37
 * @Description:
 */
public class QualifyService {
    public boolean isAvailable(PointGift pointGift) {
        System.out.println("校验: " + pointGift.getName() + " 积分通过...");
        return true;
    }
}
