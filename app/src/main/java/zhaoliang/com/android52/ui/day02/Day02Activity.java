package zhaoliang.com.android52.ui.day02;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;

import zhaoliang.com.android52.R;
import zhaoliang.com.android52.ui.ads.nativeads.BaseNativeAdListActivity;
import zhaoliang.com.android52.ui.day02.commonlayout.CommonLayoutActivity;
import zhaoliang.com.android52.ui.day02.logcat.LogcatActivity;
import zhaoliang.com.android52.ui.day02.operatorxml.OperatorXMLActivity;
import zhaoliang.com.android52.ui.day02.preference.PreferenceActivity;
import zhaoliang.com.android52.ui.day02.sdstateandsize.SDStateAndSizeActivity;
import zhaoliang.com.android52.ui.day02.storageoption.StorageOptionActivity;

/**
 * 数据存储和界面展示上
 */
public class Day02Activity extends BaseNativeAdListActivity {

    /**
     * 填充列表数据
     *
     * @return
     */
    @Override
    protected String[] fillData() {
        return getResources().getStringArray(R.array.Day02);
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
                intent = new Intent(this, CommonLayoutActivity.class);
                break;
            case 2:
                intent = new Intent(this, LogcatActivity.class);
                break;
            case 4:
                intent = new Intent(this, SDStateAndSizeActivity.class);
                break;
            case 6:
                intent = new Intent(this, StorageOptionActivity.class);
                break;
            case 8:
                intent = new Intent(this, OperatorXMLActivity.class);
                break;
            case 10:
                intent = new Intent(this, PreferenceActivity.class);
                break;
        }
        if (intent != null)
            startActivity(intent);
    }
}
