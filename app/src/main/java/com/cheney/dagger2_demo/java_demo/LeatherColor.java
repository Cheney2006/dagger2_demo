package com.cheney.dagger2_demo.java_demo;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * 自定义注解 @Qualifier来修饰注解
 */
@Qualifier
@Documented
@Retention(value = RetentionPolicy.RUNTIME)
public @interface LeatherColor {

    String color() default "white";

}
