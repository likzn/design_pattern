package com.likzn.design.pattern.creational.builder;

/**
 * @auther: Li jx
 * @date: 2019/3/19 14:29
 * @description:
 */
public class Coach {
    private CourseBuilder courseBuilder = new CourseBuilder();

    public Course makeCourse(String courseName, String coursePPT, String courseVideo, String courseQA) {
        this.courseBuilder.buildCourseName(courseName);
        this.courseBuilder.buildCoursePPT(coursePPT);
        this.courseBuilder.buildCourseVideo(courseVideo);
        this.courseBuilder.buildCourseQA(courseQA);
        return this.courseBuilder.makeCourse();
    }


}
