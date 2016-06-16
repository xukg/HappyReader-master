package com.haoyue.app.happyreader.ui.fragment;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.haoyue.app.happyreader.R;
import com.haoyue.app.happyreader.bean.BaseEntity;
import com.haoyue.app.happyreader.presenter.Presenter;
import com.haoyue.app.happyreader.presenter.impl.NewsContainerPresenterImpl;
import com.haoyue.app.happyreader.ui.activity.base.BaseFragment;
import com.haoyue.app.happyreader.ui.adpter.NewsContainerPagerAdapter;
import com.haoyue.app.happyreader.view.CommonContainerView;
import com.haoyue.app.library.eventbus.EventCenter;
import com.haoyue.app.library.widgets.XViewPager;

import java.util.List;

import butterknife.Bind;

public class NewsContainerFragment extends BaseFragment implements CommonContainerView {


    @Bind(R.id.fragment_news_pager)
    XViewPager mViewPager;

    @Bind(R.id.sliding_tabs)
    TabLayout tabLayout;

    private Presenter mImagesContainerPresenter = null;

    @Override
    protected void onFirstUserVisible() {
        mImagesContainerPresenter = new NewsContainerPresenterImpl(mContext, this);
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

    }

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.fragment_news;
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
        if (null != categoryList && !categoryList.isEmpty()) {
            for (BaseEntity item : categoryList) {
                tabLayout.addTab(tabLayout.newTab().setText(item.getName()));
            }
            mViewPager.setOffscreenPageLimit(categoryList.size());
            mViewPager.setAdapter(new NewsContainerPagerAdapter(getSupportFragmentManager(), categoryList));
            tabLayout.setupWithViewPager(mViewPager);

            mViewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

                @Override
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                }

                @Override
                public void onPageSelected(int position) {
                    NewsListFragment fragment = (NewsListFragment) mViewPager.getAdapter().instantiateItem(mViewPager, position);
                    fragment.onPageSelected(position, categoryList.get(position).getId());
                }

                @Override
                public void onPageScrollStateChanged(int state) {

                }
            });
        }
    }
}
