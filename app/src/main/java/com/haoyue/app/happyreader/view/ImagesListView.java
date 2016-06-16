package com.haoyue.app.happyreader.view;

import com.haoyue.app.happyreader.bean.ImagesListEntity;
import com.haoyue.app.happyreader.bean.ResponseImagesListEntity;
import com.haoyue.app.happyreader.view.base.BaseView;

public interface ImagesListView extends BaseView {

    void refreshListData(ResponseImagesListEntity responseImagesListEntity);

    void addMoreListData(ResponseImagesListEntity responseImagesListEntity);

    void navigateToImagesDetail(int position, ImagesListEntity entity, int x, int y, int width, int height);

}
