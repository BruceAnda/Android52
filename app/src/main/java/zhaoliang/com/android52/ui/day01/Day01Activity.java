package zhaoliang.com.android52.ui.day01;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;

import zhaoliang.com.android52.R;
import zhaoliang.com.android52.ui.ads.nativeads.BaseNativeAdListActivity;
import zhaoliang.com.android52.ui.day01.clickevent.ClickEventActivity;
import zhaoliang.com.android52.ui.day01.helloworld.HelloWorldActivity;
import zhaoliang.com.android52.ui.day01.phonedialer.PhoneDialerActivity;
import zhaoliang.com.android52.ui.day01.smssender.SmsSenderActivity;

/**
 * 快速入门
 */
public class Day01Activity extends BaseNativeAdListActivity {

    /**
     * 填充列表数据
     *
     * @return
     */
    @Override
    protected String[] fillData() {
        return getResources().getStringArray(R.array.Day01);
    }

    /**
     * 列表点击
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
                intent = new Intent(this, HelloWorldActivity.class);
                break;
            case 2:
                intent = new Intent(this, PhoneDialerActivity.class);
                break;
            case 4:
                intent = new Intent(this, SmsSenderActivity.class);
                break;
            case 6:
                intent = new Intent(this, ClickEventActivity.class);
                break;
        }
        if (intent != null)
            startActivity(intent);
    }
}
