package com.likzn.design_pattern.creational.simplefactory;

/**
 * @auther: Li jx
 * @date: 2019/3/17 16:29
 * @description:
 */
public class JavaCourse implements ICourse {
    @Override
    public void produce() {
        System.out.println("Java");
    }
}
