package com.likzn.design_pattern.principle.singleresponsibility;

/**
 * @auther: Li jx
 * @date: 2019/3/17 13:34
 * @description:
 */
public interface ICourse {
    //应拆分成两个单一职责的接口
    String getCourseName();
    String getCoursePrice();

    void refund();
    byte[] subscribe();
}
