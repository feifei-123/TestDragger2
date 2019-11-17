package com.example.testdragger2.dagger.car;

import dagger.Component;

@ManScope
@Component(modules = CarModule.class)
public interface ManComponent {
    void injectMain(Man man);
    Car car();
}
