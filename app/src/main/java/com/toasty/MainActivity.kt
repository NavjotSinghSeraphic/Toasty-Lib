package com.toasty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.toasty_lib.ToastHelper

class MainActivity : AppCompatActivity() {

     var btn : Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.btn)
         btn?.setOnClickListener {
             ToastHelper.showToast(this,"Pressed")
         }
    }
}