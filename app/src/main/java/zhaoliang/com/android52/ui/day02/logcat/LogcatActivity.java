package zhaoliang.com.android52.ui.day02.logcat;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import zhaoliang.com.android52.R;

/**
 * Logcat的使用
 */
public class LogcatActivity extends Activity {

    public static final String TAG = LogcatActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logcat);

        Log.v(TAG, "verbose");
        Log.d(TAG, "debug");
        Log.i(TAG, "info");
        Log.w(TAG, "warn");
        Log.e(TAG, "error");
    }
}
