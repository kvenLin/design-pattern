package com.louye.design.behavior.mediator;

import java.util.Date;

/**
 * @Auther: louye
 * @Date: 2021/1/31 01:12
 * @Description:
 */
public class StudyGroup {

    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + "[" + user.getName() + "]: " + message);
    }
}
