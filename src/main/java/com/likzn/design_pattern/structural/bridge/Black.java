package com.likzn.design_pattern.structural.bridge;

/**
 * @auther: Li jx
 * @date: 2019/4/1 16:06
 * @description:
 */
public class Black implements Color {
    String color;

    public Black(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }
}
