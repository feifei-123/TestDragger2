package com.example.testdragger2.search;

import com.example.testdragger2.User;

import dagger.Module;
import dagger.Provides;

@Module
public class UserModule {

    @Provides
    User userProvider(){
        return new User();
    }
}
