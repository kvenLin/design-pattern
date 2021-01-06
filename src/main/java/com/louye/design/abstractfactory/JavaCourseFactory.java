package com.louye.design.abstractfactory;

/**
 * @Auther: louye
 * @Date: 2021/1/6 14:39
 * @Description:
 */
public class JavaCourseFactory implements CourseFactory{
    public Video getVideo() {
        return new JavaVideo();
    }

    public Article getArticle() {
        return new JavaArticle();
    }
}
