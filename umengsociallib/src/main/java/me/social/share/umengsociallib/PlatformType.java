package me.social.share.umengsociallib;

import com.umeng.socialize.bean.SHARE_MEDIA;

/**
 * 分享平台
 * Created by huayunzhou on 2017/11/16.
 */
public enum PlatformType {
    /**
     * QQ好友
     */
    PLATFORM_QQ(SHARE_MEDIA.QQ),
    /**
     * QQ空间
     */
    PLATFORM_QZONE(SHARE_MEDIA.QZONE),
    /**
     * 微信好友
     */
    PLATFORM_WECHAT(SHARE_MEDIA.WEIXIN),
    /**
     * 微信朋友圈
     */
    PLATFORM_WECHAT_CIRCLE(SHARE_MEDIA.WEIXIN_CIRCLE),
    /**
     * 新浪微博
     */
    PLATFORM_SINA(SHARE_MEDIA.SINA);

    private SHARE_MEDIA shareMedia;
    PlatformType(SHARE_MEDIA shareMedia) {
        this.shareMedia = shareMedia;
    }

    public SHARE_MEDIA getShareMedia(){
        return this.shareMedia;
    }

    @Override
    public String toString() {
        return shareMedia.toString();
    }
}
