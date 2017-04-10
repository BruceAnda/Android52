package zhaoliang.com.android52.ui.day08;

import android.content.Intent;
import android.view.View;
import android.widget.ListView;

import zhaoliang.com.android52.R;
import zhaoliang.com.android52.ui.base.BaseListActivity;
import zhaoliang.com.android52.ui.day08.coderegistborad.CodeRegistBroadActivity;
import zhaoliang.com.android52.ui.day08.i18n.I18NActivity;
import zhaoliang.com.android52.ui.day08.leaderservice.LeaderServiceActivity;
import zhaoliang.com.android52.ui.day08.musicplayer.MusicPlayerActivity;
import zhaoliang.com.android52.ui.day08.paydemo.PayDemoActivity;
import zhaoliang.com.android52.ui.day08.service.ServiceActivity;
import zhaoliang.com.android52.ui.day08.startremoteservice.StartRemoteServiceActivity;
import zhaoliang.com.android52.ui.day08.styleandtheme.StyleAndThemeActivity;

public class Day08Activity extends BaseListActivity {

    @Override
    protected String[] fillData() {
        return getResources().getStringArray(R.array.Day08);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent = null;
        switch (position) {
            case 0:
                intent = new Intent(this, ServiceActivity.class);
                break;
            case 1:
                intent = new Intent(this, LeaderServiceActivity.class);
                break;
            case 2:
                intent = new Intent(this, MusicPlayerActivity.class);
                break;
            case 3:
                intent = new Intent(this, CodeRegistBroadActivity.class);
                break;
            case 4:
                intent = new Intent(this, StartRemoteServiceActivity.class);
                break;
            case 5:
                intent = new Intent(this, PayDemoActivity.class);
                break;
            case 6:
                intent = new Intent(this, StyleAndThemeActivity.class);
                break;
            case 7:
                intent = new Intent(this, I18NActivity.class);
                break;
        }
        if (intent != null)
            startActivity(intent);
    }
}
