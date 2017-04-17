# Logcat
### 截图
![截图](https://github.com/BruceAnda/Android52/blob/master/screenshot/day02/pic/pic10.png)
![截图](https://github.com/BruceAnda/Android52/blob/master/screenshot/day02/pic/pic11.png)

### 布局代码
```
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="zhaoliang.com.android52.ui.day02.logcat.LogcatActivity">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerInParent="true"
        android:text="@string/day02_values52"/>
</RelativeLayout>
```
### Java代码
```
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
```