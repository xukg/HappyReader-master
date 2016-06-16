package com.haoyue.app.happyreader.ui.fragment;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

import com.haoyue.app.happyreader.R;
import com.haoyue.app.happyreader.api.ApiConstants;
import com.haoyue.app.happyreader.bean.HotWxNewsEntity;
import com.haoyue.app.happyreader.bean.HotWxNewsEntity.ShowapiResBodyEntity.PagebeanEntity.ContentlistEntity;
import com.haoyue.app.happyreader.common.Constants;
import com.haoyue.app.happyreader.common.OnCommonPageSelectedListener;
import com.haoyue.app.happyreader.presenter.HotWxNewxListPresenter;
import com.haoyue.app.happyreader.presenter.impl.HotWxNewsListPresenterImpl;
import com.haoyue.app.happyreader.ui.activity.WxNewsDetailActivity;
import com.haoyue.app.happyreader.ui.activity.base.BaseFragment;
import com.haoyue.app.happyreader.utils.UriHelper;
import com.haoyue.app.happyreader.view.HotWxNewsListView;
import com.haoyue.app.happyreader.widgets.LoadMoreListView;
import com.haoyue.app.library.adapter.ListViewDataAdapter;
import com.haoyue.app.library.adapter.ViewHolderBase;
import com.haoyue.app.library.adapter.ViewHolderCreator;
import com.haoyue.app.happyreader.ui.activity.base.BaseWebActivity;
import com.haoyue.app.library.eventbus.EventCenter;
import com.haoyue.app.library.netstatus.NetUtils;
import com.haoyue.app.library.pla.PLAImageView;
import com.haoyue.app.library.utils.CommonUtils;
import com.haoyue.app.library.widgets.XSwipeRefreshLayout;
import com.nostra13.universalimageloader.core.ImageLoader;

import butterknife.Bind;
import butterknife.ButterKnife;

