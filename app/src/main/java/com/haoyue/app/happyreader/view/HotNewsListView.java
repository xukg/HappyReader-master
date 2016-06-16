package com.haoyue.app.happyreader.view;

import com.haoyue.app.happyreader.bean.HotNewsEntity;
import com.haoyue.app.happyreader.bean.HotWxNewsEntity;
import com.haoyue.app.happyreader.view.base.BaseView;

public interface HotNewsListView extends BaseView {

    void refreshListData(HotNewsEntity response);

    void addMoreListData(HotNewsEntity response);

//    void navigateToImagesDetail(int position, ImagesListEntity entity, int x, int y, int width, int height);

}
