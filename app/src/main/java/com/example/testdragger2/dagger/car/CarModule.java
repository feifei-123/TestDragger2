package com.example.testdragger2.dagger.car;

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
