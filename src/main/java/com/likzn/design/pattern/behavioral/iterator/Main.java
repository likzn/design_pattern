package com.likzn.design.pattern.behavioral.iterator;

/**
 * @auther: Li jx
 * @date: 2019/4/2 14:20
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        Course course = new Course("数学");
        Course course1 = new Course("英语");
        Course course2 = new Course("语文");
        Course course3 = new Course("体育");
        Course course4 = new Course("化学");
        Course course5 = new Course("物理");

        CourseList courseList = new CourseList();
        courseList.addCourse(course);
        courseList.addCourse(course1);
        courseList.addCourse(course2);
        courseList.addCourse(course3);
        courseList.addCourse(course4);
        courseList.addCourse(course5);

        System.out.println("-----------");
        printCourse(courseList);
        System.out.println("-----------");

        courseList.removeCourse(course);
        courseList.removeCourse(course3);

        System.out.println("-----------");
        printCourse(courseList);
        System.out.println("-----------");


    }

    public static void printCourse(CourseList courseList) {
        ICourseIterator courseIterator = courseList.getIterator(courseList);
        while (courseIterator.hasNext()) {
            Course course = courseIterator.nextCourse();
            System.out.println(course.getName());
        }
    }
}
