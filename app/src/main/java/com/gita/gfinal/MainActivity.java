package com.gita.gfinal;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    long backpressedtime;
    DownloadManager manager;
    model model1;
    RelativeLayout gita_block_frame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Wifi Check
        if (!isConnected(this)) {
            showInternetDialog();
        }

        ImageButton btn1 = findViewById(R.id.btn1);
        ImageButton btn2 = findViewById(R.id.btn_veda);
        ImageButton btn3 = findViewById(R.id.upanisad);
        ImageButton btn4 = findViewById(R.id.audiobook);
        gita_block_frame = findViewById(R.id.gita_block_frame);

        getSupportFragmentManager().beginTransaction().add(R.id.wrapper,new recfragment()).commit();


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.wrapper,new recfragment()).commit();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.wrapper,new VedaFragment()).commit();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.wrapper,new recfragment()).commit();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.wrapper,new AudioFragment()).commit();
            }
        });
        gita_block_frame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i  = new Intent(MainActivity.this, GitaActivity.class);
                startActivity(i);
            }
        });






    }

    //Back Pressed
    @Override
    public void onBackPressed() {
        if (backpressedtime +2000 > System.currentTimeMillis()){
            super.onBackPressed();
            return;
        }else{
            Toast.makeText(this, "Press back again to exit", Toast.LENGTH_SHORT).show();
        }
        backpressedtime = System.currentTimeMillis();
    }

    //Wifi Check
    private void showInternetDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);

        View view = LayoutInflater.from(this).inflate(R.layout.no_internet_dialog, (ViewGroup) findViewById(R.id.no_internet_layout));
        view.findViewById(R.id.try_again).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isConnected(MainActivity.this)) {
                    showInternetDialog();
                } else {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    finish();
                }
            }
        });

        builder.setView(view);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();

    }

    //Wifi Check
    private boolean isConnected(MainActivity dashboardActivity) {
        ConnectivityManager connectivityManager = (ConnectivityManager) dashboardActivity.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo wifiConn = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        NetworkInfo mobileConn = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
        return (wifiConn != null && wifiConn.isConnected()) || (mobileConn != null && mobileConn.isConnected());
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
        Intent i  = new Intent(MainActivity.this, GitaActivity.class);
        startActivity(i);
    }

    public void homeAct(View view) {
        Toast.makeText(this, "Home Section", Toast.LENGTH_SHORT).show();
    }


}