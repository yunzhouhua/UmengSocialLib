package me.social.share.demo.umengsociallib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import me.social.share.umengsociallib.SocialShare;

public class MainActivity extends AppCompatActivity {

    {
        SocialShare.configQQZone("101215409", "aaec2e7e9269e277d1ce49c2d8409b55");
        SocialShare.configWeChat("wxeed642306999d236", "e0477182953a9fff013d2c597fca4e87");
        SocialShare.configSina("1858849645", "0d8e566c1a16389a96f0f48ee772d237", "http://sns.whalecloud.com");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SocialShare.start(this, true);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        SocialShare.onActivityResult(this, requestCode, resultCode, data);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        SocialShare.release(this);
    }

    /**
     * QQ好友分享
     * @param view
     */
    public void shareQQ(View view) {
    }

    /**
     * QQ空间分享
     * @param view
     */
    public void shareQZone(View view) {
    }

    /**
     * 微信好友分享
     * @param view
     */
    public void shareWeChat(View view) {
    }

    /**
     * 微信朋友圈分享
     * @param view
     */
    public void shareWeChatCircle(View view) {

    }

    /**
     * 微博分享
     * @param view
     */
    public void shareWeibo(View view) {

    }

    /**
     * 显示Umeng自带的分享面板
     * @param view
     */
    public void shareBoard(View view) {
        SocialShare.share(this);
    }
}
