package com.example.testdragger2.app;

import dagger.Component;

@Component(modules = AppModule.class)
public interface AppComponent {
    AppApi providerAppApi();
}
