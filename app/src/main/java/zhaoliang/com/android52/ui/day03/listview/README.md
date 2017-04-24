# ListView
### 截图
![截图](https://github.com/BruceAnda/Android52/blob/master/screenshot/day03/pic/pic4.png)

### 布局代码
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context="zhaoliang.com.android52.ui.day03.listview.ListViewActivity">

    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="ArrayAdapter" />

    <ListView
        android:id="@+id/list_array_adapter"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1" />

    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="SimpleAdapter" />

    <ListView
        android:id="@+id/list_simple_adapter"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1" />

    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="CustomAdapter" />

    <ListView
        android:id="@+id/list_custom_adapter"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1" />

</LinearLayout>
```
### Java代码
```
package zhaoliang.com.android52.ui.day03.listview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import zhaoliang.com.android52.R;

/**
 * ListView的使用
 */
public class ListViewActivity extends Activity {

    private ListView mListArrayAdapter, mListSimpleAdapter, mListCustomAdapter;
    private String[] names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        names = getResources().getStringArray(R.array.Names);

        mListArrayAdapter = (ListView) findViewById(R.id.list_array_adapter);
        mListSimpleAdapter = (ListView) findViewById(R.id.list_simple_adapter);
        mListCustomAdapter = (ListView) findViewById(R.id.list_custom_adapter);

        mListArrayAdapter.setAdapter(new ArrayAdapter<String>(this, R.layout.list_item, R.id.tv_content, names));

        LinkedList<Map<String, String>> data = new LinkedList<>();
        Map<String, String> data1 = new HashMap<>();
        data1.put("name", names[0]);
        Map<String, String> data2 = new HashMap<>();
        data2.put("name", names[1]);
        Map<String, String> data3 = new HashMap<>();
        data3.put("name", names[2]);

        data.add(data1);
        data.add(data2);
        data.add(data3);
        String[] from = {"name"};
        int[] to = {R.id.tv_content};
        mListSimpleAdapter.setAdapter(new SimpleAdapter(this, data, R.layout.list_item, from, to));

        mListCustomAdapter.setAdapter(new MyAadapter());
    }

    /**
     * 自定义Adapter
     */
    class MyAadapter extends BaseAdapter {

        @Override
        public int getCount() {
            return names.length;
        }

        @Override
        public String getItem(int position) {
            return names[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder viewHolder = null;
            if (convertView == null) {
                convertView = View.inflate(ListViewActivity.this, R.layout.list_item, null);
                viewHolder = new ViewHolder(convertView);
                convertView.setTag(viewHolder);
            } else {
                viewHolder = (ViewHolder) convertView.getTag();
            }
            viewHolder.tvName.setText(getItem(position));
            return convertView;
        }

        class ViewHolder {
            TextView tvName;

            public ViewHolder(View item) {
                tvName = (TextView) item.findViewById(R.id.tv_content);
            }
        }
    }
}
```