package com.example.testdragger2.fatherAndSon;

import dagger.Module;
import dagger.Provides;

@Module
public class BikeModule {

    @Provides
    @SonScope
    Bike provideBike(){
        return new Bike();
    }
}
