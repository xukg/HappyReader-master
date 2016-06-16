package com.haoyue.app.happyreader.ui.activity.picker;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.haoyue.app.library.adapter.ListViewDataAdapter;
import com.haoyue.app.library.adapter.ViewHolderBase;
import com.haoyue.app.library.adapter.ViewHolderCreator;
import com.haoyue.app.library.eventbus.EventCenter;
import com.haoyue.app.library.netstatus.NetUtils;
import com.haoyue.app.library.picker.ImageBucket;
import com.haoyue.app.library.picker.ImagePickerHelper;
import com.haoyue.app.library.utils.CommonUtils;
import com.haoyue.app.happyreader.R;
import com.haoyue.app.happyreader.ui.activity.base.BaseActivity;
import com.haoyue.app.happyreader.utils.ImageLoaderHelper;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class CommonImagePickerListActivity extends BaseActivity {

    private static final int IMAGE_PICKER_DETAIL_REQUEST_CODE = 200;

    public static final String KEY_BUNDLE_ALBUM_PATH = "KEY_BUNDLE_ALBUM_PATH";
    public static final String KEY_BUNDLE_ALBUM_NAME = "KEY_BUNDLE_ALBUM_NAME";

    @Bind(R.id.common_image_picker_list_view)
    ListView mImagePickerListView;

    private ListViewDataAdapter<ImageBucket> mListViewAdapter = null;
    private AsyncTask<Void, Void, List<ImageBucket>> mAlbumLoadTask = null;

    @Override
    protected boolean isApplyKitKatTranslucency() {
        return true;
    }

    @Override
    protected void getBundleExtras(Bundle extras) {

    }

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.activity_common_image_picker_list;
    }

    @Override
    protected void onEventComming(EventCenter eventCenter) {

    }

    @Override
    protected View getLoadingTargetView() {
        return mImagePickerListView;
    }

    @Override
    protected void initViewsAndEvents() {
        setTitle(getResources().getString(R.string.title_image_picker));

        mListViewAdapter = new ListViewDataAdapter<ImageBucket>(new ViewHolderCreator<ImageBucket>() {
            @Override
            public ViewHolderBase<ImageBucket> createViewHolder(int position) {
                return new ViewHolderBase<ImageBucket>() {

                    ImageView mItemImage;
                    TextView mItemTitle;

                    @Override
                    public View createView(LayoutInflater layoutInflater) {
                        View convertView = layoutInflater.inflate(R.layout
                                .list_item_common_image_picker, null);
                        mItemImage = ButterKnife.findById(convertView, R.id
                                .list_item_common_image_picker_thumbnail);
                        mItemTitle = ButterKnife.findById(convertView, R.id
                                .list_item_common_image_picker_title);
                        return convertView;
                    }

                    @Override
                    public void showData(int position, ImageBucket itemData) {
                        if (null != itemData) {
                            String imagePath = itemData.bucketList.get(0).getImagePath();
                            if (!CommonUtils.isEmpty(imagePath)) {
                                ImageLoader.getInstance().displayImage("file://" + imagePath,
                                        mItemImage,
                                        ImageLoaderHelper.getInstance(mContext).getDisplayOptions());
                            }

                            int count = itemData.count;
                            String title = itemData.bucketName;

                            if (!CommonUtils.isEmpty(title)) {
                                mItemTitle.setText(title + "(" + count + ")");
                            }
                        }
                    }
                };
            }
        });
        mImagePickerListView.setAdapter(mListViewAdapter);

        mImagePickerListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (null != mListViewAdapter && null != mListViewAdapter.getDataList() &&
                        !mListViewAdapter.getDataList().isEmpty() &&
                        position < mListViewAdapter.getDataList().size()) {

                    Bundle extras = new Bundle();
                    extras.putParcelableArrayList(KEY_BUNDLE_ALBUM_PATH, mListViewAdapter
                            .getDataList().get(position).bucketList);
                    extras.putString(KEY_BUNDLE_ALBUM_NAME, mListViewAdapter.getDataList().get
                            (position).bucketName);

                    readyGoForResult(CommonImagePickerDetailActivity.class,
                            IMAGE_PICKER_DETAIL_REQUEST_CODE, extras);
                }
            }
        });

        mAlbumLoadTask = new AsyncTask<Void, Void, List<ImageBucket>>() {

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                toggleShowLoading(true, null);
                ImagePickerHelper.getHelper().init(mContext);
            }

            @Override
            protected List<ImageBucket> doInBackground(Void... params) {
                return ImagePickerHelper.getHelper().getImagesBucketList();
            }

            @Override
            protected void onPostExecute(List<ImageBucket> list) {
                toggleShowLoading(false, null);

                mListViewAdapter.getDataList().addAll(list);
                mListViewAdapter.notifyDataSetChanged();
            }
        };

        mAlbumLoadTask.execute();
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
        return true;
    }

    @Override
    protected TransitionMode getOverridePendingTransitionMode() {
        return TransitionMode.BOTTOM;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (null != mAlbumLoadTask && !mAlbumLoadTask.isCancelled()) {
            mAlbumLoadTask.cancel(true);
            mAlbumLoadTask = null;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode != RESULT_OK) {
            return;
        }

        if (requestCode == IMAGE_PICKER_DETAIL_REQUEST_CODE) {
            setResult(RESULT_OK, data);
            finish();
        }
    }
}
