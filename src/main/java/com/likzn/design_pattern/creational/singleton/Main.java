package com.likzn.design_pattern.creational.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @auther: Li jx
 * @date: 2019/3/22 15:36
 * @description:
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
//        LazySingleton lazySingleton = LazySingleton.getInstance();

        ExecutorService thread = Executors.newCachedThreadPool();
        for (int i = 0; i < 2; i++) {
            thread.execute(()->{
                LazyDoubleCheckSingleton lazyDoubleCheckSingleton = LazyDoubleCheckSingleton.getInstance();
                System.out.println(Thread.currentThread().getName() + "" + lazyDoubleCheckSingleton);

            });

        }

        thread.shutdown();
        System.out.println("end");
    }
}
