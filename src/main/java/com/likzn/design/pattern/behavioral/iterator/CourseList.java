package com.likzn.design.pattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: Li jx
 * @date: 2019/4/2 14:10
 * @description:
 */
public class CourseList implements ICourseList {
    List list;
    {
        list = new ArrayList();
    }

    @Override
    public void addCourse(Course course) {
        list.add(course);
    }

    @Override
    public void removeCourse(Course course) {
        list.remove(course);
    }

    @Override
    public ICourseIterator getIterator(ICourseList courseList) {
        return new CourseIterator(list);
    }
}
