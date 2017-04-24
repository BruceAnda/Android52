package zhaoliang.com.android52.ui.day02.logcat;

import android.os.Bundle;
import android.util.Log;

import zhaoliang.com.android52.R;
import zhaoliang.com.android52.ui.ads.bannerads.BaseBannerAdActivity;

/**
 * Logcat的使用
 */
public class LogcatActivity extends BaseBannerAdActivity {

    public static final String TAG = LogcatActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.v(TAG, "verbose");
        Log.d(TAG, "debug");
        Log.i(TAG, "info");
        Log.w(TAG, "warn");
        Log.e(TAG, "error");
    }

    @Override
    protected int setContentView() {
        return R.layout.activity_logcat;
    }
}
