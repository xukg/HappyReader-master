package com.haoyue.app.happyreader.view;

import android.view.animation.Animation;

public interface SplashView {

    void animateBackgroundImage(Animation animation);

    void initializeViews(String versionName,String copyright,int backgroundResId);

    void initializeUmengConfig();

    void navigateToHomePage();
}
