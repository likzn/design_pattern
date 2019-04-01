package com.likzn.design.pattern.structural.facade;

/**
 * @auther: Li jx
 * @date: 2019/3/24 18:33
 * @description:
 */
public class ShippingService {
    public String shippingGift() {
        System.out.println("商品进入物流");
        String giftNo = "666";
        return giftNo;
    }
}
