package com.smart4s.app.merchant.helloworld;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.smart4s.app.merchant.helloworld.util.ToastUtil;

public class ProgressActivity extends AppCompatActivity {

    private ProgressBar mPb3;
    private Button mBtnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);
        mPb3 = findViewById(R.id.pb3);
//        mPb3.setProgress(25);
        mBtnStart = findViewById(R.id.btn_start);
        mBtnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler.sendEmptyMessage(0);
            }
        });
    }
    Handler handler = new Handler(){
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            if(mPb3.getProgress() <100){
                handler.postDelayed(runnable,500);
            }else{
                ToastUtil.showMsg(ProgressActivity.this,"加载完成");
            }
        }
    };

    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            mPb3.setProgress(mPb3.getProgress() + 5);
            handler.sendEmptyMessage(0);
        }
    };
}