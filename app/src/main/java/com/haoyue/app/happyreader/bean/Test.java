package com.haoyue.app.happyreader.bean;

import java.util.List;

/**
 * Created by joyo on 15/11/2.
 */
public class Test {

    private DataEntity data;

    public void setData(DataEntity data) {
        this.data = data;
    }

    public DataEntity getData() {
        return data;
    }

    public static class DataEntity {
        /**
         * user_id : 1058
         * user_name : 皮跃清
         */

        private List<BelongMemberListEntity> belongMemberList;
        /**
         * buyer_mbid : 100121
         * seller_mbid : 9341
         * seller_mbname : 湖北中拓博升-建材部
         * title_id : 2
         * title_name : 湖南中拓电子商务有限公司
         */

        private List<TitleInfoListEntity> titleInfoList;
        /**
         * warehouseId : 1304229
         * warehouseName : 衢州元立
         */

        private List<WarehouseListEntity> warehouseList;

        public void setBelongMemberList(List<BelongMemberListEntity> belongMemberList) {
            this.belongMemberList = belongMemberList;
        }

        public void setTitleInfoList(List<TitleInfoListEntity> titleInfoList) {
            this.titleInfoList = titleInfoList;
        }

        public void setWarehouseList(List<WarehouseListEntity> warehouseList) {
            this.warehouseList = warehouseList;
        }

        public List<BelongMemberListEntity> getBelongMemberList() {
            return belongMemberList;
        }

        public List<TitleInfoListEntity> getTitleInfoList() {
            return titleInfoList;
        }

        public List<WarehouseListEntity> getWarehouseList() {
            return warehouseList;
        }

        public static class BelongMemberListEntity {
            private int user_id;
            private String user_name;

            public void setUser_id(int user_id) {
                this.user_id = user_id;
            }

            public void setUser_name(String user_name) {
                this.user_name = user_name;
            }

            public int getUser_id() {
                return user_id;
            }

            public String getUser_name() {
                return user_name;
            }
        }

        public static class TitleInfoListEntity {
            private int buyer_mbid;
            private int seller_mbid;
            private String seller_mbname;
            private int title_id;
            private String title_name;

            public void setBuyer_mbid(int buyer_mbid) {
                this.buyer_mbid = buyer_mbid;
            }

            public void setSeller_mbid(int seller_mbid) {
                this.seller_mbid = seller_mbid;
            }

            public void setSeller_mbname(String seller_mbname) {
                this.seller_mbname = seller_mbname;
            }

            public void setTitle_id(int title_id) {
                this.title_id = title_id;
            }

            public void setTitle_name(String title_name) {
                this.title_name = title_name;
            }

            public int getBuyer_mbid() {
                return buyer_mbid;
            }

            public int getSeller_mbid() {
                return seller_mbid;
            }

            public String getSeller_mbname() {
                return seller_mbname;
            }

            public int getTitle_id() {
                return title_id;
            }

            public String getTitle_name() {
                return title_name;
            }
        }

        public static class WarehouseListEntity {
            private int warehouseId;
            private String warehouseName;

            public void setWarehouseId(int warehouseId) {
                this.warehouseId = warehouseId;
            }

            public void setWarehouseName(String warehouseName) {
                this.warehouseName = warehouseName;
            }

            public int getWarehouseId() {
                return warehouseId;
            }

            public String getWarehouseName() {
                return warehouseName;
            }
        }
    }
}
