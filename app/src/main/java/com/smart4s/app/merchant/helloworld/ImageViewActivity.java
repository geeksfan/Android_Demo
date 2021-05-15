package com.smart4s.app.merchant.helloworld;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class ImageViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);
        ImageView mIv4 = findViewById(R.id.iv_4);
//        Glide.with(this).load("http://h5.web-product.dev.smart4s.com/adv/img/WechatIMG2664.jpeg").into(mIv4);
        Glide.with(this).load("https://www.baidu.com/img/PCtm_d9c8750bed0b3c7d089fa7d55720d6cf.png").into(mIv4);
    }
}