package com.haoyue.app.happyreader.interactor;

public interface HotWxNewsListInteractor {

    void getCommonListData(String requestTag, final int event_tag, String typeId, int page);
}
