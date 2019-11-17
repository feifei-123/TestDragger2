package com.example.testdragger2.dagger_android.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.testdragger2.R
import com.example.testdragger2.dagger_android.LoginService
import com.example.testdragger2.dagger_android.base.BaseActivity
import kotlinx.android.synthetic.main.activity_third.*
import javax.inject.Inject

class ThirdActivity : BaseActivity() {

    @Inject
    lateinit var loginService:LoginService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        var loginName = loginService.getLoginUserName()

        tv_info.text = loginName

        Log.d("feifei","loginName:"+loginName)

    }
}
