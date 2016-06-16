package com.haoyue.app.happyreader.ui.fragment;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;

import com.haoyue.app.happyreader.R;
import com.haoyue.app.happyreader.ui.activity.base.BaseFragment;
import com.haoyue.app.library.eventbus.EventCenter;
import com.haoyue.app.library.utils.AppInfoUtil;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * Created by joyo on 15/10/18.
 */
public class AboutFragment extends BaseFragment{

    @Bind(R.id.tvVersion)
    TextView tvVersion;


    /**
     * when fragment is visible for the first time, here we can do some initialized work or refresh data only once
     */
    @Override
    protected void onFirstUserVisible() {

    }

    /**
     * this method like the fragment's lifecycle method onResume()
     */
    @Override
    protected void onUserVisible() {

    }

    /**
     * this method like the fragment's lifecycle method onPause()
     */
    @Override
    protected void onUserInvisible() {

    }

    /**
     * get loading target view
     */
    @Override
    protected View getLoadingTargetView() {
        return null;
    }

    /**
     * init all views and add events
     */
    @Override
    protected void initViewsAndEvents() {
        tvVersion.setText(AppInfoUtil.getVersionName(mContext));
    }

    /**
     * bind layout resource file
     *
     * @return id of layout resource
     */
    @Override
    protected int getContentViewLayoutID() {
        return R.layout.fragment_about_us;
    }

    /**
     * when event comming
     *
     * @param eventCenter
     */
    @Override
    protected void onEventComming(EventCenter eventCenter) {

    }

    /**
     * is bind eventBus
     *
     * @return
     */
    @Override
    protected boolean isBindEventBusHere() {
        return false;
    }

    @OnClick({R.id.llAppName, R.id.llAppVersion,R.id.llSupport,R.id.llCooperate,R.id.about_us_pay})
    public void onClick(View v){
        switch (v.getId()){
            case R.id.about_us_pay:
            case R.id.llSupport:
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                Uri content_url = Uri.parse("https://qr.alipay.com/fku4z8n6hage0ksld3");
                intent.setData(content_url);
                startActivity(intent);
                break;
        }

    }
}
