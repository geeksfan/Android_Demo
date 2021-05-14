package com.smart4s.app.merchant.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button mBtnTextView;
    private Button mBtnButton;
    private Button mBtnEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnTextView = this.<Button>findViewById(R.id.btn_textview);
        mBtnTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 跳转到TextView演示界面
                Intent intent = new Intent(MainActivity.this, TextViexActivity.class);
                startActivity(intent);
            }
        });

        mBtnButton = findViewById(R.id.btn_button);
        mBtnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 跳转到Button演示界面
                Intent intent = new Intent(MainActivity.this, ButtonActivity.class);
                startActivity(intent);
            }
        });

        mBtnEditText = this.<Button>findViewById(R.id.btn_editText);
        mBtnEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 跳转到EditText演示界面
                Intent intent = new Intent(MainActivity.this, EditTextActivity.class);
                startActivity(intent);
            }
        });
    }
}