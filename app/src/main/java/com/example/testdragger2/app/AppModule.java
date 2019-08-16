package com.example.testdragger2.app;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    //提供AppService的Provider
    @Singleton
    @Provides
    AppService providerAppService(){
        return new AppService();
    }

    //提供DbService的provider
    @Singleton
    @Provides
    DbService providerDbService(Application application){
        return new DbService(application);
    }
}
