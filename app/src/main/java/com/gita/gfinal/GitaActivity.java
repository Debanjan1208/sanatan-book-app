package com.gita.gfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.gita.gfinal.chapters.Chapter1Activity;
import com.gita.gfinal.chapters.Chapter2Activity;

public class GitaActivity extends AppCompatActivity {

    private static final String Tag = GitaActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gita);

        init();

    }


    public void init(){

        Button btn1 = findViewById(R.id.chapter1);
        Button btn2 = findViewById(R.id.chapter2);
        Button btn3 = findViewById(R.id.chapter3);
        Button btn4 = findViewById(R.id.chapter4);
        Button btn5 = findViewById(R.id.chapter5);
        Button btn6 = findViewById(R.id.chapter6);
        Button btn7 = findViewById(R.id.chapter7);
        Button btn8 = findViewById(R.id.chapter8);
        Button btn9 = findViewById(R.id.chapter9);
        Button btn10 = findViewById(R.id.chapter10);
        Button btn11 = findViewById(R.id.chapter11);
        Button btn12 = findViewById(R.id.chapter12);
        Button btn13 = findViewById(R.id.chapter13);
        Button btn14 = findViewById(R.id.chapter14);
        Button btn15 = findViewById(R.id.chapter15);
        Button btn16 = findViewById(R.id.chapter16);
        Button btn17 = findViewById(R.id.chapter17);
        Button btn18 = findViewById(R.id.chapter18);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i  = new Intent(GitaActivity.this, Chapter1Activity.class);
                startActivity(i);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i  = new Intent(GitaActivity.this, Chapter2Activity.class);
                startActivity(i);
            }
        });

    }


    public void AboutAct(View view) {
        Intent i  = new Intent(this, AboutActivity.class);
        startActivity(i);
    }
    public void AudioAct(View view) {
        Intent i  = new Intent(this, AudioBookActivity.class);
        startActivity(i);
    }
    public void gitaAct(View view) {
        Toast.makeText(this, "Gita Section", Toast.LENGTH_SHORT).show();
    }
    public void homeAct(View view) {
        Intent i  = new Intent(this, MainActivity.class);
        startActivity(i);
    }


}