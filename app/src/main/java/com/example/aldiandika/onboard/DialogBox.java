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
    public static int  udah_questC;
    public static int  udah_questA;
    public static int  udah_questB;
    public  String selese_questA;
    public String selese_questB;
    public String selese_questC;

    public int criPos;

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
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter();
        criPos = recyclerAdapter.posisi;

        if(criPos == 0){
            if(udah_questA<2){
                udah_questA +=1;
                selese_questA = String.valueOf(udah_questA);
                Toast.makeText(this,"Quest1 selesai " +udah_questA,Toast.LENGTH_SHORT).show();
            }
        }
        else if (criPos == 1){
            if(udah_questB<2){
                udah_questB +=1;
                selese_questA = String.valueOf(udah_questB);
                Toast.makeText(this,"Quest2 selesai " +udah_questB,Toast.LENGTH_SHORT).show();
            }

        }
        if(criPos == 2){
            if(udah_questC<2){
                udah_questC +=1;

                Toast.makeText(this,"Quest3 selesai " +udah_questC,Toast.LENGTH_SHORT).show();
            }
            selese_questA = "2";
        }

        selesai_culture += 1;

//        if(selesai_culture <11){
//            Toast.makeText(this,"Selesai " +udah_quest,Toast.LENGTH_SHORT).show();
            finish();
//        }
    }

    public void balik(View view){
        finish();
    }

}
