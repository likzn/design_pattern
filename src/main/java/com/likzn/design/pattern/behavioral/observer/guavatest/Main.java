package com.likzn.design.pattern.behavioral.observer.guavatest;

/**
 * @auther: Li jx
 * @date: 2019/4/5 13:24
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("12");
        Course course = new Course("java");
        Question question = new Question("怎么实现观察者", "asd");
        course.register(teacher);
        course.post(question);
    }
}
