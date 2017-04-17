# SDStateAndSize
### 截图
![截图](https://github.com/BruceAnda/Android52/blob/master/screenshot/day02/pic/pic12.png)

### 布局代码
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context="zhaoliang.com.android52.ui.day02.sdstateandsize.SDStateAndSizeActivity">

    <TextView
        android:id="@+id/tv_sd_state"
        android:layout_width="match_parent"
        android:layout_height="wrap_content" />

    <TextView
        android:id="@+id/tv_sd_size"
        android:layout_width="match_parent"
        android:layout_height="wrap_content" />
</LinearLayout>
```
### Java代码
```
package zhaoliang.com.android52.ui.day02.sdstateandsize;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.text.format.Formatter;
import android.widget.TextView;

import zhaoliang.com.android52.R;

/**
 * SD目前状态和大小的获取
 */
public class SDStateAndSizeActivity extends Activity {

    // 声明控件
    private TextView mTvSdState, mTvSdSize;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sdstate_and_size);

        mTvSdState = (TextView) findViewById(R.id.tv_sd_state);
        mTvSdSize = (TextView) findViewById(R.id.tv_sd_size);

        mTvSdState.setText(Environment.getExternalStorageState());

        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
        int blockSize = statFs.getBlockSize();
        int blockCount = statFs.getBlockCount();
        int availableBlocks = statFs.getAvailableBlocks();
        mTvSdSize.setText("区块大小：" + Formatter.formatFileSize(this, blockSize) + "\n总空间：" + Formatter.formatFileSize(this, (long) blockSize * blockCount) + "\n可用空间：" + Formatter.formatFileSize(this, blockSize * availableBlocks));
    }
}
```