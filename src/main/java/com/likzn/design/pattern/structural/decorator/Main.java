package com.likzn.design.pattern.structural.decorator;

/**
 * @auther: Li jx
 * @date: 2019/3/25 17:13
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        ACake aCake;
        aCake = new Cake();
        aCake = new CakeWithEgg(aCake);
        aCake = new CakeWithEgg(aCake);
        aCake = new CakeWithStarbarry(aCake);
        System.out.println(aCake.getName() + "  " + aCake.cost());
    }
}
