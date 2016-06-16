package com.haoyue.app.happyreader.bean;

import java.util.List;

/**
 * Created by joyo on 15/10/29.
 */
public class NewsChannelEntity {

    /**
     * channelId : 5572a108b3cdc86cf39001cd
     * name : 国内焦点
     */

    private List<ChannelListEntity> channelList;

    public void setChannelList(List<ChannelListEntity> channelList) {
        this.channelList = channelList;
    }

    public List<ChannelListEntity> getChannelList() {
        return channelList;
    }

    public static class ChannelListEntity {
        private String channelId;
        private String name;

        public void setChannelId(String channelId) {
            this.channelId = channelId;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getChannelId() {
            return channelId;
        }

        public String getName() {
            return name;
        }
    }
}
