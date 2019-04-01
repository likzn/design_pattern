package com.likzn.design.pattern.creational.singleton;

/**
 * @auther: Li jx
 * @date: 2019/3/22 15:35
 * @description:
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    private LazySingleton() {
    }
    public  static LazySingleton getInstance() {
        if (null == lazySingleton) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
