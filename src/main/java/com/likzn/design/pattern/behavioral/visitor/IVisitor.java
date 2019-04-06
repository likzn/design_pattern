package com.likzn.design.pattern.behavioral.visitor;

/**
 * @auther: Li jx
 * @date: 2019/4/6 14:24
 * @description:
 */
public interface IVisitor {
    void visit(FreeCourse freeCourse);

    void visit(CodingCourse codingCourse);
}
