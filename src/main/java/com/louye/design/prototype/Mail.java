package com.louye.design.prototype;

import lombok.Data;

/**
 * @Auther: louye
 * @Date: 2021/1/5 21:28
 * @Description:
 */
@Data
public class Mail implements Cloneable{
    private String name;
    private String emailAddress;
    private String content;

    public Mail() {
        System.out.println("Mail Class Constructor");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("clone mail object");
        return super.clone();
    }
}
