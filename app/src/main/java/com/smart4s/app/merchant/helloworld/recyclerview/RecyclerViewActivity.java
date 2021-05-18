package com.smart4s.app.merchant.helloworld.recyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.smart4s.app.merchant.helloworld.R;

public class RecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        Button mBtnLinear = findViewById(R.id.btn_linear);
        mBtnLinear.setOnClickListener(view -> {
            Intent intent = new Intent(RecyclerViewActivity.this, LinearRecyclerViewActivity.class);
            startActivity(intent);
        });

        Button mBtnHor = findViewById(R.id.btn_hor);
        mBtnHor.setOnClickListener(view -> {
            Intent intent = new Intent(RecyclerViewActivity.this, HorRecyclerViewActivity.class);
            startActivity(intent);
        });

        Button mBtnGrid = findViewById(R.id.btn_grid);
        mBtnGrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RecyclerViewActivity.this, GridRecyclerViewActivity.class);
                startActivity(intent);
            }
        });

        Button mBtnPu = findViewById(R.id.btn_pu);
        mBtnPu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RecyclerViewActivity.this, PuRecyclerViewActivity.class);
                startActivity(intent);
            }
        });
    }
}