package com.haoyue.app.happyreader.interactor.impl;

import com.haoyue.app.happyreader.bean.HotNewsEntity;
import com.haoyue.app.happyreader.bean.HotWxNewsEntity;
import com.haoyue.app.happyreader.interactor.HotWxNewsListInteractor;
import com.haoyue.app.happyreader.interactor.NewsListInteractor;
import com.haoyue.app.happyreader.listeners.BaseMultiLoadedListener;
import com.haoyue.app.happyreader.utils.ApiManager;
import com.haoyue.app.happyreader.utils.Config;
import com.haoyue.app.happyreader.utils.Md5Util;
import com.haoyue.app.happyreader.utils.TimeUtil;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;

public class NewsListInteractorImpl implements NewsListInteractor {

    private BaseMultiLoadedListener<HotNewsEntity> loadedListener = null;

    public NewsListInteractorImpl(BaseMultiLoadedListener<HotNewsEntity> loadedListener) {
        this.loadedListener = loadedListener;
    }

    @Override
    public void getCommonListData(final String requestTag, final int event_tag, String channelId, int page) {

        String timestamp = TimeUtil.getCurrentTimeStr();
        StringBuffer signSb = new StringBuffer();
        signSb.append("channelId").append(channelId)
                .append("page").append(page)
                .append("showapi_appid").append(Config.API_ID)
                .append("showapi_timestamp").append(timestamp)
                .append(Config.API_SECRET);
        String showapi_sign = Md5Util.doMD5(signSb.toString());

        ApiManager.getInstance().getHotNews(channelId, "", page, Config.API_ID, timestamp, "", showapi_sign)
                .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(new Observer<HotNewsEntity>() {

                            @Override
                            public void onCompleted() {

                            }

                            @Override
                            public void onError(Throwable e) {
                                loadedListener.onException(e.getMessage());
                            }

                            @Override
                            public void onNext(HotNewsEntity hotWxNewsEntity) {
                                if (hotWxNewsEntity.getShowapi_res_code()==0){
                                    loadedListener.onSuccess(event_tag, hotWxNewsEntity);
                                }else {
                                    loadedListener.onError(hotWxNewsEntity.getShowapi_res_error());
                                }
                            }
                        });
    }

}
