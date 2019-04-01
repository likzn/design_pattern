package com.likzn.design_pattern.structural.decorator;

/**
 * @auther: Li jx
 * @date: 2019/3/25 17:08
 * @description:
 */
public class ADecoratorCake extends ACake {
    ACake aCake;

    public ADecoratorCake(ACake aCake) {
        this.aCake = aCake;
    }

    @Override
    public String getName() {
        return this.aCake.getName();
    }

    @Override
    public Integer cost() {
        return this.aCake.cost();
    }

}
