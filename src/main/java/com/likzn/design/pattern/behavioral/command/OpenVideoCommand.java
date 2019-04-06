package com.likzn.design.pattern.behavioral.command;

/**
 * @auther: Li jx
 * @date: 2019/4/5 15:35
 * @description:
 */
public class OpenVideoCommand implements Command {
    private CourseVideo courseVideo;

    public OpenVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.open();
    }
}
