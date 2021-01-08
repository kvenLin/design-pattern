package com.louye.design.structural.composite;

/**
 * @Auther: louye
 * @Date: 2021/1/8 10:09
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        CatalogComponent linuxCourse = new Course("linux", 11);
        CatalogComponent windowsCourse = new Course("windows", 6);

        CatalogComponent javaCourseCatalog = new CourseCatalog("java catalog", 2);
        CatalogComponent mallCourse1 = new Course("Java mall course1", 55);
        CatalogComponent mallCourse2 = new Course("Java mall course2", 22);
        CatalogComponent mallCourse3 = new Course("Java mall course3", 89);
        CatalogComponent designPattern = new Course("Java designPattern course", 321);

        javaCourseCatalog.add(mallCourse1);
        javaCourseCatalog.add(mallCourse2);
        javaCourseCatalog.add(mallCourse3);
        javaCourseCatalog.add(designPattern);

        CatalogComponent imoocCourseCatalog = new CourseCatalog("imooc course catalog", 1);
        imoocCourseCatalog.add(linuxCourse);
        imoocCourseCatalog.add(windowsCourse);
        imoocCourseCatalog.add(javaCourseCatalog);

        imoocCourseCatalog.print();

    }
}
