package com.haoyue.app.happyreader.presenter.impl;

import android.content.Context;

import com.haoyue.app.happyreader.R;
import com.haoyue.app.happyreader.bean.HistoryEntity;
import com.haoyue.app.happyreader.interactor.HistoryInteractor;
import com.haoyue.app.happyreader.interactor.impl.HistoryInteractorImpl;
import com.haoyue.app.happyreader.listeners.BaseSingleLoadedListener;
import com.haoyue.app.happyreader.presenter.HistoryPresenter;
import com.haoyue.app.happyreader.view.HistoryView;

/**
 * Created by joyo on 15/10/30.
 */
public class HistoryPresenterImpl implements HistoryPresenter, BaseSingleLoadedListener<HistoryEntity>{

    private Context mContext = null;
    private HistoryView historyView = null;
    private HistoryInteractor mHistoryInteractor;

    public HistoryPresenterImpl(Context context,HistoryView historyView){
        this.mContext = context;
        this.historyView = historyView;
        mHistoryInteractor = new HistoryInteractorImpl(this);

    }
    @Override
    public void loadListData(String requestTag, int event_tag, String date, boolean isSwipeRefresh) {
        historyView.hideLoading();
        if (!isSwipeRefresh) {
            historyView.showLoading(mContext.getString(R.string.common_loading_message));
        }
        mHistoryInteractor.getCommonListData(requestTag, date);
    }

    @Override
    public void onItemClickListener(int position, HistoryEntity.ShowapiResBodyEntity.ListEntity entity, int x, int y, int width, int height) {
        historyView.navigateToImagesDetail(position, entity, x, y, width, height);
    }

    /**
     * when data call back success
     *
     * @param data
     */
    @Override
    public void onSuccess(HistoryEntity data) {
        historyView.hideLoading();
        historyView.refreshListData(data);
    }

    /**
     * when data call back error
     *
     * @param msg
     */
    @Override
    public void onError(String msg) {
        historyView.hideLoading();
        historyView.showError(msg);
    }

    /**
     * when data call back occurred exception
     *
     * @param msg
     */
    @Override
    public void onException(String msg) {
        historyView.hideLoading();
        historyView.showError(msg);
    }
}
