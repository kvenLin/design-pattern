package com.louye.design.structural.flyweight;

/**
 * @Auther: louye
 * @Date: 2021/1/7 11:10
 * @Description:
 */
public class Manager implements Employee {
    private String department;
    private String reportContent;

    public Manager(String department) {
        this.department = department;
    }

    public void report() {
        System.out.println(reportContent);
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }
}
