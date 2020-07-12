package com.cheney.dagger2_demo.android.ui.detail.fragment;

import javax.inject.Inject;

/**
 * Created by Cheney on 02/06/2020.
 */

public class DetailFragmentPresenter {

    DetailFragmentView detailFragmentView;

    @Inject
    public DetailFragmentPresenter(DetailFragmentView detailFragmentView) {
        this.detailFragmentView = detailFragmentView;
        detailFragmentView.onDetailFragmentLoaded();
    }
}
