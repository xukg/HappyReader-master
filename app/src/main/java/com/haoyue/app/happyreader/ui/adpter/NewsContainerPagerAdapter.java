package com.haoyue.app.happyreader.ui.adpter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.haoyue.app.happyreader.bean.BaseEntity;
import com.haoyue.app.happyreader.ui.fragment.HotWxNewsListFragment;
import com.haoyue.app.happyreader.ui.fragment.NewsListFragment;

import java.util.List;

public class NewsContainerPagerAdapter extends FragmentPagerAdapter {

    private List<BaseEntity> mCategoryList = null;

    public NewsContainerPagerAdapter(FragmentManager fm, List<BaseEntity> categoryList) {
        super(fm);
        mCategoryList = categoryList;
    }

    @Override
    public Fragment getItem(int position) {
        return new NewsListFragment();
    }

    @Override
    public int getCount() {
        return null != mCategoryList ? mCategoryList.size() : 0;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return null != mCategoryList ? mCategoryList.get(position).getName() : null;
    }
}
