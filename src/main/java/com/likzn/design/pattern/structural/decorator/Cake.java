package com.likzn.design.pattern.structural.decorator;

/**
 * @auther: Li jx
 * @date: 2019/3/25 17:11
 * @description:
 */
public class Cake extends ACake {

    @Override
    public String getName() {
        return "蛋糕";
    }

    @Override
    public Integer cost() {
        return 10;
    }
}
