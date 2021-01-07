package com.louye.design.structural.adapter.objectadapter;

/**
 * @Auther: louye
 * @Date: 2021/1/7 09:56
 * @Description:
 */
public class Adapter implements Target{
    private Adaptee adaptee = new Adaptee();
    public void request() {
        adaptee.adapteeRequest();
    }
}
