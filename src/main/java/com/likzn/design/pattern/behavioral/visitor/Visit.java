package com.likzn.design.pattern.behavioral.visitor;

/**
 * @auther: Li jx
 * @date: 2019/4/6 14:26
 * @description:
 */
public class Visit implements IVisitor {
    @Override
    public void visit(FreeCourse freeCourse) {
        System.out.println("免费课程："+freeCourse.getName());
    }

    @Override
    public void visit(CodingCourse codingCourse) {
        System.out.println("实战课程：" + codingCourse.getName() + "价格" + codingCourse.getPrice());
    }
}
