package com.example.aldiandika.onboard;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class DialogBox extends Activity {

    View decorView;
    Button udahBaca;
    ImageView btn_bgA;
    ImageView btn_bgB;
    ImageView btn_bgKa;
    ImageView btn_bgKi;
    Button btn_tutup;
    public static int selesai_culture;
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            decorView.setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // hide nav bar
                            | View.SYSTEM_UI_FLAG_FULLSCREEN // hide status bar
                            | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);}
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_box);
        decorView = getWindow().getDecorView();

       decorView.setSystemUiVisibility(
               View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                       | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                       | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                       | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // hide nav bar
                       | View.SYSTEM_UI_FLAG_FULLSCREEN // hide status bar
                       | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        udahBaca = (Button) findViewById(R.id.udahBaca);
        btn_bgA = (ImageView) findViewById(R.id.btn_bgA);
        btn_bgB = (ImageView) findViewById(R.id.btn_bgB);
        btn_bgKa = (ImageView) findViewById(R.id.btn_bgka);
        btn_bgKi = (ImageView) findViewById(R.id.btn_bgki);
        btn_tutup = (Button) findViewById(R.id.btn_tutup);

    }

    public void yes(View view){
        selesai_culture += 1;
        if(selesai_culture <11){
            Toast.makeText(this,"Selesai " +selesai_culture,Toast.LENGTH_SHORT).show();
            finish();
        }
    }

    public void balik(View view){
        finish();
    }

}
