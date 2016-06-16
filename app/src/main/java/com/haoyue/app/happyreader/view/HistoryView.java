package com.haoyue.app.happyreader.view;

import com.haoyue.app.happyreader.bean.HistoryEntity;
import com.haoyue.app.happyreader.view.base.BaseView;

public interface HistoryView extends BaseView {

    void refreshListData(HistoryEntity response);

    void navigateToImagesDetail(int position, HistoryEntity.ShowapiResBodyEntity.ListEntity entity, int x, int y, int width, int height);
}
