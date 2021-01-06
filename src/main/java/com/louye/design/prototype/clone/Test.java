package com.louye.design.prototype.clone;

import java.util.Date;

/**
 * @Auther: louye
 * @Date: 2021/1/6 09:36
 * @Description:
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date birthday = new Date(0L);
        Pig pig1 = new Pig("佩奇", birthday);
        Pig pig2 = (Pig) pig1.clone();
        System.out.println(pig1);
        System.out.println(pig2);

//      pig1.setName("test");
        pig1.getBirthday().setTime(66666666666L);
        System.out.println(pig1);
        System.out.println(pig2);
    }
}
