package com.xjl.fastopen;

import android.app.Application;

import shortbread.Shortbread;

/**
 * Created by XJL on 2017/7/21.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Shortbread.create(this);
    }
}
