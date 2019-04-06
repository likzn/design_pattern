package com.likzn.design.pattern.behavioral.command;

/**
 * @auther: Li jx
 * @date: 2019/4/5 15:35
 * @description:
 */
public class CloseVideoCommand implements Command {
    private CourseVideo courseVideo;

    public CloseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.close();
    }
}
