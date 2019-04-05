package com.likzn.design.pattern.behavioral.observer.guavatest;

import com.google.common.eventbus.Subscribe;

/**
 * @auther: Li jx
 * @date: 2019/4/5 13:18
 * @description:
 */
public class Teacher {
    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    @Subscribe
    public void subscribe(Question question) {
        System.out.println(teacherName + "收到" + question.getUserName() + "问的" + question.getQuestionContent());
    }
}
