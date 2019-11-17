package com.example.testdragger2.fatherAndSon;


import dagger.Subcomponent;

@SonScope
@Subcomponent(modules = BikeModule.class)
public interface SonComponent {
    void inject(Son son);

    @Subcomponent.Builder
    interface Builder{
        SonComponent build();
    }
}
