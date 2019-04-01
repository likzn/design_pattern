package com.likzn.design.pattern.structural.facade;

/**
 * @auther: Li jx
 * @date: 2019/3/24 18:36
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        ExchangeGift exchangeGift = new ExchangeGift();
        exchangeGift.exchange(new Gift("恰比"));

    }
}
