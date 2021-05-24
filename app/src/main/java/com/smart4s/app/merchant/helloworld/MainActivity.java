package com.smart4s.app.merchant.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button mBtnUi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnUi = findViewById(R.id.btn_ui);
        OnClick onClick = new OnClick();
        mBtnUi.setOnClickListener(onClick);
    }

    class OnClick implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            Intent intent = null;
            switch (view.getId()){
                case R.id.btn_ui:
                    intent = new Intent(MainActivity.this, UIActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}