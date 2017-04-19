package zhaoliang.com.android52.ui.day05;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;

import zhaoliang.com.android52.R;
import zhaoliang.com.android52.ui.ads.nativeads.BaseNativeAdListActivity;
import zhaoliang.com.android52.ui.day05.downloader.DownloaderActivity;
import zhaoliang.com.android52.ui.day05.httpclientandasynchttpclient.HttpClientAndAsyncHttpClientActivity;

/**
 * 网络编程下
 */
public class Day05Activity extends BaseNativeAdListActivity {

    /**
     * 填充列表数据
     *
     * @return
     */
    @Override
    protected String[] fillData() {
        return getResources().getStringArray(R.array.Day05);
    }

    /**
     * 列表点击事件
     *
     * @param parent
     * @param view
     * @param position
     * @param id
     */
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = null;
        switch (position) {
            case 0:
                intent = new Intent(this, HttpClientAndAsyncHttpClientActivity.class);
                break;
            case 2:
                intent = new Intent(this, DownloaderActivity.class);
                break;
        }
        if (intent != null)
            startActivity(intent);
    }
}
