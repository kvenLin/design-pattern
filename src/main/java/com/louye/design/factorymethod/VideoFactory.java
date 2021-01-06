package com.louye.design.factorymethod;

/**
 * @Auther: louye
 * @Date: 2021/1/6 11:13
 * @Description:
 * 抽象工厂默认使用抽象类而不是使用接口, 只定义规范契约而不决定产生哪一类的产品, 产生哪一种类型完全交由子类实现
 * 原因: 大多数情况下抽象工厂有些行为是已知的, 所以抽象类可以提供默认已知的方法实现
 */
public abstract class VideoFactory {
    public abstract Video getVideo();
}
