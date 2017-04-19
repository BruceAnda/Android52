package zhaoliang.com.android52.ui.day11;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;

import zhaoliang.com.android52.R;
import zhaoliang.com.android52.ui.ads.nativeads.BaseNativeAdListActivity;
import zhaoliang.com.android52.ui.day11.animator.AnimatorActivity;
import zhaoliang.com.android52.ui.day11.fragment.FragmentActivity;

/**
 * 新特性和知识点回顾
 */
public class Day11Activity extends BaseNativeAdListActivity {

    /**
     * 填充列表数据
     *
     * @return
     */
    @Override
    protected String[] fillData() {
        return getResources().getStringArray(R.array.Day11);
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
                intent = new Intent(this, FragmentActivity.class);
                break;
            case 2:
                intent = new Intent(this, AnimatorActivity.class);
                break;
        }
        if (intent != null)
            startActivity(intent);
    }
}
