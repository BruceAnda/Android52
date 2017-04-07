package zhaoliang.com.android52.ui.day04;

import android.content.Intent;
import android.view.View;
import android.widget.ListView;

import zhaoliang.com.android52.R;
import zhaoliang.com.android52.ui.base.BaseListActivity;
import zhaoliang.com.android52.ui.day04.getandpost.GETAndPOSTActivity;
import zhaoliang.com.android52.ui.day04.htmlviewer.HTMLViewerActivity;
import zhaoliang.com.android52.ui.day04.imageviewer.ImageViewerActivity;
import zhaoliang.com.android52.ui.day04.simplenewsclient.SimpleNewsClientActivity;

public class Day04Activity extends BaseListActivity {

    @Override
    protected String[] fillData() {
        return getResources().getStringArray(R.array.Day04);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent = null;
        switch (position) {
            case 0:
                intent = new Intent(this, ImageViewerActivity.class);
                break;
            case 1:
                intent = new Intent(this, HTMLViewerActivity.class);
                break;
            case 2:
                intent = new Intent(this, SimpleNewsClientActivity.class);
                break;
            case 3:
                intent = new Intent(this, GETAndPOSTActivity.class);
                break;
        }
        if (intent != null)
            startActivity(intent);
    }
}
