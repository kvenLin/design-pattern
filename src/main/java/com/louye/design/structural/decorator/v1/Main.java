package com.louye.design.structural.decorator.v1;

/**
 * @Auther: louye
 * @Date: 2021/1/6 16:35
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        BatterCake batterCake = new BatterCake();
        System.out.println(batterCake.getDesc() + ", 价格: " + batterCake.cost());

        BatterCake batterCakeWithEgg = new BatterCakeWithEgg();
        System.out.println(batterCakeWithEgg.getDesc() + ", 价格: " + batterCakeWithEgg.cost());

        BatterCake batterCakeWithEggSausage = new BatterCakeWithEggSausage();
        System.out.println(batterCakeWithEggSausage.getDesc() + ", 价格: " + batterCakeWithEggSausage.cost());
    }
}
