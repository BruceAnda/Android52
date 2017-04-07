package zhaoliang.com.android52.ui.day03;

import android.content.Intent;
import android.view.View;
import android.widget.ListView;

import zhaoliang.com.android52.R;
import zhaoliang.com.android52.ui.base.BaseListActivity;
import zhaoliang.com.android52.ui.day03.dialog.DialogActivity;
import zhaoliang.com.android52.ui.day03.junit.JunitActivity;
import zhaoliang.com.android52.ui.day03.listview.ListViewActivity;
import zhaoliang.com.android52.ui.day03.sqlite.SqliteActivity;

public class Day03Activity extends BaseListActivity {

    @Override
    protected String[] fillData() {
        return getResources().getStringArray(R.array.Day03);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent = null;
        switch (position) {
            case 0:
                intent = new Intent(this, JunitActivity.class);
                break;
            case 1:
                intent = new Intent(this, SqliteActivity.class);
                break;
            case 2:
                intent = new Intent(this, ListViewActivity.class);
                break;
            case 3:
                intent = new Intent(this, DialogActivity.class);
                break;
        }
        if (intent != null)
            startActivity(intent);
    }
}
