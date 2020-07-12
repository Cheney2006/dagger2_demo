package com.cheney.dagger2_demo.java_demo;

import android.content.Context;

import androidx.recyclerview.widget.LinearLayoutManager;


import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * @Qualifier和@Named注解 使用
 */
@Module
public class LayoutManagerModule {

    private static final String VERTICAL = "vertical";
    private static final String HORIZONTAL = "horizontal";

    @Named(VERTICAL)
//    @Vertical
    @Provides
    public LinearLayoutManager provideLinearLayoutManager(Context context) {
        return new LinearLayoutManager(context);
    }

    /**
     * 直接写在项目中是会报错，需要使用@Qualifier或@Named注解
     * @Named的时候需要加上我们定义的key所以略显麻烦，可以通过自定义@Qualifier注解来解决这个问题
     * @param context
     * @return
     */
    @Named(HORIZONTAL)
//    @Horizontal
    @Provides
    public LinearLayoutManager provideHorizontalLinearLayoutManager(Context context) {
        return new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL,false);
    }
}
