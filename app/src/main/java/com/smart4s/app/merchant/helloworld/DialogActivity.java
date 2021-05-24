package com.smart4s.app.merchant.helloworld;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.smart4s.app.merchant.helloworld.util.ToastUtil;

public class DialogActivity extends AppCompatActivity {

    private Button mBtnDialog1, mBtnDialog2, mBtnDialog3, mBtnDialog4,mBtnDialog5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        mBtnDialog1 = this.<Button>findViewById(R.id.btn_dialog1);
        mBtnDialog2 = this.<Button>findViewById(R.id.btn_dialog2);
        mBtnDialog3 = this.<Button>findViewById(R.id.btn_dialog3);
        mBtnDialog4 = this.<Button>findViewById(R.id.btn_dialog4);
        mBtnDialog5 = this.<Button>findViewById(R.id.btn_dialog5);
        OnClick onClick = new OnClick();
        mBtnDialog1.setOnClickListener(onClick);
        mBtnDialog2.setOnClickListener(onClick);
        mBtnDialog3.setOnClickListener(onClick);
        mBtnDialog4.setOnClickListener(onClick);
        mBtnDialog5.setOnClickListener(onClick);
    }

    class OnClick implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_dialog1:
                    AlertDialog.Builder builder = new AlertDialog.Builder(DialogActivity.this);
                    builder.setTitle("请回答").setMessage("你觉得课程如何?").setIcon(R.drawable.icon_user)
                            .setPositiveButton("棒", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    ToastUtil.showMsg(getApplicationContext(), "你很诚实");
                                }
                            })
                            .setNeutralButton("还行", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    ToastUtil.showMsg(getApplicationContext(), "你再瞅瞅～");
                                }
                            })
                            .setNegativeButton("不好", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    ToastUtil.showMsg(getApplicationContext(), "睁眼说瞎话");
                                }
                            }).show();
                    break;
                case R.id.btn_dialog2:
                    String[] array = new String[]{"男", "女"};
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(DialogActivity.this);
                    builder1.setTitle("选择性别").setItems(array, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            ToastUtil.showMsg(DialogActivity.this, array[i]);
                        }
                    }).show();
                    break;
                case R.id.btn_dialog3:
                    String[] array1 = new String[]{"男", "女"};
                    AlertDialog.Builder builder2 = new AlertDialog.Builder(DialogActivity.this);
                    builder2.setTitle("选择性别").setSingleChoiceItems(array1, 0, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            ToastUtil.showMsg(DialogActivity.this, array1[i]);
                            dialogInterface.dismiss();
                        }
                    }).setCancelable(false).show();

                    break;
                case R.id.btn_dialog4:
                    String[] array4 = new String[]{"唱歌", "跳舞","写代码"};
                    boolean[] isSelected = new boolean[]{false,false,true};
                    AlertDialog.Builder builder4 = new AlertDialog.Builder(DialogActivity.this);
                    builder4.setTitle("选择兴趣").setMultiChoiceItems(array4, isSelected, new DialogInterface.OnMultiChoiceClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                            ToastUtil.showMsg(DialogActivity.this,array4[i]+":"+b);
                        }
                    }).setCancelable(false).setPositiveButton("确定", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            ToastUtil.showMsg(DialogActivity.this,"确定");
                        }
                    }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            ToastUtil.showMsg(DialogActivity.this,"取消");
                        }
                    }).show();
                    break;
                case R.id.btn_dialog5:
                    AlertDialog.Builder builder5 = new AlertDialog.Builder(DialogActivity.this);
                    View view = LayoutInflater.from(DialogActivity.this).inflate(R.layout.layout_dialog,null );
                    EditText etUserName = view.findViewById(R.id.et_username);
                    EditText etPassWord = view.findViewById(R.id.et_password);
                    Button btnLogin = view.findViewById(R.id.btn_login);
                   btnLogin.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            // TODO: 2021/5/24
                        }
                    });
                    builder5.setTitle("请先登录").setView(view).show();
                    break;
            }
        }
    }
}