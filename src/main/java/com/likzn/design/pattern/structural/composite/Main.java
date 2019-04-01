package com.likzn.design.pattern.structural.composite;

/**
 * @auther: Li jx
 * @date: 2019/3/29 15:27
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        CataLog cataLog = new CataLog("总目录",1);
        CataLog javaCataLog = new CataLog("JAVA目录",2);
        Course windows = new Course("windox", 11);
        Course linux = new Course("linux", 12);
        Course java1 = new Course("java一期", 1);
        Course java2 = new Course("java二期", 2);
        Course java3 = new Course("java三期", 3);
        cataLog.add(windows);
        cataLog.add(linux);
        cataLog.add(javaCataLog);
        javaCataLog.add(java1);
        javaCataLog.add(java2);
        javaCataLog.add(java3);
        cataLog.print();
    }
}
