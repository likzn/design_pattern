package com.likzn.design_pattern.structural.bridge;

/**
 * @auther: Li jx
 * @date: 2019/4/1 16:02
 * @description:
 */
public abstract class Shape {
    protected Color color ;

    public Shape(Color color) {
        this.color = color;
    }

    abstract String getColor();
}
