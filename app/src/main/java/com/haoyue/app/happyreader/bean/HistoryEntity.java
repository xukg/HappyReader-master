package com.haoyue.app.happyreader.bean;

import java.util.List;

/**
 * Created by joyo on 15/9/25.
 */
public class HistoryEntity {
    /**
     * showapi_res_code : 0
     * showapi_res_error :
     * showapi_res_body : {"list":[{"day":25,"month":9,"title":"国务院决定设立全国社会保障基金理事会","year":"2000"},{"day":25,"month":9,"title":"何厚铧委任澳门特区行政会委员","year":"1999"},{"day":25,"month":9,"title":"中国C(城市)网正式启动","year":"1998"},{"day":25,"img":"http://img.lssdjt.com/200907/7/B42308159.jpg","month":9,"title":"中国学者解开\u201c香格里拉\u201d之谜","year":"1997"},{"day":25,"img":"http://img.lssdjt.com/200905/17/DB214814314.jpg","month":9,"title":"香港回归后举办首次大型国际会议","year":"1997"},{"day":25,"img":"http://img.lssdjt.com/200905/17/10215040847.jpg","month":9,"title":"京津塘高速公路全线通车","year":"1993"},{"day":25,"month":9,"title":"《飘》的续集\u2014\u2014《郝思嘉》问世","year":"1991"},{"day":25,"month":9,"title":"日最高法院判决政府阁僚参拜靖国神社违宪","year":"1991"},{"day":25,"month":9,"title":"中国第一家破产倒闭企业\u2014\u2014沈阳防爆器械厂被整体拍卖","year":"1986"},{"day":25,"img":"http://img.lssdjt.com/200905/17/C1215447238.jpg","month":9,"title":"中国女排再次夺冠","year":"1982"},{"day":25,"month":9,"title":"中共中央号召一对夫妇只生一个孩子","year":"1980"},{"day":25,"month":9,"title":"十一届四中全会《关于加快农业发展若干问题的决定》","year":"1979"},{"day":25,"img":"http://img.lssdjt.com/200409/25/B9222917156.jpg","month":9,"title":"中日邦交正常化","year":"1972"},{"day":25,"img":"http://img.lssdjt.com/200905/17/8B215813212.jpg","month":9,"title":"我国发现大庆油田","year":"1959"},{"day":25,"month":9,"title":"斯里兰卡总理班达拉奈克遇刺","year":"1959"},{"day":25,"img":"http://img.lssdjt.com/201309/26/260553538.jpg","month":9,"title":"美国小石城事件爆发","year":"1957"},{"day":25,"month":9,"title":"毛泽东谈错误的两重性","year":"1956"},{"day":25,"month":9,"title":"过渡时期总路线正式公布","year":"1953"},{"day":25,"img":"http://img.lssdjt.com/200905/17/FB215956373.jpg","month":9,"title":"陶峙岳、包尔汉于新疆率部起义","year":"1949"},{"day":25,"img":"http://img.lssdjt.com/200905/17/4222212824.jpg","month":9,"title":"平型关大捷","year":"1937"},{"day":25,"img":"http://img.lssdjt.com/200905/17/1122255475.jpg","month":9,"title":"蒋介石对苏区发动第五次\u201c围剿\u201d","year":"1933"},{"day":25,"month":9,"title":"杭州雷峰塔倒坍","year":"1924"},{"day":25,"month":9,"title":"俄国劳动解放社成立","year":"1883"}],"ret_code":0}
     */

    private int showapi_res_code;
    private String showapi_res_error;
    private ShowapiResBodyEntity showapi_res_body;

    public void setShowapi_res_code(int showapi_res_code) {
        this.showapi_res_code = showapi_res_code;
    }

    public void setShowapi_res_error(String showapi_res_error) {
        this.showapi_res_error = showapi_res_error;
    }

    public void setShowapi_res_body(ShowapiResBodyEntity showapi_res_body) {
        this.showapi_res_body = showapi_res_body;
    }

    public int getShowapi_res_code() {
        return showapi_res_code;
    }

    public String getShowapi_res_error() {
        return showapi_res_error;
    }

