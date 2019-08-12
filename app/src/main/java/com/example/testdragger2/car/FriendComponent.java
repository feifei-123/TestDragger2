package com.example.testdragger2.car;

import com.example.testdragger2.MainComponent;

import dagger.Component;


@FriendScope
@Component(dependencies = ManComponent.class)
public interface FriendComponent {
    void inject(Friend friend);
}
