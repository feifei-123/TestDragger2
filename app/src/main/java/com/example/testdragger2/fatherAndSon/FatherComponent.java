package com.example.testdragger2.fatherAndSon;

import com.example.testdragger2.car.Man;

import dagger.Component;

@FatherScope
@Component(modules = FatherModule.class)
public interface FatherComponent {
    void inject(Man man);
    SonComponent.Builder sonComponent();    // 增加一个方法，用来创建 Subcomponent。
}
