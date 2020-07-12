package com.cheney.dagger2_demo.java_demo;


import com.cheney.dagger2_demo.java_demo.bean.Car;

import dagger.Component;

/**
 * Component就是一个中间人，里面存着依赖提供者和依赖需求者,只能用于接口或者抽象类
 */
@CarScope
@Component(modules = CarModule.class)
public interface CarComponent {
    /**
     * 表示的是需要在CarModule类中去寻找依赖，void inject(Car car);这个方法是抽象的，表示需要将这些依赖应用到Car类。说白了就是Car类需要CarModule来提供依赖。
     * @param car
     */
    void inject(Car car);
}
