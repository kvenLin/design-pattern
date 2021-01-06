package com.louye.design.structural.decorator.v1;

/**
 * @Auther: louye
 * @Date: 2021/1/6 16:32
 * @Description:
 */
public class BatterCakeWithEgg extends BatterCake{

    @Override
    public String getDesc() {
        return super.getDesc() + "加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}
