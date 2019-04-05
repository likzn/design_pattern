package com.likzn.design.pattern.behavioral.stragety;

import lombok.AllArgsConstructor;

/**
 * @auther: Li jx
 * @date: 2019/4/2 19:41
 * @description:
 */
@AllArgsConstructor
public class PromotionStrategy {
    private IStrategy stragety;

    public void excute() {
        stragety.execute();
    }
}
