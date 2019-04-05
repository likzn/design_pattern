package com.likzn.design.pattern.behavioral.stragety;

import java.util.HashMap;
import java.util.Map;

/**
 * @auther: Li jx
 * @date: 2019/4/2 19:43
 * @description:
 */
public class StrategyFactory {
    private static Map<String, IStrategy> PROMOTION_MAP = new HashMap<String, IStrategy>();
    private static EmptyStrategy emptyStrategy = new EmptyStrategy();


    private StrategyFactory() {

    }


    static {
        PROMOTION_MAP.put(PromtionKey.MANJIAN, new ManjianStrategy());
        PROMOTION_MAP.put(PromtionKey.DAZHE, new DazheStrategy());
        PROMOTION_MAP.put(PromtionKey.LIJIAN, new LijianStrategy());
    }

    private interface PromtionKey {
        String LIJIAN = "LIJIAN";
        String DAZHE = "DAZHE";
        String MANJIAN = "MANJIAN";
    }

    public static IStrategy getStrategy(String promotionKey) {
        IStrategy strategy = PROMOTION_MAP.get(promotionKey);
        return strategy == null ? emptyStrategy : strategy;
    }
}
