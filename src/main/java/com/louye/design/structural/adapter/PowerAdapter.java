package com.louye.design.structural.adapter;

/**
 * @Auther: louye
 * @Date: 2021/1/7 10:05
 * @Description:
 */
public class PowerAdapter implements DC5{
    private AC220 ac220 = new AC220();
    public int outPutDC5V() {
        int adapterInput = ac220.outPutAC220V();
        //变压器...
        int adapterOutPut = adapterInput / 44;
        System.out.println("使用电源适配器输入: " + adapterInput + "V, 输出: " + adapterOutPut + "V");
        return adapterOutPut;
    }
}
