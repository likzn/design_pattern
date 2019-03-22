package com.likzn.design_pattern.creational.builder;

/**
 * className ICourseBuilder
 * description ICourseBuilder
 *
 * @author Li jx
 * @version 1.0
 * @date 2019/3/19 14:24
 */
public interface ICourseBuilder {

    void buildCourseName(String courseName);
    void buildCoursePPT(String coursePPT);
    void buildCourseVideo(String courseVideo);
    void buildCourseQA(String courseQA);

}
