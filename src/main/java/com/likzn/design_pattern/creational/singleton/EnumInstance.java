package com.likzn.design_pattern.creational.singleton;

/**
 * @auther: Li jx
 * @date: 2019/3/23 16:49
 * @description:
 */
public enum EnumInstance {
    INSTANCE{
        @Override
        public void print() {
            System.out.println("hello");

        }
    },
    ;
    Object date;

    abstract void print();

    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }

    public static EnumInstance getInstance() {
        return INSTANCE;
    }
}
