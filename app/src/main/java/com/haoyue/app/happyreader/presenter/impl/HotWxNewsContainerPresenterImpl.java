package com.haoyue.app.happyreader.presenter.impl;

import android.content.Context;

import com.haoyue.app.happyreader.interactor.CommonContainerInteractor;
import com.haoyue.app.happyreader.interactor.impl.HotWxNewsContainerInteractorImpl;
import com.haoyue.app.happyreader.presenter.Presenter;
import com.haoyue.app.happyreader.view.CommonContainerView;

public class HotWxNewsContainerPresenterImpl implements Presenter {

    private Context mContext;
    private CommonContainerInteractor mCommonContainerInteractor;
    private CommonContainerView mCommonContainerView;

    public HotWxNewsContainerPresenterImpl(Context context, CommonContainerView commonContainerView) {
        mContext = context;
        mCommonContainerView = commonContainerView;
        mCommonContainerInteractor = new HotWxNewsContainerInteractorImpl();
    }

    @Override
    public void initialized() {
        mCommonContainerView.initializePagerViews(mCommonContainerInteractor.getCommonCategoryList(mContext));
    }
}
