package com.louye.design.structural.adapter.classadapter;

/**
 * @Auther: louye
 * @Date: 2021/1/6 19:46
 * @Description:
 */
public class Adapter extends Adaptee implements Target{
    public void request() {
        super.adapteeRequest();
    }
}
