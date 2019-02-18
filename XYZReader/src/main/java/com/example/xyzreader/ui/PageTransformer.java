package com.example.xyzreader.ui;

import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.example.xyzreader.R;

public class PageTransformer implements ViewPager.PageTransformer {

    @Override
    public void transformPage(@NonNull View view, float position) {
        View articleImageView = view.findViewById(R.id.photo);
        int pageWidth = view.getWidth();

        if (position < -1) {
            // page is way off-screen to the left
            view.setAlpha(1);
        } else if (position <= 1) {
            articleImageView.setTranslationX(-position * (pageWidth / 2));
        } else {
            // the page is way off-screen to the right
            view.setAlpha(1);
        }
    }
}