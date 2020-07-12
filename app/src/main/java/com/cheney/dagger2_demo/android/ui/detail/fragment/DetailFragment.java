package com.cheney.dagger2_demo.android.ui.detail.fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.Nullable;

import javax.inject.Inject;

import dagger.android.support.DaggerFragment;

/**
 * Created by Cheney on 02/06/2020.
 */

public class DetailFragment extends DaggerFragment implements DetailFragmentView {

    @Inject
    DetailFragmentPresenter detailFragmentPresenter;

    public static DetailFragment newInstance() {
        Bundle args = new Bundle();
        DetailFragment fragment = new DetailFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetailFragmentLoaded() {
        Log.v("TEST", "OnDetailFragmentLoaded.");
    }
}
