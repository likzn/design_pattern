package com.likzn.design.pattern.behavioral.iterator;

/**
 * @auther: Li jx
 * @date: 2019/4/2 14:09
 * @description:
 */

public interface ICourseList {

    void addCourse(Course course);

    void removeCourse(Course course);

    ICourseIterator getIterator(ICourseList courseList);
}
