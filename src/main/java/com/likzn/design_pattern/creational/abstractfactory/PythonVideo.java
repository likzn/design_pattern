package com.likzn.design_pattern.creational.abstractfactory;

/**
 * @auther: Li jx
 * @date: 2019/3/18 19:57
 * @description:
 */
public class PythonVideo implements Video {
    @Override
    public void produce() {
        System.out.println("Python录像");
    }
}
