package com.haoyue.app.happyreader.ui.fragment;

import android.graphics.Color;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import com.haoyue.app.happyreader.R;
import com.haoyue.app.happyreader.api.ApiConstants;
import com.haoyue.app.happyreader.bean.HistoryEntity;
import com.haoyue.app.happyreader.bean.HotNewsEntity;
import com.haoyue.app.happyreader.common.Constants;
import com.haoyue.app.happyreader.presenter.HistoryPresenter;
import com.haoyue.app.happyreader.presenter.impl.HistoryPresenterImpl;
import com.haoyue.app.happyreader.ui.activity.ImagesDetailActivity;
import com.haoyue.app.happyreader.ui.activity.base.BaseFragment;
import com.haoyue.app.happyreader.utils.TimeUtil;
import com.haoyue.app.happyreader.view.HistoryView;
import com.haoyue.app.happyreader.widgets.LoadMoreListView;
import com.haoyue.app.library.adapter.ListViewDataAdapter;
import com.haoyue.app.library.adapter.ViewHolderBase;
import com.haoyue.app.library.adapter.ViewHolderCreator;
import com.haoyue.app.library.eventbus.EventCenter;
import com.haoyue.app.library.netstatus.NetUtils;
import com.haoyue.app.library.utils.CommonUtils;
import com.haoyue.app.library.widgets.XSwipeRefreshLayout;
import com.nostra13.universalimageloader.core.ImageLoader;

import butterknife.Bind;
import butterknife.ButterKnife;

public class HistoryFragment extends BaseFragment implements HistoryView, SwipeRefreshLayout.OnRefreshListener{

    @Bind(R.id.history_list_swipe_layout)
    XSwipeRefreshLayout mSwipeRefreshLayout;

    @Bind(R.id.history_list_list_view)
    LoadMoreListView mListView;

    @Bind(R.id.fabButton)
    FloatingActionButton fabButton;

    private HistoryPresenter mHistoryPresenter;

    private ListViewDataAdapter<HistoryEntity.ShowapiResBodyEntity.ListEntity> mListViewAdapter = null;

