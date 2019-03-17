package com.likzn.design_pattern.singleresponsibility;

/**
 * @auther: Li jx
 * @date: 2019/3/17 13:30
 * @description:
 */
public class Bird {

    public void move(String birdName) {
        //大量if-else难维护，应拆分
        if ("鸵鸟".equals(birdName)){
            System.out.println("用脚走");
        } else {
            System.out.println("用翅膀飞");
        }
    }
}
