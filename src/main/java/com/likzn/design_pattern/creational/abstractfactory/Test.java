package com.likzn.design_pattern.creational.abstractfactory;

/**
 * @auther: Li jx
 * @date: 2019/3/17 16:30
 * @description: 针对产品族
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new PythonCourseFactory();
        ICourse course = courseFactory.getCourse();
        course.produce();
        Video video = courseFactory.getVideo();
        video.produce();
    }
}
