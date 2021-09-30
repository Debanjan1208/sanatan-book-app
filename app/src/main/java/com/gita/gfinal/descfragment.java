package com.gita.gfinal;


import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class descfragment extends Fragment {

    String name, course, email, purl;
    public descfragment() {

    }

    public descfragment(String name, String course, String email, String purl) {
        this.name=name;
        this.course=course;
        this.email=email;
        this.purl=purl;
    }

    public static descfragment newInstance(String param1, String param2) {
        descfragment fragment = new descfragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_descfragment, container, false);

        ImageView imageholder=view.findViewById(R.id.imagegholder);
        TextView nameholder=view.findViewById(R.id.nameholder);
        TextView courseholder=view.findViewById(R.id.courseholder);
        TextView emailholder=view.findViewById(R.id.emailholder);

        nameholder.setText(name);
        emailholder.setText(email);
        Glide.with(getContext()).load(purl).into(imageholder);

        courseholder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(course));
                startActivity(i);
            }
        });


        return  view;
    }

    public void onBackPressed()
    {
        AppCompatActivity activity=(AppCompatActivity)getContext();
        activity.getSupportFragmentManager().beginTransaction().replace(R.id.relativeLayout,new recfragment()).addToBackStack(null).commit();

    }
}