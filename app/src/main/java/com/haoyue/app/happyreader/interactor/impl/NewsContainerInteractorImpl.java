package com.haoyue.app.happyreader.interactor.impl;

import android.content.Context;

import com.haoyue.app.happyreader.R;
import com.haoyue.app.happyreader.bean.BaseEntity;
import com.haoyue.app.happyreader.interactor.CommonContainerInteractor;

import java.util.ArrayList;
import java.util.List;

public class NewsContainerInteractorImpl implements CommonContainerInteractor {
    @Override
    public List<BaseEntity> getCommonCategoryList(Context context) {
        List<BaseEntity> resultData = new ArrayList<>();
        String[] categoryArrayId = context.getResources().getStringArray(R.array.news_channel_id);
        String[] categoryArrayName = context.getResources().getStringArray(R.array.news_channel_name);
        for (int i=0; i<14; i++){
            resultData.add(new BaseEntity(categoryArrayId[i], categoryArrayName[i]));
        }
        return resultData;
    }
}
