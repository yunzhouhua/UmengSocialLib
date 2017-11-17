package me.social.share.umengsociallib;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import com.umeng.socialize.Config;
import com.umeng.socialize.PlatformConfig;
import com.umeng.socialize.ShareAction;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMWeb;

/**
 * Created by huayunzhou on 2017/11/16.
 */

public class SocialShare {

    public static void configWeChat(String id, String secretKey){
        PlatformConfig.setWeixin(id, secretKey);
    }

    public static void configQQZone(String id, String secretKey){
        PlatformConfig.setQQZone(id, secretKey);
    }

    public static void configSina(String id, String secretKey, String redirectUrl){
        PlatformConfig.setSinaWeibo(id, secretKey, redirectUrl);
    }

    /**
     * 调用分享页面入口Activity起始位置调用，onCreate()
     * @param context
     * @param isDebug   是否调试模式，即是否开启日志
     */
    public static void start(Context context, boolean isDebug){
        Config.DEBUG = isDebug;
        UMShareAPI.get(context);
    }

    /**
     * 调用分享页面入口Activity回调位置调用，onActivityResult()
     * @param context
     * @param requestCode
     * @param resultCode
     * @param data
     */
    public static void onActivityResult(Context context, int requestCode, int resultCode, Intent data){
        UMShareAPI.get(context).onActivityResult(requestCode, resultCode, data);
    }

    /**
     * 调用分享页面入口Activity销毁位置调用，onDestroy()
     * @param context
     */
    public static void release(Context context){
        UMShareAPI.get(context).release();
    }

    public static void share(Activity activity){
        UMWeb web = new UMWeb("http://www.baidu.com");
        web.setTitle("This is music title");//标题
        web.setDescription("my description");//描述
        new ShareAction(activity)
                .withMedia(web)
                .setDisplayList(SHARE_MEDIA.SINA,SHARE_MEDIA.QQ,SHARE_MEDIA.QZONE,SHARE_MEDIA.WEIXIN,SHARE_MEDIA.WEIXIN_CIRCLE)
                .open();
    }


}
