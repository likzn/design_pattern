package com.likzn.design.pattern.creational.abstractfactory;

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

    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

}
