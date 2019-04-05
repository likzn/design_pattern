package com.likzn.design.pattern.behavioral.templatemethod;

/**
 * @auther: Li jx
 * @date: 2019/4/1 21:09
 * @description:
 */
public class JavaDesignCourse extends ACourse {
    @Override
    void packageCourse() {
        System.out.println("提供源码");
    }

    @Override
    boolean needWriteArticle() {
        return true;
    }
}
