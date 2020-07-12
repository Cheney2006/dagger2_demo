package com.cheney.dagger2_demo.android.di;

import com.cheney.dagger2_demo.android.ui.detail.DetailActivity;
import com.cheney.dagger2_demo.android.ui.detail.DetailActivityModule;
import com.cheney.dagger2_demo.android.ui.detail.DetailFragmentProvider;
import com.cheney.dagger2_demo.android.ui.main.MainActivity;
import com.cheney.dagger2_demo.android.ui.main.MainActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by Cheney on 25/05/2020.
 */
@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity bindMainActivity();

    @ContributesAndroidInjector(modules = {DetailActivityModule.class, DetailFragmentProvider.class})
    abstract DetailActivity bindDetailActivity();

}
