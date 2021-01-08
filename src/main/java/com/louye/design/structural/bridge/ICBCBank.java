package com.louye.design.structural.bridge;

/**
 * @Auther: louye
 * @Date: 2021/1/8 11:39
 * @Description:
 */
public class ICBCBank extends Bank {
    public ICBCBank(Account account) {
        super(account);
    }

    Account openAccount() {
        System.out.println("打开工商银行T账号");
        return account;
    }
}
