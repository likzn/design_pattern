package com.likzn.design.pattern.behavioral.command;

/**
 * @auther: Li jx
 * @date: 2019/4/5 15:38
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        CourseVideo courseVideo = new CourseVideo("java");

        OpenVideoCommand openVideoCommand = new OpenVideoCommand(courseVideo);
        CloseVideoCommand closeVideoCommand = new CloseVideoCommand(courseVideo);
        Staff staff = new Staff();

        staff.addCommand(openVideoCommand);
        staff.executeCommand();
        staff.addCommand(closeVideoCommand);
        staff.executeCommand();


    }
}
