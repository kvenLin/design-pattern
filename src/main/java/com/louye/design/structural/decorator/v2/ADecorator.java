package com.louye.design.structural.decorator.v2;

/**
 * @Auther: louye
 * @Date: 2021/1/6 16:45
 * @Description:
 */
public abstract class ADecorator extends ABatterCake {
    private ABatterCake aBatterCake;

    public ADecorator(ABatterCake aBatterCake) {
        this.aBatterCake = aBatterCake;
    }

    protected String getDesc() {
        return this.aBatterCake.getDesc();
    }

    protected int cost() {
        return this.aBatterCake.cost();
    }

    protected abstract void doSomething();
}
