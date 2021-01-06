package com.louye.design.abstractfactory;

/**
 * @Auther: louye
 * @Date: 2021/1/6 14:50
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();
        video.produce();
        article.produce();
    }
}