    @Override
    protected void onFirstUserVisible() {
        toggleShowLoading(true, null);
        mHistoryPresenter = new HistoryPresenterImpl(mContext, this);

        if (NetUtils.isNetworkConnected(mContext)) {
            if (null != mSwipeRefreshLayout) {
                mSwipeRefreshLayout.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mHistoryPresenter.loadListData(TAG_LOG, Constants.EVENT_REFRESH_DATA, TimeUtil.getCurrentMonthDay(), false);
                    }
                }, ApiConstants.Integers.PAGE_LAZY_LOAD_DELAY_TIME_MS);
            }
        } else {
            toggleNetworkError(true, new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mHistoryPresenter.loadListData(TAG_LOG, Constants.EVENT_REFRESH_DATA, TimeUtil.getCurrentMonthDay(), false);
                }
            });
        }

    }

    @Override
    protected void initViewsAndEvents() {
        startFABAnimation();

        mListViewAdapter = new ListViewDataAdapter<HistoryEntity.ShowapiResBodyEntity.ListEntity>(new ViewHolderCreator<HistoryEntity.ShowapiResBodyEntity.ListEntity>() {
            @Override
            public ViewHolderBase<HistoryEntity.ShowapiResBodyEntity.ListEntity> createViewHolder(int position) {
                return new ViewHolderBase<HistoryEntity.ShowapiResBodyEntity.ListEntity>() {

                    TextView tvYear;

                    TextView tvDate;

                    ImageView ivImage;

                    TextView tvContent;

                    View view_0;

                    View view_2;

                    @Override
                    public View createView(LayoutInflater layoutInflater) {
                        View convertView = layoutInflater.inflate(R.layout.view_history_item, null);
                        tvYear = ButterKnife.findById(convertView, R.id.tvYear);
                        tvDate = ButterKnife.findById(convertView, R.id.tvDate);
                        ivImage = ButterKnife.findById(convertView, R.id.ivImage);
                        tvContent = ButterKnife.findById(convertView, R.id.tvContent);
                        view_0 = ButterKnife.findById(convertView, R.id.view_0);
                        view_2 = ButterKnife.findById(convertView, R.id.view_2);

                        return convertView;
                    }

                    @Override
                    public void showData(final int position, final HistoryEntity.ShowapiResBodyEntity.ListEntity data) {
                        tvYear.setText(String.format("%s年", data.getYear()));
                        tvDate.setText(String.format("%s月%s日", data.getMonth(), data.getDay()));
                        tvContent.setText(data.getTitle());
                        if (!CommonUtils.isEmpty(data.getImg())) {
                            ImageLoader.getInstance().displayImage(data.getImg(), ivImage);
                            ivImage.setVisibility(View.VISIBLE);
                            ivImage.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Rect frame = new Rect();
                                    getActivity().getWindow().getDecorView().getWindowVisibleDisplayFrame(frame);
                                    int statusBarHeight = frame.top;

                                    int[] location = new int[2];
                                    v.getLocationOnScreen(location);
                                    location[1] += statusBarHeight;

                                    int width = v.getWidth();
                                    int height = v.getHeight();

                                    if (null != mListViewAdapter) {
                                        mHistoryPresenter.onItemClickListener(position,
                                                data,
                                                location[0],
                                                location[1],
                                                width,
                                                height);
                                    }
                                }
                            });
                        }else {
                            ivImage.setVisibility(View.GONE);
                        }
                        if (mListViewAdapter.getDataList().size() == (position + 1)) {
                            view_2.setVisibility(View.GONE);
                        } else {
                            view_2.setVisibility(View.VISIBLE);
                        }
                    }
                };
            }
        });

        TextView tvDate = new TextView(mContext);
        tvDate.setTextColor(Color.parseColor("#ffff4444"));
        tvDate.setPadding(20, 10, 20, 0);
        tvDate.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 16);
        tvDate.setText("今天是：" + TimeUtil.getCurrentYearMonthDay());
        mListView.addHeaderView(tvDate);
        mListView.setAdapter(mListViewAdapter);

        mSwipeRefreshLayout.setColorSchemeColors(
                getResources().getColor(R.color.gplus_color_1),
                getResources().getColor(R.color.gplus_color_2),
                getResources().getColor(R.color.gplus_color_3),
                getResources().getColor(R.color.gplus_color_4));
        mSwipeRefreshLayout.setOnRefreshListener(this);
    }

    @Override
    public void showError(String msg) {
        if (null != mSwipeRefreshLayout) {
            mSwipeRefreshLayout.setRefreshing(false);
        }
        toggleShowError(true, msg, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mHistoryPresenter.loadListData(TAG_LOG, Constants.EVENT_REFRESH_DATA, TimeUtil.getCurrentMonthDay(), false);
            }
        });
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    @Override
    public void onDetach() {
        super.onDetach();
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
    protected int getContentViewLayoutID() {
        return R.layout.fragment_history;
    }

    @Override
    protected void onEventComming(EventCenter eventCenter) {

    }

    @Override
    protected boolean isBindEventBusHere() {
        return true;
    }

    @Override
    public void refreshListData(HistoryEntity response) {
        if (null != mSwipeRefreshLayout) {
            mSwipeRefreshLayout.setRefreshing(false);
        }

        if (null != response) {
            if (null != mListViewAdapter) {
                mListViewAdapter.getDataList().clear();
                mListViewAdapter.getDataList().addAll(response.getShowapi_res_body().getList());
                mListViewAdapter.notifyDataSetChanged();
            }
            mListView.setCanLoadMore(false);
        }
    }

    @Override
    public void navigateToImagesDetail(int position, HistoryEntity.ShowapiResBodyEntity.ListEntity entity, int x, int y, int width, int height) {
        Bundle extras = new Bundle();
        extras.putString(ImagesDetailActivity.INTENT_IMAGE_URL_TAG, entity.getImg());
        extras.putInt(ImagesDetailActivity.INTENT_IMAGE_X_TAG, x);
        extras.putInt(ImagesDetailActivity.INTENT_IMAGE_Y_TAG, y);
        extras.putInt(ImagesDetailActivity.INTENT_IMAGE_W_TAG, width);
        extras.putInt(ImagesDetailActivity.INTENT_IMAGE_H_TAG, height);
        readyGo(ImagesDetailActivity.class, extras);
        getActivity().overridePendingTransition(0, 0);
    }

    @Override
    public void onRefresh() {
        mHistoryPresenter.loadListData(TAG_LOG, Constants.EVENT_REFRESH_DATA, TimeUtil.getCurrentMonthDay(), false);
    }

    private void startFABAnimation() {
        fabButton.animate()
                .translationY(0)
                .setInterpolator(new OvershootInterpolator(1.f))
                .setStartDelay(500)
                .setDuration(400)
                .start();
    }
}
