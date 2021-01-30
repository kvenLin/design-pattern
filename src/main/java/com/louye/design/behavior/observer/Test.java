package com.louye.design.behavior.observer;

/**
 * @Auther: louye
 * @Date: 2021/1/26 09:56
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course("java设计模式");
        Teacher teacher = new Teacher("CLF");
        course.addObserver(teacher);

        //业务逻辑代码
        Question question = new Question();
        question.setUsername("louye");
        question.setContent("java的主函数编写实现");

        course.produce(course, question);
    }
}
