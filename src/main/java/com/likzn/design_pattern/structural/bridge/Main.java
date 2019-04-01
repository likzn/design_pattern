package com.likzn.design_pattern.structural.bridge;

/**
 * @auther: Li jx
 * @date: 2019/4/1 16:12
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(new Red("红"));
        System.out.println(circle.getColor());

        Triangle triangle = new Triangle(new Black("黑"));
        System.out.println(triangle.getColor());
    }
}
