package com.haoyue.app.happyreader.interactor.impl;

import android.content.Context;

import com.haoyue.app.happyreader.R;
import com.haoyue.app.happyreader.bean.BaseEntity;
import com.haoyue.app.happyreader.interactor.CommonContainerInteractor;

import java.util.ArrayList;
import java.util.List;

public class HotWxNewsContainerInteractorImpl implements CommonContainerInteractor {
    @Override
    public List<BaseEntity> getCommonCategoryList(Context context) {
        List<BaseEntity> resultData = new ArrayList<>();
        String[] imagesCategoryArrayId = context.getResources().getStringArray(R.array.wxnews_category_list_id);
        String[] imagesCategoryArrayName = context.getResources().getStringArray(R.array.wxnews_category_list_name);
        for (int i=0; i<20; i++){
            resultData.add(new BaseEntity(imagesCategoryArrayId[i], imagesCategoryArrayName[i]));
        }
        return resultData;
    }
}
