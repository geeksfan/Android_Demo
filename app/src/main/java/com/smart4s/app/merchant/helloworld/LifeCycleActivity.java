package com.smart4s.app.merchant.helloworld;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LifeCycleActivity extends AppCompatActivity {
    //创建
    @Override
    protected void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
        Log.d("LifeCycle", "--------onCreate---------");
    }

    //启动
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle", "--------onStart---------");
    }

    //继续——每次进入Activity进行一些操作，例如：数据的刷新
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycle", "--------onResume---------");
    }

    //暂停——应用跳到后台，或者暂时离开进行操作
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle", "--------onPause---------");
    }

    //停止
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle", "--------onStop---------");
    }

    //重新启动
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifeCycle", "--------onRestart---------");
    }

    //销毁——页面摧毁之前需要做什么事情
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle", "--------onDestroy---------");
    }
}
