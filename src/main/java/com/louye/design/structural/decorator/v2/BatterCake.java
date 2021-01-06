package com.louye.design.structural.decorator.v2;

/**
 * @Auther: louye
 * @Date: 2021/1/6 16:45
 * @Description:
 */
public class BatterCake extends ABatterCake{
    protected String getDesc() {
        return "煎饼";
    }

    protected int cost() {
        return 8;
    }
}
