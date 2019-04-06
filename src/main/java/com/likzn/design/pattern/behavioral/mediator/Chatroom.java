package com.likzn.design.pattern.behavioral.mediator;

import java.util.Date;

/**
 * @auther: Li jx
 * @date: 2019/4/6 13:44
 * @description:
 */
public class Chatroom {
    public static void showMessage(User user, String mes) {
        System.out.println(new Date().toString() + user.getName() + "发送了" + mes);
    }
}
