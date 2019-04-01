package com.likzn.design.pattern.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: Li jx
 * @date: 2019/3/17 15:49
 * @description:
 */
public class TeamLeader {
    public void checkCourseNums() {
        List list = new ArrayList();
        for (int i = 0; i < 20; i++) {
            list.add(new Course());
        }
        System.out.println("总数为:"+list.size());

    }
}
