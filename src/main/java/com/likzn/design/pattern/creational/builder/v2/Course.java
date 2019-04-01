package com.likzn.design.pattern.creational.builder.v2;

import lombok.ToString;

/**
 * @auther: Li jx
 * @date: 2019/3/19 14:41
 * @description:
 */
@ToString
public class Course {
    private String courseName;
    private String coursePPT;
    private String courseVideo;
    private String courseQA;

    public Course(CourseBuilder courseBuilder) {
        this.courseName = courseBuilder.courseName;
        this.coursePPT = courseBuilder.coursePPT;
        this.courseVideo = courseBuilder.courseVideo;
        this.courseQA = courseBuilder.courseQA;
    }

    public static class CourseBuilder {
        private String courseName;
        private String coursePPT;
        private String courseVideo;
        private String courseQA;

        public CourseBuilder buildCourseName(String courseName) {
            this.courseName = courseName;
            return this;
        }

        public CourseBuilder buildCoursePPT(String coursePPT) {
            this.coursePPT = coursePPT;
            return this;
        }

        public CourseBuilder buildCourseVideo(String courseVideo) {
            this.courseVideo = courseVideo;
            return this;
        }

        public CourseBuilder buildCourseQA(String courseQA) {
            this.courseQA = courseQA;
            return this;
        }

        public Course build() {
            return new Course(this);
        }

    }
}
