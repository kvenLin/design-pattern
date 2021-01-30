package com.louye.design.behavior.mediator;

/**
 * @Auther: louye
 * @Date: 2021/1/31 01:17
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        User clf = new User("clf");
        User louye = new User("louye");
        clf.sendMessage("hello louye, how r u ?");
        louye.sendMessage("I'm fine, thank u!");
    }
}
