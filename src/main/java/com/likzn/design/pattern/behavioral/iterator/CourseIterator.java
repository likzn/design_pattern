package com.likzn.design.pattern.behavioral.iterator;

import java.util.List;

/**
 * @auther: Li jx
 * @date: 2019/4/2 14:11
 * @description:
 */
public class CourseIterator implements ICourseIterator {
    private List list;
    private int position = 0;

    public CourseIterator(List list) {
        this.list = list;
    }

    @Override
    public Course nextCourse() {
        System.out.println("位置是："+position);
        Course course = (Course) list.get(position);
        position++;
        return course;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }
}
