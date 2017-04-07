package zhaoliang.com.android52.ui.day06.activitylifecycle;

import android.app.Activity;
import android.os.Bundle;

import zhaoliang.com.android52.R;

public class ActivityLifeCycleActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
    }
}
