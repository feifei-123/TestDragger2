package com.example.testdragger2.search;

import com.example.testdragger2.ActivityScoped;
import com.example.testdragger2.User;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class YourActivityModule {

    /** 每 声明一个 ContributesAndroidInjector 就会自动生成一个XXX_contributesYourActivityInjector的module,
     *  并生成一个XXX_contributesYourActivityInjector的一个内部SubComponent类：XXX_contributesYourActivityInjector.YourActivitySubcomponent
     *
     *  这类自动生成了XXX_contributes***Injector.XXXSubcomponent sub组件会自动注入到parent Componet(本例中是AppCompponenet)中.
     *
     *  如下，会自动生成
     *   YourActivity_contributesYourActivityInjector
     *   SearchActivity_contributeSearchActivityInjectr
     *   和自动生成的module类和内部SubComponent类
     */
@ActivityScoped
@ContributesAndroidInjector(modules = { UserModule.class})
    abstract YourActivity contributesYourActivityInjector();


@ActivityScoped
@ContributesAndroidInjector
    abstract SearchActivity contributeSearchActivityInjectr();
}
