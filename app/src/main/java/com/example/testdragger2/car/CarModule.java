package com.example.testdragger2.car;

import com.example.testdragger2.ActivityScoped;

import dagger.Module;
import dagger.Provides;

@Module
public class CarModule {

    @Provides
    @ManScope
    static Car provideCar(){
        return new Car();
    }
}
