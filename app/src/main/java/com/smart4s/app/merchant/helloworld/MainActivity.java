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
    private Button mBtnRadioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnTextView = this.<Button>findViewById(R.id.btn_textview);
        mBtnButton = this.<Button>findViewById(R.id.btn_button);
        mBtnEditText = this.<Button>findViewById(R.id.btn_editText);
        mBtnRadioButton = this.<Button>findViewById(R.id.btn_radioButton);
        setListener();
    }

    private void setListener(){
        OnClick onClick = new OnClick();
        mBtnTextView.setOnClickListener(onClick);
        mBtnButton.setOnClickListener(onClick);
        mBtnEditText.setOnClickListener(onClick);
        mBtnRadioButton.setOnClickListener(onClick);
    }

    private class OnClick implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Intent intent = null;
            switch (view.getId()){
                case R.id.btn_textview:
                    // 跳转到TextView演示界面
                    intent = new Intent(MainActivity.this, TextViexActivity.class);
                    break;
                case R.id.btn_button:
                    // 跳转到Button演示界面
                    intent = new Intent(MainActivity.this, ButtonActivity.class);
                    break;
                case R.id.btn_editText:
                    // 跳转到EditText演示界面
                    intent = new Intent(MainActivity.this, EditTextActivity.class);
                    break;
                case R.id.btn_radioButton:
                    // 跳转到RadioButton演示界面
                    intent = new Intent(MainActivity.this, RadioButtonActivity.class);
                    break;
            }
            startActivity(intent);

        }
    }
}