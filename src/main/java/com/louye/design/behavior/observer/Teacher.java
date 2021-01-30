package com.louye.design.behavior.observer;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Observable;
import java.util.Observer;

/**
 * @Auther: louye
 * @Date: 2021/1/26 09:47
 * @Description:
 */
@Data
@AllArgsConstructor
public class Teacher implements Observer {
    private String teacherName;

    public void update(Observable o, Object arg) {
        Course course = (Course) o;
        Question question = (Question) arg;
        System.out.println(teacherName
                + "老师的" + course.getCourseName()
                + "接收到一个" + question.getUsername()
                + "提交的问答:" + question.getContent());
    }
}
