package com.haoyue.app.happyreader.presenter.impl;

import android.content.Context;

import com.haoyue.app.happyreader.R;
import com.haoyue.app.happyreader.bean.HotWxNewsEntity;
import com.haoyue.app.happyreader.bean.ImagesListEntity;
import com.haoyue.app.happyreader.common.Constants;
import com.haoyue.app.happyreader.interactor.HotWxNewsListInteractor;
import com.haoyue.app.happyreader.interactor.impl.HotWxNewsListInteractorImpl;
import com.haoyue.app.happyreader.listeners.BaseMultiLoadedListener;
import com.haoyue.app.happyreader.presenter.HotWxNewxListPresenter;
import com.haoyue.app.happyreader.view.HotWxNewsListView;

public class HotWxNewsListPresenterImpl implements HotWxNewxListPresenter, BaseMultiLoadedListener<HotWxNewsEntity> {

    private Context mContext = null;
    private HotWxNewsListView mImagesListView = null;
    private HotWxNewsListInteractor mCommonListInteractor = null;

    public HotWxNewsListPresenterImpl(Context context, HotWxNewsListView hotWxNewsListView) {
        mContext = context;
        mImagesListView = hotWxNewsListView;
        mCommonListInteractor = new HotWxNewsListInteractorImpl(this);
    }

    @Override
    public void onSuccess(int event_tag, HotWxNewsEntity data) {
        mImagesListView.hideLoading();
        if (event_tag == Constants.EVENT_REFRESH_DATA) {
            mImagesListView.refreshListData(data);
        } else if (event_tag == Constants.EVENT_LOAD_MORE_DATA) {
            mImagesListView.addMoreListData(data);
        }
    }

    @Override
    public void onError(String msg) {
        mImagesListView.hideLoading();
        mImagesListView.showError(msg);
    }

    @Override
    public void onException(String msg) {
        mImagesListView.hideLoading();
        mImagesListView.showError(msg);
    }

    @Override
    public void loadListData(String requestTag, int event_tag, String typeId, int page, boolean isSwipeRefresh) {
        mImagesListView.hideLoading();
        if (!isSwipeRefresh) {
            mImagesListView.showLoading(mContext.getString(R.string.common_loading_message));
        }
        mCommonListInteractor.getCommonListData(requestTag, event_tag, typeId, page);
    }

//    @Override
//    public void onItemClickListener(int position, ImagesListEntity entity, int x, int y, int width, int height) {
////        mImagesListView.navigateToImagesDetail(position, entity, x, y, width, height);
//    }
}
