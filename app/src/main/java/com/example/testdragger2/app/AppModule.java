package com.example.testdragger2.app;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    @Provides
    AppApi providerAppApi(){
        return new AppApi();
    }
}
