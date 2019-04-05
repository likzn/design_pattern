package com.likzn.design.pattern.behavioral.observer.guavatest;

import com.google.common.eventbus.EventBus;
import lombok.Getter;

/**
 * @auther: Li jx
 * @date: 2019/4/5 13:17
 * @description:
 */
@Getter
public class Course extends EventBus {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }


}
