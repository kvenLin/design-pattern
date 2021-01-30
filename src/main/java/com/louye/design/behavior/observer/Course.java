package com.louye.design.behavior.observer;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Observable;

/**
 * @Auther: louye
 * @Date: 2021/1/26 09:45
 * @Description:
 */
@Data
@AllArgsConstructor
public class Course extends Observable {
    private String courseName;

    public void produce(Course course, Question question) {
        System.out.println(question.getUsername() + "在" + course.getCourseName() + "提交了一个问题");
        //状态发生改变
        setChanged();
        notifyObservers(question);

    }
}
