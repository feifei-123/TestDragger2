package com.example.testdragger2.activity;

import android.app.Activity;

import com.example.testdragger2.ActivityScoped;
import com.example.testdragger2.MainActivity;

import dagger.BindsInstance;
import dagger.Component;

@Component
@ActivityScoped
public interface HomeActivityComponent {

    /**
     * @Component.Builder 表示下面的Builder 接口，是自动生成DaggerXXXComponent的父类
     * @BindsInstance 表示 Builder中 持有一个Activity的实例，并且通过 Builder activity(Activity activity);进行初始化
     */
    @Component.Builder
    interface Builder{
        @BindsInstance
        Builder activity(Activity activity);
        HomeActivityComponent build();
    }

}
