package com.louye.design.behavior.iterator;

import java.util.List;

/**
 * @Auther: louye
 * @Date: 2021/1/22 11:37
 * @Description:
 */
public class CourseIteratorImpl implements CourseIterator {

    private List courseList;
    private int position;
    private Course course;

    public CourseIteratorImpl(List courseList) {
        this.courseList = courseList;
    }

    public Course nextCourse() {
        System.out.println("返回课程, 位置是: " + position);
        course = (Course) courseList.get(position);
        position ++;
        return course;
    }

    public boolean isLastCourse() {
        if (position < courseList.size()) {
            return false;
        }
        return true;
    }
}
