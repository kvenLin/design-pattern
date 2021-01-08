package com.louye.design.structural.bridge;

/**
 * @Auther: louye
 * @Date: 2021/1/8 11:35
 * @Description:
 */
public abstract class Bank {
    protected Account account;
    public Bank(Account account) {
        this.account = account;
    }
    abstract Account openAccount();
}
