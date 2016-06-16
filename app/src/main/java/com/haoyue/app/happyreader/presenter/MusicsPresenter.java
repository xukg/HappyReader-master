package com.haoyue.app.happyreader.presenter;

import com.haoyue.app.happyreader.bean.MusicsListEntity;

public interface MusicsPresenter {

    void loadListData(String requestTag, String keywords, int event_tag);

    void onNextClick();

    void onPrevClick();

    void onStartPlay();

    void onPausePlay();

    void onRePlay();

    void seekTo(int position);

    void onStopPlay();

    void refreshPageInfo(MusicsListEntity entity, int totalDuration);

    void refreshProgress(int progress);

    void refreshSecondProgress(int progress);
}
