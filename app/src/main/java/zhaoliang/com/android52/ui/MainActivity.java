package zhaoliang.com.android52.ui;

import android.content.Intent;
import android.view.View;
import android.widget.ListView;

import zhaoliang.com.android52.R;
import zhaoliang.com.android52.ui.base.BaseListActivity;
import zhaoliang.com.android52.ui.day01.Day01Activity;
import zhaoliang.com.android52.ui.day02.Day02Activity;
import zhaoliang.com.android52.ui.day03.Day03Activity;
import zhaoliang.com.android52.ui.day04.Day04Activity;
import zhaoliang.com.android52.ui.day05.Day05Activity;
import zhaoliang.com.android52.ui.day06.Day06Activity;
import zhaoliang.com.android52.ui.day07.Day07Activity;
import zhaoliang.com.android52.ui.day08.Day08Activity;
import zhaoliang.com.android52.ui.day09.Day09Activity;
import zhaoliang.com.android52.ui.day10.Day10Activity;
import zhaoliang.com.android52.ui.day11.Day11Activity;
import zhaoliang.com.android52.ui.day12.Day12Activity;

/**
 * 主界面列表Activity
 */
public class MainActivity extends BaseListActivity {

    /**
     * 填充数据
     *
     * @return
     */
    @Override
    protected String[] fillData() {
        return getResources().getStringArray(R.array.MainItem);
    }

    /**
     * 列表项点击事件
     *
     * @param l
     * @param v
     * @param position
     * @param id
     */
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent = null;
        switch (position) {
            case 0:
                intent = new Intent(this, Day01Activity.class);
                break;
            case 1:
                intent = new Intent(this, Day02Activity.class);
                break;
            case 2:
                intent = new Intent(this, Day03Activity.class);
                break;
            case 3:
                intent = new Intent(this, Day04Activity.class);
                break;
            case 4:
                intent = new Intent(this, Day05Activity.class);
                break;
            case 5:
                intent = new Intent(this, Day06Activity.class);
                break;
            case 6:
                intent = new Intent(this, Day07Activity.class);
                break;
            case 7:
                intent = new Intent(this, Day08Activity.class);
                break;
            case 8:
                intent = new Intent(this, Day09Activity.class);
                break;
            case 9:
                intent = new Intent(this, Day10Activity.class);
                break;
            case 10:
                intent = new Intent(this, Day11Activity.class);
                break;
            case 11:
                intent = new Intent(this, Day12Activity.class);
                break;
        }
        if (intent != null)
            startActivity(intent);
    }
}
