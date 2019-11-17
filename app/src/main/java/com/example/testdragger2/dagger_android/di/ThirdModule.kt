package com.example.testdragger2.dagger_android.di

import com.example.testdragger2.dagger_android.LoginService
import dagger.Module
import dagger.Provides


@Module
class ThirdModule {

    @Provides
    public fun getLoginService():LoginService{
        return LoginService()
    }

}