package com.haoyue.app.happyreader.view;

import com.haoyue.app.happyreader.bean.HotWxNewsEntity;
import com.haoyue.app.happyreader.bean.ImagesListEntity;
import com.haoyue.app.happyreader.bean.ResponseImagesListEntity;
import com.haoyue.app.happyreader.view.base.BaseView;

public interface HotWxNewsListView extends BaseView {

    void refreshListData(HotWxNewsEntity response);

    void addMoreListData(HotWxNewsEntity response);

//    void navigateToImagesDetail(int position, ImagesListEntity entity, int x, int y, int width, int height);

}
