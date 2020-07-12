package com.cheney.dagger2_demo.android.ui.main;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

import com.cheney.dagger2_demo.android.data.ApiService;

/**
 * Created by Cheney on 25/05/2020.
 */
@Module
public abstract class MainActivityModule {

    @Provides
    static MainPresenter provideMainPresenter(MainView mainView, ApiService apiService) {
        return new MainPresenterImpl(mainView, apiService);
    }

    @Binds
    abstract MainView provideMainView(MainActivity mainActivity);

    @Provides
    static boolean provideLogged(){
        return true;
    }
}
