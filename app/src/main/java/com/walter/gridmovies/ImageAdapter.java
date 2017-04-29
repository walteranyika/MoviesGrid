package com.walter.gridmovies;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by walter on 4/11/17.
 */

public class ImageAdapter extends BaseAdapter {
    Context mContext;

    int images[] ={R.mipmap.img_1,R.mipmap.img_2,R.mipmap.img_3,R.mipmap.img_4,R.mipmap.img_5,R.mipmap.img_6,R.mipmap.img_7,R.mipmap.img_8,R.mipmap.img_9,R.mipmap.img_10,R.mipmap.img_11,R.mipmap.img_12,R.mipmap.img_13,R.mipmap.img_14,R.mipmap.img_15,R.mipmap.img_16,R.mipmap.img_17,R.mipmap.img_18,R.mipmap.img_19,R.mipmap.img_20};

    public ImageAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return images[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(images[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return imageView;
    }
}
