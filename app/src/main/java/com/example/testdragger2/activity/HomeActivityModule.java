package com.example.testdragger2.activity;

import android.app.Activity;

import com.example.testdragger2.ActivityScoped;
import com.example.testdragger2.MainActivity;

import dagger.Module;
import dagger.Provides;

@Module
public class HomeActivityModule {
    private MainActivity activity;

    @Provides
    @ActivityScoped
    Activity provideActivity(){
        return activity;
    }

}
