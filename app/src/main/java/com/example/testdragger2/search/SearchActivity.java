package com.example.testdragger2.search;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.testdragger2.R;
import com.example.testdragger2.app.AppService;
import com.example.testdragger2.app.DbService;

import javax.inject.Inject;

import dagger.android.AndroidInjection;


public class SearchActivity extends AppCompatActivity {

//    @Inject
//    FlowerBean flower;

    @Inject
    AppService appApi;

    @Inject
    DbService dbService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        Log.d("feifei -- ","appApi.hashCode:"+appApi.hashCode());
    }
}
