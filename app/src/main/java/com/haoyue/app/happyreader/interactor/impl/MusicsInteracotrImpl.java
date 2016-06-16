package com.haoyue.app.happyreader.interactor.impl;

import com.haoyue.app.happyreader.bean.ResponseMusicsListentity;
import com.haoyue.app.happyreader.interactor.MusicsInteractor;
import com.haoyue.app.happyreader.listeners.BaseMultiLoadedListener;
import com.haoyue.app.happyreader.utils.ApiManager;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;


public class MusicsInteracotrImpl implements MusicsInteractor {

    private BaseMultiLoadedListener<ResponseMusicsListentity> loadedListener = null;

    public MusicsInteracotrImpl(BaseMultiLoadedListener<ResponseMusicsListentity> loadedListener) {
        this.loadedListener = loadedListener;
    }

    @Override
    public void getMusicListData(String requestTag, String keywords, final int event_tag) {
        ApiManager.getDoubanInstance().getMusicListData(keywords, "radio_desktop_win", "100", "", 0)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ResponseMusicsListentity>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        loadedListener.onException(e.getMessage());
                    }

                    @Override
                    public void onNext(ResponseMusicsListentity responseMusicsListentity) {
                        loadedListener.onSuccess(event_tag, responseMusicsListentity);
                    }
                });
    }
}
