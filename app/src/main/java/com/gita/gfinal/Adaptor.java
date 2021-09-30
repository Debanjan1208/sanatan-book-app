package com.gita.gfinal;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptor extends BaseAdapter {

    ArrayList<String> list;
    Context mContext;

    public Adaptor(ArrayList<String> list, Context mContext) {
        this.list = list;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null)
        {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.list_item, parent,false);
            TextView textView = convertView.findViewById(R.id.text);
            textView.setText(list.get(position));
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(mContext, SliderActivity.class);
                    i.putExtra("list", list);
                    i.putExtra("current", position);
                    mContext.startActivity(i);
                }
            });
        }

        return convertView;
    }
}
