package com.likzn.design_pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: Li jx
 * @date: 2019/3/29 15:24
 * @description:
 */
public class CataLog extends Component {
    List<Component> list = new ArrayList<Component>();
    private String name;
    private int level;

    public CataLog(String name,int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public void remove(Component component) {
        list.remove(component);
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for (Component component : list) {
            for (int i = 0; i < this.level; i++) {
                System.out.print("  ");
            }
            component.print();
        }
    }
}
