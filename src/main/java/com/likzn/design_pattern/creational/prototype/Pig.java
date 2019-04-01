package com.likzn.design_pattern.creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

/**
 * @auther: Li jx
 * @date: 2019/3/24 15:16
 * @description:
 */
@Getter
@Setter
@AllArgsConstructor
public class Pig implements Cloneable{
    private String name;
    private Date birthday;
    private List<Date> list;

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", list=" + list +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Pig pig = (Pig) super.clone();
        pig.birthday = (Date) pig.birthday.clone();
        return pig;
    }
}
