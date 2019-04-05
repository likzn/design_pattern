package com.likzn.design.pattern.behavioral.stragety;

/**
 * @auther: Li jx
 * @date: 2019/4/2 19:42
 * @description:
 */
public class Main {
    public static void main(String[] args) {
//        PromotionStrategy promotionStragety = new PromotionStrategy(new DazheStrategy());
//        promotionStragety.excute();
//
//        PromotionStrategy promotionStragety1 = new PromotionStrategy(new LijianStrategy());
//        promotionStragety1.excute();
        String string = "DAZHE";
        PromotionStrategy promotion = new PromotionStrategy(StrategyFactory.getStrategy(string));
        promotion.excute();
    }
}
