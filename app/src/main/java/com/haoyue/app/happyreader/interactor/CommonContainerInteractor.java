package com.haoyue.app.happyreader.interactor;

import android.content.Context;

import com.haoyue.app.happyreader.bean.BaseEntity;

import java.util.List;

public interface CommonContainerInteractor {

    List<BaseEntity> getCommonCategoryList(Context context);
}
