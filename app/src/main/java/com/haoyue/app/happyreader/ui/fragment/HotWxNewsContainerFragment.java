package com.haoyue.app.happyreader.ui.fragment;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.animation.OvershootInterpolator;

import com.haoyue.app.happyreader.R;
import com.haoyue.app.happyreader.bean.BaseEntity;
import com.haoyue.app.happyreader.presenter.Presenter;
import com.haoyue.app.happyreader.presenter.impl.HotWxNewsContainerPresenterImpl;
import com.haoyue.app.happyreader.ui.activity.SearchWxNewsActivity;
import com.haoyue.app.happyreader.ui.activity.base.BaseFragment;
import com.haoyue.app.happyreader.ui.adpter.HotWxNewsContainerPagerAdapter;
import com.haoyue.app.happyreader.view.CommonContainerView;
import com.haoyue.app.library.eventbus.EventCenter;
import com.haoyue.app.library.widgets.XViewPager;

import java.util.List;

import butterknife.Bind;

public class HotWxNewsContainerFragment extends BaseFragment implements CommonContainerView {


    @Bind(R.id.fragment_wx_news_pager)
    XViewPager mViewPager;

    @Bind(R.id.fabButton)
    FloatingActionButton fabButton;

    @Bind(R.id.sliding_tabs)
    TabLayout tabLayout;

    private static final int ANIM_DURATION_FAB = 400;

    private Presenter mImagesContainerPresenter = null;

    @Override
    protected void onFirstUserVisible() {
        mImagesContainerPresenter = new HotWxNewsContainerPresenterImpl(mContext, this);
        mImagesContainerPresenter.initialized();
    }

    @Override
    protected void onUserVisible() {

    }

    @Override
    protected void onUserInvisible() {

    }

    @Override
    protected View getLoadingTargetView() {
        return null;
    }

    @Override
    protected void initViewsAndEvents() {
        fabButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                readyGo(SearchWxNewsActivity.class);
            }
        });
    }

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.fragment_wx_news;
    }

    @Override
    protected void onEventComming(EventCenter eventCenter) {

    }

    @Override
    protected boolean isBindEventBusHere() {
        return false;
    }

    @Override
    public void initializePagerViews(final List<BaseEntity> categoryList) {

        startFABAnimation();

        if (null != categoryList && !categoryList.isEmpty()) {
            for (BaseEntity item : categoryList) {
                tabLayout.addTab(tabLayout.newTab().setText(item.getName()));
            }
            mViewPager.setOffscreenPageLimit(categoryList.size());
            mViewPager.setAdapter(new HotWxNewsContainerPagerAdapter(getSupportFragmentManager(), categoryList));
            tabLayout.setupWithViewPager(mViewPager);
            mViewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                @Override
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                    HotWxNewsListFragment fragment = (HotWxNewsListFragment) mViewPager.getAdapter().instantiateItem(mViewPager, position);
                    fragment.onPageSelected(position, categoryList.get(position).getId());
                }

                @Override
                public void onPageSelected(int position) {

                }

                @Override
                public void onPageScrollStateChanged(int state) {

                }
            });
        }
    }

    private void startFABAnimation() {
        fabButton.animate()
                .translationY(0)
                .setInterpolator(new OvershootInterpolator(1.f))
                .setStartDelay(500)
                .setDuration(ANIM_DURATION_FAB)
                .start();
    }
}
