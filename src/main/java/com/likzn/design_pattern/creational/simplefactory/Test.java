package com.likzn.design_pattern.creational.simplefactory;

/**
 * @auther: Li jx
 * @date: 2019/3/17 16:30
 * @description:
 */
public class Test {
    //    public static void main(String[] args) {
//        CourseFactory courseFactory = new CourseFactory();
//        ICourse course = courseFactory.getCourse("java");
//        course.produce();
//    }
    public static void main(String[] args) {
        CourseFactory courseFactory = new CourseFactory();
        ICourse course = courseFactory.getCourse(JavaCourse.class);
        course.produce();

    }

}
