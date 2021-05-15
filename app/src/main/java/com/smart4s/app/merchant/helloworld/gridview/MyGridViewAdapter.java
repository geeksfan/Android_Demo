package com.smart4s.app.merchant.helloworld.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.smart4s.app.merchant.helloworld.R;

public class MyGridViewAdapter extends BaseAdapter {

    private Context mContent;
    private LayoutInflater mLayoutInflater;

    public MyGridViewAdapter(Context context) {
        this.mContent = context;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    static class ViewHolder{
        public ImageView imageView;
        public TextView textView;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder = null;
        if(view == null){
            view = mLayoutInflater.inflate(R.layout.layout_grid_view_item, null);
            holder = new ViewHolder();
            holder.imageView = view.<ImageView>findViewById(R.id.iv_grid);
            holder.textView = view.<TextView>findViewById(R.id.tv_grid_title);
            view.setTag(holder);
        }else{
            holder = (ViewHolder) view.getTag();
        }
        //赋值
        holder.textView.setText("花");
        Glide.with(mContent).load("https://img2.baidu.com/it/u=2320925921,3519901792&fm=26&fmt=auto&gp=0.jpg").into(holder.imageView);
        return view;
    }
}
