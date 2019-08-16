package com.example.testdragger2.police;

import com.example.testdragger2.car.Car;

import dagger.Module;
import dagger.Provides;

@Module
public class UniFormModule {
    @Provides
    Uniform provideUniform(){
        return new Uniform();
    }
}
