package com.smart4s.app.merchant.helloworld.jump;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.smart4s.app.merchant.helloworld.R;

public class AActivity extends AppCompatActivity {

    private Button mBtnJump;

    @Override
    protected void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        mBtnJump = this.<Button>findViewById(R.id.jump);
        mBtnJump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO:显示跳转1——常用
                Intent intent = new Intent(AActivity.this,BActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("name","张小盒");
                bundle.putInt("number",88);
                intent.putExtras(bundle);
//                startActivity(intent);
                startActivityForResult(intent,0);



                //TODO:显示跳转2
                //Intent intent = new Intent();
                //intent.setClass(AActivity.this,BActivity.class);
                //startActivity(intent);
                //TODO:显示跳转3
                //Intent intent = new Intent();
                //intent.setClassName(AActivity.this,"com.smart4s.app.merchant.helloworld.jump.BActivity");
                //startActivity(intent);
                //TODO:显示跳转4
                //Intent intent = new Intent();
                //intent.setComponent(new ComponentName(AActivity.this,"com.smart4s.app.merchant.helloworld.jump.BActivity"));
                //startActivity(intent);

                //TODO:隐式跳转1
                //Intent intent = new Intent();
                //intent.setAction("com.skyan.test.BActivity");
                //startActivity(intent);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable @org.jetbrains.annotations.Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Toast.makeText(AActivity.this,data.getExtras().getString("title"),Toast.LENGTH_LONG).show();
    }
}
