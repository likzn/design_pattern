package com.likzn.design.principle.singleresponsibility;

/**
 * @auther: Li jx
 * @date: 2019/3/17 13:38
 * @description:
 */
public class JavaCourse implements ICourseContent,ICourseManager {
    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public String getCoursePrice() {
        return null;
    }

    @Override
    public void refund() {

    }

    @Override
    public byte[] subscribe() {
        return new byte[0];
    }
}
