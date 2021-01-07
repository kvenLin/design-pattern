package com.louye.design.test;

import com.github.houbb.markdown.toc.core.impl.AtxMarkdownToc;

/**
 * @Auther: louye
 * @Date: 2021/1/7 10:41
 * @Description:
 */
public class TocMain {
    public static void main(String[] args) {
        AtxMarkdownToc.newInstance().genTocFile("README.md");
    }
}
