package com.cheney.dagger2_demo.android.di;

import android.app.Application;
import android.content.Context;

import com.cheney.dagger2_demo.android.AndroidSampleApp;
import com.cheney.dagger2_demo.android.Constants;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.Subcomponent;

/**
 * Created by Cheney on 25/05/2020.
 */
@Module
public abstract class AppModule {



//    @Singleton
//    @Provides
//    static String providePackageName(Application application) {
//        return application.getPackageName();
//    }

    @Binds
    abstract Context provideContext(Application application);

    @Singleton
    @Provides
    @Named(Constants.NamedKey.PACKAGE_NAME)
    static String providePackageName(Context context) {
        return context.getPackageName();
    }

}
