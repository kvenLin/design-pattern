package com.louye.design.behavior.command;

/**
 * @Auther: louye
 * @Date: 2021/1/26 18:30
 * @Description:
 */
public class CloseCourseVideoCommand implements Command{
    private CourseVideo courseVideo;

    public CloseCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    public void execute() {
        courseVideo.close();
    }
}
