package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


// 메인쓰레드 = UI 쓰레드

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main); // 그림그리는 함수(무엇을? ->activity_main)

    }
}