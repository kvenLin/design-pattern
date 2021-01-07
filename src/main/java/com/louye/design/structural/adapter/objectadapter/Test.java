package com.louye.design.structural.adapter.objectadapter;

/**
 * @Auther: louye
 * @Date: 2021/1/6 19:48
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();
        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}
