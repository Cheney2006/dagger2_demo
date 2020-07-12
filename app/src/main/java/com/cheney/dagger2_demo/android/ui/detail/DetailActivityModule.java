package com.cheney.dagger2_demo.android.ui.detail;

import com.cheney.dagger2_demo.android.data.ApiService;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Cheney on 30/05/2020.
 */
@Module
public abstract class DetailActivityModule {

    @Provides
    static DetailPresenter provideDetailPresenter(DetailView detailView, ApiService apiService) {
        return new DetailPresenterImpl(detailView, apiService);
    }

    @Binds
    abstract DetailView provideDetailView(DetailActivity detailActivity);
}
