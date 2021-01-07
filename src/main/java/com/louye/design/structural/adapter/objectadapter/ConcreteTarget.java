package com.louye.design.structural.adapter.objectadapter;


/**
 * @Auther: louye
 * @Date: 2021/1/6 19:44
 * @Description:
 */
public class ConcreteTarget implements Target {
    public void request() {
        System.out.println("ConcreteTarget目标方法");
    }
}
