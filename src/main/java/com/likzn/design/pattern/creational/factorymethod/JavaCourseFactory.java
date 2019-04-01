package com.likzn.design.pattern.creational.factorymethod;

/**
 * @auther: Li jx
 * @date: 2019/3/18 18:51
 * @description:
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public ICourse getCourse() {
        return new JavaCourse();
    }
}
