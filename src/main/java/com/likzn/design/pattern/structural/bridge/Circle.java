package com.likzn.design.pattern.structural.bridge;



/**
 * @auther: Li jx
 * @date: 2019/4/1 16:03
 * @description:
 */
public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    String getColor() {
        return color.getColor();
    }
}
