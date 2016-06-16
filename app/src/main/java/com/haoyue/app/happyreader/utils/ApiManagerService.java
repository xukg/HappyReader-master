package com.haoyue.app.happyreader.utils;

import com.haoyue.app.happyreader.bean.HistoryEntity;
import com.haoyue.app.happyreader.bean.HotNewsEntity;
import com.haoyue.app.happyreader.bean.HotWxNewsEntity;
import com.haoyue.app.happyreader.bean.ResponseImagesListEntity;
import com.haoyue.app.happyreader.bean.ResponseMusicsListentity;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;

/**
 * Created by joyo on 15/9/30.
 */
public interface ApiManagerService {

    int PAGE_LIMIT = 20;

    //获取新闻列表
    @GET("/109-35")
    Observable<HotNewsEntity> getHotNews(
            @Query("channelId") String channelId,
            @Query("channelName") String channelName,
            @Query("page") int page,
            @Query("showapi_appid") String appid,
            @Query("showapi_timestamp") String showapi_timestamp,
            @Query("title") String title,
            @Query("showapi_sign") String showapi_sign);

    /**
     * retrofit 支持 rxjava 整合
     * 这种方法适用于新接口
     */
    @GET("/582-2")
    Observable<HotWxNewsEntity> getHotWXData(
            @Query("key") String key,
            @Query("page") int page,
            @Query("showapi_appid") String showapi_appid,
            @Query("showapi_timestamp") String showapi_timestamp,
            @Query("typeId") String typeId,
            @Query("showapi_sign") String showapi_sign);

    //豆瓣音乐
    @GET("/j/app/radio/people")
    Observable<ResponseMusicsListentity> getMusicListData(
            @Query("channel") String channelId,
            @Query("app_name") String app_name,
            @Query("version") String version,
            @Query("type") String type,
            @Query("sid") int sid);

    //热门图片
    @GET("/data/imgs")
    Observable<ResponseImagesListEntity> getImageListData(
            @Query("col") String col,
            @Query("tag") String tag,
            @Query("pn") int pageNum,
            @Query("rn") int PAGE_LIMIT,
            @Query("from") int sid);

    //获取历史的今天
    @GET("/119-42")
    Observable<HistoryEntity> getHistoryToday(
            @Query("showapi_appid") String appid,
            @Query("showapi_timestamp") String showapi_timestamp,
            @Query("date") String date,
            @Query("showapi_sign") String showapi_sign);

}
