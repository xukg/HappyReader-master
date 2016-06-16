package com.haoyue.app.happyreader.presenter.impl;

import android.content.Context;

import com.haoyue.app.happyreader.interactor.HomeInteractor;
import com.haoyue.app.happyreader.interactor.impl.HomeInteractorImpl;
import com.haoyue.app.happyreader.presenter.Presenter;
import com.haoyue.app.happyreader.view.HomeView;

public class HomePresenterImpl implements Presenter {

    private Context mContext = null;
    private HomeView mHomeView = null;
    private HomeInteractor mHomeInteractor = null;

    public HomePresenterImpl(Context context, HomeView homeView) {
        if (null == homeView) {
            throw new IllegalArgumentException("Constructor's parameters must not be Null");
        }

        mContext = context;
        mHomeView = homeView;
        mHomeInteractor = new HomeInteractorImpl();
    }

    @Override
    public void initialized() {
        mHomeView.initializeViews(mHomeInteractor.getPagerFragments(), mHomeInteractor.getNavigationListData(mContext));
    }
}
