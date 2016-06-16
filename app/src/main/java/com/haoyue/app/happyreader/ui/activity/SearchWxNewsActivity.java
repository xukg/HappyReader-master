package com.haoyue.app.happyreader.ui.activity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.SearchView;

import com.haoyue.app.happyreader.R;
import com.haoyue.app.happyreader.ui.activity.base.BaseSwipeBackActivity;
import com.haoyue.app.library.eventbus.EventCenter;
import com.haoyue.app.library.netstatus.NetUtils;

public class SearchWxNewsActivity extends BaseSwipeBackActivity implements SearchView.OnQueryTextListener{

//    @Bind(R.id.searchview)
//    SearchView searchview;

    @Override
    protected boolean isApplyKitKatTranslucency() {
        return true;
    }

    /**
     * get bundle data
     *
     * @param extras
     */
    @Override
    protected void getBundleExtras(Bundle extras) {

    }

    /**
     * bind layout resource file
     *
     * @return id of layout resource
     */
    @Override
    protected int getContentViewLayoutID() {
        return R.layout.activity_search_wx_news;
    }

    /**
     * when event comming
     *
     * @param eventCenter
     */
    @Override
    protected void onEventComming(EventCenter eventCenter) {

    }

    /**
     * get loading target view
     */
    @Override
    protected View getLoadingTargetView() {
        return null;
    }

    /**
     * init all views and add events
     */
    @Override
    protected void initViewsAndEvents() {
//        searchview.setIconifiedByDefault(false);
//        searchview.setOnQueryTextListener(this);
//        searchview.setSubmitButtonEnabled(true);

    }

    /**
     * network connected
     *
     * @param type
     */
    @Override
    protected void onNetworkConnected(NetUtils.NetType type) {

    }

    /**
     * network disconnected
     */
    @Override
    protected void onNetworkDisConnected() {

    }

    /**
     * is applyStatusBarTranslucency
     *
     * @return
     */
    @Override
    protected boolean isApplyStatusBarTranslucency() {
        return true;
    }

    /**
     * is bind eventBus
     *
     * @return
     */
    @Override
    protected boolean isBindEventBusHere() {
        return false;
    }

    /**
     * toggle overridePendingTransition
     *
     * @return
     */
    @Override
    protected boolean toggleOverridePendingTransition() {
        return false;
    }

    /**
     * get the overridePendingTransition mode
     */
    @Override
    protected TransitionMode getOverridePendingTransitionMode() {
        return null;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // TODO Auto-generated method stub
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.search_menu, menu);
        MenuItem search = menu.findItem(R.id.menu_search);
        SearchView searchView = (SearchView) search.getActionView();

        //是搜索框默认展开
        search.expandActionView();
        //显示搜索确认按钮
        if(searchView == null){
//            showToast("SearchView Fail to get Search View.");
            return true;
        }
        searchView.setSubmitButtonEnabled(true);
        searchView.setOnQueryTextListener(this);

        return super.onCreateOptionsMenu(menu);
    }

    // 单击搜索按钮时激发该方法
    @Override
    public boolean onQueryTextSubmit(String query) {
        // 实际应用中应该在该方法内执行实际查询
        // 此处仅使用Toast显示用户输入的查询内容
        showToast("您的选择是:" + query);
        return false;
    }

    /**
     * Called when the query text is changed by the user.
     *
     * @param newText the new content of the query text field.
     * @return false if the SearchView should perform the default action of showing any
     * suggestions if available, true if the action was handled by the listener.
     */
    @Override
    public boolean onQueryTextChange(String newText) {
        return false;
    }
}
