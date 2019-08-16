package com.example.testdragger2.car;

import com.example.testdragger2.ActivityScoped;

import dagger.Component;

@ManScope
@Component(modules = CarModule.class)
public interface ManComponent {
    void injectMain(Man man);
    Car car();

}
