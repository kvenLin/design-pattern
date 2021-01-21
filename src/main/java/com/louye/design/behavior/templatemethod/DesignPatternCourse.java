package com.louye.design.behavior.templatemethod;

/**
 * @Auther: louye
 * @Date: 2021/1/21 17:10
 * @Description: 设计模式课程
 */
public class DesignPatternCourse extends ACourse {
    void packageCourse() {
        System.out.println("提供Java课程源代码");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }
}
