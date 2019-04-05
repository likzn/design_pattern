package com.likzn.design.pattern.behavioral.observer;

/**
 * @auther: Li jx
 * @date: 2019/4/5 13:24
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        Course course = new Course("Java设计模式");
        Teacher teacher = new Teacher("Teacher");
        Question question = new Question("单例模式是什么", "小L");


        course.addObserver(teacher);
        course.produceQuestion(question);


    }
}
