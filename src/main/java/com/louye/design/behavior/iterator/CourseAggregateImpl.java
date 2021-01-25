package com.louye.design.behavior.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: louye
 * @Date: 2021/1/22 11:34
 * @Description:
 */
public class CourseAggregateImpl implements CourseAggregate {
    private List courseList;

    public CourseAggregateImpl() {
        this.courseList = new ArrayList();
    }

    public void addCourse(Course course) {
        courseList.add(course);
    }

    public void removeCourse(Course course) {
        courseList.remove(course);
    }

    public CourseIterator getCourseIterator() {
        return new CourseIteratorImpl(courseList) ;
    }
}
