package com.likzn.design_pattern.creational.singleton;

import java.io.Serializable;

/**
 * @auther: Li jx
 * @date: 2019/3/23 14:31
 * @description:
 */
public class HungrySingleton implements Serializable {
    private static final HungrySingleton instance = new HungrySingleton();

    HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return instance;
    }

    public Object readResolve() {
        return instance;
    }
}
