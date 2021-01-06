package com.louye.design.factorymethod;

/**
 * @Auther: louye
 * @Date: 2021/1/6 11:20
 * @Description:
 */
public class PythonVideoFactory extends VideoFactory {
    public Video getVideo() {
        return new PythonVideo();
    }
}
