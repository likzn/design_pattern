package com.likzn.design.pattern.creational.prototype;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @auther: Li jx
 * @date: 2019/3/24 15:19
 * @description:
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date(0L);
        List list = new ArrayList();
        list.add(new Date(0L));
        list.add(new Date(123123L));
        Pig pig = new Pig("gal", date, list);
        Pig pig1 = (Pig) pig.clone();
        System.out.println(pig);
        System.out.println(pig1);
        pig.getBirthday().setTime(123123L);
        pig.setName("qwe");
        pig.getList().add(new Date(123123123121L));
        System.out.println(pig);
        System.out.println(pig1);
    }
}
