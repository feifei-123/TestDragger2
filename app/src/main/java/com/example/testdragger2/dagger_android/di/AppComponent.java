package com.example.testdragger2.dagger_android.di;

import com.example.testdragger2.dagger_android.app.MyApp;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Component(modules = {
        AndroidInjectionModule.class,
        AppModule.class,
        ActivityModule.class,
        FragmentModule.class
    }
)
public interface AppComponent {

    public void injectApp(MyApp app);

    @Component.Builder
    interface Builder{
        AppComponent build();
    }
}
