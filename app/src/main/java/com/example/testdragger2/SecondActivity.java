package com.example.testdragger2;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.example.testdragger2.app.MyApp;
import com.example.testdragger2.worm.Worm;
import com.example.testdragger2.worm.WormModule;

import javax.inject.Inject;

public class SecondActivity extends Activity {

    @Inject
    Worm mWorm3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        DaggerWormComponent.builder().wormModule(new WormModule("test"))
                .appComponent(MyApp.getAppComponent()).build().testInject(this);
        Log.d("feifei","mWorm3.hashCode:"+mWorm3.hashCode());
    }
}
