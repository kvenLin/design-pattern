package com.louye.design.prototype;

/**
 * @Auther: louye
 * @Date: 2021/1/5 21:37
 * @Description:
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");
        for (int i = 0; i < 10; i++) {
            Mail mailTemp = (Mail) mail.clone();
            mailTemp.setName("姓名" + i);
            mailTemp.setEmailAddress("姓名" + i + "@gmail.com");
            mailTemp.setContent("恭喜中奖了!");
            MailUtil.send(mailTemp);
        }
        MailUtil.saveOriginMailRecord(mail);
    }
}
