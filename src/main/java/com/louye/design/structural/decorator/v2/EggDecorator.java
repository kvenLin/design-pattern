package com.louye.design.structural.decorator.v2;

/**
 * @Auther: louye
 * @Date: 2021/1/6 16:48
 * @Description:
 */
public class EggDecorator extends ADecorator{
    public EggDecorator(ABatterCake aBatterCake) {
        super(aBatterCake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 1;
    }

    protected void doSomething() {

    }
}
