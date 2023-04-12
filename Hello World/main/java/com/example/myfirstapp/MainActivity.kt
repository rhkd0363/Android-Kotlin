package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // activity_main 의 레이아웃 설정, R 은 res 폴더를 가리키고 있음
        setContentView(R.layout.activity_main)
    }
}