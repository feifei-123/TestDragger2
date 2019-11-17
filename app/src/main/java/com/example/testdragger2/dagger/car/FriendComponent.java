package com.example.testdragger2.dagger.car;

import dagger.Component;


@FriendScope
@Component(dependencies = ManComponent.class)
public interface FriendComponent {
    void inject(Friend friend);
}
