package com.likzn.design.pattern.creational.simplefactory;

/**
 * @auther: Li jx
 * @date: 2019/3/17 16:30
 * @description:
 */
public class PythonCourse implements ICourse{
    @Override
    public void produce() {
        System.out.println("Python");
    }
}
