package com.example.testdragger2.dagger_android.di;

import com.example.testdragger2.dagger_android.app.AppApi;
import com.example.testdragger2.dagger_android.app.TheService;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class AppModule {
    @Binds
    abstract TheService getApiService(AppApi appApi);
}
