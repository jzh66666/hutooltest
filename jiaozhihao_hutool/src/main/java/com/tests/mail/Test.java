package com.tests.mail;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.extra.mail.MailAccount;
import cn.hutool.extra.mail.MailUtil;
/**
 * @desc   邮件
 * @author JZH
 *
 */
public class Test {
	public static void main(String[] args) {
		MailAccount account = new MailAccount();
        account.setHost("smtp.qq.com");
        account.setPort(25);
        account.setAuth(true);
        account.setFrom("1147981135@qq.com");
        account.setUser("1147981135@qq.com");
        account.setPass("efjzehhqudcfgiih"); //授权码
        MailUtil.send(account, CollUtil.newArrayList("1147981135@qq.com"), "主题", "内容", false);
	}
}
