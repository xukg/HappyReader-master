package com.haoyue.app.happyreader.view;

import com.haoyue.app.library.base.BaseLazyFragment;
import com.haoyue.app.happyreader.bean.NavigationEntity;

import java.util.List;

public interface HomeView {

    void initializeViews(List<BaseLazyFragment> fragments, List<NavigationEntity> navigationList);

}
