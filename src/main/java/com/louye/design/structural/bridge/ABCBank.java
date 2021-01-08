package com.louye.design.structural.bridge;

/**
 * @Auther: louye
 * @Date: 2021/1/8 11:39
 * @Description:
 */
public class ABCBank extends Bank {
    public ABCBank(Account account) {
        super(account);
    }

    Account openAccount() {
        System.out.println("打开中国农业银行账号");
        return account;
    }
}
