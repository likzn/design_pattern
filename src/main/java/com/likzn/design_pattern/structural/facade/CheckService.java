package com.likzn.design_pattern.structural.facade;

/**
 * @auther: Li jx
 * @date: 2019/3/24 18:30
 * @description:
 */
public class CheckService {

    public boolean isAvailiable(Gift gift) {
        System.out.println("校验通过，库存通过");
        return true;
    }
}
