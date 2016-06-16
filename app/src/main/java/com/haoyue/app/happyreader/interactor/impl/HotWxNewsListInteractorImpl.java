package com.haoyue.app.happyreader.interactor.impl;

import com.haoyue.app.happyreader.bean.HotWxNewsEntity;
import com.haoyue.app.happyreader.interactor.HotWxNewsListInteractor;
import com.haoyue.app.happyreader.listeners.BaseMultiLoadedListener;
import com.haoyue.app.happyreader.utils.ApiManager;
import com.haoyue.app.happyreader.utils.Config;
import com.haoyue.app.happyreader.utils.Md5Util;
import com.haoyue.app.happyreader.utils.TimeUtil;
import com.haoyue.app.happyreader.view.CommonContainerView;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;
import rx.Observer;
import rx.Scheduler;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class HotWxNewsListInteractorImpl implements HotWxNewsListInteractor {

    private BaseMultiLoadedListener<HotWxNewsEntity> loadedListener = null;

    public HotWxNewsListInteractorImpl(BaseMultiLoadedListener<HotWxNewsEntity> loadedListener) {
        this.loadedListener = loadedListener;
    }

    @Override
    public void getCommonListData(final String requestTag, final int event_tag, String typeId, int page) {
        String timestamp = TimeUtil.getCurrentTimeStr();
        StringBuffer signSb = new StringBuffer();
        signSb.append("page").append(page)
                .append("showapi_appid").append(Config.API_ID)
                .append("showapi_timestamp").append(timestamp)
                .append("typeId").append(typeId)
                .append(Config.API_SECRET);
        String showapi_sign = Md5Util.doMD5(signSb.toString());

        ApiManager.getInstance().getHotWXData("", page, Config.API_ID, timestamp, typeId, showapi_sign)
                .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(new Observer<HotWxNewsEntity>() {

                            @Override
                            public void onCompleted() {

                            }

                            @Override
                            public void onError(Throwable e) {
                                loadedListener.onException(e.getMessage());
                            }

                            @Override
                            public void onNext(HotWxNewsEntity hotWxNewsEntity) {
                                if (hotWxNewsEntity.getShowapi_res_code()==0){
                                    loadedListener.onSuccess(event_tag, hotWxNewsEntity);
                                }else {
                                    loadedListener.onError(hotWxNewsEntity.getShowapi_res_error());
                                }
                            }
                        });
    }

}
