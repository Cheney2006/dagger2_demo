package com.cheney.dagger2_demo.android.di;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

import com.cheney.dagger2_demo.android.Constants;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class SystemModule {
    //构造方式传入
    private final Application application;

    public SystemModule(Application application) {
        this.application = application;
    }

//    @Provides
//    Context provideContext(Application application) {
//        return application;
//    }

    @Singleton
    @Provides
//    @Named(Constants.NamedKey.VERSION_NAME)
    String provideVersionName(Context context) {
        try {
            PackageManager manager = context.getPackageManager();
            PackageInfo info = manager.getPackageInfo(context.getPackageName(), 0);
            String version = info.versionName;
            return version;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "1.0";
    }

    @Singleton
    @Provides
//    @Named(Constants.NamedKey.VERSION_CODE)
    long provideVersionCode(Context context) {
        try {
            PackageManager manager = context.getPackageManager();
            PackageInfo info = manager.getPackageInfo(context.getPackageName(), 0);
            long version = info.versionCode;
            return version;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 1;
    }
}
