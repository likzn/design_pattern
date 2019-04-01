package com.likzn.design.pattern.structural.flyweight;

/**
 * @auther: Li jx
 * @date: 2019/3/28 20:11
 * @description:
 */
public class Main {
    private static  String[] departments = {"QA", "PM", "HR", "TG"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String department = departments[(int) (Math.random() * departments.length)];
            Manager manager = (Manager) MangerFactory.getManger(department);
            manager.report();
        }
    }

}
