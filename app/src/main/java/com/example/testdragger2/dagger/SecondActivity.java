package com.example.testdragger2.dagger;

import android.os.Bundle;
import android.util.Log;

import com.example.testdragger2.R;
import com.example.testdragger2.User;
import com.example.testdragger2.dagger_android.base.BaseActivity;

import javax.inject.Inject;

public class SecondActivity extends BaseActivity {

    @Inject
    User mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d("feifei","mUser.name:"+mUser.getName());
    }
}
