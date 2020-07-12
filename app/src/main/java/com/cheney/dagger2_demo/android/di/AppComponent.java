package com.cheney.dagger2_demo.android.di;

import android.app.AppComponentFactory;
import android.app.Application;

import com.cheney.dagger2_demo.android.AndroidSampleApp;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.support.AndroidSupportInjection;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by Cheney on 25/05/2020.
 */
@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,
        AppModule.class, SystemModule.class,
        ActivityBuilder.class})
public interface AppComponent extends AndroidInjector<DaggerApplication> {


//    void inject(AndroidSampleApp app);

//    @Component.Builder
//    interface Builder {
//        @BindsInstance
//        Builder application(Application application);
//        AppComponent build();
//    }

//    @Component.Builder
//    abstract class Builder extends AndroidInjector.Builder<AndroidSampleApp> {}

    // 通过@Component.Factory注解定义
    @Component.Factory
    interface Factory {
        // 工厂接口中只能含有一个方法
        AppComponent create(SystemModule sm, @BindsInstance Application application);
    }


}
