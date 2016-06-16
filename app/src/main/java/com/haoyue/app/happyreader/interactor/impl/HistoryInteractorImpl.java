package com.haoyue.app.happyreader.interactor.impl;

import com.haoyue.app.happyreader.bean.HistoryEntity;
import com.haoyue.app.happyreader.interactor.HistoryInteractor;
import com.haoyue.app.happyreader.listeners.BaseSingleLoadedListener;
import com.haoyue.app.happyreader.utils.ApiManager;
import com.haoyue.app.happyreader.utils.Config;
import com.haoyue.app.happyreader.utils.Md5Util;
import com.haoyue.app.happyreader.utils.TimeUtil;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;

/**
 * Created by joyo on 15/10/30.
 */
public class HistoryInteractorImpl implements HistoryInteractor{

    private BaseSingleLoadedListener<HistoryEntity> loadedListener = null;

    public HistoryInteractorImpl(BaseSingleLoadedListener<HistoryEntity> loadedListener) {
        this.loadedListener = loadedListener;
    }

    @Override
    public void getCommonListData(String requestTag, String date) {
        String timestamp = TimeUtil.getCurrentTimeStr();
        StringBuffer signSb = new StringBuffer();
        signSb.append("date").append(date)
                .append("showapi_appid").append(Config.API_ID)
                .append("showapi_timestamp").append(timestamp)
                .append(Config.API_SECRET);
        String showapi_sign = Md5Util.doMD5(signSb.toString());

        ApiManager.getInstance().getHistoryToday(Config.API_ID, timestamp, date, showapi_sign)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<HistoryEntity>() {

                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        loadedListener.onException(e.getMessage());
                    }

                    @Override
                    public void onNext(HistoryEntity hotWxNewsEntity) {
                        if (hotWxNewsEntity.getShowapi_res_code()==0){
                            loadedListener.onSuccess(hotWxNewsEntity);
                        }else {
                            loadedListener.onError(hotWxNewsEntity.getShowapi_res_error());
                        }
                    }
                });
    }
}
