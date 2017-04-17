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
