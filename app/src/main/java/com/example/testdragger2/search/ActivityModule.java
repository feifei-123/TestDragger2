package com.example.testdragger2.search;

import android.app.Activity;

import com.example.testdragger2.ActivityScoped;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.android.ContributesAndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * subcomponents 指定SubComponenet-
 */
@Module(subcomponents = {SearchActivitySubcomponent.class})
public abstract class ActivityModule {

    /**
     * @Binds的用法：
     *
     *当需要返回的是接口的实例时，需要用到@Binds注解
     * 并要求：
     * （1）方法中必须有参数且只能有一个，是接口的实现类，返回值类型是一个接口
     * （2）实现类必须提供@Inject的构造或Module中的Provides形式提供
     * （3）方法是抽象方法，不必写方法体
     * （4）此时使用@Binds代替@Inject
     */

    /**
     * @IntoMap 是有注入形式初始化 map集合，Map由一系列key-value组成。
     * @ActivityKey(SearchActivity.class)  指定了map中使用的Key,而value为方法的返回值。
     *
     */
    @Binds
    @IntoMap
    @ActivityKey(SearchActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(SearchActivitySubcomponent.Builder builder);

    //ActivityModule 单独提供了providerFlower的Provider
    @Provides
    static FlowerBean providerFlower(){
        return new FlowerBean("rose","red");
    }


}
