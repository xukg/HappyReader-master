package com.haoyue.app.happyreader.utils;

import retrofit.RestAdapter;

/**
 * Created by joyo on 15/9/30.
 */
public class ApiManager {

    private static ApiManagerService singleton;

    private static ApiManagerService imageSingleton;

    private static ApiManagerService douBanSingleton;

    private static final RestAdapter restAdapter = new RestAdapter.Builder()
            .setEndpoint(Config.HTTP_HEAD)
            .setLogLevel(RestAdapter.LogLevel.HEADERS_AND_ARGS)
            .build();

    private static final RestAdapter doubanRestAdapter = new RestAdapter.Builder()
            .setEndpoint(Config.DOUBAN_HTTP_HEAD)
            .setLogLevel(RestAdapter.LogLevel.HEADERS_AND_ARGS)
            .build();


    private static final RestAdapter imageRestAdapter = new RestAdapter.Builder()
            .setEndpoint(Config.IMAGE_HTTP_HEAD)
            .setLogLevel(RestAdapter.LogLevel.HEADERS_AND_ARGS)
            .build();

    public static ApiManagerService getInstance() {
        if (singleton == null) {
            synchronized (ApiManager.class) {
                if (singleton == null) {
                    singleton = restAdapter.create(ApiManagerService.class);
                }
            }
        }
        return singleton;
    }

    public static ApiManagerService getDoubanInstance() {
        if (douBanSingleton == null) {
            synchronized (ApiManager.class) {
                if (douBanSingleton == null) {
                    douBanSingleton = doubanRestAdapter.create(ApiManagerService.class);
                }
            }
        }
        return douBanSingleton;
    }

    public static ApiManagerService getImageInstance() {
        if (imageSingleton == null) {
            synchronized (ApiManager.class) {
                if (imageSingleton == null) {
                    imageSingleton = imageRestAdapter.create(ApiManagerService.class);
                }
            }
        }
        return imageSingleton;
    }
}
