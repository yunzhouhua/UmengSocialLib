package me.social.share.umengsociallib;

import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;

/**
 * 分享回调
 * Created by huayunzhou on 2017/11/17.
 */

public abstract class ShareCallback implements UMShareListener{

    public void onShareStart(PlatformType platformType){}

    public abstract void onShareResult(PlatformType platformType);

    public void onShareError(PlatformType platformType, Throwable throwable){}

    public void onShareCancle(PlatformType platformType){}

    @Override
    public void onStart(SHARE_MEDIA share_media) {
        onShareStart(mediaToType(share_media));
    }

    @Override
    public void onResult(SHARE_MEDIA share_media) {
        onShareResult(mediaToType(share_media));
    }

    @Override
    public void onError(SHARE_MEDIA share_media, Throwable throwable) {
        onShareError(mediaToType(share_media), throwable);
    }

    @Override
    public void onCancel(SHARE_MEDIA share_media) {
        onShareCancle(mediaToType(share_media));
    }

    /**
     *  get PlatformType by SHARE_MEDIA
     * @param media
     * @return
     */
    private PlatformType mediaToType(SHARE_MEDIA media){
        for(PlatformType type : PlatformType.values()){
            if(media.equals(type.getShareMedia())){
                return type;
            }
        }
        return null;
    }
}
