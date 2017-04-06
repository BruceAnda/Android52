package zhaoliang.com.android52.ui.day01;

import zhaoliang.com.android52.R;
import zhaoliang.com.android52.ui.base.BaseListActivity;

public class Day01Activity extends BaseListActivity {

    @Override
    protected String[] fillData() {
        return getResources().getStringArray(R.array.Day01);
    }
}
