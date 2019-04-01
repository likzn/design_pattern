package com.likzn.design.pattern.creational.builder;

/**
 * @auther: Li jx
 * @date: 2019/3/19 14:26
 * @description:
 */
public class CourseBuilder implements ICourseBuilder {

    Course course = new Course();
    @Override
    public void buildCourseName(String courseName) {
        this.course.setCourseName(courseName);
    }

    @Override
    public void buildCoursePPT(String coursePPT) {
        this.course.setCoursePPT(coursePPT);
    }

    @Override
    public void buildCourseVideo(String courseVideo) {
        this.course.setCourseVideo(courseVideo);
    }

    @Override
    public void buildCourseQA(String courseQA) {
        this.course.setCourseQA(courseQA);
    }

    public Course makeCourse() {
        return this.course;
    }
}
