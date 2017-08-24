package com.voole.thirdpart2voole30;

/**
 * 第三方跳转action
 * Created by liq on 2017/3/18.
 */

public class ThirdPartActionUtil {

    public static final String ACTION_DATA = "Data";
    public static final String ACTION_EXTRA_DATA = "EXTRA_DATA";
    public static final String ACTION_MAIN = "com.upotv.vod.test.action.main";
    public static final String ACTION_HOME = "home";//首页


    public static final String FIRST_ACTION = "com.upotv.vod.test.action.";
    public static final String[] actions = new String[]{
            "recommend","film", "tvplay", "children", "division"
            , "animation","variety", "life", "documentary", "more"
            , "mine","programlist", "programlistdetail", "order","watchhistory"
            , "collection", "search", "ranking"};
    //首页频道 推荐
    public static final String ACTION_HOME_RECOMMEND = FIRST_ACTION + actions[0];
    //首页频道 电影
    public static final String ACTION_HOME_FILM = FIRST_ACTION + actions[1];
    //首页频道 电视剧
    public static final String ACTION_HOME_TVPLAY = FIRST_ACTION + actions[2];
    //首页频道 少儿
    public static final String ACTION_HOME_CHILDREN = FIRST_ACTION + actions[3];
    //首页频道 专区
    public static final String ACTION_HOME_DIVISION = FIRST_ACTION + actions[4];
    //首页频道 动漫
    public static final String ACTION_HOME_ANIMATION = FIRST_ACTION + actions[5];
    //首页频道 综艺
    public static final String ACTION_HOME_VARIETY = FIRST_ACTION + actions[6];
    //首页频道 生活
    public static final String ACTION_HOME_LIFE = FIRST_ACTION + actions[7];
    //首页频道 记录片
    public static final String ACTION_HOME_DOCUMENTARY = FIRST_ACTION + actions[8];
    //首页频道 更多
    public static final String ACTION_HOME_MORE = FIRST_ACTION + actions[9];
    //首页频道 我
    public static final String ACTION_HOME_MINE = FIRST_ACTION + actions[10];
    //节目列表
    public static final String ACTION_PROGRAMLIST = FIRST_ACTION + actions[11];
    //节目集详情页
    public static final String ACTION_PROGRAMLISTDETAIL = FIRST_ACTION + actions[12];
    //订购页面
    public static final String ACTION_ORDER = FIRST_ACTION + actions[13];
    //观看历史
    public static final String ACTION_WATCHHISTORY = FIRST_ACTION + actions[14];
    //我的收藏
    public static final String ACTION_COLLECTION = FIRST_ACTION + actions[15];
    //搜索页面
    public static final String ACTION_SEARCH = FIRST_ACTION + actions[16];
    //排行榜
    public static final String ACTION_RANKING = FIRST_ACTION + actions[17];
    /**
     * 栏目ID
     */
    public static final String NAVIGATOR_COLUMN_ID = "navigator_column_id";
    /**
     * 栏目名字
     */
    public static final String NAVIGATOR_COLUMN_NAME = "navigator_column_name";

}
