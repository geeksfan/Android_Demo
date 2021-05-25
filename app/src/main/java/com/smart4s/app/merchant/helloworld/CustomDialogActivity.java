package com.smart4s.app.merchant.helloworld;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.smart4s.app.merchant.helloworld.util.ToastUtil;
import com.smart4s.app.merchant.helloworld.widget.CustomDialog;

public class CustomDialogActivity extends AppCompatActivity {

    private Button mBtnCustomDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_dialog);
        mBtnCustomDialog = this.<Button>findViewById(R.id.btn_custom_dialog);
        mBtnCustomDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomDialog customDialog = new CustomDialog(CustomDialogActivity.this);
                customDialog.setTitle("提示").setMessage("确认删除吗？")
                        .setCancel("取消", new CustomDialog.IOnCancelListener() {
                            @Override
                            public void onCancel(CustomDialog dialog) {
                                ToastUtil.showMsg(CustomDialogActivity.this,"Cancel...");
                            }
                        }).setConfirm("确认", new CustomDialog.IOnConfirmListener() {
                    @Override
                    public void onConfirm(CustomDialog dialog) {
                        ToastUtil.showMsg(CustomDialogActivity.this,"Confirm...");
                    }
                }).show();
            }
        });
    }
}