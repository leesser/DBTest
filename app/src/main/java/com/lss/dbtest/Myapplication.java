package com.lss.dbtest;

import android.app.Application;

import com.facebook.stetho.Stetho;

/**
 * Created by shuai on 16-7-14.
 */
public class Myapplication extends Application {
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }
}
