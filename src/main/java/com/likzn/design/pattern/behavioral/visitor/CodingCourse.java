package com.likzn.design.pattern.behavioral.visitor;

import lombok.Getter;
import lombok.Setter;

/**
 * @auther: Li jx
 * @date: 2019/4/6 14:25
 * @description:
 */
@Getter
@Setter
public class CodingCourse extends ICourse {
    private int price;

    @Override
    public void accept(IVisitor iVisitor) {
        iVisitor.visit(this);

    }
}
