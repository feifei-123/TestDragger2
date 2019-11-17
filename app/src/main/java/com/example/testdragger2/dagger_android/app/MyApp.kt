package com.example.testdragger2.dagger_android.app

import android.app.Activity
import android.app.Application
import android.util.Log
import androidx.fragment.app.Fragment
import com.example.testdragger2.dagger_android.di.DaggerAppComponent

import javax.inject.Inject

import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import dagger.android.support.HasSupportFragmentInjector


class MyApp : Application(), HasActivityInjector , HasSupportFragmentInjector {


    @Inject
    lateinit var dispatchingActivityAndroidInjector: DispatchingAndroidInjector<Activity>

    @Inject
    lateinit var dispatchingFragmentAndroidInjector: DispatchingAndroidInjector<Fragment>

    @Inject
    @JvmField
    var theAppApi: AppApi? = null

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.builder().build().injectApp(this)

        Log.d("feifei","验证application的注入情况 - dispatchingAndroidInjector.size:"+dispatchingActivityAndroidInjector
                +"\n,dispatchingFragmentAndroidInjector:"+dispatchingFragmentAndroidInjector
                +"\n,theAppApi:"+theAppApi
        )
    }

    override fun activityInjector(): AndroidInjector<Activity>? {
        return dispatchingActivityAndroidInjector
    }

    override fun supportFragmentInjector(): AndroidInjector<Fragment> {
        return dispatchingFragmentAndroidInjector
    }
}
