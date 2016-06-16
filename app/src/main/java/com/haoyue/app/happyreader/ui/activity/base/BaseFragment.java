package com.haoyue.app.happyreader.ui.activity.base;

import com.haoyue.app.library.base.BaseLazyFragment;
import com.haoyue.app.happyreader.view.base.BaseView;
import com.umeng.analytics.MobclickAgent;


public abstract class BaseFragment extends BaseLazyFragment implements BaseView {

    @Override
    public void onResume() {
        super.onResume();
        MobclickAgent.onPageStart(TAG_LOG);
    }

    @Override
    public void onPause() {
        super.onPause();
        MobclickAgent.onPageEnd(TAG_LOG);
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
}
