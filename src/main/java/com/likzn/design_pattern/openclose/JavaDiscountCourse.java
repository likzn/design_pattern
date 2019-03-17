package com.likzn.design_pattern.openclose;

/**
 * @auther: Li jx
 * @date: 2019/3/16 21:29
 * @description:
 */
public class JavaDiscountCourse extends JavaCourse {
    public JavaDiscountCourse(Integer id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public Double getPrice() {
        return super.getPrice()*0.8;
    }
    public Double getOriginPrice() {
        return super.getPrice();
    }
}
