package com.likzn.design_pattern.creational.builder;

/**
 * @auther: Li jx
 * @date: 2019/3/19 14:31
 * @description:
 */
public class Test {
    public static void main(String[] args) {

        Coach coach = new Coach();
        Course course = coach.makeCourse("Java", "JavaPPT", "JavaVideo", "JavaQA");
        System.out.println(course);
    }
}
