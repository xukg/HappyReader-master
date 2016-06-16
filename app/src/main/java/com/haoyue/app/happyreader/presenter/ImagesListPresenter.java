package com.haoyue.app.happyreader.presenter;

import com.haoyue.app.happyreader.bean.ImagesListEntity;

public interface ImagesListPresenter {

    void loadListData(String requestTag, int event_tag, String keywords, int page, boolean isSwipeRefresh);

    void onItemClickListener(int position, ImagesListEntity entity, int x, int y, int width, int height);

}
