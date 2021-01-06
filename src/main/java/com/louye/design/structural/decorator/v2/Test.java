package com.louye.design.structural.decorator.v2;

/**
 * @Auther: louye
 * @Date: 2021/1/6 16:51
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        ABatterCake aBatterCake = new BatterCake();
        aBatterCake = new EggDecorator(aBatterCake);
        aBatterCake = new EggDecorator(aBatterCake);
        aBatterCake = new SausageDecorator(aBatterCake);
        System.out.println(aBatterCake.getDesc() + "价格: " + aBatterCake.cost());
    }
}
