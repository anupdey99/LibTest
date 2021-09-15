package com.github.anupdey99.libtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.anupdey99.library.Main

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Main().showToast(this)
    }
}