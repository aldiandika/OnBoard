package com.example.aldiandika.onboard;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ProgressBar;
import android.widget.TabHost;
import android.widget.TabWidget;

public class MainActivity extends FragmentActivity {

    ProgressBar progAtas;
    FragmentTabHost tabhost;
    ViewPager pager;
    SectionPageAdapter secPage;
    View decorView;

//    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        setContentView(R.layout.immersive_activity);


        decorView = getWindow().getDecorView();
        progAtas = (ProgressBar) findViewById(R.id.progAtas);
        progAtas.getProgressDrawable().setColorFilter(
                Color.RED, android.graphics.PorterDuff.Mode.SRC_IN);
        //        progAtas.setProgressTintList(ColorStateList.valueOf(Color.RED));
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        tabhost = (FragmentTabHost) findViewById(R.id.tabhost);
        tabhost.setup(this, getSupportFragmentManager(), android.R.id.tabcontent);

        tabhost.addTab(
                tabhost.newTabSpec("home").setIndicator(null,getResources().getDrawable(R.drawable.tab_home)),
                HomeFragment.class, null);
        tabhost.addTab(
                tabhost.newTabSpec("Timeline").setIndicator(null, getResources().getDrawable(R.drawable.tab_time)),
                TimeFragment.class, null);
        tabhost.addTab(
                tabhost.newTabSpec("Achievement").setIndicator(null, getResources().getDrawable(R.drawable.tab_achiev)),
                AchievFragment.class, null);
        tabhost.addTab(
                tabhost.newTabSpec("Profile").setIndicator(null,getResources().getDrawable(R.drawable.tab_profile)),
                ProfFragment.class, null);
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        secPage = new SectionPageAdapter(getSupportFragmentManager());
        pager = (ViewPager) findViewById(R.id.pager);
        setupViewPager(pager);

        pager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                tabhost.setCurrentTab(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        tabhost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                pager.setCurrentItem(tabhost.getCurrentTab());
            }
        });


    }


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


    private void setupViewPager(ViewPager pager){
        SectionPageAdapter adapter = new SectionPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new HomeFragment(),tabhost.getCurrentTabTag());
        adapter.addFragment(new TimeFragment(),tabhost.getCurrentTabTag());
        adapter.addFragment(new AchievFragment(),tabhost.getCurrentTabTag());
        adapter.addFragment(new ProfFragment(),tabhost.getCurrentTabTag());
        pager.setAdapter(adapter);
    }


}

//Update

//    private void initializeHorizontalTabs() {
//        LinearLayout ll = (LinearLayout) tabWidget.getParent();
//        horizontalScrollView = new HorizontalScrollView(this);
//        horizontalScrollView.setLayoutParams(new FrameLayout.LayoutParams(
//                FrameLayout.LayoutParams.MATCH_PARENT,
//                FrameLayout.LayoutParams.WRAP_CONTENT));
//        ll.addView(horizontalScrollView, 0);
//        ll.removeView(tabWidget);
//        horizontalScrollView.addView(tabWidget);
//        horizontalScrollView.setHorizontalScrollBarEnabled(false);
//    }

//    private void scrollToCurrentTab() {
//        final int screenWidth = getWindowManager().getDefaultDisplay().getWidth();
//        final int leftX = tabs.getChildAt(tabhost.getCurrentTab()).getLeft();
//        int newX = 0;
//
//        newX = leftX + (tabs.getChildAt(tabhost.getCurrentTab()).getWidth() / 2) - (screenWidth / 2);
//        if (newX < 0) {
//            newX = 0;
//        }
//        horizontalScrollView.scrollTo(newX, 0);
//    }
