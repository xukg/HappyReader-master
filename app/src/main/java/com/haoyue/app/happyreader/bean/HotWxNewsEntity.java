package com.haoyue.app.happyreader.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by joyo on 15/10/21.
 */
public class HotWxNewsEntity {
    /**
     * showapi_res_code : 0
     * showapi_res_error :
     * showapi_res_body : {"pagebean":{"allNum":85098,"allPages":4255,"contentlist":[{"contentImg":"http://app1.showapi.com/weixin_info/article/1aa11847-c36c-451d-9333-068dc5872308.jpg","date":"2015-09-29 12:00","id":"560a2b446e3629cf03e8450e","title":"早秋裙子怎么穿?跟着学起来准没错!","typeId":"0","typeName":"热点","url":"http://mp.weixin.qq.com/s?__biz=MjM5Njc4MDIzNw==&mid=219500088&idx=3&sn=14fbf6dcf02aea3082dfdcc5adf666fe&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/09fe9af9-3e4f-4355-b0e6-0f40fc0867f9.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/434d2fda-9ddd-4f11-839f-b50cca8f7d6c.jpg","userName":"时尚女装搭配"},{"contentImg":"http://app1.showapi.com/weixin_info/article/21518186-1b62-4624-a0d2-34696ef4ae73.jpg","date":"2015-09-29 11:54","id":"560a2b446e3629cf03e8450c","title":"医闹猖狂：护士被逼抱婴儿尸体「罚站」示众","typeId":"0","typeName":"热点","url":"http://mp.weixin.qq.com/s?__biz=MjM5NDQxMzEzMA==&mid=208125155&idx=1&sn=bbbfa16d5ddfa3f0ed297770606f8fa3&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/9d284405-f427-4821-811f-ca57784d2812.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/7101c6dc-2fe4-447d-966b-9bb46eb7023f.jpg","userName":"丁香头条"},{"contentImg":"http://app1.showapi.com/weixin_info/article/d52714be-5c07-4c49-a0ed-bc5834cc26d3.jpg","date":"2015-09-29 12:25","id":"560a2b446e3629cf03e8450b","title":"中国警察已经到了危险的时候","typeId":"0","typeName":"热点","url":"http://mp.weixin.qq.com/s?__biz=MzA4MjAyMTU3MA==&mid=212033682&idx=2&sn=02df2e1cf527f879a0ebe54cc04abfa2&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/f87c4d80-3b01-450f-a436-ea8847ee0902.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/12caf49c-a654-47ef-a76f-e86cfcc3fb35.jpg","userName":"Police"},{"contentImg":"http://app1.showapi.com/weixin_info/article/7b327723-30d6-40a0-b6f3-e620d667a905.jpg","date":"2015-09-29 12:09","id":"560a2b446e3629cf03e8450a","title":"天长市公安局迅速依法处置一起故意杀人案","typeId":"0","typeName":"热点","url":"http://mp.weixin.qq.com/s?__biz=MzAwNzM0ODM0Nw==&mid=210981407&idx=1&sn=9f209bb325ceab2ee81cfe34440a588f&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/0e724114-dc4f-4ea0-ad03-332fbd60c8df.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/8379eb86-2585-437f-bbfd-7a12d801f9de.jpg","userName":"滁州警方"},{"contentImg":"http://app1.showapi.com/weixin_info/article/4c2e129a-d575-412e-a23b-e966bb3a3507.jpg","date":"2015-09-29 12:06","id":"560a2b446e3629cf03e84509","title":"一组图告诉你时尚与年龄无关，简直个个都帅炸啊...","typeId":"0","typeName":"热点","url":"http://mp.weixin.qq.com/s?__biz=Mjk2NzMwNTY2MA==&mid=216891385&idx=3&sn=a4903f6610cb546f7ad29d2b48a99bde&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/44ac5ca2-9620-48af-8361-e59fb4529ab6.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/bca4fd4a-2e0a-4d00-b063-a493dc3bb2c3.jpg","userName":"冷笑话"},{"contentImg":"http://app1.showapi.com/weixin_info/article/9b0884ef-ac11-4b46-9692-a16ba81451dc.jpg","date":"2015-09-29 12:34","id":"560a2b446e3629cf03e84508","title":"你来抢楼，我来送，两百万红包献给队长!","typeId":"0","typeName":"热点","url":"http://mp.weixin.qq.com/s?__biz=MzA5NTE2NjQ4Mw==&mid=418946237&idx=2&sn=961c598f92e6cda02ab65d2c04061f10&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/ce5b0243-ed71-495b-9063-67159f888000.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/54116a91-7bbb-4be9-a182-3aee616d8d8d.jpg","userName":"全民突击"},{"contentImg":"http://app1.showapi.com/weixin_info/article/e3d7316c-c09a-41dc-9fd4-4598f6d0a92d.jpg","date":"2015-09-29 12:47","id":"560a2b446e3629cf03e84507","title":"不是我想逞强，只是除了自己没有谁能永远依仗","typeId":"0","typeName":"热点","url":"http://mp.weixin.qq.com/s?__biz=MzA3MTE0NDkxNg==&mid=773148034&idx=8&sn=d98dcb0e23541498948afc304210a8a0&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/60d27f83-4fad-4ef7-a4ca-9c86a0583b32.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/0979c590-4ae8-46dd-bb85-2877490cee47.jpg","userName":"卡妞微秀"},{"contentImg":"http://app1.showapi.com/weixin_info/article/21f6cc03-4954-40e2-86df-809aa567989f.jpg","date":"2015-09-29 12:42","id":"560a2b446e3629cf03e84506","title":"你并不会失去爱的能力","typeId":"0","typeName":"热点","url":"http://mp.weixin.qq.com/s?__biz=MjM5MDMyMzg2MA==&mid=216463809&idx=1&sn=a07454f1d518ac1b4aac1c85e3d82151&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/1141e703-efa6-4856-b4a5-713a8532a7ad.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/a7cb508f-0a2d-4ce1-a170-59e2e96f9a5b.jpg","userName":"十点读书"},{"contentImg":"http://app1.showapi.com/weixin_info/article/5adedf2c-2635-4bd0-a912-60a373039836.jpg","date":"2015-09-29 12:20","id":"560a2b446e3629cf03e84505","title":"央视：聪明你的旅行，去哪儿网的智慧旅游布局","typeId":"1","typeName":"推荐","url":"http://mp.weixin.qq.com/s?__biz=MzA3MDEzOTMwMw==&mid=214882224&idx=4&sn=a42982f730dfb18c447eda4783774229&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/f7acad85-0537-4dd6-b845-65a45a34f011.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/5841c06e-5af9-49ec-955c-c7454e6b9965.jpg","userName":"品橙旅游"},{"contentImg":"http://app1.showapi.com/weixin_info/article/e4198600-82ce-44c0-bc77-8aa562f44e68.jpg","date":"2015-09-29 12:29","id":"560a2b446e3629cf03e84504","title":"日本旅游攻略：冲绳另类游","typeId":"1","typeName":"推荐","url":"http://mp.weixin.qq.com/s?__biz=MjM5OTAzNDY1OQ==&mid=208230828&idx=3&sn=ae0df818774a424448f11dd898b6e212&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/2f197a81-0636-456e-bbe0-82607975fe9d.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/22eb6c16-c358-4fe7-ae36-cdcd61e9f69e.jpg","userName":"在日华人圈"},{"contentImg":"http://app1.showapi.com/weixin_info/article/e512080c-0dad-4151-b2fe-ceee0912541d.jpg","date":"2015-09-29 12:26","id":"560a2b446e3629cf03e84503","title":"发改委：有车位才能买车可能在中国推行","typeId":"1","typeName":"推荐","url":"http://mp.weixin.qq.com/s?__biz=MjM5MTE5NTI4MQ==&mid=208881834&idx=5&sn=1fb69be9fa0ec30a6d15a12f631ee3ad&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/e55b88bc-e3a1-40fd-a386-20333d3e413d.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/ca42f833-353d-4989-be2d-968efc222e96.jpg","userName":"12缸汽车"},{"contentImg":"http://app1.showapi.com/weixin_info/article/3a56a474-597f-45e2-aee5-0fec39b0e2c5.jpg","date":"2015-09-29 12:25","id":"560a2b446e3629cf03e84502","title":"生个聪明女儿的下场，你个死鬼哈哈哈","typeId":"1","typeName":"推荐","url":"http://mp.weixin.qq.com/s?__biz=MzA5MDA3NjYyMA==&mid=210790632&idx=4&sn=c97df9154a6d33e7003b1dc69e2d7780&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/7173126e-cd51-4cfa-82c3-fba60fef93d5.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/5d8cbd48-ccf8-4ced-b329-2f821dba63d3.jpg","userName":"信托行业网"},{"contentImg":"http://app1.showapi.com/weixin_info/article/0bd60e9f-27c9-45ca-bdd3-9d32e1d2a825.jpg","date":"2015-09-29 11:54","id":"560a2b446e3629cf03e84501","title":"十二星座适合住多大的房子?","typeId":"18","typeName":"星座控","url":"http://mp.weixin.qq.com/s?__biz=MzAwOTUyNzQ0NA==&mid=211535591&idx=2&sn=0f7a0bc78371a3387353ab272d801c19&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/7f0aab13-9ee3-4346-b88f-f3d8b58a40e7.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/0fcb15d2-05be-4b44-8a6b-42b725b738b7.jpg","userName":"我和星座的日常"},{"contentImg":"http://app1.showapi.com/weixin_info/article/fd46ed71-b7e6-4b16-ace1-b78b1c2931fa.jpg","date":"2015-09-29 12:28","id":"560a2b446e3629cf03e84500","title":"5板块资金净流入暴增 10股遭大幅加仓","typeId":"1","typeName":"推荐","url":"http://mp.weixin.qq.com/s?__biz=MjM5NDAwMzIyMA==&mid=217107847&idx=4&sn=758b91398f7cfc0d29f80e29b0a78ee5&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/dc0ea1da-c557-4516-a307-bcab3b33b27a.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/6a11adbe-b766-479c-a828-3969a0bb4e0b.jpg","userName":"股票雷达"},{"contentImg":"http://app1.showapi.com/weixin_info/article/1320f3b5-fbf3-4403-b8fc-285c4d7ccf71.jpg","date":"2015-09-29 11:57","id":"560a2b446e3629cf03e844ff","title":"中秋过后的第一周，你的星座运势是怎么样的呢?","typeId":"18","typeName":"星座控","url":"http://mp.weixin.qq.com/s?__biz=MzAxNjY4MjEwMA==&mid=209553605&idx=3&sn=555e0759421be0cc7d61ede8ef73b917&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/d2efada8-7363-47d9-826b-d51322463778.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/5ddd35d4-b7be-4950-a078-63c6bc87821d.jpg","userName":"每天一测"},{"contentImg":"http://app1.showapi.com/weixin_info/article/d49e0836-32a5-4cfe-b7ae-d761e4cf1002.jpg","date":"2015-09-29 12:40","id":"560a2b446e3629cf03e844fe","title":"7岁童声《我只在乎你》，听醉了!","typeId":"1","typeName":"推荐","url":"http://mp.weixin.qq.com/s?__biz=MjM5NzI2NDgyMA==&mid=218849504&idx=4&sn=9bac32c99c0c70d1dfc461f3ddba9299&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/bd041919-e7b5-4440-8ecf-cb2ff12ea5e1.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/7de75b5d-cc67-4fe3-9823-aa9fc51771af.jpg","userName":"全球搞笑视频榜"},{"contentImg":"http://app1.showapi.com/weixin_info/article/bd75b692-bb69-46ce-81f4-7966284ff18d.jpg","date":"2015-09-29 12:46","id":"560a2b446e3629cf03e844fd","title":"太像苏迪罗了!!台风杜鹃明晨或连江登陆，警惕\u201c...","typeId":"1","typeName":"推荐","url":"http://mp.weixin.qq.com/s?__biz=MTQ2NTI0MTgwMQ==&mid=210941260&idx=1&sn=a8728be75caafcb576d31b181964ab3f&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/eacb9166-65f7-4ab2-87ef-b66da8f8cb06.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/2623d95f-d45c-4236-96c6-727785036928.jpg","userName":"东南快报"},{"contentImg":"http://app1.showapi.com/weixin_info/article/953d2afa-edb5-4b7a-8185-094aa3424738.jpg","date":"2015-09-29 11:58","id":"560a2b446e3629cf03e844fc","title":"天蝎座今日运势9.28","typeId":"18","typeName":"星座控","url":"http://mp.weixin.qq.com/s?__biz=MjM5ODU0MTk0MA==&mid=210810721&idx=2&sn=c73dc6ed519a8566af573613da0fac10&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/3e9fec49-3675-4341-8f92-449dcd80ccae.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/05666a4a-a148-4d40-a8ca-8d05b742ae69.jpg","userName":"天蝎座专属"},{"contentImg":"http://app1.showapi.com/weixin_info/article/fb2accba-76ab-4c00-b918-b5ed83dae22a.jpg","date":"2015-09-29 12:00","id":"560a2b446e3629cf03e844fb","title":"十二星座给人的第一印象，快来对号入座!","typeId":"18","typeName":"星座控","url":"http://mp.weixin.qq.com/s?__biz=MzA3NzA2OTI2Nw==&mid=212775188&idx=5&sn=729de3fae624b7bb1b1dc496a1f85c97&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/292e84a7-3c72-4ef9-a743-661413beb9df.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/7c98e102-250d-4a55-b8c7-1c20df6c9dab.jpg","userName":"星座小窝"},{"contentImg":"http://app1.showapi.com/weixin_info/article/dc632d2f-491e-4031-aebd-8eab85f35d74.jpg","date":"2015-09-29 12:44","id":"560a2b446e3629cf03e844fa","title":"量身定制的十二星座海岛，我很好奇你是哪片~","typeId":"18","typeName":"星座控","url":"http://mp.weixin.qq.com/s?__biz=MjM5NzIxODEyMg==&mid=225054125&idx=6&sn=2f71863032c983805c284b8bef2293a5&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/3b99b4d8-22e8-4bdf-8b76-f04e6af54696.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/3af5bc50-a87c-4c5f-afb6-bb659c5939c9.jpg","userName":"意大利华人"}],"currentPage":1,"maxResult":20},"ret_code":0}
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
         * pagebean : {"allNum":85098,"allPages":4255,"contentlist":[{"contentImg":"http://app1.showapi.com/weixin_info/article/1aa11847-c36c-451d-9333-068dc5872308.jpg","date":"2015-09-29 12:00","id":"560a2b446e3629cf03e8450e","title":"早秋裙子怎么穿?跟着学起来准没错!","typeId":"0","typeName":"热点","url":"http://mp.weixin.qq.com/s?__biz=MjM5Njc4MDIzNw==&mid=219500088&idx=3&sn=14fbf6dcf02aea3082dfdcc5adf666fe&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/09fe9af9-3e4f-4355-b0e6-0f40fc0867f9.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/434d2fda-9ddd-4f11-839f-b50cca8f7d6c.jpg","userName":"时尚女装搭配"},{"contentImg":"http://app1.showapi.com/weixin_info/article/21518186-1b62-4624-a0d2-34696ef4ae73.jpg","date":"2015-09-29 11:54","id":"560a2b446e3629cf03e8450c","title":"医闹猖狂：护士被逼抱婴儿尸体「罚站」示众","typeId":"0","typeName":"热点","url":"http://mp.weixin.qq.com/s?__biz=MjM5NDQxMzEzMA==&mid=208125155&idx=1&sn=bbbfa16d5ddfa3f0ed297770606f8fa3&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/9d284405-f427-4821-811f-ca57784d2812.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/7101c6dc-2fe4-447d-966b-9bb46eb7023f.jpg","userName":"丁香头条"},{"contentImg":"http://app1.showapi.com/weixin_info/article/d52714be-5c07-4c49-a0ed-bc5834cc26d3.jpg","date":"2015-09-29 12:25","id":"560a2b446e3629cf03e8450b","title":"中国警察已经到了危险的时候","typeId":"0","typeName":"热点","url":"http://mp.weixin.qq.com/s?__biz=MzA4MjAyMTU3MA==&mid=212033682&idx=2&sn=02df2e1cf527f879a0ebe54cc04abfa2&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/f87c4d80-3b01-450f-a436-ea8847ee0902.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/12caf49c-a654-47ef-a76f-e86cfcc3fb35.jpg","userName":"Police"},{"contentImg":"http://app1.showapi.com/weixin_info/article/7b327723-30d6-40a0-b6f3-e620d667a905.jpg","date":"2015-09-29 12:09","id":"560a2b446e3629cf03e8450a","title":"天长市公安局迅速依法处置一起故意杀人案","typeId":"0","typeName":"热点","url":"http://mp.weixin.qq.com/s?__biz=MzAwNzM0ODM0Nw==&mid=210981407&idx=1&sn=9f209bb325ceab2ee81cfe34440a588f&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/0e724114-dc4f-4ea0-ad03-332fbd60c8df.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/8379eb86-2585-437f-bbfd-7a12d801f9de.jpg","userName":"滁州警方"},{"contentImg":"http://app1.showapi.com/weixin_info/article/4c2e129a-d575-412e-a23b-e966bb3a3507.jpg","date":"2015-09-29 12:06","id":"560a2b446e3629cf03e84509","title":"一组图告诉你时尚与年龄无关，简直个个都帅炸啊...","typeId":"0","typeName":"热点","url":"http://mp.weixin.qq.com/s?__biz=Mjk2NzMwNTY2MA==&mid=216891385&idx=3&sn=a4903f6610cb546f7ad29d2b48a99bde&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/44ac5ca2-9620-48af-8361-e59fb4529ab6.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/bca4fd4a-2e0a-4d00-b063-a493dc3bb2c3.jpg","userName":"冷笑话"},{"contentImg":"http://app1.showapi.com/weixin_info/article/9b0884ef-ac11-4b46-9692-a16ba81451dc.jpg","date":"2015-09-29 12:34","id":"560a2b446e3629cf03e84508","title":"你来抢楼，我来送，两百万红包献给队长!","typeId":"0","typeName":"热点","url":"http://mp.weixin.qq.com/s?__biz=MzA5NTE2NjQ4Mw==&mid=418946237&idx=2&sn=961c598f92e6cda02ab65d2c04061f10&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/ce5b0243-ed71-495b-9063-67159f888000.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/54116a91-7bbb-4be9-a182-3aee616d8d8d.jpg","userName":"全民突击"},{"contentImg":"http://app1.showapi.com/weixin_info/article/e3d7316c-c09a-41dc-9fd4-4598f6d0a92d.jpg","date":"2015-09-29 12:47","id":"560a2b446e3629cf03e84507","title":"不是我想逞强，只是除了自己没有谁能永远依仗","typeId":"0","typeName":"热点","url":"http://mp.weixin.qq.com/s?__biz=MzA3MTE0NDkxNg==&mid=773148034&idx=8&sn=d98dcb0e23541498948afc304210a8a0&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/60d27f83-4fad-4ef7-a4ca-9c86a0583b32.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/0979c590-4ae8-46dd-bb85-2877490cee47.jpg","userName":"卡妞微秀"},{"contentImg":"http://app1.showapi.com/weixin_info/article/21f6cc03-4954-40e2-86df-809aa567989f.jpg","date":"2015-09-29 12:42","id":"560a2b446e3629cf03e84506","title":"你并不会失去爱的能力","typeId":"0","typeName":"热点","url":"http://mp.weixin.qq.com/s?__biz=MjM5MDMyMzg2MA==&mid=216463809&idx=1&sn=a07454f1d518ac1b4aac1c85e3d82151&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/1141e703-efa6-4856-b4a5-713a8532a7ad.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/a7cb508f-0a2d-4ce1-a170-59e2e96f9a5b.jpg","userName":"十点读书"},{"contentImg":"http://app1.showapi.com/weixin_info/article/5adedf2c-2635-4bd0-a912-60a373039836.jpg","date":"2015-09-29 12:20","id":"560a2b446e3629cf03e84505","title":"央视：聪明你的旅行，去哪儿网的智慧旅游布局","typeId":"1","typeName":"推荐","url":"http://mp.weixin.qq.com/s?__biz=MzA3MDEzOTMwMw==&mid=214882224&idx=4&sn=a42982f730dfb18c447eda4783774229&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/f7acad85-0537-4dd6-b845-65a45a34f011.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/5841c06e-5af9-49ec-955c-c7454e6b9965.jpg","userName":"品橙旅游"},{"contentImg":"http://app1.showapi.com/weixin_info/article/e4198600-82ce-44c0-bc77-8aa562f44e68.jpg","date":"2015-09-29 12:29","id":"560a2b446e3629cf03e84504","title":"日本旅游攻略：冲绳另类游","typeId":"1","typeName":"推荐","url":"http://mp.weixin.qq.com/s?__biz=MjM5OTAzNDY1OQ==&mid=208230828&idx=3&sn=ae0df818774a424448f11dd898b6e212&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/2f197a81-0636-456e-bbe0-82607975fe9d.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/22eb6c16-c358-4fe7-ae36-cdcd61e9f69e.jpg","userName":"在日华人圈"},{"contentImg":"http://app1.showapi.com/weixin_info/article/e512080c-0dad-4151-b2fe-ceee0912541d.jpg","date":"2015-09-29 12:26","id":"560a2b446e3629cf03e84503","title":"发改委：有车位才能买车可能在中国推行","typeId":"1","typeName":"推荐","url":"http://mp.weixin.qq.com/s?__biz=MjM5MTE5NTI4MQ==&mid=208881834&idx=5&sn=1fb69be9fa0ec30a6d15a12f631ee3ad&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/e55b88bc-e3a1-40fd-a386-20333d3e413d.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/ca42f833-353d-4989-be2d-968efc222e96.jpg","userName":"12缸汽车"},{"contentImg":"http://app1.showapi.com/weixin_info/article/3a56a474-597f-45e2-aee5-0fec39b0e2c5.jpg","date":"2015-09-29 12:25","id":"560a2b446e3629cf03e84502","title":"生个聪明女儿的下场，你个死鬼哈哈哈","typeId":"1","typeName":"推荐","url":"http://mp.weixin.qq.com/s?__biz=MzA5MDA3NjYyMA==&mid=210790632&idx=4&sn=c97df9154a6d33e7003b1dc69e2d7780&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/7173126e-cd51-4cfa-82c3-fba60fef93d5.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/5d8cbd48-ccf8-4ced-b329-2f821dba63d3.jpg","userName":"信托行业网"},{"contentImg":"http://app1.showapi.com/weixin_info/article/0bd60e9f-27c9-45ca-bdd3-9d32e1d2a825.jpg","date":"2015-09-29 11:54","id":"560a2b446e3629cf03e84501","title":"十二星座适合住多大的房子?","typeId":"18","typeName":"星座控","url":"http://mp.weixin.qq.com/s?__biz=MzAwOTUyNzQ0NA==&mid=211535591&idx=2&sn=0f7a0bc78371a3387353ab272d801c19&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/7f0aab13-9ee3-4346-b88f-f3d8b58a40e7.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/0fcb15d2-05be-4b44-8a6b-42b725b738b7.jpg","userName":"我和星座的日常"},{"contentImg":"http://app1.showapi.com/weixin_info/article/fd46ed71-b7e6-4b16-ace1-b78b1c2931fa.jpg","date":"2015-09-29 12:28","id":"560a2b446e3629cf03e84500","title":"5板块资金净流入暴增 10股遭大幅加仓","typeId":"1","typeName":"推荐","url":"http://mp.weixin.qq.com/s?__biz=MjM5NDAwMzIyMA==&mid=217107847&idx=4&sn=758b91398f7cfc0d29f80e29b0a78ee5&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/dc0ea1da-c557-4516-a307-bcab3b33b27a.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/6a11adbe-b766-479c-a828-3969a0bb4e0b.jpg","userName":"股票雷达"},{"contentImg":"http://app1.showapi.com/weixin_info/article/1320f3b5-fbf3-4403-b8fc-285c4d7ccf71.jpg","date":"2015-09-29 11:57","id":"560a2b446e3629cf03e844ff","title":"中秋过后的第一周，你的星座运势是怎么样的呢?","typeId":"18","typeName":"星座控","url":"http://mp.weixin.qq.com/s?__biz=MzAxNjY4MjEwMA==&mid=209553605&idx=3&sn=555e0759421be0cc7d61ede8ef73b917&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/d2efada8-7363-47d9-826b-d51322463778.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/5ddd35d4-b7be-4950-a078-63c6bc87821d.jpg","userName":"每天一测"},{"contentImg":"http://app1.showapi.com/weixin_info/article/d49e0836-32a5-4cfe-b7ae-d761e4cf1002.jpg","date":"2015-09-29 12:40","id":"560a2b446e3629cf03e844fe","title":"7岁童声《我只在乎你》，听醉了!","typeId":"1","typeName":"推荐","url":"http://mp.weixin.qq.com/s?__biz=MjM5NzI2NDgyMA==&mid=218849504&idx=4&sn=9bac32c99c0c70d1dfc461f3ddba9299&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/bd041919-e7b5-4440-8ecf-cb2ff12ea5e1.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/7de75b5d-cc67-4fe3-9823-aa9fc51771af.jpg","userName":"全球搞笑视频榜"},{"contentImg":"http://app1.showapi.com/weixin_info/article/bd75b692-bb69-46ce-81f4-7966284ff18d.jpg","date":"2015-09-29 12:46","id":"560a2b446e3629cf03e844fd","title":"太像苏迪罗了!!台风杜鹃明晨或连江登陆，警惕\u201c...","typeId":"1","typeName":"推荐","url":"http://mp.weixin.qq.com/s?__biz=MTQ2NTI0MTgwMQ==&mid=210941260&idx=1&sn=a8728be75caafcb576d31b181964ab3f&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/eacb9166-65f7-4ab2-87ef-b66da8f8cb06.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/2623d95f-d45c-4236-96c6-727785036928.jpg","userName":"东南快报"},{"contentImg":"http://app1.showapi.com/weixin_info/article/953d2afa-edb5-4b7a-8185-094aa3424738.jpg","date":"2015-09-29 11:58","id":"560a2b446e3629cf03e844fc","title":"天蝎座今日运势9.28","typeId":"18","typeName":"星座控","url":"http://mp.weixin.qq.com/s?__biz=MjM5ODU0MTk0MA==&mid=210810721&idx=2&sn=c73dc6ed519a8566af573613da0fac10&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/3e9fec49-3675-4341-8f92-449dcd80ccae.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/05666a4a-a148-4d40-a8ca-8d05b742ae69.jpg","userName":"天蝎座专属"},{"contentImg":"http://app1.showapi.com/weixin_info/article/fb2accba-76ab-4c00-b918-b5ed83dae22a.jpg","date":"2015-09-29 12:00","id":"560a2b446e3629cf03e844fb","title":"十二星座给人的第一印象，快来对号入座!","typeId":"18","typeName":"星座控","url":"http://mp.weixin.qq.com/s?__biz=MzA3NzA2OTI2Nw==&mid=212775188&idx=5&sn=729de3fae624b7bb1b1dc496a1f85c97&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/292e84a7-3c72-4ef9-a743-661413beb9df.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/7c98e102-250d-4a55-b8c7-1c20df6c9dab.jpg","userName":"星座小窝"},{"contentImg":"http://app1.showapi.com/weixin_info/article/dc632d2f-491e-4031-aebd-8eab85f35d74.jpg","date":"2015-09-29 12:44","id":"560a2b446e3629cf03e844fa","title":"量身定制的十二星座海岛，我很好奇你是哪片~","typeId":"18","typeName":"星座控","url":"http://mp.weixin.qq.com/s?__biz=MjM5NzIxODEyMg==&mid=225054125&idx=6&sn=2f71863032c983805c284b8bef2293a5&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/3b99b4d8-22e8-4bdf-8b76-f04e6af54696.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/3af5bc50-a87c-4c5f-afb6-bb659c5939c9.jpg","userName":"意大利华人"}],"currentPage":1,"maxResult":20}
         * ret_code : 0
         */

