package com.likzn.design.pattern.behavioral.observer;

import lombok.Getter;

import java.util.Observable;

/**
 * @auther: Li jx
 * @date: 2019/4/5 13:17
 * @description:
 */
@Getter
public class Course extends Observable {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void produceQuestion(Question question) {
        System.out.println(question.getUserName() + "问了" + courseName + question.getQuestionContent());
        setChanged();
        notifyObservers(question);
    }
}
