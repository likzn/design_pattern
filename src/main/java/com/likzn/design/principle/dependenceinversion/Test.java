package com.likzn.design.principle.dependenceinversion;

/**
 * @auther: Li jx
 * @date: 2019/3/17 12:49
 * @description:
 */
public class Test {

    public static void main(String[] args) {
        //v1
//        People people = new People();
//        people.studyCCourse();
//        people.studyJavaCourse();
        //v2
//        People people = new People();
//        people.studyCourse(new JavaCourse());
//        people.studyCourse(new CCourse());
        //v3
        People people = new People();
        people.setICourse(new JavaCourse());
        people.studyCourse();
        people.setICourse(new CCourse());
        people.studyCourse();
        people.setICourse(new PythonCourse());
        people.studyCourse();
    }
}
