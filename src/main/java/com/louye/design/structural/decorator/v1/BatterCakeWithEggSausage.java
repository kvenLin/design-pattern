package com.louye.design.structural.decorator.v1;

/**
 * @Auther: louye
 * @Date: 2021/1/6 16:34
 * @Description:
 */
public class BatterCakeWithEggSausage extends BatterCakeWithEgg{
    @Override
    public String getDesc() {
        return super.getDesc() + " 加一根香肠";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
