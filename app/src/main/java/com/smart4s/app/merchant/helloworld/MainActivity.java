package com.smart4s.app.merchant.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.smart4s.app.merchant.helloworld.ListView.ListViewActivity;

public class MainActivity extends AppCompatActivity {

    private Button mBtnTextView;
    private Button mBtnButton;
    private Button mBtnEditText;
    private Button mBtnRadioButton;
    private Button mBtnCheckBox;
    private Button mBtnImageView;
    private Button mBtnListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnTextView = this.<Button>findViewById(R.id.btn_textview);
        mBtnButton = this.<Button>findViewById(R.id.btn_button);
        mBtnEditText = this.<Button>findViewById(R.id.btn_editText);
        mBtnRadioButton = this.<Button>findViewById(R.id.btn_radioButton);
        mBtnCheckBox = this.<Button>findViewById(R.id.btn_checkBox);
        mBtnImageView = this.<Button>findViewById(R.id.btn_imageView);
        mBtnListView = this.<Button>findViewById(R.id.btn_listView);
        setListener();
    }

    private void setListener(){
        OnClick onClick = new OnClick();
        mBtnTextView.setOnClickListener(onClick);
        mBtnButton.setOnClickListener(onClick);
        mBtnEditText.setOnClickListener(onClick);
        mBtnRadioButton.setOnClickListener(onClick);
        mBtnCheckBox.setOnClickListener(onClick);
        mBtnImageView.setOnClickListener(onClick);
        mBtnListView.setOnClickListener(onClick);
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
                case R.id.btn_checkBox:
                    // 跳转到CheckBox演示界面
                    intent = new Intent(MainActivity.this, CheckBoxActivity.class);
                    break;
                case R.id.btn_imageView:
                    // 跳转到ImageView演示界面
                    intent = new Intent(MainActivity.this, ImageViewActivity.class);
                    break;
                case R.id.btn_listView:
                    // 跳转到ListView演示界面
                    intent = new Intent(MainActivity.this, ListViewActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}