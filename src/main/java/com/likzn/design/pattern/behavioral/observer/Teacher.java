package com.likzn.design.pattern.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @auther: Li jx
 * @date: 2019/4/5 13:18
 * @description:
 */
public class Teacher implements Observer {
    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course) o;
        Question question = (Question) arg;
        System.out.println(teacherName + "收到了" + course.getCourseName()+question.getUserName() + "问的" + question.getQuestionContent());
    }
}
