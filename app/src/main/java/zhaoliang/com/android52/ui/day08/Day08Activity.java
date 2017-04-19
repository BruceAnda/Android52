package zhaoliang.com.android52.ui.day08;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;

import zhaoliang.com.android52.R;
import zhaoliang.com.android52.ui.ads.nativeads.BaseNativeAdListActivity;
import zhaoliang.com.android52.ui.day08.coderegistborad.CodeRegistBroadActivity;
import zhaoliang.com.android52.ui.day08.i18n.I18NActivity;
import zhaoliang.com.android52.ui.day08.leaderservice.LeaderServiceActivity;
import zhaoliang.com.android52.ui.day08.musicplayer.MusicPlayerActivity;
import zhaoliang.com.android52.ui.day08.paydemo.PayDemoActivity;
import zhaoliang.com.android52.ui.day08.service.ServiceActivity;
import zhaoliang.com.android52.ui.day08.startremoteservice.StartRemoteServiceActivity;
import zhaoliang.com.android52.ui.day08.styleandtheme.StyleAndThemeActivity;

/**
 * 广播和服务下
 */
public class Day08Activity extends BaseNativeAdListActivity {

    /**
     * 填充列表数据
     *
     * @return
     */
    @Override
    protected String[] fillData() {
        return getResources().getStringArray(R.array.Day08);
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
                intent = new Intent(this, ServiceActivity.class);
                break;
            case 2:
                intent = new Intent(this, LeaderServiceActivity.class);
                break;
            case 4:
                intent = new Intent(this, MusicPlayerActivity.class);
                break;
            case 6:
                intent = new Intent(this, CodeRegistBroadActivity.class);
                break;
            case 8:
                intent = new Intent(this, StartRemoteServiceActivity.class);
                break;
            case 10:
                intent = new Intent(this, PayDemoActivity.class);
                break;
            case 12:
                intent = new Intent(this, StyleAndThemeActivity.class);
                break;
            case 14:
                intent = new Intent(this, I18NActivity.class);
                break;
        }
        if (intent != null)
            startActivity(intent);
    }
}
