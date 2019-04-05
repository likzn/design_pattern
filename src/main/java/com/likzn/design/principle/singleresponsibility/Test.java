package com.likzn.design.principle.singleresponsibility;

/**
 * @auther: Li jx
 * @date: 2019/3/17 13:33
 * @description:
 */
public class Test {
    public static void main(String[] args) {
        WalkBird walkBird = new WalkBird();
        walkBird.move("鸵鸟");
        FlyBird flyBird = new FlyBird();
        flyBird.move("大雁");
    }
}
