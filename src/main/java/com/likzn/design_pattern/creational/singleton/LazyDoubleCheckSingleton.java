package com.likzn.design_pattern.creational.singleton;

/**
 * @auther: Li jx
 * @date: 2019/3/22 16:22
 * @description:
 */
public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton() {

    }

    public static LazyDoubleCheckSingleton getInstance() {
        if (null == lazyDoubleCheckSingleton) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (null == lazyDoubleCheckSingleton) {
                    // 指令重排序
                    // 1.分配内存
                    // 2.初始化对象
                    // 3.lazyDoubleCheckSingleton指向这个内存

                    // 指令重排序

                    // 1
                    // 3
                    // 2 所以要禁止指令重排序 用volatile
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }

}
