package com.haoyue.app.happyreader.interactor.impl;

import android.content.Context;

import com.haoyue.app.happyreader.R;
import com.haoyue.app.happyreader.bean.BaseEntity;
import com.haoyue.app.happyreader.interactor.CommonContainerInteractor;

import java.util.ArrayList;
import java.util.List;

public class ImagesContainerInteractorImpl implements CommonContainerInteractor {
    @Override
    public List<BaseEntity> getCommonCategoryList(Context context) {
        List<BaseEntity> resultData = new ArrayList<>();
        String[] imagesCategoryArrayId = context.getResources().getStringArray(R.array.images_category_list_id);
        String[] imagesCategoryArrayName = context.getResources().getStringArray(R.array.images_category_list_name);
        resultData.add(new BaseEntity(imagesCategoryArrayId[0], imagesCategoryArrayName[0]));
        resultData.add(new BaseEntity(imagesCategoryArrayId[1], imagesCategoryArrayName[1]));
        resultData.add(new BaseEntity(imagesCategoryArrayId[2], imagesCategoryArrayName[2]));
        resultData.add(new BaseEntity(imagesCategoryArrayId[3], imagesCategoryArrayName[3]));
        resultData.add(new BaseEntity(imagesCategoryArrayId[4], imagesCategoryArrayName[4]));
        resultData.add(new BaseEntity(imagesCategoryArrayId[5], imagesCategoryArrayName[5]));
        return resultData;
    }
}
