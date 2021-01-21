package com.louye.design.behavior.templatemethod;

/**
 * @Auther: louye
 * @Date: 2021/1/21 17:10
 * @Description: 前端课程
 */
public class FECourse extends ACourse {
    private boolean needWriteArticleFlag = false;

    void packageCourse() {
        System.out.println("提供课程源代码");
        System.out.println("提供多媒体素材");
    }

    public FECourse() {
    }

    public FECourse(boolean needWriteArticleFlag) {
        this.needWriteArticleFlag = needWriteArticleFlag;
    }

    @Override
    protected boolean needWriteArticle() {
        return this.needWriteArticleFlag;
    }

    public boolean isNeedWriteArticleFlag() {
        return needWriteArticleFlag;
    }

    public void setNeedWriteArticleFlag(boolean needWriteArticleFlag) {
        this.needWriteArticleFlag = needWriteArticleFlag;
    }
}
