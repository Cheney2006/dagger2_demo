package com.cheney.dagger2_demo.android.ui.main;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.cheney.dagger2_demo.R;
import com.cheney.dagger2_demo.android.Constants;
import com.cheney.dagger2_demo.android.ui.detail.DetailActivity;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends DaggerAppCompatActivity implements MainView {

    @Inject
    MainPresenter mainPresenter;

    @Inject
    @Named(Constants.NamedKey.PACKAGE_NAME)
    String packageName;

    @Inject
    String versionName;

    @Inject
    long versionCode;

    @Inject
    boolean logged;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainPresenter.loadMain();
        Log.v("TEST", "packageName=" + packageName);
        Log.v("TEST", "versionName="+versionName+",versionCode="+versionCode);
        Log.v("TEST", "logged="+logged);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DetailActivity.class));
            }
        });
    }

    @Override
    public void onMainLoaded() {
        Log.v("TEST", "Main page is loaded.");
    }
}
