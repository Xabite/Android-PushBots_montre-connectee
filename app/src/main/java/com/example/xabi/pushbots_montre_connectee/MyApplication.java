package com.example.xabi.pushbots_montre_connectee;

import android.app.Application;

import com.pushbots.push.Pushbots;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Initialize Pushbots Library
        Pushbots.sharedInstance().init(this);
    }
}
