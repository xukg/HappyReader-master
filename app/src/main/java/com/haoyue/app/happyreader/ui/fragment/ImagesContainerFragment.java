package com.haoyue.app.happyreader.ui.fragment;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.haoyue.app.happyreader.R;
import com.haoyue.app.happyreader.bean.BaseEntity;
import com.haoyue.app.happyreader.presenter.Presenter;
import com.haoyue.app.happyreader.presenter.impl.ImagesContainerPresenterImpl;
import com.haoyue.app.happyreader.ui.activity.base.BaseFragment;
import com.haoyue.app.happyreader.ui.adpter.ImagesContainerPagerAdapter;
import com.haoyue.app.happyreader.view.CommonContainerView;
import com.haoyue.app.library.eventbus.EventCenter;
import com.haoyue.app.library.widgets.XViewPager;

import java.util.List;

import butterknife.Bind;

public class ImagesContainerFragment extends BaseFragment implements CommonContainerView {


    @Bind(R.id.viewPage)
    XViewPager mViewPager;

    @Bind(R.id.sliding_tabs)
    TabLayout tabLayout;

    private Presenter mImagesContainerPresenter = null;

    @Override
    protected void onFirstUserVisible() {
        mImagesContainerPresenter = new ImagesContainerPresenterImpl(mContext, this);
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
        return R.layout.fragment_images;
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
            mViewPager.setAdapter(new ImagesContainerPagerAdapter(getSupportFragmentManager(), categoryList));
            tabLayout.setupWithViewPager(mViewPager);

            mViewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                @Override
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                }

                @Override
                public void onPageSelected(int position) {
                    ImagesListFragment fragment = (ImagesListFragment) mViewPager.getAdapter().instantiateItem(mViewPager, position);
                    fragment.onPageSelected(position, categoryList.get(position).getId());
                }

                @Override
                public void onPageScrollStateChanged(int state) {

                }
            });
        }
    }
}
