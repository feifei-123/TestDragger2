package com.example.testdragger2.dagger_android.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testdragger2.R
import com.example.testdragger2.dagger_android.base.BaseActivity
import com.example.testdragger2.dagger_android.fragment.FourFragment

class FourActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportFragmentManager.beginTransaction()
                .replace(
                        android.R.id.content,
                        FourFragment(),
                        "FourFragment"
                ).commit()
    }
}
