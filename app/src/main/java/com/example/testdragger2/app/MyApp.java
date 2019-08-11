package com.example.testdragger2.app;

import android.app.Application;



public class MyApp extends Application {
    private static AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.create();
    }

    public static AppComponent getAppComponent(){
        return appComponent;
    }
}
