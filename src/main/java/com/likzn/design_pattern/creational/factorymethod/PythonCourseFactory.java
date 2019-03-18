package com.likzn.design_pattern.creational.factorymethod;

/**
 * @auther: Li jx
 * @date: 2019/3/18 18:51
 * @description:
 */
public class PythonCourseFactory implements CourseFactory {
    @Override
    public ICourse getCourse() {
        return new PythonCourse();
    }

}
