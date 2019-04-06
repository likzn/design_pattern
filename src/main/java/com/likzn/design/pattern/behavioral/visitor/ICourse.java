package com.likzn.design.pattern.behavioral.visitor;

import lombok.Getter;
import lombok.Setter;

/**
 * @auther: Li jx
 * @date: 2019/4/6 14:23
 * @description:
 */
@Getter
@Setter
public abstract class ICourse {

    private String name;

    public abstract void accept(IVisitor iVisitor);
}
