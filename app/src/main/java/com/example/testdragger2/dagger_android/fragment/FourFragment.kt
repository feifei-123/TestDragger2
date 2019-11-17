package com.example.testdragger2.dagger_android.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.testdragger2.R
import com.example.testdragger2.User
import com.example.testdragger2.dagger_android.base.BaseFragment
import javax.inject.Inject

class FourFragment():BaseFragment() {

    @Inject
    lateinit var mUser:User
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var mView = inflater.inflate(R.layout.fragment_four, container, false)
        mView.findViewById<TextView>(R.id.tv_info).text = mUser.name
        Log.d("feifei","mUser.name:"+mUser.name)
        return mView
    }



}