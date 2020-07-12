package com.cheney.dagger2_demo.java_demo.bean;

import javax.inject.Inject;

/**
 * 车架
 */
public class Frame {

    /**
     * 用 @Inject 注解标注目标类中依赖类的实例对象
     * 用 @Inject 注解标注依赖类的构造函数
     */
    @Inject
    public Frame() {
        System.out.println("new Frame()");
    }
}
