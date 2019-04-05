package com.likzn.design.pattern.behavioral.iterator;

/**
 * @auther: Li jx
 * @date: 2019/4/2 14:06
 * @description:
 */
public interface ICourseIterator {
    Course nextCourse();
    boolean hasNext();
}
