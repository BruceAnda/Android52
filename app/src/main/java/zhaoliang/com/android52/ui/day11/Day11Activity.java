package zhaoliang.com.android52.ui.day11;

import android.content.Intent;
import android.view.View;
import android.widget.ListView;

import zhaoliang.com.android52.R;
import zhaoliang.com.android52.ui.base.BaseListActivity;
import zhaoliang.com.android52.ui.day11.animator.AnimatorActivity;
import zhaoliang.com.android52.ui.day11.fragment.FragmentActivity;

public class Day11Activity extends BaseListActivity {

    @Override
    protected String[] fillData() {
        return getResources().getStringArray(R.array.Day11);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent = null;
        switch (position) {
            case 0:
                intent = new Intent(this, FragmentActivity.class);
                break;
            case 1:
                intent = new Intent(this, AnimatorActivity.class);
                break;
        }
        if (intent != null)
            startActivity(intent);
    }
}
