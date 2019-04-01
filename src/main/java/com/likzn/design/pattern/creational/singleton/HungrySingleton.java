package com.likzn.design.pattern.creational.singleton;

import java.io.Serializable;

/**
 * @auther: Li jx
 * @date: 2019/3/23 14:31
 * @description:
 */
public class HungrySingleton implements Serializable,Cloneable {
    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
        if (instance != null) {
            throw new RuntimeException("反射");
        }
    }

    public static HungrySingleton getInstance() {
        return instance;
    }

    public Object readResolve() {
        return instance;
    }
}
