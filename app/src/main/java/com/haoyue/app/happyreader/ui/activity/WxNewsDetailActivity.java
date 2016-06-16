package com.haoyue.app.happyreader.ui.activity;

import android.support.design.widget.FloatingActionButton;
import android.view.View;

import com.haoyue.app.happyreader.R;
import com.haoyue.app.library.utils.SystemUtil;
import com.haoyue.app.happyreader.ui.activity.base.BaseWebActivity;

import butterknife.Bind;

public class WxNewsDetailActivity extends BaseWebActivity {

    @Bind(R.id.fabShare)
    FloatingActionButton fabShare;

    /**
     * init all views and add events
     */
    @Override
    protected void initViewsAndEvents() {
        super.initViewsAndEvents();

        fabShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SystemUtil.shareMsg(WxNewsDetailActivity.this, "精彩随心悦", mWebTitle, mWebUrl, null);
            }
        });
        fabShare.setVisibility(View.GONE);

    }
}
