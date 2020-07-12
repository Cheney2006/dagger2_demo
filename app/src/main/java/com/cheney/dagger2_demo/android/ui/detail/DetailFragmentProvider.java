package com.cheney.dagger2_demo.android.ui.detail;

import com.cheney.dagger2_demo.android.ui.detail.fragment.DetailFragment;
import com.cheney.dagger2_demo.android.ui.detail.fragment.DetailFragmentModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by Cheney on 02/06/2020.
 */
@Module
public abstract class DetailFragmentProvider {

    @ContributesAndroidInjector(modules = DetailFragmentModule.class)
    abstract DetailFragment provideDetailFragmentFactory();
}
