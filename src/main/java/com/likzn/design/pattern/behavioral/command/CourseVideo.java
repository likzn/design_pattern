package com.likzn.design.pattern.behavioral.command;

import lombok.AllArgsConstructor;

/**
 * @auther: Li jx
 * @date: 2019/4/5 15:33
 * @description:
 */
@AllArgsConstructor
public class CourseVideo {
    private String courseVideoName;

    public void open() {
        System.out.println(courseVideoName + "打开");
    }

    public void close() {
        System.out.println(courseVideoName + "关闭");
    }
}
