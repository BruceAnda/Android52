package zhaoliang.com.android52.ui.day10;

import android.content.Intent;
import android.view.View;
import android.widget.ListView;

import zhaoliang.com.android52.R;
import zhaoliang.com.android52.ui.base.BaseListActivity;
import zhaoliang.com.android52.ui.day10.contentobserver.ContentObserverActivity;
import zhaoliang.com.android52.ui.day10.customcontentprovider.CustomContentProviderActivity;
import zhaoliang.com.android52.ui.day10.operatorconstacts.OperatorContactsActivity;
import zhaoliang.com.android52.ui.day10.operatorsms.OperatorSMSActivity;

public class Day10Activity extends BaseListActivity {

    @Override
    protected String[] fillData() {
        return getResources().getStringArray(R.array.Day10);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent = null;
        switch (position) {
            case 0:
                intent = new Intent(this, CustomContentProviderActivity.class);
                break;
            case 1:
                intent = new Intent(this, OperatorSMSActivity.class);
                break;
            case 2:
                intent = new Intent(this, OperatorContactsActivity.class);
                break;
            case 3:
                intent = new Intent(this, ContentObserverActivity.class);
                break;
        }
        if (intent != null)
            startActivity(intent);
    }
}
