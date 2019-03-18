package com.likzn.design_pattern.creational.factorymethod;

/**
 * @auther: Li jx
 * @date: 2019/3/17 16:30
 * @description:
 */
public class PythonCourse implements ICourse {
    @Override
    public void produce() {
        System.out.println("Python");
    }
}
