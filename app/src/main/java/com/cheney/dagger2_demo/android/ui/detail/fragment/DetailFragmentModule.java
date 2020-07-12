package com.cheney.dagger2_demo.android.ui.detail.fragment;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Cheney on 02/06/2020.
 */
@Module
public class DetailFragmentModule {

    @Provides
    DetailFragmentView provideDetailFragmentView(DetailFragment detailFragment){
        return detailFragment;
    }

}
