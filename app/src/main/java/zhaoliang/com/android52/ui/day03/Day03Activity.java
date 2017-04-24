package zhaoliang.com.android52.ui.day03;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;

import zhaoliang.com.android52.R;
import zhaoliang.com.android52.ui.ads.nativeads.BaseNativeAdListActivity;
import zhaoliang.com.android52.ui.day03.dialog.DialogActivity;
import zhaoliang.com.android52.ui.day03.junit.JunitActivity;
import zhaoliang.com.android52.ui.day03.listview.ListViewActivity;
import zhaoliang.com.android52.ui.day03.sqlite.SqliteActivity;

/**
 * 数据存储和界面展示下
 */
public class Day03Activity extends BaseNativeAdListActivity {

    /**
     * 填充列表数据
     *
     * @return
     */
    @Override
    protected String[] fillData() {
        return getResources().getStringArray(R.array.Day03);
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
                intent = new Intent(this, JunitActivity.class);
                break;
            case 2:
                intent = new Intent(this, SqliteActivity.class);
                break;
            case 4:
                intent = new Intent(this, ListViewActivity.class);
                break;
            case 6:
                intent = new Intent(this, DialogActivity.class);
                break;
        }
        if (intent != null)
            startActivity(intent);
    }
}
