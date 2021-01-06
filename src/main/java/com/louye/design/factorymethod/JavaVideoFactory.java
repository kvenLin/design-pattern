package com.louye.design.factorymethod;

/**
 * @Auther: louye
 * @Date: 2021/1/6 11:19
 * @Description:
 */
public class JavaVideoFactory extends VideoFactory {
    public Video getVideo() {
        return new JavaVideo();
    }
}