    public ShowapiResBodyEntity getShowapi_res_body() {
        return showapi_res_body;
    }

    public static class ShowapiResBodyEntity {
        /**
         * list : [{"day":25,"month":9,"title":"国务院决定设立全国社会保障基金理事会","year":"2000"},{"day":25,"month":9,"title":"何厚铧委任澳门特区行政会委员","year":"1999"},{"day":25,"month":9,"title":"中国C(城市)网正式启动","year":"1998"},{"day":25,"img":"http://img.lssdjt.com/200907/7/B42308159.jpg","month":9,"title":"中国学者解开\u201c香格里拉\u201d之谜","year":"1997"},{"day":25,"img":"http://img.lssdjt.com/200905/17/DB214814314.jpg","month":9,"title":"香港回归后举办首次大型国际会议","year":"1997"},{"day":25,"img":"http://img.lssdjt.com/200905/17/10215040847.jpg","month":9,"title":"京津塘高速公路全线通车","year":"1993"},{"day":25,"month":9,"title":"《飘》的续集\u2014\u2014《郝思嘉》问世","year":"1991"},{"day":25,"month":9,"title":"日最高法院判决政府阁僚参拜靖国神社违宪","year":"1991"},{"day":25,"month":9,"title":"中国第一家破产倒闭企业\u2014\u2014沈阳防爆器械厂被整体拍卖","year":"1986"},{"day":25,"img":"http://img.lssdjt.com/200905/17/C1215447238.jpg","month":9,"title":"中国女排再次夺冠","year":"1982"},{"day":25,"month":9,"title":"中共中央号召一对夫妇只生一个孩子","year":"1980"},{"day":25,"month":9,"title":"十一届四中全会《关于加快农业发展若干问题的决定》","year":"1979"},{"day":25,"img":"http://img.lssdjt.com/200409/25/B9222917156.jpg","month":9,"title":"中日邦交正常化","year":"1972"},{"day":25,"img":"http://img.lssdjt.com/200905/17/8B215813212.jpg","month":9,"title":"我国发现大庆油田","year":"1959"},{"day":25,"month":9,"title":"斯里兰卡总理班达拉奈克遇刺","year":"1959"},{"day":25,"img":"http://img.lssdjt.com/201309/26/260553538.jpg","month":9,"title":"美国小石城事件爆发","year":"1957"},{"day":25,"month":9,"title":"毛泽东谈错误的两重性","year":"1956"},{"day":25,"month":9,"title":"过渡时期总路线正式公布","year":"1953"},{"day":25,"img":"http://img.lssdjt.com/200905/17/FB215956373.jpg","month":9,"title":"陶峙岳、包尔汉于新疆率部起义","year":"1949"},{"day":25,"img":"http://img.lssdjt.com/200905/17/4222212824.jpg","month":9,"title":"平型关大捷","year":"1937"},{"day":25,"img":"http://img.lssdjt.com/200905/17/1122255475.jpg","month":9,"title":"蒋介石对苏区发动第五次\u201c围剿\u201d","year":"1933"},{"day":25,"month":9,"title":"杭州雷峰塔倒坍","year":"1924"},{"day":25,"month":9,"title":"俄国劳动解放社成立","year":"1883"}]
         * ret_code : 0
         */

        private int ret_code;
        private List<ListEntity> list;

        public void setRet_code(int ret_code) {
            this.ret_code = ret_code;
        }

        public void setList(List<ListEntity> list) {
            this.list = list;
        }

        public int getRet_code() {
            return ret_code;
        }

        public List<ListEntity> getList() {
            return list;
        }

        public static class ListEntity {
            /**
             * day : 25
             * month : 9
             * title : 国务院决定设立全国社会保障基金理事会
             * year : 2000
             */

            private int day;
            private int month;
            private String title;
            private String img;
            private String year;

            public void setDay(int day) {
                this.day = day;
            }

            public void setMonth(int month) {
                this.month = month;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public void setYear(String year) {
                this.year = year;
            }

            public int getDay() {
                return day;
            }

            public int getMonth() {
                return month;
            }

            public String getTitle() {
                return title;
            }

            public String getYear() {
                return year;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }
        }
    }
}
