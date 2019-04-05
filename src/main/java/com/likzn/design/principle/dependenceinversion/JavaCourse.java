package com.likzn.design.principle.dependenceinversion;

/**
 * @auther: Li jx
 * @date: 2019/3/17 12:50
 * @description:
 */
public class JavaCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("学习java");
    }
}
