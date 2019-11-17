package com.example.testdragger2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.testdragger2.dagger.SecondActivity;
import com.example.testdragger2.dagger.car.DaggerManComponent;
import com.example.testdragger2.dagger.car.Man;
import com.example.testdragger2.dagger_android.activity.FourActivity;
import com.example.testdragger2.dagger_android.activity.ThirdActivity;
import com.example.testdragger2.dagger_android.base.BaseActivity;

public class MainActivity extends BaseActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public void onClick(View view) {

        if(view.getId()== R.id.btn_dagger_demo){
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        }
        else if(view.getId() == R.id.btn_dagger_android_demo_activity){
            Intent intent = new Intent(this, ThirdActivity.class);
            startActivity(intent);
        }
        else if(view.getId() == R.id.btn_dagger_android_demo_fragment){
            Intent intent = new Intent(this, FourActivity.class);
            startActivity(intent);
        }

    }
}