        private PagebeanEntity pagebean;
        private int ret_code;

        public void setPagebean(PagebeanEntity pagebean) {
            this.pagebean = pagebean;
        }

        public void setRet_code(int ret_code) {
            this.ret_code = ret_code;
        }

        public PagebeanEntity getPagebean() {
            return pagebean;
        }

        public int getRet_code() {
            return ret_code;
        }

        public static class PagebeanEntity{
            /**
             * allNum : 85098
             * allPages : 4255
             * contentlist : [{"contentImg":"http://app1.showapi.com/weixin_info/article/1aa11847-c36c-451d-9333-068dc5872308.jpg","date":"2015-09-29 12:00","id":"560a2b446e3629cf03e8450e","title":"早秋裙子怎么穿?跟着学起来准没错!","typeId":"0","typeName":"热点","url":"http://mp.weixin.qq.com/s?__biz=MjM5Njc4MDIzNw==&mid=219500088&idx=3&sn=14fbf6dcf02aea3082dfdcc5adf666fe&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/09fe9af9-3e4f-4355-b0e6-0f40fc0867f9.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/434d2fda-9ddd-4f11-839f-b50cca8f7d6c.jpg","userName":"时尚女装搭配"},{"contentImg":"http://app1.showapi.com/weixin_info/article/21518186-1b62-4624-a0d2-34696ef4ae73.jpg","date":"2015-09-29 11:54","id":"560a2b446e3629cf03e8450c","title":"医闹猖狂：护士被逼抱婴儿尸体「罚站」示众","typeId":"0","typeName":"热点","url":"http://mp.weixin.qq.com/s?__biz=MjM5NDQxMzEzMA==&mid=208125155&idx=1&sn=bbbfa16d5ddfa3f0ed297770606f8fa3&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/9d284405-f427-4821-811f-ca57784d2812.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/7101c6dc-2fe4-447d-966b-9bb46eb7023f.jpg","userName":"丁香头条"},{"contentImg":"http://app1.showapi.com/weixin_info/article/d52714be-5c07-4c49-a0ed-bc5834cc26d3.jpg","date":"2015-09-29 12:25","id":"560a2b446e3629cf03e8450b","title":"中国警察已经到了危险的时候","typeId":"0","typeName":"热点","url":"http://mp.weixin.qq.com/s?__biz=MzA4MjAyMTU3MA==&mid=212033682&idx=2&sn=02df2e1cf527f879a0ebe54cc04abfa2&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/f87c4d80-3b01-450f-a436-ea8847ee0902.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/12caf49c-a654-47ef-a76f-e86cfcc3fb35.jpg","userName":"Police"},{"contentImg":"http://app1.showapi.com/weixin_info/article/7b327723-30d6-40a0-b6f3-e620d667a905.jpg","date":"2015-09-29 12:09","id":"560a2b446e3629cf03e8450a","title":"天长市公安局迅速依法处置一起故意杀人案","typeId":"0","typeName":"热点","url":"http://mp.weixin.qq.com/s?__biz=MzAwNzM0ODM0Nw==&mid=210981407&idx=1&sn=9f209bb325ceab2ee81cfe34440a588f&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/0e724114-dc4f-4ea0-ad03-332fbd60c8df.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/8379eb86-2585-437f-bbfd-7a12d801f9de.jpg","userName":"滁州警方"},{"contentImg":"http://app1.showapi.com/weixin_info/article/4c2e129a-d575-412e-a23b-e966bb3a3507.jpg","date":"2015-09-29 12:06","id":"560a2b446e3629cf03e84509","title":"一组图告诉你时尚与年龄无关，简直个个都帅炸啊...","typeId":"0","typeName":"热点","url":"http://mp.weixin.qq.com/s?__biz=Mjk2NzMwNTY2MA==&mid=216891385&idx=3&sn=a4903f6610cb546f7ad29d2b48a99bde&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/44ac5ca2-9620-48af-8361-e59fb4529ab6.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/bca4fd4a-2e0a-4d00-b063-a493dc3bb2c3.jpg","userName":"冷笑话"},{"contentImg":"http://app1.showapi.com/weixin_info/article/9b0884ef-ac11-4b46-9692-a16ba81451dc.jpg","date":"2015-09-29 12:34","id":"560a2b446e3629cf03e84508","title":"你来抢楼，我来送，两百万红包献给队长!","typeId":"0","typeName":"热点","url":"http://mp.weixin.qq.com/s?__biz=MzA5NTE2NjQ4Mw==&mid=418946237&idx=2&sn=961c598f92e6cda02ab65d2c04061f10&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/ce5b0243-ed71-495b-9063-67159f888000.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/54116a91-7bbb-4be9-a182-3aee616d8d8d.jpg","userName":"全民突击"},{"contentImg":"http://app1.showapi.com/weixin_info/article/e3d7316c-c09a-41dc-9fd4-4598f6d0a92d.jpg","date":"2015-09-29 12:47","id":"560a2b446e3629cf03e84507","title":"不是我想逞强，只是除了自己没有谁能永远依仗","typeId":"0","typeName":"热点","url":"http://mp.weixin.qq.com/s?__biz=MzA3MTE0NDkxNg==&mid=773148034&idx=8&sn=d98dcb0e23541498948afc304210a8a0&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/60d27f83-4fad-4ef7-a4ca-9c86a0583b32.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/0979c590-4ae8-46dd-bb85-2877490cee47.jpg","userName":"卡妞微秀"},{"contentImg":"http://app1.showapi.com/weixin_info/article/21f6cc03-4954-40e2-86df-809aa567989f.jpg","date":"2015-09-29 12:42","id":"560a2b446e3629cf03e84506","title":"你并不会失去爱的能力","typeId":"0","typeName":"热点","url":"http://mp.weixin.qq.com/s?__biz=MjM5MDMyMzg2MA==&mid=216463809&idx=1&sn=a07454f1d518ac1b4aac1c85e3d82151&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/1141e703-efa6-4856-b4a5-713a8532a7ad.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/a7cb508f-0a2d-4ce1-a170-59e2e96f9a5b.jpg","userName":"十点读书"},{"contentImg":"http://app1.showapi.com/weixin_info/article/5adedf2c-2635-4bd0-a912-60a373039836.jpg","date":"2015-09-29 12:20","id":"560a2b446e3629cf03e84505","title":"央视：聪明你的旅行，去哪儿网的智慧旅游布局","typeId":"1","typeName":"推荐","url":"http://mp.weixin.qq.com/s?__biz=MzA3MDEzOTMwMw==&mid=214882224&idx=4&sn=a42982f730dfb18c447eda4783774229&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/f7acad85-0537-4dd6-b845-65a45a34f011.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/5841c06e-5af9-49ec-955c-c7454e6b9965.jpg","userName":"品橙旅游"},{"contentImg":"http://app1.showapi.com/weixin_info/article/e4198600-82ce-44c0-bc77-8aa562f44e68.jpg","date":"2015-09-29 12:29","id":"560a2b446e3629cf03e84504","title":"日本旅游攻略：冲绳另类游","typeId":"1","typeName":"推荐","url":"http://mp.weixin.qq.com/s?__biz=MjM5OTAzNDY1OQ==&mid=208230828&idx=3&sn=ae0df818774a424448f11dd898b6e212&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/2f197a81-0636-456e-bbe0-82607975fe9d.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/22eb6c16-c358-4fe7-ae36-cdcd61e9f69e.jpg","userName":"在日华人圈"},{"contentImg":"http://app1.showapi.com/weixin_info/article/e512080c-0dad-4151-b2fe-ceee0912541d.jpg","date":"2015-09-29 12:26","id":"560a2b446e3629cf03e84503","title":"发改委：有车位才能买车可能在中国推行","typeId":"1","typeName":"推荐","url":"http://mp.weixin.qq.com/s?__biz=MjM5MTE5NTI4MQ==&mid=208881834&idx=5&sn=1fb69be9fa0ec30a6d15a12f631ee3ad&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/e55b88bc-e3a1-40fd-a386-20333d3e413d.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/ca42f833-353d-4989-be2d-968efc222e96.jpg","userName":"12缸汽车"},{"contentImg":"http://app1.showapi.com/weixin_info/article/3a56a474-597f-45e2-aee5-0fec39b0e2c5.jpg","date":"2015-09-29 12:25","id":"560a2b446e3629cf03e84502","title":"生个聪明女儿的下场，你个死鬼哈哈哈","typeId":"1","typeName":"推荐","url":"http://mp.weixin.qq.com/s?__biz=MzA5MDA3NjYyMA==&mid=210790632&idx=4&sn=c97df9154a6d33e7003b1dc69e2d7780&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/7173126e-cd51-4cfa-82c3-fba60fef93d5.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/5d8cbd48-ccf8-4ced-b329-2f821dba63d3.jpg","userName":"信托行业网"},{"contentImg":"http://app1.showapi.com/weixin_info/article/0bd60e9f-27c9-45ca-bdd3-9d32e1d2a825.jpg","date":"2015-09-29 11:54","id":"560a2b446e3629cf03e84501","title":"十二星座适合住多大的房子?","typeId":"18","typeName":"星座控","url":"http://mp.weixin.qq.com/s?__biz=MzAwOTUyNzQ0NA==&mid=211535591&idx=2&sn=0f7a0bc78371a3387353ab272d801c19&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/7f0aab13-9ee3-4346-b88f-f3d8b58a40e7.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/0fcb15d2-05be-4b44-8a6b-42b725b738b7.jpg","userName":"我和星座的日常"},{"contentImg":"http://app1.showapi.com/weixin_info/article/fd46ed71-b7e6-4b16-ace1-b78b1c2931fa.jpg","date":"2015-09-29 12:28","id":"560a2b446e3629cf03e84500","title":"5板块资金净流入暴增 10股遭大幅加仓","typeId":"1","typeName":"推荐","url":"http://mp.weixin.qq.com/s?__biz=MjM5NDAwMzIyMA==&mid=217107847&idx=4&sn=758b91398f7cfc0d29f80e29b0a78ee5&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/dc0ea1da-c557-4516-a307-bcab3b33b27a.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/6a11adbe-b766-479c-a828-3969a0bb4e0b.jpg","userName":"股票雷达"},{"contentImg":"http://app1.showapi.com/weixin_info/article/1320f3b5-fbf3-4403-b8fc-285c4d7ccf71.jpg","date":"2015-09-29 11:57","id":"560a2b446e3629cf03e844ff","title":"中秋过后的第一周，你的星座运势是怎么样的呢?","typeId":"18","typeName":"星座控","url":"http://mp.weixin.qq.com/s?__biz=MzAxNjY4MjEwMA==&mid=209553605&idx=3&sn=555e0759421be0cc7d61ede8ef73b917&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/d2efada8-7363-47d9-826b-d51322463778.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/5ddd35d4-b7be-4950-a078-63c6bc87821d.jpg","userName":"每天一测"},{"contentImg":"http://app1.showapi.com/weixin_info/article/d49e0836-32a5-4cfe-b7ae-d761e4cf1002.jpg","date":"2015-09-29 12:40","id":"560a2b446e3629cf03e844fe","title":"7岁童声《我只在乎你》，听醉了!","typeId":"1","typeName":"推荐","url":"http://mp.weixin.qq.com/s?__biz=MjM5NzI2NDgyMA==&mid=218849504&idx=4&sn=9bac32c99c0c70d1dfc461f3ddba9299&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/bd041919-e7b5-4440-8ecf-cb2ff12ea5e1.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/7de75b5d-cc67-4fe3-9823-aa9fc51771af.jpg","userName":"全球搞笑视频榜"},{"contentImg":"http://app1.showapi.com/weixin_info/article/bd75b692-bb69-46ce-81f4-7966284ff18d.jpg","date":"2015-09-29 12:46","id":"560a2b446e3629cf03e844fd","title":"太像苏迪罗了!!台风杜鹃明晨或连江登陆，警惕\u201c...","typeId":"1","typeName":"推荐","url":"http://mp.weixin.qq.com/s?__biz=MTQ2NTI0MTgwMQ==&mid=210941260&idx=1&sn=a8728be75caafcb576d31b181964ab3f&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/eacb9166-65f7-4ab2-87ef-b66da8f8cb06.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/2623d95f-d45c-4236-96c6-727785036928.jpg","userName":"东南快报"},{"contentImg":"http://app1.showapi.com/weixin_info/article/953d2afa-edb5-4b7a-8185-094aa3424738.jpg","date":"2015-09-29 11:58","id":"560a2b446e3629cf03e844fc","title":"天蝎座今日运势9.28","typeId":"18","typeName":"星座控","url":"http://mp.weixin.qq.com/s?__biz=MjM5ODU0MTk0MA==&mid=210810721&idx=2&sn=c73dc6ed519a8566af573613da0fac10&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/3e9fec49-3675-4341-8f92-449dcd80ccae.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/05666a4a-a148-4d40-a8ca-8d05b742ae69.jpg","userName":"天蝎座专属"},{"contentImg":"http://app1.showapi.com/weixin_info/article/fb2accba-76ab-4c00-b918-b5ed83dae22a.jpg","date":"2015-09-29 12:00","id":"560a2b446e3629cf03e844fb","title":"十二星座给人的第一印象，快来对号入座!","typeId":"18","typeName":"星座控","url":"http://mp.weixin.qq.com/s?__biz=MzA3NzA2OTI2Nw==&mid=212775188&idx=5&sn=729de3fae624b7bb1b1dc496a1f85c97&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/292e84a7-3c72-4ef9-a743-661413beb9df.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/7c98e102-250d-4a55-b8c7-1c20df6c9dab.jpg","userName":"星座小窝"},{"contentImg":"http://app1.showapi.com/weixin_info/article/dc632d2f-491e-4031-aebd-8eab85f35d74.jpg","date":"2015-09-29 12:44","id":"560a2b446e3629cf03e844fa","title":"量身定制的十二星座海岛，我很好奇你是哪片~","typeId":"18","typeName":"星座控","url":"http://mp.weixin.qq.com/s?__biz=MjM5NzIxODEyMg==&mid=225054125&idx=6&sn=2f71863032c983805c284b8bef2293a5&3rd=MzA3MDU4NTYzMw==&scene=6#rd","userLogo":"http://app1.showapi.com/weixin_info/article/3b99b4d8-22e8-4bdf-8b76-f04e6af54696.jpg","userLogo_code":"http://app1.showapi.com/weixin_info/article/3af5bc50-a87c-4c5f-afb6-bb659c5939c9.jpg","userName":"意大利华人"}]
             * currentPage : 1
             * maxResult : 20
             */

