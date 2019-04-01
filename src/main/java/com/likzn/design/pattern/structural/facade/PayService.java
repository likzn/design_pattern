package com.likzn.design.pattern.structural.facade;

/**
 * @auther: Li jx
 * @date: 2019/3/24 18:33
 * @description:
 */
public class PayService {
    public boolean pay(Gift gift) {
        System.out.println("支付成功");
        return true;
    }
}
