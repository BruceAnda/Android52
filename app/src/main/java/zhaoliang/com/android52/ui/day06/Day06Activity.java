package zhaoliang.com.android52.ui.day06;

import android.content.Intent;
import android.view.View;
import android.widget.ListView;

import zhaoliang.com.android52.R;
import zhaoliang.com.android52.ui.base.BaseListActivity;
import zhaoliang.com.android52.ui.day06.activityjump.ActivityJumpActivity;
import zhaoliang.com.android52.ui.day06.activitylifecycle.ActivityLifeCycleActivity;
import zhaoliang.com.android52.ui.day06.activitylunchmode.ActivityLunchModeActivity;
import zhaoliang.com.android52.ui.day06.screenorientation.ScreenOrientationActivity;
import zhaoliang.com.android52.ui.day06.secondactivity.SecondActivity;
import zhaoliang.com.android52.ui.day06.startactivityforresult.StartActivityForResultActivity;

public class Day06Activity extends BaseListActivity {

    @Override
    protected String[] fillData() {
        return getResources().getStringArray(R.array.Day06);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent = null;
        switch (position) {
            case 0:
                intent = new Intent(this, SecondActivity.class);
                break;
            case 1:
                intent = new Intent(this, ActivityJumpActivity.class);
                break;
            case 2:
                intent = new Intent(this, ActivityLifeCycleActivity.class);
                break;
            case 3:
                intent = new Intent(this, ActivityLunchModeActivity.class);
                break;
            case 4:
                intent = new Intent(this, ScreenOrientationActivity.class);
                break;
            case 5:
                intent = new Intent(this, StartActivityForResultActivity.class);
                break;
        }
        if (intent != null)
            startActivity(intent);
    }
}
