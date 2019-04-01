package com.likzn.design.pattern.structural.decorator;

/**
 * @auther: Li jx
 * @date: 2019/3/25 17:12
 * @description:
 */
public class CakeWithEgg extends ADecoratorCake {
    public CakeWithEgg(ACake aCake) {
        super(aCake);
    }

    @Override
    public String getName() {
        return super.getName()+" 加一个蛋";
    }

    @Override
    public Integer cost() {
        return super.cost()+3;
    }
}
