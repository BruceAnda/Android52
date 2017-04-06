package zhaoliang.com.android52.ui.base;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import zhaoliang.com.android52.R;

/**
 * list基类
 * Created by zhaoliang on 2017/4/6.
 */

public abstract class BaseListActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this, R.layout.list_item, R.id.tv_content, fillData()));
    }

    /**
     * 填充数据
     *
     * @return
     */
    protected abstract String[] fillData();

}
