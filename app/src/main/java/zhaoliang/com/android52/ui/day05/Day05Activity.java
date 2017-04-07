package zhaoliang.com.android52.ui.day05;

import android.content.Intent;
import android.view.View;
import android.widget.ListView;

import zhaoliang.com.android52.R;
import zhaoliang.com.android52.ui.base.BaseListActivity;
import zhaoliang.com.android52.ui.day05.downloader.DownloaderActivity;
import zhaoliang.com.android52.ui.day05.httpclientandasynchttpclient.HttpClientAndAsyncHttpClientActivity;

public class Day05Activity extends BaseListActivity {

    @Override
    protected String[] fillData() {
        return getResources().getStringArray(R.array.Day05);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent = null;
        switch (position) {
            case 0:
                intent = new Intent(this, HttpClientAndAsyncHttpClientActivity.class);
                break;
            case 1:
                intent = new Intent(this, DownloaderActivity.class);
                break;
        }
        if (intent != null)
            startActivity(intent);
    }
}