            private int allNum;
            private int allPages;
            private int currentPage;
            private int maxResult;
            private List<ContentlistEntity> contentlist;

            public void setAllNum(int allNum) {
                this.allNum = allNum;
            }

            public void setAllPages(int allPages) {
                this.allPages = allPages;
            }

            public void setCurrentPage(int currentPage) {
                this.currentPage = currentPage;
            }

            public void setMaxResult(int maxResult) {
                this.maxResult = maxResult;
            }

            public void setContentlist(List<ContentlistEntity> contentlist) {
                this.contentlist = contentlist;
            }

            public int getAllNum() {
                return allNum;
            }

            public int getAllPages() {
                return allPages;
            }

            public int getCurrentPage() {
                return currentPage;
            }

            public int getMaxResult() {
                return maxResult;
            }

            public List<ContentlistEntity> getContentlist() {
                return contentlist;
            }

            public static class ContentlistEntity implements Serializable{
                /**
                 * contentImg : http://app1.showapi.com/weixin_info/article/1aa11847-c36c-451d-9333-068dc5872308.jpg
                 * date : 2015-09-29 12:00
                 * id : 560a2b446e3629cf03e8450e
                 * title : 早秋裙子怎么穿?跟着学起来准没错!
                 * typeId : 0
                 * typeName : 热点
                 * url : http://mp.weixin.qq.com/s?__biz=MjM5Njc4MDIzNw==&mid=219500088&idx=3&sn=14fbf6dcf02aea3082dfdcc5adf666fe&3rd=MzA3MDU4NTYzMw==&scene=6#rd
                 * userLogo : http://app1.showapi.com/weixin_info/article/09fe9af9-3e4f-4355-b0e6-0f40fc0867f9.jpg
                 * userLogo_code : http://app1.showapi.com/weixin_info/article/434d2fda-9ddd-4f11-839f-b50cca8f7d6c.jpg
                 * userName : 时尚女装搭配
                 */

                private String contentImg;
                private String date;
                private String id;
                private String title;
                private String typeId;
                private String typeName;
                private String url;
                private String userLogo;
                private String userLogo_code;
                private String userName;

                public void setContentImg(String contentImg) {
                    this.contentImg = contentImg;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public void setTypeId(String typeId) {
                    this.typeId = typeId;
                }

                public void setTypeName(String typeName) {
                    this.typeName = typeName;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public void setUserLogo(String userLogo) {
                    this.userLogo = userLogo;
                }

                public void setUserLogo_code(String userLogo_code) {
                    this.userLogo_code = userLogo_code;
                }

                public void setUserName(String userName) {
                    this.userName = userName;
                }

                public String getContentImg() {
                    return contentImg;
                }

                public String getDate() {
                    return date;
                }

                public String getId() {
                    return id;
                }

                public String getTitle() {
                    return title;
                }

                public String getTypeId() {
                    return typeId;
                }

                public String getTypeName() {
                    return typeName;
                }

                public String getUrl() {
                    return url;
                }

                public String getUserLogo() {
                    return userLogo;
                }

                public String getUserLogo_code() {
                    return userLogo_code;
                }

                public String getUserName() {
                    return userName;
                }
            }
        }
    }
}
