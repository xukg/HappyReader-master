package com.haoyue.app.happyreader.ui.activity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;

import com.haoyue.app.happyreader.R;
import com.haoyue.app.happyreader.presenter.Presenter;
import com.haoyue.app.happyreader.presenter.impl.SplashPresenterImpl;
import com.haoyue.app.happyreader.ui.activity.base.BaseActivity;
import com.haoyue.app.happyreader.view.SplashView;
import com.haoyue.app.library.eventbus.EventCenter;
import com.haoyue.app.library.netstatus.NetUtils;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.MobclickAgent;

import butterknife.Bind;

public class WelcomeActivity extends BaseActivity implements SplashView {

    @Bind(R.id.splash_image)
    ImageView mSplashImage;

    private Presenter mSplashPresenter = null;

    @Override
    protected void getBundleExtras(Bundle extras) {

    }

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.activity_splash;
    }

    @Override
    protected void onEventComming(EventCenter eventCenter) {

    }

    @Override
    protected View getLoadingTargetView() {
        return null;
    }

    @Override
    protected void initViewsAndEvents() {
        mSplashPresenter = new SplashPresenterImpl(this, this);
        mSplashPresenter.initialized();
    }

    @Override
    protected void onNetworkConnected(NetUtils.NetType type) {

    }

    @Override
    protected void onNetworkDisConnected() {

    }

    @Override
    protected boolean isApplyKitKatTranslucency() {
        return false;
    }

    @Override
    protected boolean isApplyStatusBarTranslucency() {
        return true;
    }

    @Override
    protected boolean isBindEventBusHere() {
        return false;
    }

    @Override
    protected boolean toggleOverridePendingTransition() {
        return false;
    }

    @Override
    protected TransitionMode getOverridePendingTransitionMode() {
        return null;
    }

    @Override
    public void animateBackgroundImage(Animation animation) {
        mSplashImage.startAnimation(animation);
    }

    @Override
    public void initializeViews(String versionName, String copyright, int backgroundResId) {
        mSplashImage.setImageResource(backgroundResId);
    }

    @Override
    public void initializeUmengConfig() {
//        AnalyticsConfig.ssetAppkey(this, "5625a298e0f55ab715002ffa");
//        AnalyticsConfig.setChannel("应用宝");
        MobclickAgent.UMAnalyticsConfig config = new MobclickAgent.UMAnalyticsConfig(this, "5625a298e0f55ab715002ffa", "应用宝");
        MobclickAgent.startWithConfigure(config);
    }

    @Override
    public void navigateToHomePage() {
        readyGoThenKill(MainActivity.class);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (event.getKeyCode() == KeyEvent.KEYCODE_BACK) {
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
