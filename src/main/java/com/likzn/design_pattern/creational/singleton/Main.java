package com.likzn.design_pattern.creational.singleton;

import java.io.*;

/**
 * @auther: Li jx
 * @date: 2019/3/22 15:36
 * @description:
 */
public class Main {
    public static void main(String[] args) throws InterruptedException, IOException, ClassNotFoundException {
//        LazySingleton lazySingleton = LazySingleton.getInstance();

    //        ExecutorService thread = Executors.newCachedThreadPool();
    //        for (int i = 0; i < 2; i++) {
    //            thread.execute(()->{
    //                StaticInnerSingleton staticInnerSingleton = StaticInnerSingleton.getInstance();
    //                System.out.println(Thread.currentThread().getName() + "" + staticInnerSingleton);
    //
    //            });
    //
    //        }
    //
    //        thread.shutdown();
    //        System.out.println("end");
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("single"));
        objectOutputStream.writeObject(hungrySingleton);

        File file = new File("single");
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));

        HungrySingleton instance = (HungrySingleton) objectInputStream.readObject();
        System.out.println(hungrySingleton);
        System.out.println(instance);
        System.out.println(instance == hungrySingleton);


    }
}
