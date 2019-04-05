package com.likzn.design.pattern.behavioral.stragety;

/**
 * @auther: Li jx
 * @date: 2019/4/2 19:50
 * @description:
 */
public class EmptyStrategy implements IStrategy {
    @Override
    public void execute() {
        System.out.println("不打折");

    }
}
