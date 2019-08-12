package com.example.testdragger2.app;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Reusable;

@Component(modules = AppModule.class)
public interface AppComponent {
    AppApi providerAppApi();
}
