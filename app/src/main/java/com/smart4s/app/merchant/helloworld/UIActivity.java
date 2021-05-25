package com.smart4s.app.merchant.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.smart4s.app.merchant.helloworld.gridview.GridViewActivity;
import com.smart4s.app.merchant.helloworld.listview.ListViewActivity;
import com.smart4s.app.merchant.helloworld.recyclerview.RecyclerViewActivity;

public class UIActivity extends AppCompatActivity {

    private Button mBtnTextView;
    private Button mBtnButton;
    private Button mBtnEditText;
    private Button mBtnRadioButton;
    private Button mBtnCheckBox;
    private Button mBtnImageView;
    private Button mBtnListView;
    private Button mBtnGridView;
    private Button mBtnScrollView;
    private Button mBtnRecyclerView;
    private Button mBtnWebView;
    private Button mBtnToast;
    private Button mBtnDialog;
    private Button mBtnProgress;
    private Button mBtnCustomDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui);
        mBtnTextView = this.<Button>findViewById(R.id.btn_textview);
        mBtnButton = this.<Button>findViewById(R.id.btn_button);
        mBtnEditText = this.<Button>findViewById(R.id.btn_editText);
        mBtnRadioButton = this.<Button>findViewById(R.id.btn_radioButton);
        mBtnCheckBox = this.<Button>findViewById(R.id.btn_checkBox);
        mBtnImageView = this.<Button>findViewById(R.id.btn_imageView);
        mBtnListView = this.<Button>findViewById(R.id.btn_listView);
        mBtnGridView = this.<Button>findViewById(R.id.btn_gridView);
        mBtnScrollView = this.<Button>findViewById(R.id.btn_scrollView);
        mBtnRecyclerView = this.<Button>findViewById(R.id.btn_recyclerView);
        mBtnWebView = this.<Button>findViewById(R.id.btn_webView);
        mBtnToast = this.<Button>findViewById(R.id.btn_toast);
        mBtnDialog = this.<Button>findViewById(R.id.btn_dialog);
        mBtnProgress = this.<Button>findViewById(R.id.btn_progress);
        mBtnCustomDialog = this.<Button>findViewById(R.id.btn_customDialog);
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
        mBtnGridView.setOnClickListener(onClick);
        mBtnScrollView.setOnClickListener(onClick);
        mBtnRecyclerView.setOnClickListener(onClick);
        mBtnWebView.setOnClickListener(onClick);
        mBtnToast.setOnClickListener(onClick);
        mBtnDialog.setOnClickListener(onClick);
        mBtnProgress.setOnClickListener(onClick);
        mBtnCustomDialog.setOnClickListener(onClick);
    }

    private class OnClick implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Intent intent = null;
            switch (view.getId()){
                case R.id.btn_textview:
                    // 跳转到TextView演示界面
                    intent = new Intent(UIActivity.this, TextViexActivity.class);
                    break;
                case R.id.btn_button:
                    // 跳转到Button演示界面
                    intent = new Intent(UIActivity.this, ButtonActivity.class);
                    break;
                case R.id.btn_editText:
                    // 跳转到EditText演示界面
                    intent = new Intent(UIActivity.this, EditTextActivity.class);
                    break;
                case R.id.btn_radioButton:
                    // 跳转到RadioButton演示界面
                    intent = new Intent(UIActivity.this, RadioButtonActivity.class);
                    break;
                case R.id.btn_checkBox:
                    // 跳转到CheckBox演示界面
                    intent = new Intent(UIActivity.this, CheckBoxActivity.class);
                    break;
                case R.id.btn_imageView:
                    // 跳转到ImageView演示界面
                    intent = new Intent(UIActivity.this, ImageViewActivity.class);
                    break;
                case R.id.btn_listView:
                    // 跳转到ListView演示界面
                    intent = new Intent(UIActivity.this, ListViewActivity.class);
                    break;
                case R.id.btn_gridView:
                    // 跳转到GridView演示界面
                    intent = new Intent(UIActivity.this, GridViewActivity.class);
                    break;
                case R.id.btn_scrollView:
                    // 跳转到ScollView演示界面
                    intent = new Intent(UIActivity.this, ScrollViewActivity.class);
                    break;
                case R.id.btn_recyclerView:
                    // 跳转到RecycleView演示界面
                    intent = new Intent(UIActivity.this, RecyclerViewActivity.class);
                    break;
                case R.id.btn_webView:
                    // 跳转到WebView演示界面
                    intent = new Intent(UIActivity.this, WebViewActivity.class);
                    break;
                case R.id.btn_toast:
                    // 跳转到Toast演示界面
                    intent = new Intent(UIActivity.this, ToastActivity.class);
                    break;
                case R.id.btn_dialog:
                    // 跳转到Dialog演示界面
                    intent = new Intent(UIActivity.this, DialogActivity.class);
                    break;
                case R.id.btn_progress:
                    // 跳转到ProgressBar && ProgressDialog演示界面
                    intent = new Intent(UIActivity.this, ProgressActivity.class);
                    break;
                case R.id.btn_customDialog:
                    // 跳转到CustomDialog演示界面
                    intent = new Intent(UIActivity.this, CustomDialogActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}