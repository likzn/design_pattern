package com.likzn.design.pattern.structural.facade;

/**
 * @auther: Li jx
 * @date: 2019/3/24 18:35
 * @description:
 */
public class ExchangeGift {
    private CheckService checkService = new CheckService();
    private PayService payService = new PayService();
    private ShippingService shippingService = new ShippingService();
    public void exchange(Gift gift) {
        if (checkService.isAvailiable(gift)) {
            if (payService.pay(gift)) {
                System.out.println("物流号是"+shippingService.shippingGift());
            }
        }
    }
}
