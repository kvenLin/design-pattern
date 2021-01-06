package com.louye.design.factorymethod;

/**
 * @Auther: louye
 * @Date: 2021/1/6 11:22
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
    }
}
