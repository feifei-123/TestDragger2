package com.example.testdragger2.app;

import android.app.Application;

import com.example.testdragger2.search.ActivityModule;
import com.example.testdragger2.search.YourActivityModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * AppModule 提供了 AppService 和 DBService的provider
 * ActivityModule FlowerBean 的Provider
 * AndroidInjectionModule 提供了 存储AndroidInjector.Factory<? extends Activity> 的map,未直接提供Provider
 * 同时@BindsInstance,提供了application的Provider
 */
@Singleton
@Component(modules = {
        AppModule.class,
//        ActivityModule.class,
        YourActivityModule.class,
        AndroidInjectionModule.class,
       })
public interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        public Builder application(Application application);
        public AppComponent  build();
    }

    void inject(MyApp application);

    AppService providerAppApi();


}
