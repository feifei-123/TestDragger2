package com.example.testdragger2.police;

import dagger.Component;
import dagger.Module;

@Component(modules = UniFormModule.class)
public interface PoliceComponent {
    public void inject(Police police);
}
