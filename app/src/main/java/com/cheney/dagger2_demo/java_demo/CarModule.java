package com.cheney.dagger2_demo.java_demo;

import com.cheney.dagger2_demo.java_demo.bean.Engine;
import com.cheney.dagger2_demo.java_demo.bean.Leather;
import com.cheney.dagger2_demo.java_demo.bean.Seat;
import com.cheney.dagger2_demo.java_demo.bean.Wheel;

import dagger.Module;
import dagger.Provides;

/**
 * 类注解，表示此类的方法是提供依赖的，它告诉dagger在哪可以找到依赖
 *
 * 通过@Inject 的注解实体类的构造函数是必不可少，它标识着 Dagger2 可以实例化该类。那么当你需要实例化一个第三方的对象时，是不是懵逼了，因为你不可能注解第三方类的构造函数 -- 比如说 Gson 类的构造函数。那么现在就需要 @Module 来充分发挥作用了。
 * 其实Module 其实是一个简单工厂模式，Module 里面的方法都是创建相应类实例的方法。
 *
 */
@Module
public class CarModule {

    /**
     * 表示该方法提供依赖；通过这个注解的方法，能给你提供依赖
     * 只在@Module中使用，用于提供构造好的实例。一般与@Singleton搭配，用单例方法的形式对外提供依赖,是一种替代@Inject注解构造方法的方式。
     * 使用了@Providers的方法应使用provide作为前缀，使用了@Module的类应使用Module作为后缀。
     * 如果@Providers方法或@Inject构造方法有参数，要保证它能够被dagger获取到，比如通过其它@Providers方法或者@Inject注解构造器的形式得到。
     *
     * @return
     */
//    @Provides
//    public Engine provideEngine() {
//        return new Engine();
//    }
    @BrandA
    @Provides
    public Engine provideEngineA() {
        return new Engine("大众");
    }

    @BrandB
    @Provides
    public Engine provideEngineB() {
        return new Engine("本田");
    }

    @Provides
    public Leather provideLeather() {
        return new Leather();
    }

    @LeatherColor(color = "black")
    @Provides
    public Leather provideLeatherColor() {
        return new Leather("black");
    }

    @Provides
    public Seat provideSeat(Leather leather) {
//        return new Seat("有车套");
        return new Seat(leather);
    }

    @Provides
    @CarScope
    public Wheel provideWheel() {
        return new Wheel();
    }
}
