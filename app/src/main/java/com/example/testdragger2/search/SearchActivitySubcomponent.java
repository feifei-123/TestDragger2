package com.example.testdragger2.search;


import com.example.testdragger2.app.AppService;

import dagger.Subcomponent;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

/**
 * 指定SearchActivitySubcomponent 继承自AndroidInjector接口
 * 指定SearchActivitySubcomponent.Builder 继承自AndroidInjector.Builder
 * SearchActivitySubcomponent 继承自 AppComponent，同时也就继承了AppComponenet中的所有的Provider
 * 包括：AppService、DbService,FlowerBean 还有Application的provider
 */
@Subcomponent(modules = {AndroidInjectionModule.class})
public interface SearchActivitySubcomponent extends AndroidInjector<SearchActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SearchActivity>{
    }

    AppService providerAppApi();

}
