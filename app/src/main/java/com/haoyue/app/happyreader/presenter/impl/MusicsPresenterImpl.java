package com.haoyue.app.happyreader.presenter.impl;

import android.content.Context;

import com.haoyue.app.happyreader.bean.MusicsListEntity;
import com.haoyue.app.happyreader.bean.ResponseMusicsListentity;
import com.haoyue.app.happyreader.common.Constants;
import com.haoyue.app.happyreader.interactor.MusicsInteractor;
import com.haoyue.app.happyreader.interactor.impl.MusicsInteracotrImpl;
import com.haoyue.app.happyreader.listeners.BaseMultiLoadedListener;
import com.haoyue.app.happyreader.presenter.MusicsPresenter;
import com.haoyue.app.happyreader.view.MusicsView;

public class MusicsPresenterImpl implements MusicsPresenter, BaseMultiLoadedListener<ResponseMusicsListentity> {

    private Context mContext = null;
    private MusicsView mMusicsView = null;
    private MusicsInteractor mMusicsInteractor = null;

    public MusicsPresenterImpl(Context context, MusicsView musicsView) {
        mContext = context;
        mMusicsView = musicsView;
        mMusicsInteractor = new MusicsInteracotrImpl(this);
    }

    @Override
    public void loadListData(String requestTag, String keywords, int event_tag) {
        mMusicsInteractor.getMusicListData(requestTag, keywords, event_tag);
    }

    @Override
    public void onNextClick() {
        mMusicsView.playNextMusic();
    }

    @Override
    public void onPrevClick() {
        mMusicsView.playPrevMusic();
    }

    @Override
    public void onStartPlay() {
        mMusicsView.startPlayMusic();
    }

    @Override
    public void onPausePlay() {
        mMusicsView.pausePlayMusic();
    }

    @Override
    public void onRePlay() {
        mMusicsView.rePlayMusic();
    }

    @Override
    public void seekTo(int position) {
        mMusicsView.seekToPosition(position);
    }

    @Override
    public void onStopPlay() {
        mMusicsView.stopPlayMusic();
    }

    @Override
    public void refreshPageInfo(MusicsListEntity entity, int totalDuration) {
        mMusicsView.refreshPageInfo(entity, totalDuration);
    }

    @Override
    public void refreshProgress(int progress) {
        mMusicsView.refreshPlayProgress(progress);
    }

    @Override
    public void refreshSecondProgress(int progress) {
        mMusicsView.refreshPlaySecondProgress(progress);
    }

    @Override
    public void onSuccess(int event_tag, ResponseMusicsListentity data) {
        if (event_tag == Constants.EVENT_REFRESH_DATA) {
            mMusicsView.refreshMusicsList(data);
        } else if (event_tag == Constants.EVENT_LOAD_MORE_DATA) {
            mMusicsView.addMoreMusicsList(data);
        }

    }

    @Override
    public void onError(String msg) {
        mMusicsView.showError(msg);
    }

    @Override
    public void onException(String msg) {
        mMusicsView.showError(msg);
    }
}
