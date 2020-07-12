package com.cheney.dagger2_demo.android.ui.main;


import com.cheney.dagger2_demo.android.data.ApiService;

import javax.inject.Inject;


/**
 * Created by Cheney on 25/05/2020.
 */

public class MainPresenterImpl implements MainPresenter{
    MainView mainView;
    ApiService apiService;

    @Inject
    public MainPresenterImpl(MainView mainView, ApiService apiService) {
        this.mainView = mainView;
        this.apiService = apiService;
    }

    public void loadMain(){
        apiService.loadData();
        mainView.onMainLoaded();
    }
}
