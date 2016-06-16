package com.haoyue.app.happyreader.presenter.impl;

import android.content.Context;

import com.haoyue.app.happyreader.R;
import com.haoyue.app.happyreader.bean.HotNewsEntity;
import com.haoyue.app.happyreader.common.Constants;
import com.haoyue.app.happyreader.interactor.NewsListInteractor;
import com.haoyue.app.happyreader.interactor.impl.NewsListInteractorImpl;
import com.haoyue.app.happyreader.listeners.BaseMultiLoadedListener;
import com.haoyue.app.happyreader.presenter.NewxListPresenter;
import com.haoyue.app.happyreader.view.HotNewsListView;

public class NewsListPresenterImpl implements NewxListPresenter, BaseMultiLoadedListener<HotNewsEntity> {

    private Context mContext = null;
    private HotNewsListView mImagesListView = null;
    private NewsListInteractor mCommonListInteractor = null;

    public NewsListPresenterImpl(Context context, HotNewsListView hotNewsListView) {
        mContext = context;
        mImagesListView = hotNewsListView;
        mCommonListInteractor = new NewsListInteractorImpl(this);
    }

    @Override
    public void onSuccess(int event_tag, HotNewsEntity data) {
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
