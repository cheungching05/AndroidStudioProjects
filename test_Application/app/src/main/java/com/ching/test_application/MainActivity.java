package com.ching.test_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("日志","MainActivity---onCreate方法");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("日志","MainActivity---onStart方法");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("日志","MainActivity---onDestroy方法");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("日志","MainActivity---onPause方法");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("日志","MainActivity---onStop方法");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("日志","MainActivity---onResume方法");
    }
}