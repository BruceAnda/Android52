package zhaoliang.com.android52.ui.ads.bannerads;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import zhaoliang.com.android52.R;

/**
 * Created by zhaoliang on 2017/4/18.
 */

public abstract class BaseBannerAdActivity extends Activity {

    private AdView mAdView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(setContentView());
        findView();
    }

    /**
     * 设置布局文件
     *
     * @return
     */
    protected abstract int setContentView();

    /**
     * 查找控件
     */
    protected void findView() {
        // Gets the ad view defined in layout/ad_fragment.xml with ad unit ID set in
        // values/strings.xml.
        mAdView = (AdView) findViewById(R.id.ad_view);

        // Start loading the ad in the background.
        mAdView.loadAd(new AdRequest.Builder().build());
    }

    /** Called when leaving the activity */
    @Override
    public void onPause() {
        if (mAdView != null) {
            mAdView.pause();
        }
        super.onPause();
    }

    /** Called when returning to the activity */
    @Override
    public void onResume() {
        super.onResume();
        if (mAdView != null) {
            mAdView.resume();
        }
    }

    /** Called before the activity is destroyed */
    @Override
    public void onDestroy() {
        if (mAdView != null) {
            mAdView.destroy();
        }
        super.onDestroy();
    }
}
