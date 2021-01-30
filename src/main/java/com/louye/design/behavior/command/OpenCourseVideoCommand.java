package com.louye.design.behavior.command;

/**
 * @Auther: louye
 * @Date: 2021/1/26 18:30
 * @Description:
 */
public class OpenCourseVideoCommand implements Command {
    private CourseVideo courseVideo;

    public OpenCourseVideoCommand(CourseVideo  courseVideo) {
        this.courseVideo = courseVideo;
    }

    public void execute() {
        courseVideo.open();
    }
}
