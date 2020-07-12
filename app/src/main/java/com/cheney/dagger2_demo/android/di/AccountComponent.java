package com.cheney.dagger2_demo.android.di;

import android.app.Application;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;

@Singleton
@Component(modules = ApiModule.class)
public interface AccountComponent {

    @Component.Factory
    interface Factory {
        // 工厂接口中只能含有一个方法
        AccountComponent create(ApiModule apiModule,  @BindsInstance boolean isDebug);
    }
}
