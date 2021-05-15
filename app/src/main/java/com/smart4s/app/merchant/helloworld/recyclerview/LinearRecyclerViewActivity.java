package com.smart4s.app.merchant.helloworld.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.smart4s.app.merchant.helloworld.R;

public class LinearRecyclerViewActivity extends AppCompatActivity {

    private RecyclerView mRvMain1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_recycler_view);
        mRvMain1 = findViewById(R.id.rv_main);
        mRvMain1.setLayoutManager(new LinearLayoutManager(LinearRecyclerViewActivity.this));
        mRvMain1.setAdapter(new LinearAdapter(LinearRecyclerViewActivity.this));
    }
}