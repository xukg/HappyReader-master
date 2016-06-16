package com.haoyue.app.happyreader.ui.activity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;

import com.github.amlcurran.showcaseview.ShowcaseView;
import com.github.amlcurran.showcaseview.targets.Target;
import com.haoyue.app.happyreader.R;
import com.haoyue.app.happyreader.bean.NavigationEntity;
import com.haoyue.app.happyreader.presenter.Presenter;
import com.haoyue.app.happyreader.presenter.impl.HomePresenterImpl;
import com.haoyue.app.happyreader.ui.activity.base.BaseActivity;
import com.haoyue.app.happyreader.ui.adpter.VPFragmentAdapter;
import com.haoyue.app.happyreader.view.HomeView;
import com.haoyue.app.library.base.BaseLazyFragment;
import com.haoyue.app.library.eventbus.EventCenter;
import com.haoyue.app.library.netstatus.NetUtils;
import com.haoyue.app.library.utils.SharedPreferencesUtil;
import com.haoyue.app.library.widgets.XViewPager;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity implements HomeView {

    private static long DOUBLE_CLICK_TIME = 0L;

    @Bind(R.id.home_container)
    XViewPager mViewPager;

    @Bind(R.id.navigation_view)
    NavigationView mNavigationView;

    @Bind(R.id.home_drawer)
    DrawerLayout mDrawerLayout;

    private int mCurrentMenuCheckedPos = 0;
    private ActionBarDrawerToggle mActionBarDrawerToggle = null;

    private Presenter mHomePresenter = null;

    protected SharedPreferencesUtil spUtil;

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.activity_home;
    }

    @Override
    protected void onEventComming(EventCenter eventCenter) {

    }

    @Override
    protected View getLoadingTargetView() {
        return ButterKnife.findById(this, R.id.home_container);
    }

    @Override
    protected void initViewsAndEvents() {
        mHomePresenter = new HomePresenterImpl(this, this);
        mHomePresenter.initialized();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                spUtil = new SharedPreferencesUtil(MainActivity.this);
                showCaseView();
            }
        }, 5000);
    }

    @Override
    public void initializeViews(final List<BaseLazyFragment> fragments, final List<NavigationEntity> navigationList) {
        mActionBarDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, mToolbar, R.string.drawer_open, R.string.drawer_close) {

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                setTitle(getString(R.string.app_name));
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
                setTitle(navigationList.get(mCurrentMenuCheckedPos).getName());
            }
        };

        mActionBarDrawerToggle.setDrawerIndicatorEnabled(true);
        mDrawerLayout.setDrawerListener(mActionBarDrawerToggle);
        setupDrawerContent(mNavigationView);
        mNavigationView.getMenu().getItem(0).setChecked(true);

        if (null != fragments && !fragments.isEmpty()) {
            mViewPager.setEnableScroll(false);
            mViewPager.setOffscreenPageLimit(fragments.size());
            mViewPager.setAdapter(new VPFragmentAdapter(getSupportFragmentManager(), fragments));
        }

        setTitle(navigationList.get(mCurrentMenuCheckedPos).getName());
    }

    private void setupDrawerContent(NavigationView navigationView) {
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        int position = 0;
                        switch (menuItem.getItemId()) {
                            case R.id.navigation_news:
                                position = 0;
                                break;
                            case R.id.navigation_wechats:
                                position = 1;
                                break;
                            case R.id.navigation_image:
                                position = 2;
                                break;
                            case R.id.navigation_music:
                                position = 3;
                                break;
                            case R.id.navigation_history:
                                position = 4;
                                break;
                            case R.id.navigation_about:
                                position = 5;
                                break;
                        }
                        mCurrentMenuCheckedPos = position;
                        menuItem.setChecked(true);
                        mDrawerLayout.closeDrawer(Gravity.LEFT);
                        mViewPager.setCurrentItem(mCurrentMenuCheckedPos, false);
                        return true;
                    }
                });
    }

    @Override
    protected void onNetworkConnected(NetUtils.NetType type) {

    }

    @Override
    protected void onNetworkDisConnected() {

    }

    @Override
    protected boolean isApplyStatusBarTranslucency() {
        return true;
    }

    @Override
    protected boolean isBindEventBusHere() {
        return false;
    }

    @Override
    protected boolean toggleOverridePendingTransition() {
        return false;
    }

    @Override
    protected TransitionMode getOverridePendingTransitionMode() {
        return null;
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        if (mActionBarDrawerToggle != null) {
            mActionBarDrawerToggle.syncState();
        }
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (mActionBarDrawerToggle != null) {
            mActionBarDrawerToggle.onConfigurationChanged(newConfig);
        }
    }

    @Override
    protected void getBundleExtras(Bundle extras) {

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (event.getKeyCode() == KeyEvent.KEYCODE_MENU) {
            if (mDrawerLayout.isDrawerOpen(Gravity.LEFT)) {
                mDrawerLayout.closeDrawer(Gravity.LEFT);
            } else {
                mDrawerLayout.openDrawer(Gravity.LEFT);
            }
            return true;
        } else if (event.getKeyCode() == KeyEvent.KEYCODE_BACK) {
            if (mDrawerLayout.isDrawerOpen(Gravity.LEFT)) {
                mDrawerLayout.closeDrawer(Gravity.LEFT);
            } else {
                if ((System.currentTimeMillis() - DOUBLE_CLICK_TIME) > 2000) {
                    showToast(getString(R.string.double_click_exit));
                    DOUBLE_CLICK_TIME = System.currentTimeMillis();
                } else {
                    getBaseApplication().exitApp();
                }
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    protected boolean isApplyKitKatTranslucency() {
        return true;
    }

    private void showCaseView() {
        boolean hasShowCaseView = spUtil.getValue("mainCaseView", false);
        if (!hasShowCaseView) {
            View view = LayoutInflater.from(this).inflate(R.layout.main_show_case_view, null);
            ShowcaseView showcaseView = new ShowcaseView.Builder(this).setStyle(R.style.show_case_view_sytle).hideOnTouchOutside().build();
            showcaseView.showButton();
            showcaseView.setTag(Target.NONE);
            showcaseView.setHideOnTouchOutside(false);
            showcaseView.addView(view);
            spUtil.setValue("mainCaseView", true);
        }
    }

}
