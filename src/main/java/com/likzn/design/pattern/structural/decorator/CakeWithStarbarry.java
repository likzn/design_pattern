package com.likzn.design.pattern.structural.decorator;

/**
 * @auther: Li jx
 * @date: 2019/3/25 17:12
 * @description:
 */
public class CakeWithStarbarry extends ADecoratorCake {
    public CakeWithStarbarry(ACake aCake) {
        super(aCake);
    }

    @Override
    public String getName() {
        return super.getName() +" 加一个草莓";
    }

    @Override
    public Integer cost() {
        return super.cost()+2;
    }
}
