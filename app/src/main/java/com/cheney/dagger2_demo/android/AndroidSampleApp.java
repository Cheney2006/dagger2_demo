package com.cheney.dagger2_demo.android;

import android.app.Application;

import com.cheney.dagger2_demo.android.di.ApiModule;
import com.cheney.dagger2_demo.android.di.AppComponent;
import com.cheney.dagger2_demo.android.di.AppModule;
import com.cheney.dagger2_demo.android.di.DaggerAccountComponent;
import com.cheney.dagger2_demo.android.di.DaggerAppComponent;
import com.cheney.dagger2_demo.android.di.SystemModule;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;


/**
 * Created by Cheney on 25/05/2020.
 */

public class AndroidSampleApp extends DaggerApplication {

    @Override
    public void onCreate() {
        super.onCreate();
//        DaggerAppComponent.builder()
//                .systemModule(new SystemModule(this))
//                .build();
        DaggerAccountComponent.factory().create(new ApiModule("https://www.baidu.com"), true);
    }

    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
//        DaggerAppComponent.builder()
//                .systemModule(new SystemModule(this))
//                .build()
//                .inject(this);
        //builder方式
//        return DaggerAppComponent.builder().create(this);
        //factory方式
//        AppComponent appComponent = DaggerAppComponent.factory().create(this);
//        appComponent.inject(this);
//        return appComponent;
        return DaggerAppComponent.factory().create(new SystemModule(this), this);
    }

}
