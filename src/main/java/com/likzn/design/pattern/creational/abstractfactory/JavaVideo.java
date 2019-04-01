package com.likzn.design.pattern.creational.abstractfactory;

/**
 * @auther: Li jx
 * @date: 2019/3/18 19:56
 * @description:
 */
public class JavaVideo implements Video{

    @Override
    public void produce() {
        System.out.println("java录像");
    }
}
