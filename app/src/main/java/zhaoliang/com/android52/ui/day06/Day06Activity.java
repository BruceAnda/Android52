package zhaoliang.com.android52.ui.day06;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;

import zhaoliang.com.android52.R;
import zhaoliang.com.android52.ui.ads.nativeads.BaseNativeAdListActivity;
import zhaoliang.com.android52.ui.day06.activityjump.ActivityJumpActivity;
import zhaoliang.com.android52.ui.day06.activitylifecycle.ActivityLifeCycleActivity;
import zhaoliang.com.android52.ui.day06.activitylunchmode.ActivityLunchModeActivity;
import zhaoliang.com.android52.ui.day06.screenorientation.ScreenOrientationActivity;
import zhaoliang.com.android52.ui.day06.secondactivity.SecondActivity;
import zhaoliang.com.android52.ui.day06.startactivityforresult.StartActivityForResultActivity;

/**
 * 页面跳转和数据传递
 */
public class Day06Activity extends BaseNativeAdListActivity {

    /**
     * 填充列表数据
     *
     * @return
     */
    @Override
    protected String[] fillData() {
        return getResources().getStringArray(R.array.Day06);
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
                intent = new Intent(this, SecondActivity.class);
                break;
            case 2:
                intent = new Intent(this, ActivityJumpActivity.class);
                break;
            case 4:
                intent = new Intent(this, ActivityLifeCycleActivity.class);
                break;
            case 6:
                intent = new Intent(this, ActivityLunchModeActivity.class);
                break;
            case 8:
                intent = new Intent(this, ScreenOrientationActivity.class);
                break;
            case 10:
                intent = new Intent(this, StartActivityForResultActivity.class);
                break;
        }
        if (intent != null)
            startActivity(intent);
    }
}
