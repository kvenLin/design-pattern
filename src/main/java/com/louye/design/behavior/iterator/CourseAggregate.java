package com.louye.design.behavior.iterator;

/**
 * @Auther: louye
 * @Date: 2021/1/22 11:16
 * @Description:
 */
public interface CourseAggregate {
    void addCourse(Course course);
    void removeCourse(Course course);
    CourseIterator getCourseIterator();
}
