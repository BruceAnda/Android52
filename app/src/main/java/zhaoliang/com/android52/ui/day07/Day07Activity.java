package zhaoliang.com.android52.ui.day07;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;

import zhaoliang.com.android52.R;
import zhaoliang.com.android52.ui.ads.nativeads.BaseNativeAdListActivity;
import zhaoliang.com.android52.ui.day07.bootcomplete.BootCompleteActivity;
import zhaoliang.com.android52.ui.day07.custombroad.CustomBroadActivity;
import zhaoliang.com.android52.ui.day07.ipdialer.IpDialerActivity;
import zhaoliang.com.android52.ui.day07.orderbroad.OrderBroadActivity;
import zhaoliang.com.android52.ui.day07.packagebroad.PackageBroadActivity;
import zhaoliang.com.android52.ui.day07.phonerecoder.PhoneRecoderActivity;
import zhaoliang.com.android52.ui.day07.sdcardbroad.SDCardBroadActivity;
import zhaoliang.com.android52.ui.day07.smsbroad.SmsBroadActivity;

/**
 * 广播和服务上
 */
public class Day07Activity extends BaseNativeAdListActivity {

    /**
     * 填充列表数据
     *
     * @return
     */
    @Override
    protected String[] fillData() {
        return getResources().getStringArray(R.array.Day07);
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
                intent = new Intent(this, IpDialerActivity.class);
                break;
            case 2:
                intent = new Intent(this, SmsBroadActivity.class);
                break;
            case 4:
                intent = new Intent(this, SDCardBroadActivity.class);
                break;
            case 6:
                intent = new Intent(this, BootCompleteActivity.class);
                break;
            case 8:
                intent = new Intent(this, PackageBroadActivity.class);
                break;
            case 10:
                intent = new Intent(this, CustomBroadActivity.class);
                break;
            case 12:
                intent = new Intent(this, OrderBroadActivity.class);
                break;
            case 14:
                intent = new Intent(this, PhoneRecoderActivity.class);
                break;
        }
        if (intent != null)
            startActivity(intent);
    }
}
