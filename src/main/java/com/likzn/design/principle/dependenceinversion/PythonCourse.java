package com.likzn.design.principle.dependenceinversion;

/**
 * @auther: Li jx
 * @date: 2019/3/17 12:57
 * @description:
 */
public class PythonCourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("学习Python");
    }
}
