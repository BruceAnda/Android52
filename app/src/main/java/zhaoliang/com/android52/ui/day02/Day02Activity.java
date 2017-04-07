package zhaoliang.com.android52.ui.day02;

import android.content.Intent;
import android.view.View;
import android.widget.ListView;

import zhaoliang.com.android52.R;
import zhaoliang.com.android52.ui.base.BaseListActivity;
import zhaoliang.com.android52.ui.day02.commonlayout.CommonLayoutActivity;
import zhaoliang.com.android52.ui.day02.logcat.LogcatActivity;
import zhaoliang.com.android52.ui.day02.operatorxml.OperatorXMLActivity;
import zhaoliang.com.android52.ui.day02.preference.PreferenceActivity;
import zhaoliang.com.android52.ui.day02.sdstateandsize.SDStateAndSizeActivity;
import zhaoliang.com.android52.ui.day02.storageoption.StorageOptionActivity;

public class Day02Activity extends BaseListActivity {

    @Override
    protected String[] fillData() {
        return getResources().getStringArray(R.array.Day02);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent = null;
        switch (position) {
            case 0:
                intent = new Intent(this, CommonLayoutActivity.class);
                break;
            case 1:
                intent = new Intent(this, LogcatActivity.class);
                break;
            case 2:
                intent = new Intent(this, SDStateAndSizeActivity.class);
                break;
            case 3:
                intent = new Intent(this, StorageOptionActivity.class);
                break;
            case 4:
                intent = new Intent(this, OperatorXMLActivity.class);
                break;
            case 5:
                intent = new Intent(this, PreferenceActivity.class);
                break;
        }
        if (intent != null)
            startActivity(intent);
    }
}
