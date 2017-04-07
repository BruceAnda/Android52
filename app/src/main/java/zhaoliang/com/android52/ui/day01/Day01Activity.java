package zhaoliang.com.android52.ui.day01;

import android.content.Intent;
import android.view.View;
import android.widget.ListView;

import zhaoliang.com.android52.R;
import zhaoliang.com.android52.ui.base.BaseListActivity;
import zhaoliang.com.android52.ui.day01.clickevent.ClickEventActivity;
import zhaoliang.com.android52.ui.day01.helloworld.HelloWorldActivity;
import zhaoliang.com.android52.ui.day01.phonedialer.PhoneDialerActivity;
import zhaoliang.com.android52.ui.day01.smssender.SmsSenderActivity;

/**
 * 第一天内容列表
 */
public class Day01Activity extends BaseListActivity {

    @Override
    protected String[] fillData() {
        return getResources().getStringArray(R.array.Day01);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent = null;
        switch (position) {
            case 0:
                intent = new Intent(this, HelloWorldActivity.class);
                break;
            case 1:
                intent = new Intent(this, PhoneDialerActivity.class);
                break;
            case 2:
                intent = new Intent(this, SmsSenderActivity.class);
                break;
            case 3:
                intent = new Intent(this, ClickEventActivity.class);
                break;
        }
        if (intent != null)
            startActivity(intent);
    }
}
