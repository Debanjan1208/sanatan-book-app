package com.gita.gfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class AudioBookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio_book);

        getSupportFragmentManager().beginTransaction().replace(R.id.wrapper3,new AudioFragment()).commit();

    }
    public void AboutAct(View view) {
        Intent i  = new Intent(this, AboutActivity.class);
        startActivity(i);
    }

    public void AudioAct(View view) {
        Toast.makeText(this, "Audio Section", Toast.LENGTH_SHORT).show();
    }

    public void gitaAct(View view) {
        Intent i  = new Intent(this, GitaActivity.class);
        startActivity(i);
    }

    public void homeAct(View view) {
        Intent i  = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}