package com.louye.design.structural.bridge;

/**
 * @Auther: louye
 * @Date: 2021/1/8 11:45
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Bank icbcBank = new ICBCBank(new DepositAccount());
        Account icbcAccount = icbcBank.openAccount();
        icbcAccount.showAccountType();
    }
}
