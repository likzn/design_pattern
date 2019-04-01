package com.likzn.design_pattern.structural.adapter;

/**
 * @auther: Li jx
 * @date: 2019/3/28 16:19
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        DC5 dc5 = new Adapter();
        dc5.outputDC5();
    }
}
