package com.cheney.dagger2_demo.android.ui.detail;

import com.cheney.dagger2_demo.android.data.ApiService;

import javax.inject.Inject;


/**
 * Created by Cheney on 30/05/2020.
 */

public class DetailPresenterImpl implements DetailPresenter{

    DetailView detailView;
    ApiService apiService;

    @Inject
    public DetailPresenterImpl(DetailView detailView, ApiService apiService) {
        this.detailView = detailView;
        this.apiService = apiService;
    }

    public void loadDetail(){
        apiService.loadData();
        detailView.onDetailLoaded();
    }
}
