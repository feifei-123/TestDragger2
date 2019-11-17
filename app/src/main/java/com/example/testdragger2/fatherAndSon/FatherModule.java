package com.example.testdragger2.fatherAndSon;


import com.example.testdragger2.car.Car;

import dagger.Module;
import dagger.Provides;

@Module(subcomponents = SonComponent.class)
public class FatherModule {
    @Provides
    @FatherScope
    static Car provideCar(){
        return new Car();
    }
}
