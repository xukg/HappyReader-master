package com.haoyue.app.happyreader.ui.activity.base;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;

import com.github.amlcurran.showcaseview.ShowcaseView;
import com.github.amlcurran.showcaseview.targets.Target;
import com.haoyue.app.library.base.BaseSwipeBackCompatActivity;
import com.haoyue.app.happyreader.R;
import com.haoyue.app.happyreader.HappyReaderApplication;
import com.haoyue.app.happyreader.view.base.BaseView;
import com.haoyue.app.library.utils.SharedPreferencesUtil;
import com.umeng.analytics.MobclickAgent;

import butterknife.ButterKnife;

public abstract class BaseSwipeBackActivity extends BaseSwipeBackCompatActivity implements BaseView {

    protected Toolbar mToolbar;

    protected SharedPreferencesUtil spUtil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (isApplyKitKatTranslucency()) {
            setSystemBarTintDrawable(getResources().getDrawable(R.drawable.sr_primary));
        }
        spUtil = new SharedPreferencesUtil(mContext);
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        mToolbar = ButterKnife.findById(this, R.id.common_toolbar);
        if (null != mToolbar) {
            setSupportActionBar(mToolbar);
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    private void showCaseView() {
        boolean hasShowCaseView = spUtil.getValue("hasShowCaseView", false);
        if (!hasShowCaseView) {
            View view = LayoutInflater.from(this).inflate(R.layout.show_case_view, null);
            ShowcaseView showcaseView = new ShowcaseView.Builder(this).setStyle(R.style.show_case_view_sytle).hideOnTouchOutside().build();
            showcaseView.showButton();
            showcaseView.setTag(Target.NONE);
            showcaseView.setHideOnTouchOutside(false);
            showcaseView.addView(view);
            spUtil.setValue("hasShowCaseView", true);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        MobclickAgent.onResume(this);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                spUtil = new SharedPreferencesUtil(mContext);
                showCaseView();
            }
        }, 3000);
    }

    @Override
    protected void onPause() {
        super.onPause();
        MobclickAgent.onPause(this);
    }

    protected HappyReaderApplication getBaseApplication() {
        return (HappyReaderApplication) getApplication();
    }


    @Override
    public void showError(String msg) {
        toggleShowError(true, msg, null);
    }

    @Override
    public void showException(String msg) {
        toggleShowError(true, msg, null);
    }

    @Override
    public void showNetError() {
        toggleNetworkError(true, null);
    }

    @Override
    public void showLoading(String msg) {
        toggleShowLoading(true, null);
    }

    @Override
    public void hideLoading() {
        toggleShowLoading(false, null);
    }

    protected abstract boolean isApplyKitKatTranslucency();
}
