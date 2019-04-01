package com.likzn.design.pattern.principle.interfacegregation;

/**
 * className IAnimalAction
 * description IAnimalAction
 *
 * @author Li jx
 * @version 1.0
 * @date 2019/3/17 15:26
 */
public interface IAnimalAction {
    void fly();
    void swim();
    void eat();
    //粒度过大，根据接口隔离原则应拆分
}
