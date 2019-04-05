package com.likzn.design.pattern.behavioral.templatemethod;

/**
 * @auther: Li jx
 * @date: 2019/4/1 21:07
 * @description:
 */
public abstract class ACourse {
    void makeCourse() {
        this.makePPT();
        this.makeVideo();
        if (this.needWriteArticle()) {
            this.makeArticle();
        }
        this.packageCourse();

    }

    final void makePPT() {
        System.out.println("制作PPT");
    }

    final void makeVideo() {
        System.out.println("制作Video");
    }

    final void makeArticle() {
        System.out.println("制作手记");
    }

    boolean needWriteArticle() {
        return false;
    }

    abstract void packageCourse();
}
