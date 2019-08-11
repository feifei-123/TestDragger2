package com.example.testdragger2;

import javax.inject.Inject;

import dagger.Module;

@Module
public class User {
    private String name;
    @Inject
    public User(){
        this.name = "小美";
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
