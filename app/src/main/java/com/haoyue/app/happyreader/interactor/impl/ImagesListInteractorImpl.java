package com.haoyue.app.happyreader.interactor.impl;

import com.haoyue.app.happyreader.bean.ResponseImagesListEntity;
import com.haoyue.app.happyreader.interactor.CommonListInteractor;
import com.haoyue.app.happyreader.listeners.BaseMultiLoadedListener;
import com.haoyue.app.happyreader.utils.ApiManager;
import com.haoyue.app.happyreader.utils.ApiManagerService;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;

public class ImagesListInteractorImpl implements CommonListInteractor {

    private BaseMultiLoadedListener<ResponseImagesListEntity> loadedListener = null;

    public ImagesListInteractorImpl(BaseMultiLoadedListener<ResponseImagesListEntity> loadedListener) {
        this.loadedListener = loadedListener;
    }

    @Override
    public void getCommonListData(final String requestTag, final int event_tag, String keywords, int page) {
        ApiManager.getImageInstance().getImageListData(keywords, "全部", page * ApiManagerService.PAGE_LIMIT,
                ApiManagerService.PAGE_LIMIT, 1).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ResponseImagesListEntity>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        loadedListener.onException(e.getMessage());
                    }

                    @Override
                    public void onNext(ResponseImagesListEntity responseImagesListEntity) {
                        loadedListener.onSuccess(event_tag, responseImagesListEntity);
                    }
                });
    }

}
