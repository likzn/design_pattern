package com.likzn.design_pattern.openclose;

import lombok.extern.slf4j.Slf4j;

/**
 * @auther: Li jx
 * @date: 2019/3/16 21:26
 * @description:
 */
@Slf4j
public class Test {
    public static void main(String[] args) {
        ICourse course = new JavaDiscountCourse(1, "设计模式之禅", 199d);
        JavaDiscountCourse javaCourse = (JavaDiscountCourse) course;
        log.info("Id:{},Name:{},原价:{}，现价：{}",javaCourse.getId(),javaCourse.getName(),javaCourse.getOriginPrice(),javaCourse.getPrice());
    }
}
