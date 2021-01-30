package com.louye.design.behavior.command;

import lombok.AllArgsConstructor;

/**
 * @Auther: louye
 * @Date: 2021/1/26 18:27
 * @Description: 
 */
@AllArgsConstructor
public class CourseVideo {
    private String name;

    public void open(){
        System.out.println(this.name + "课程视频打开");
    }

    public void close(){
        System.out.println(this.name + "课程视频关闭");
    }

}
