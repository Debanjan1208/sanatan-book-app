package com.gita.gfinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;

public class SliderActivity extends AppCompatActivity {

    TextFragmentAdaptor adaptor;
    ArrayList<String> list;
    int current;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider);

        ViewPager mPager = findViewById(R.id.pager);
        list = getIntent().getStringArrayListExtra("list");
        current = getIntent().getIntExtra("current", 1);

        adaptor = new TextFragmentAdaptor(getSupportFragmentManager(),list);
        mPager.setAdapter(adaptor);
        mPager.setCurrentItem(current);

    }



}