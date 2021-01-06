package com.louye.design.prototype.clone;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

/**
 * @Auther: louye
 * @Date: 2021/1/6 09:34
 * @Description:
 */
//@Data
@AllArgsConstructor
public class Pig implements Cloneable{
    private String name;
    private Date birthday;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Pig pig = (Pig) super.clone();
        //深克隆
        pig.birthday = (Date) pig.birthday.clone();
        return pig;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", " + super.toString() +
                '}';
    }
}
