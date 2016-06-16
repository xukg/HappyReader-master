package com.haoyue.app.happyreader.presenter;

import com.haoyue.app.happyreader.bean.HistoryEntity;

public interface HistoryPresenter {

    void loadListData(String requestTag, int event_tag, String date, boolean isSwipeRefresh);

    void onItemClickListener(int position, HistoryEntity.ShowapiResBodyEntity.ListEntity entity, int x, int y, int width, int height);

}
