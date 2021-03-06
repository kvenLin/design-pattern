package com.louye.design.abstractfactory;

/**
 * @Auther: louye
 * @Date: 2021/1/6 14:43
 * @Description:
 */
public class PythonCourseFactory implements CourseFactory {
    public Video getVideo() {
        return new PythonVideo();
    }

    public Article getArticle() {
        return new PythonArticle();
    }
}