public class HotWxNewsListFragment extends BaseFragment implements OnCommonPageSelectedListener,
        HotWxNewsListView, SwipeRefreshLayout.OnRefreshListener, LoadMoreListView.OnLoadMoreListener, LoadMoreListView.OnItemClickListener {

    @Bind(R.id.fragment_news_list_swipe_layout)
    XSwipeRefreshLayout mSwipeRefreshLayout;

    @Bind(R.id.fragment_news_list_list_view)
    LoadMoreListView mListView;

    private static  final String[] arrayId = {"0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19"};

    private static String mCurrentCategoryID = "0";

    /**
     * the page number
     */
    private int mCurrentPage = 1;

    private HotWxNewxListPresenter mNewsListPresenter = null;
    private ListViewDataAdapter<ContentlistEntity> mListViewAdapter = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCurrentCategoryID = arrayId[0];
    }

    @Override
    protected void onFirstUserVisible() {
        mCurrentPage = 1;
        mNewsListPresenter = new HotWxNewsListPresenterImpl(mContext, this);

        if (NetUtils.isNetworkConnected(mContext)) {
            if (null != mSwipeRefreshLayout) {
                mSwipeRefreshLayout.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mNewsListPresenter.loadListData(TAG_LOG, Constants.EVENT_REFRESH_DATA, mCurrentCategoryID,mCurrentPage, false);
                    }
                }, ApiConstants.Integers.PAGE_LAZY_LOAD_DELAY_TIME_MS);
            }
        } else {
            toggleNetworkError(true, new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mNewsListPresenter.loadListData(TAG_LOG, Constants.EVENT_REFRESH_DATA, mCurrentCategoryID,
                            mCurrentPage, false);
                }
            });
        }
    }

    @Override
    protected void onUserVisible() {

    }

    @Override
    protected void onUserInvisible() {

    }

    @Override
    protected View getLoadingTargetView() {
        return mSwipeRefreshLayout;
    }

    @Override
    protected void initViewsAndEvents() {
        mListViewAdapter = new ListViewDataAdapter<ContentlistEntity>(new ViewHolderCreator<ContentlistEntity>() {
            @Override
            public ViewHolderBase<ContentlistEntity> createViewHolder(int position) {
                return new ViewHolderBase<ContentlistEntity>() {

                    PLAImageView mItemImage;

                    TextView tvTime;

                    TextView tvTitle;

                    TextView tvDesc;

                    @Override
                    public View createView(LayoutInflater layoutInflater) {
                        View convertView = layoutInflater.inflate(R.layout.list_item_news_list, null);
                        mItemImage = ButterKnife.findById(convertView, R.id.list_item_images_list_image);
                        tvTime = ButterKnife.findById(convertView, R.id.tvTime);
                        tvTitle = ButterKnife.findById(convertView, R.id.tvTitle);
                        tvDesc = ButterKnife.findById(convertView, R.id.tvDesc);

                        return convertView;
                    }

                    @Override
                    public void showData(int position, ContentlistEntity itemData) {

                        String imageUrl = itemData.getContentImg();

                        if (!CommonUtils.isEmpty(imageUrl)) {
                            ImageLoader.getInstance().displayImage(imageUrl, mItemImage);
                        }
                        tvTime.setText(itemData.getDate());
                        tvTitle.setText(itemData.getUserName());
                        tvDesc.setText(itemData.getTitle());
                    }
                };
            }
        });

        mListView.setOnItemClickListener(this);
        mListView.setOnLoadMoreListener(this);
        mListView.setAdapter(mListViewAdapter);

        mSwipeRefreshLayout.setColorSchemeColors(
                getResources().getColor(R.color.gplus_color_1),
                getResources().getColor(R.color.gplus_color_2),
                getResources().getColor(R.color.gplus_color_3),
                getResources().getColor(R.color.gplus_color_4));
        mSwipeRefreshLayout.setOnRefreshListener(this);
    }

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.fragment_hotwx_news_list;
    }

    @Override
    protected void onEventComming(EventCenter eventCenter) {

    }

    /**
     * when current page checked
     *
     * @param position
     * @param keywords
     */
    @Override
    public void onPageSelected(int position, String keywords) {
        mCurrentCategoryID = arrayId[position];;
    }

    @Override
    protected boolean isBindEventBusHere() {
        return false;
    }

    @Override
    public void showError(String msg) {
        if (null != mSwipeRefreshLayout) {
            mSwipeRefreshLayout.setRefreshing(false);
        }
        toggleShowError(true, msg, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mNewsListPresenter.loadListData(TAG_LOG, Constants.EVENT_REFRESH_DATA, mCurrentCategoryID,
                        mCurrentPage, false);
            }
        });
    }

    @Override
    public void refreshListData(HotWxNewsEntity response) {
        if (null != mSwipeRefreshLayout) {
            mSwipeRefreshLayout.setRefreshing(false);
        }

        if (null != response) {
            if (null != mListViewAdapter) {
                mListViewAdapter.getDataList().clear();
                mListViewAdapter.getDataList().addAll(response.getShowapi_res_body().getPagebean().getContentlist());
                mListViewAdapter.notifyDataSetChanged();
            }

            if (null != mListView) {
                if (response.getShowapi_res_body().getPagebean().getAllPages() > mCurrentPage) {
                    mListView.setCanLoadMore(true);
                } else {
                    mListView.setCanLoadMore(false);
                }
            }
        }
    }

    @Override
    public void addMoreListData(HotWxNewsEntity response) {
        if (null != mListView) {
            mListView.onLoadMoreComplete();
        }

        if (null != response) {
            if (null != mListViewAdapter) {
                mListViewAdapter.getDataList().addAll(response.getShowapi_res_body().getPagebean().getContentlist());
                mListViewAdapter.notifyDataSetChanged();
            }

            if (null != mListView) {
                if (response.getShowapi_res_body().getPagebean().getAllPages() > mCurrentPage) {
                    mListView.setCanLoadMore(true);
                } else {
                    mListView.setCanLoadMore(false);
                }
            }
        }
    }

    @Override
    public void onRefresh() {
        mCurrentPage = 1;
        mNewsListPresenter.loadListData(TAG_LOG, Constants.EVENT_REFRESH_DATA, mCurrentCategoryID, mCurrentPage, true);
    }

    /**
     * Called when the list reaches the last item (the last item is visible
     * to the user)
     */
    @Override
    public void onLoadMore() {
        mCurrentPage++;
        mNewsListPresenter.loadListData(TAG_LOG, Constants.EVENT_LOAD_MORE_DATA, mCurrentCategoryID, mCurrentPage, true);
    }

    /**
     * Callback method to be invoked when an item in this AdapterView has
     * been clicked.
     * <p/>
     * Implementers can call getItemAtPosition(position) if they need
     * to access the data associated with the selected item.
     *
     * @param parent   The AdapterView where the click happened.
     * @param view     The view within the AdapterView that was clicked (this
     *                 will be a view provided by the adapter)
     * @param position The position of the view in the adapter.
     * @param id       The row id of the item that was clicked.
     */
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if (position>=mListViewAdapter.getDataList().size()){
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(BaseWebActivity.BUNDLE_KEY_TITLE, mListViewAdapter.getDataList().get(position).getTitle());
        bundle.putString(BaseWebActivity.BUNDLE_KEY_URL, mListViewAdapter.getDataList().get(position).getUrl());
        bundle.putBoolean(BaseWebActivity.BUNDLE_KEY_SHOW_BOTTOM_BAR, true);
        readyGo(WxNewsDetailActivity.class, bundle);

    }
}
