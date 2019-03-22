package com.likzn.design_pattern.creational.builder.v2;

/**
 * @auther: Li jx
 * @date: 2019/3/19 14:51
 * @description:
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseName("Java")
                .buildCoursePPT("javaPPt")
                .buildCourseQA("qa")
                .build();
        System.out.println(course);

    }
}
