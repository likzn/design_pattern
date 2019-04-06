package com.likzn.design.pattern.behavioral.mediator;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @auther: Li jx
 * @date: 2019/4/6 13:43
 * @description:
 */
@Getter
@AllArgsConstructor
public class User {
    private String name;

    public void sendMessage(String message) {
        Chatroom.showMessage(this, message);
    }
}
