package com.likzn.design_pattern.structural.composite;

/**
 * @auther: Li jx
 * @date: 2019/3/29 15:22
 * @description:
 */
public abstract class Component {
    public void add(Component component) {
        throw new UnsupportedOperationException("不可以添加");
    }
    public void remove(Component component) {
        throw new UnsupportedOperationException("不可以减少");
    }
    public String getName() {
        throw new UnsupportedOperationException("不可以得到名字");
    }
    public int getCost() {
        throw new UnsupportedOperationException("不可以得到价格");
    }
    public void print() {
        throw new UnsupportedOperationException("不可以打印");
    }
}
