package com.louye.design.structural.adapter;

/**
 * @Auther: louye
 * @Date: 2021/1/7 10:09
 * @Description:
 * 生活场景: 电源适配器, 220V电流转换为5V电流
 */
public class Test {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter();
        dc5.outPutDC5V();
    }
}
