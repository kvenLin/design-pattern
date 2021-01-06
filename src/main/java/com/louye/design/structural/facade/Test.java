package com.louye.design.structural.facade;

/**
 * @Auther: louye
 * @Date: 2021/1/6 15:48
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        PointGift pointGift = new PointGift("T恤");
        GiftExchangeService giftExchangeService = new GiftExchangeService();

        giftExchangeService.giftExchange(pointGift);
    }
}
