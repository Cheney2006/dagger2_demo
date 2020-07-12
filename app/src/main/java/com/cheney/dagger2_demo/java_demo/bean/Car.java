package com.cheney.dagger2_demo.java_demo.bean;

import com.cheney.dagger2_demo.java_demo.BrandA;
import com.cheney.dagger2_demo.java_demo.BrandB;
import com.cheney.dagger2_demo.java_demo.CarModule;
import com.cheney.dagger2_demo.java_demo.DaggerCarComponent;

import javax.inject.Inject;

/**
 * Dagger优势：
 * 1、如果我修改Engine类的构造器，那么对于第一种做法应该同时修改Car构造器的；如果还有N个地方依赖了我的Engine构造器怎么办？只能一个一个的去修改，这就增加了代码修改难度；而使用Dagger2呢？你的@Inject依赖还是不会变 ，只要修改一下Module类即可
 * 2、更加解耦
 */
public class Car {

    /**
     * @Inject只能作用于一个构造器
     */
    @Inject
    Frame frame;

    @BrandA
    @Inject
    public Engine engine;

    @BrandB
    @Inject
    public Engine engineB;

    @Inject
    Seat seat;

    @Inject
    Wheel wheel;

    @Inject
    Wheel wheelB;

//    @LeatherColor(color = "black")
//    @Inject
//    Leather leather;

    //    private Engine engine;
//    private Seat seat;
//    private Wheel wheel;
    public Car() {
//        engine = new Engine();
//        seat = new Seat();
//        wheel = new Wheel();
        DaggerCarComponent.builder().carModule(new CarModule()).build().inject(this);
        System.out.println( "new Car()");

    }
}
