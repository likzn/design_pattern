package com.likzn.design.pattern.behavioral.visitor;

import lombok.Getter;

/**
 * @auther: Li jx
 * @date: 2019/4/6 14:25
 * @description:
 */
@Getter
public class FreeCourse extends ICourse {

    @Override
    public void accept(IVisitor iVisitor) {
        iVisitor.visit(this);
    }
}
