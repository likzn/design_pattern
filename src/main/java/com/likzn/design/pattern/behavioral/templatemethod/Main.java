package com.likzn.design.pattern.behavioral.templatemethod;

/**
 * @auther: Li jx
 * @date: 2019/4/1 21:10
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("-----------");
        ACourse javaCourse = new JavaDesignCourse();
        javaCourse.makeCourse();
        System.out.println("-----------");


        System.out.println("-----------");
        ACourse FECourse = new FECourse();
        FECourse.makeCourse();
        System.out.println("-----------");

    }
}
