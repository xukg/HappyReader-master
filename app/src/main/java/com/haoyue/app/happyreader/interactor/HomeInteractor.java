package com.haoyue.app.happyreader.interactor;

import android.content.Context;

import com.haoyue.app.library.base.BaseLazyFragment;
import com.haoyue.app.happyreader.bean.NavigationEntity;

import java.util.List;

public interface HomeInteractor {

    List<BaseLazyFragment> getPagerFragments();

    List<NavigationEntity> getNavigationListData(Context context);
}
