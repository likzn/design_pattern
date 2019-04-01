package com.likzn.design.pattern.creational.factorymethod;

/**
 * @auther: Li jx
 * @date: 2019/3/17 16:30
 * @description: 针对相同产品等级，不同产品族
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new PythonCourseFactory();
        ICourse course = courseFactory.getCourse();
        course.produce();
    }
}
