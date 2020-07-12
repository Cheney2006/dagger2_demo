package com.cheney.dagger2_demo.android.data;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by Cheney on 26/05/2020.
 */

public class ApiService {

    @Inject
    public ApiService() {
    }

    public void loadData(){
        Log.v("TEST", "load data.");
    }
}
