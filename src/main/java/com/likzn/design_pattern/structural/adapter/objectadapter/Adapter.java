package com.likzn.design_pattern.structural.adapter.objectadapter;

/**
 * @auther: Li jx
 * @date: 2019/3/28 16:12
 * @description:
 */
public class Adapter implements Target {
    Adaptee adaptee = new Adaptee();
    @Override
    public void targetRuquest() {
        adaptee.request();

    }
}
