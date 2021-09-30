package com.gita.gfinal;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

public class TextFragmentAdaptor extends FragmentStatePagerAdapter {

    ArrayList<String> list;

    public TextFragmentAdaptor(@NonNull FragmentManager fm,ArrayList<String> list) {
        super(fm);
        this.list = list;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        TextFragment fragment = new TextFragment();

        Bundle b = new Bundle();

        b.putString("current", list.get(position));

        fragment.setArguments(b);

        return fragment;
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
