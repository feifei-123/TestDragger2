package com.example.testdragger2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.testdragger2.activity.DaggerHomeActivityComponent;
import com.example.testdragger2.activity.HomeActivityComponent;
import com.example.testdragger2.app.MyApp;
import com.example.testdragger2.worm.DaggerWormComponent;
import com.example.testdragger2.worm.Worm;
import com.example.testdragger2.worm.WormComponent;
import com.example.testdragger2.worm.WormModule;

import javax.inject.Inject;
import javax.inject.Named;

            public class MainActivity extends Activity implements View.OnClickListener{

    @Inject
    Worm mWorm1;

    @Inject
    Worm mWorm2;


    @Named("dev")
    @Inject
    Worm mWorm_dev;

    @Named("release")
    @Inject
    Worm mWorm_release;

    @Inject
    User mUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        DaggerMainComponent.builder().build().inject(this);

//        String userName = this.mUser.getName();
//        Log.d("feifei","userName:"+userName);


        WormModule wormModule = new WormModule("test");
        //WormComponent 的module中包含WormModule,那么builder,会自动生成一个wormModule()方法用于传入module
        WormComponent wormComponent = DaggerWormComponent.builder().wormModule(wormModule)
                .appComponent(MyApp.getAppComponent()).build();
        wormComponent.testInject(this);
        Log.d("feifei","---mWorm1.hashCode:"+ mWorm1.hashCode()+"\n"
                +"mWorm2.hashCode:"+ mWorm2.hashCode()+"\n"
                +"mWorm_dev:"+mWorm_dev.getName()+"\n"
                +"mWorm.releae:"+mWorm_release.getName()+"\n"
                +",user.getName:"+mUser.getName());

       HomeActivityComponent homeActivityComponent = DaggerHomeActivityComponent.builder().activity(this).build();

    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }
}
