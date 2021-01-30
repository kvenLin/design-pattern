package com.louye.design.behavior.mediator;

/**
 * @Auther: louye
 * @Date: 2021/1/31 01:11
 * @Description:
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        StudyGroup.showMessage(this, message);
    }
}
