package com.example.testdragger2.dagger_android.di

import com.example.testdragger2.MainActivity
import com.example.testdragger2.dagger.SecondActivity
import com.example.testdragger2.dagger_android.activity.FourActivity
import com.example.testdragger2.dagger_android.activity.ThirdActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {
    //
    //
    /**
     * 1、需要通过AndroidInjection.inject()进行注入的所有activity,都集中写到ActivityModule中，如下所示
     * 2、@ContributesAndroidInjector 标注会自动生成DaggerXXXComponent(如DaggerMainActivityComponent),其继承自AndroidInjector<XXX>(如AndroidInjector<MainActivity>)
     * 并实现了  void inject(T instance);方法(如,void inject(MainActivity instance))。
     * 至此已经自动实现了dagger注入三要素中的 "组装工人worker"和 owner(如MainActivity)
     * 如果自动生成的DaggerXXXComponent 中需要额外的provider才能够完成依赖注入，那可以将包含provider的module 添加给DaggerXXXComponent, 方法如下（利用modules =）:
     * @ContributesAndroidInjector(modules = [ThirdModule::class])标签
      */

    @ContributesAndroidInjector
    abstract fun contributeMain():MainActivity

    @ContributesAndroidInjector
    abstract fun controbuteSecond(): SecondActivity

    @ContributesAndroidInjector(modules = [ThirdModule::class])
    abstract fun controbuteThird(): ThirdActivity

    @ContributesAndroidInjector
    abstract fun controbuteFour(): FourActivity

}