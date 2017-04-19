package zhaoliang.com.android52.ui.day04;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;

import zhaoliang.com.android52.R;
import zhaoliang.com.android52.ui.ads.nativeads.BaseNativeAdListActivity;
import zhaoliang.com.android52.ui.day04.getandpost.GETAndPOSTActivity;
import zhaoliang.com.android52.ui.day04.htmlviewer.HTMLViewerActivity;
import zhaoliang.com.android52.ui.day04.imageviewer.ImageViewerActivity;
import zhaoliang.com.android52.ui.day04.simplenewsclient.SimpleNewsClientActivity;

/**
 * 网络编程上
 */
public class Day04Activity extends BaseNativeAdListActivity {

    /**
     * 填充列表数据
     *
     * @return
     */
    @Override
    protected String[] fillData() {
        return getResources().getStringArray(R.array.Day04);
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
                intent = new Intent(this, ImageViewerActivity.class);
                break;
            case 2:
                intent = new Intent(this, HTMLViewerActivity.class);
                break;
            case 4:
                intent = new Intent(this, SimpleNewsClientActivity.class);
                break;
            case 6:
                intent = new Intent(this, GETAndPOSTActivity.class);
                break;
        }
        if (intent != null)
            startActivity(intent);
    }
}
