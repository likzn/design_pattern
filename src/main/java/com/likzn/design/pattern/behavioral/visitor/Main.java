package com.likzn.design.pattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: Li jx
 * @date: 2019/4/6 14:29
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        List<ICourse> list = new ArrayList<>();
        FreeCourse freeCourse = new FreeCourse();
        freeCourse.setName("java入门");
        CodingCourse codingCourse = new CodingCourse();
        codingCourse.setName("java设计模式");
        codingCourse.setPrice(299);
        list.add(freeCourse);
        list.add(codingCourse);

        for (ICourse c : list) {
            c.accept(new Visit());
        }
    }
}
