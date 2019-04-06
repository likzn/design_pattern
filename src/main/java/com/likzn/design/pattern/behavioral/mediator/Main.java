package com.likzn.design.pattern.behavioral.mediator;

/**
 * @auther: Li jx
 * @date: 2019/4/6 13:46
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        User user1 = new User("aa");
        User user2 = new User("bb");

        user1.sendMessage("你是谁");
        user2.sendMessage("我是bb");

    }
}
