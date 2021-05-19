package com.smart4s.app.merchant.helloworld;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ToastActivity extends AppCompatActivity {

    private Button mBtnToast1;
    private Button mBtnToast2;
    private Button mBtnToast3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);
        mBtnToast1 = this.<Button>findViewById(R.id.btn_toast_1);
        mBtnToast2 = this.<Button>findViewById(R.id.btn_toast_2);
        mBtnToast3 = this.<Button>findViewById(R.id.btn_toast_3);
        OnClick onClick = new OnClick();
        mBtnToast1.setOnClickListener(onClick);
        mBtnToast2.setOnClickListener(onClick);
        mBtnToast3.setOnClickListener(onClick);
    }

    class OnClick implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.btn_toast_1:
                    Toast.makeText(getApplicationContext(),"Toast",Toast.LENGTH_LONG).show();
                    break;
                case R.id.btn_toast_2:
                    Toast toastCenter = Toast.makeText(getApplicationContext(),"Toast",Toast.LENGTH_LONG);
                    toastCenter.setGravity(Gravity.CENTER,0,0);
                    toastCenter.show();
                    break;
                case R.id.btn_toast_3:
                    break;
            }
        }
    }
}