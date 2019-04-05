package com.likzn.design.pattern.behavioral.stragety;

/**
 * @auther: Li jx
 * @date: 2019/4/2 19:38
 * @description:
 */
public class ManjianStrategy implements IStrategy {
    @Override
    public void execute() {
        System.out.println("实现满减");
    }
}
