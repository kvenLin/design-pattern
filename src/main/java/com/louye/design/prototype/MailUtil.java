package com.louye.design.prototype;

import java.text.MessageFormat;

/**
 * @Auther: louye
 * @Date: 2021/1/5 21:32
 * @Description:
 */
public class MailUtil {
    public static void send(Mail mail) {
        String outPutContent = "向{0}同学, 邮件地址: {1}, 邮件内容: {2}, 发送邮件!";
        System.out.println(MessageFormat.format(outPutContent, mail.getName(), mail.getEmailAddress(), mail.getContent()));
    }

    public static void saveOriginMailRecord(Mail mail) {
        System.out.println("存储原始邮件记录, originMail: " + mail.getContent());
    }
}
