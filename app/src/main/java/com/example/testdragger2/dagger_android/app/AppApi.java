package com.example.testdragger2.dagger_android.app;

import javax.inject.Inject;

public class AppApi implements TheService {
    @Inject
    public AppApi(){

    }

    public String toString(){
        return "feifei_AppApi";
    }

}
