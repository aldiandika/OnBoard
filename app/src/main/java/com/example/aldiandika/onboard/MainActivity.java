package com.example.aldiandika.onboard;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class MainActivity extends FragmentActivity {

    ProgressBar progAtas;
    FragmentTabHost tabhost;

//    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progAtas = (ProgressBar) findViewById(R.id.progAtas);
        progAtas.getProgressDrawable().setColorFilter(
                Color.RED, android.graphics.PorterDuff.Mode.SRC_IN);

        tabhost = (FragmentTabHost) findViewById(R.id.tabhost);
        tabhost.setup(this, getSupportFragmentManager(), android.R.id.tabcontent);

        tabhost.addTab(
                tabhost.newTabSpec("home").setIndicator("Home", null),
                HomeFragment.class, null);
        tabhost.addTab(
                tabhost.newTabSpec("Timeline").setIndicator("Timeline", null),
                TimeFragment.class, null);

//        progAtas.setProgressTintList(ColorStateList.valueOf(Color.RED));


    }
}
