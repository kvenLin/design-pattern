package com.louye.design.behavior.templatemethod;

/**
 * @Auther: louye
 * @Date: 2021/1/21 17:12
 * @Description: 模板方法模式
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("后端设计模式课程start---");
        ACourse designPatternCourse = new DesignPatternCourse();
        designPatternCourse.makeCourse();
        System.out.println("后端设计模式课程end---");

        System.out.println("前端课程start---");
        ACourse feCourse = new FECourse(true);
        feCourse.makeCourse();
        System.out.println("前端课程end---");


    }
}
