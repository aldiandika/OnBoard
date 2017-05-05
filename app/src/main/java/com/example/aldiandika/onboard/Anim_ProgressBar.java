package com.example.aldiandika.onboard;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ProgressBar;

/**
 * Created by Crew on 5/5/2017.
 */

public class Anim_ProgressBar extends Animation {

    private ProgressBar progressBar;
    private float from;
    private float  to;

    public Anim_ProgressBar(ProgressBar progressBar, float from, float to) {
        super();
        this.progressBar = progressBar;
        this.from = from;
        this.to = to;
    }

    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t) {
        super.applyTransformation(interpolatedTime, t);
        float value = from + (to - from) * interpolatedTime;
        progressBar.setProgress((int) value);
    }
}
