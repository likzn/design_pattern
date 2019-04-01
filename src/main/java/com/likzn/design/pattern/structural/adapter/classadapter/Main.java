package com.likzn.design.pattern.structural.adapter.classadapter;

/**
 * @auther: Li jx
 * @date: 2019/3/28 16:13
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.targetRuquest();
    }
}
