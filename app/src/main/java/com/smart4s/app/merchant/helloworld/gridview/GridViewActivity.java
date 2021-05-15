package com.smart4s.app.merchant.helloworld.gridview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.smart4s.app.merchant.helloworld.R;

public class GridViewActivity extends AppCompatActivity {

    private GridView mGv1;

    @Override
    protected void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        mGv1 = findViewById(R.id.gv_1);
        mGv1.setAdapter(new MyGridViewAdapter(GridViewActivity.this));
        mGv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(GridViewActivity.this,"点击"+i,Toast.LENGTH_SHORT).show();
            }
        });
        mGv1.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(GridViewActivity.this,"长按"+i,Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}
