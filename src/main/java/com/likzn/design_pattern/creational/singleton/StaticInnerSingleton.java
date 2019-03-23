package com.likzn.design_pattern.creational.singleton;

/**
 * @auther: Li jx
 * @date: 2019/3/22 18:19
 * @description:
 */
public class StaticInnerSingleton {

    private static class InnerClass {
        private static StaticInnerSingleton staticInnerSingleton = new StaticInnerSingleton();
    }

    public static StaticInnerSingleton getInstance() {
        return InnerClass.staticInnerSingleton;
    }

    private StaticInnerSingleton() {

    }



}
