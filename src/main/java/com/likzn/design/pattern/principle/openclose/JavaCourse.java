package com.likzn.design.pattern.principle.openclose;

/**
 * @auther: Li jx
 * @date: 2019/3/16 21:24
 * @description:
 */
public class JavaCourse implements ICourse {
    private Integer id;
    private String name;
    private double price;

    @Override
    public String toString() {
        return "JavaCourse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }

    public JavaCourse(Integer id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
