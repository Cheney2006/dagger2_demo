package com.cheney.dagger2_demo.java_demo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

@Qualifier
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Vertical {
}
