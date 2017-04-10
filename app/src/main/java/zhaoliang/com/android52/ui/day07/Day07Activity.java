package zhaoliang.com.android52.ui.day07;

import android.content.Intent;
import android.view.View;
import android.widget.ListView;

import zhaoliang.com.android52.R;
import zhaoliang.com.android52.ui.base.BaseListActivity;
import zhaoliang.com.android52.ui.day07.bootcomplete.BootCompleteActivity;
import zhaoliang.com.android52.ui.day07.custombroad.CustomBroadActivity;
import zhaoliang.com.android52.ui.day07.ipdialer.IpDialerActivity;
import zhaoliang.com.android52.ui.day07.orderbroad.OrderBroadActivity;
import zhaoliang.com.android52.ui.day07.packagebroad.PackageBroadActivity;
import zhaoliang.com.android52.ui.day07.phonerecoder.PhoneRecoderActivity;
import zhaoliang.com.android52.ui.day07.sdcardbroad.SDCardBroadActivity;
import zhaoliang.com.android52.ui.day07.smsbroad.SmsBroadActivity;

public class Day07Activity extends BaseListActivity {

    @Override
    protected String[] fillData() {
        return getResources().getStringArray(R.array.Day07);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent = null;
        switch (position) {
            case 0:
                intent = new Intent(this, IpDialerActivity.class);
                break;
            case 1:
                intent = new Intent(this, SmsBroadActivity.class);
                break;
            case 2:
                intent = new Intent(this, SDCardBroadActivity.class);
                break;
            case 3:
                intent = new Intent(this, BootCompleteActivity.class);
                break;
            case 4:
                intent = new Intent(this, PackageBroadActivity.class);
                break;
            case 5:
                intent = new Intent(this, CustomBroadActivity.class);
                break;
            case 6:
                intent = new Intent(this, OrderBroadActivity.class);
                break;
            case 7:
                intent = new Intent(this, PhoneRecoderActivity.class);
                break;
        }
        if (intent != null)
            startActivity(intent);
    }
}
