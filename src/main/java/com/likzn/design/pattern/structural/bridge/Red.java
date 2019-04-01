package com.likzn.design.pattern.structural.bridge;

/**
 * @auther: Li jx
 * @date: 2019/4/1 16:05
 * @description:
 */
public class Red implements Color {
    String color;
    public Red(String color) {
        this.color = color;
    }
    @Override
    public String getColor() {
        return color;
    }
}
