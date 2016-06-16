package com.haoyue.app.happyreader.interactor.impl;

import android.content.Context;

import com.haoyue.app.happyreader.ui.fragment.AboutFragment;
import com.haoyue.app.happyreader.ui.fragment.HistoryFragment;
import com.haoyue.app.happyreader.ui.fragment.HotWxNewsContainerFragment;
import com.haoyue.app.happyreader.ui.fragment.NewsContainerFragment;
import com.haoyue.app.library.base.BaseLazyFragment;
import com.haoyue.app.happyreader.R;
import com.haoyue.app.happyreader.bean.NavigationEntity;
import com.haoyue.app.happyreader.interactor.HomeInteractor;
import com.haoyue.app.happyreader.ui.fragment.ImagesContainerFragment;
import com.haoyue.app.happyreader.ui.fragment.MusicsFragment;

import java.util.ArrayList;
import java.util.List;

public class HomeInteractorImpl implements HomeInteractor {

    @Override
    public List<BaseLazyFragment> getPagerFragments() {
        List<BaseLazyFragment> fragments = new ArrayList<>();
        fragments.add(new NewsContainerFragment());
        fragments.add(new HotWxNewsContainerFragment());
        fragments.add(new ImagesContainerFragment());
        fragments.add(new MusicsFragment());
        fragments.add(new HistoryFragment());
        fragments.add(new AboutFragment());

        return fragments;
    }

    @Override
    public List<NavigationEntity> getNavigationListData(Context context) {
        List<NavigationEntity> navigationEntities = new ArrayList<>();
        String[] navigationArrays = context.getResources().getStringArray(R.array.navigation_list);
        for (int i = 0; i < 6; i++) {
            navigationEntities.add(new NavigationEntity("", navigationArrays[i], R.drawable.ic_news));
        }
        return navigationEntities;
    }
}
