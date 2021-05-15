package com.smart4s.app.merchant.helloworld.listview;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.smart4s.app.merchant.helloworld.R;

public class MyListViewAdapter extends BaseAdapter {

    private Context mContxt;
    private LayoutInflater mLayoutInflater;

    public MyListViewAdapter(Context context){
        this.mContxt = context;
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
        public TextView tvTitle, tvTime, tvContent;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if(view == null){
            view = mLayoutInflater.inflate(R.layout.layout_list_item, null);
            holder = new ViewHolder();
            holder.imageView = view.<ImageView>findViewById(R.id.iv);
            holder.tvTitle = view.<TextView>findViewById(R.id.tv_title);
            holder.tvTime = view.<TextView>findViewById(R.id.tv_time);
            holder.tvContent = view.<TextView>findViewById(R.id.tv_contnent);
            view.setTag(holder);
            Log.d("view==null", view.toString());
        }else{
            holder = (ViewHolder) view.getTag();
            Log.d("view !== null", holder.toString());
        }
        //给控件赋值
        holder.tvTitle.setText("这是标题");
        holder.tvTime.setText("2088-08-08");
        holder.tvContent.setText("这是内容");
        Glide.with(mContxt).load("https://www.baidu.com/img/PCtm_d9c8750bed0b3c7d089fa7d55720d6cf.png").into(holder.imageView);
        return view;
    }
}
