package com.likzn.design.pattern.principle.dependenceinversion;

/**
 * @auther: Li jx
 * @date: 2019/3/17 12:51
 * @description:
 */
public class CCourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("学习C");
    }
}
