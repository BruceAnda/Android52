package zhaoliang.com.android52.ui.day10;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;

import zhaoliang.com.android52.R;
import zhaoliang.com.android52.ui.ads.nativeads.BaseNativeAdListActivity;
import zhaoliang.com.android52.ui.day10.contentobserver.ContentObserverActivity;
import zhaoliang.com.android52.ui.day10.customcontentprovider.CustomContentProviderActivity;
import zhaoliang.com.android52.ui.day10.operatorconstacts.OperatorContactsActivity;
import zhaoliang.com.android52.ui.day10.operatorsms.OperatorSMSActivity;

/**
 * 内容提供者
 */
public class Day10Activity extends BaseNativeAdListActivity {

    /**
     * 填充列表数据
     *
     * @return
     */
    @Override
    protected String[] fillData() {
        return getResources().getStringArray(R.array.Day10);
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
                intent = new Intent(this, CustomContentProviderActivity.class);
                break;
            case 2:
                intent = new Intent(this, OperatorSMSActivity.class);
                break;
            case 4:
                intent = new Intent(this, OperatorContactsActivity.class);
                break;
            case 6:
                intent = new Intent(this, ContentObserverActivity.class);
                break;
        }
        if (intent != null)
            startActivity(intent);
    }
}
