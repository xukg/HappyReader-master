package com.haoyue.app.happyreader.presenter.impl;

import android.content.Context;

import com.haoyue.app.happyreader.interactor.CommonContainerInteractor;
import com.haoyue.app.happyreader.interactor.impl.ImagesContainerInteractorImpl;
import com.haoyue.app.happyreader.presenter.Presenter;
import com.haoyue.app.happyreader.view.CommonContainerView;

public class ImagesContainerPresenterImpl implements Presenter {

    private Context mContext;
    private CommonContainerInteractor mCommonContainerInteractor;
    private CommonContainerView mCommonContainerView;

    public ImagesContainerPresenterImpl(Context context, CommonContainerView commonContainerView) {
        mContext = context;
        mCommonContainerView = commonContainerView;
        mCommonContainerInteractor = new ImagesContainerInteractorImpl();
    }

    @Override
    public void initialized() {
        mCommonContainerView.initializePagerViews(mCommonContainerInteractor.getCommonCategoryList(mContext));
    }
}
