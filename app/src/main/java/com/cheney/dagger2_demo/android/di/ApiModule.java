package com.cheney.dagger2_demo.android.di;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApiModule {
    private String baseUrl;

    public ApiModule(String baseUrl) {
        System.out.println("baseUrl="+baseUrl);
        this.baseUrl = baseUrl;
    }

}
