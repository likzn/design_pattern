package com.likzn.design_pattern.structural.flyweight;

import lombok.Setter;

/**
 * @auther: Li jx
 * @date: 2019/3/28 20:05
 * @description:
 */
@Setter
public class Manager implements Employer {

    private String department;
    private String reportContent;

    @Override
    public void report() {
        System.out.println(reportContent);
    }

    public Manager(String department) {
        this.department = department;
    }
}
