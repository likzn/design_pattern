package com.likzn.design_pattern.structural.composite;

/**
 * @auther: Li jx
 * @date: 2019/3/29 15:25
 * @description:
 */
public class Course extends Component {
    private String name;
    private int cost;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getCost() {
        return this.cost;
    }

    public Course(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public void print() {
        System.out.println("Course name:"+this.name+" cost:"+this.cost);
    }
}
