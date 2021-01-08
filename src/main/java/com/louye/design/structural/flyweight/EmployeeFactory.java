package com.louye.design.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: louye
 * @Date: 2021/1/7 11:13
 * @Description:
 */
public class EmployeeFactory {
    private static final Map<String, Employee> EMPLOYEE_MAP = new HashMap<String, Employee>();
    public static Employee getManager(String department) {
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);
        if (manager == null) {
            manager = new Manager(department);
            System.out.println("创建部门经理:" + department);
            String reportContent = "部门名称:" + department + ", 部门汇报...";
            manager.setReportContent(reportContent);
            System.out.println("报告内容: " + reportContent);
            EMPLOYEE_MAP.put(department, manager);
        }
        return manager;
    }
}
