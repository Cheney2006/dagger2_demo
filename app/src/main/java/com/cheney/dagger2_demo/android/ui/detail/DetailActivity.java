package com.cheney.dagger2_demo.android.ui.detail;

import android.os.Bundle;
import android.util.Log;

import com.cheney.dagger2_demo.R;
import com.cheney.dagger2_demo.android.ui.detail.fragment.DetailFragment;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

/**
 * Created by Cheney on 25/05/2020.
 */

public class DetailActivity extends DaggerAppCompatActivity implements DetailView {

    @Inject
    DetailPresenter detailPresenter;

//    这里编译报错，因为在MainActivityModule中取不到
//    @Inject
//    boolean logged;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        detailPresenter.loadDetail();
//        Log.v("TEST", "logged="+logged);
        if (savedInstanceState == null)
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.container, DetailFragment.newInstance())
                    .commitAllowingStateLoss();
    }

    @Override
    public void onDetailLoaded() {
        Log.v("TEST", "Detail is loaded");
    }

}
