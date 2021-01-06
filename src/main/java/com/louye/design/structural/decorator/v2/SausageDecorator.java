package com.louye.design.structural.decorator.v2;

/**
 * @Auther: louye
 * @Date: 2021/1/6 16:48
 * @Description:
 */
public class SausageDecorator extends ADecorator{
    public SausageDecorator(ABatterCake aBatterCake) {
        super(aBatterCake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一根香肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }

    protected void doSomething() {

    }
}
