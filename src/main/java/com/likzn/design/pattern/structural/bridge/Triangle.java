package com.likzn.design.pattern.structural.bridge;

/**
 * @auther: Li jx
 * @date: 2019/4/1 16:07
 * @description:
 */
public class Triangle extends Shape {
    public Triangle(Color color) {
        super(color);
    }

    @Override
    String getColor() {
        return color.getColor();
    }
}
