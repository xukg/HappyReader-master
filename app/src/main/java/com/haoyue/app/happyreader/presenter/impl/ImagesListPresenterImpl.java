package com.haoyue.app.happyreader.presenter.impl;

import android.content.Context;

import com.haoyue.app.happyreader.R;
import com.haoyue.app.happyreader.bean.ImagesListEntity;
import com.haoyue.app.happyreader.bean.ResponseImagesListEntity;
import com.haoyue.app.happyreader.common.Constants;
import com.haoyue.app.happyreader.interactor.CommonListInteractor;
import com.haoyue.app.happyreader.interactor.impl.ImagesListInteractorImpl;
import com.haoyue.app.happyreader.listeners.BaseMultiLoadedListener;
import com.haoyue.app.happyreader.presenter.ImagesListPresenter;
import com.haoyue.app.happyreader.view.ImagesListView;

public class ImagesListPresenterImpl implements ImagesListPresenter, BaseMultiLoadedListener<ResponseImagesListEntity> {

    private Context mContext = null;
    private ImagesListView mImagesListView = null;
    private CommonListInteractor mCommonListInteractor = null;

    public ImagesListPresenterImpl(Context context, ImagesListView imagesListView) {
        mContext = context;
        mImagesListView = imagesListView;
        mCommonListInteractor = new ImagesListInteractorImpl(this);
    }

    @Override
    public void onSuccess(int event_tag, ResponseImagesListEntity data) {
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
    public void loadListData(String requestTag, int event_tag, String keywords, int page, boolean isSwipeRefresh) {
        mImagesListView.hideLoading();
        if (!isSwipeRefresh) {
            mImagesListView.showLoading(mContext.getString(R.string.common_loading_message));
        }
        mCommonListInteractor.getCommonListData(requestTag, event_tag, keywords, page);
    }

    @Override
    public void onItemClickListener(int position, ImagesListEntity entity, int x, int y, int width, int height) {
        mImagesListView.navigateToImagesDetail(position, entity, x, y, width, height);
    }
}
