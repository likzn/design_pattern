package com.likzn.design_pattern.structural.adapter.classadapter;

/**
 * @auther: Li jx
 * @date: 2019/3/28 16:12
 * @description:
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void targetRuquest() {
        super.request();

    }
}
