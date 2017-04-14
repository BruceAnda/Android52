# CommonLayout

### 布局代码
1. 主界面

![截图](https://github.com/BruceAnda/Android52/blob/master/screenshot/day02/pic/pic2.png)
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context="zhaoliang.com.android52.ui.day02.commonlayout.CommonLayoutActivity">

    <Button
        android:id="@+id/layout1"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:onClick="layout"
        android:text="LinearLayoutDemoOne" />

    <Button
        android:id="@+id/layout2"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:onClick="layout"
        android:text="LinearLayoutDemoTwo" />

    <Button
        android:id="@+id/layout3"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:onClick="layout"
        android:text="RelativeLayoutDemoOne" />

    <Button
        android:id="@+id/layout4"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:onClick="layout"
        android:text="RelativeLayoutDemoTwo" />

    <Button
        android:id="@+id/layout5"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:onClick="layout"
        android:text="FrameLayoutDemo" />

    <Button
        android:id="@+id/layout6"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:onClick="layout"
        android:text="TableLayoutDemo" />

    <Button
        android:id="@+id/layout7"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:onClick="layout"
        android:text="AbsoluteLayoutDemo" />
</LinearLayout>
```
2. LinearLayoutDemoOne

![截图](https://github.com/BruceAnda/Android52/blob/master/screenshot/day02/pic/pic3.png)
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context="zhaoliang.com.android52.ui.day02.commonlayout.layout.LinearLayoutDemoOneActivity">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1"
        android:orientation="horizontal">

        <TextView
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:background="#aa0000" />

        <TextView
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:background="#00aa00" />

        <TextView
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:background="#0000aa" />

        <TextView
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:background="#aaaa00" />
    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1"
        android:orientation="vertical">

        <TextView
            android:layout_width="match_parent"
            android:layout_height="0dp"
            android:layout_weight="1"
            android:background="#aa0000" />

        <TextView
            android:layout_width="match_parent"
            android:layout_height="0dp"
            android:layout_weight="1"
            android:background="#00aa00" />

        <TextView
            android:layout_width="match_parent"
            android:layout_height="0dp"
            android:layout_weight="1"
            android:background="#0000aa" />

        <TextView
            android:layout_width="match_parent"
            android:layout_height="0dp"
            android:layout_weight="1"
            android:background="#aaaa00" />
    </LinearLayout>
</LinearLayout>
```
3. LinearLayoutDemoTwo
![截图](https://github.com/BruceAnda/Android52/blob/master/screenshot/day02/pic/pic4.png)
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context="zhaoliang.com.android52.ui.day02.commonlayout.layout.LinearLayoutDemoTwoActivity">

    <EditText
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1"
        android:background="@android:drawable/editbox_background" />

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1"
        android:orientation="horizontal">

        <Button
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:text="@string/day02_values8" />

        <Button
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:text="@string/day02_values9" />

        <Button
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:text="@string/day02_values10" />

        <Button
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:text="@string/day02_values11" />
    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1"
        android:orientation="horizontal">

        <Button
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:text="@string/day02_values12" />

        <Button
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:text="@string/day02_values13" />

        <Button
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:text="@string/day02_values14" />

        <Button
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:text="@string/day02_values15" />
    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1"
        android:orientation="horizontal">

        <Button
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:text="@string/day02_values16" />

        <Button
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:text="@string/day02_values17" />

        <Button
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:text="@string/day02_values18" />

        <Button
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:text="@string/day02_values19" />
    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1"
        android:orientation="horizontal">

        <Button
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:text="@string/day02_values20" />

        <Button
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:text="@string/day02_values21" />

        <Button
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:text="@string/day02_values22" />

        <Button
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:text="@string/day02_values23" />
    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="2"
        android:orientation="horizontal">

        <LinearLayout
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="3"
            android:orientation="vertical">

            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="0dp"
                android:layout_weight="1"
                android:orientation="horizontal">

                <Button
                    android:layout_width="0dp"
                    android:layout_height="match_parent"
                    android:layout_weight="1"
                    android:text="@string/day02_values24" />

                <Button
                    android:layout_width="0dp"
                    android:layout_height="match_parent"
                    android:layout_weight="1"
                    android:text="@string/day02_values25" />

                <Button
                    android:layout_width="0dp"
                    android:layout_height="match_parent"
                    android:layout_weight="1"
                    android:text="@string/day02_values26" />
            </LinearLayout>

            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="0dp"
                android:layout_weight="1"
                android:orientation="horizontal">

                <Button
                    android:layout_width="0dp"
                    android:layout_height="match_parent"
                    android:layout_weight="2"
                    android:text="@string/day02_values27" />

                <Button
                    android:layout_width="0dp"
                    android:layout_height="match_parent"
                    android:layout_weight="1"
                    android:text="@string/day02_values28" />
            </LinearLayout>
        </LinearLayout>

        <Button
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:text="@string/day02_values29" />
    </LinearLayout>
</LinearLayout>
```
4. RelativeLayoutDemoOne
![截图](https://github.com/BruceAnda/Android52/blob/master/screenshot/day02/pic/pic5.png)
```
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="zhaoliang.com.android52.ui.day02.commonlayout.layout.RelativeLayoutDemoOneActivity">

    <Button
        android:id="@+id/center"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerInParent="true"
        android:text="@string/day02_values30" />

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_above="@id/center"
        android:layout_alignLeft="@id/center"
        android:text="@string/day02_values31" />

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignLeft="@id/center"
        android:layout_below="@id/center"
        android:text="@string/day02_values32" />

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignTop="@id/center"
        android:layout_toLeftOf="@id/center"
        android:text="@string/day03_values33" />

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_above="@id/center"
        android:layout_toLeftOf="@id/center"
        android:text="@string/day02_values34" />

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@id/center"
        android:layout_toLeftOf="@id/center"
        android:text="@string/day02_values35" />

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignTop="@id/center"
        android:layout_toRightOf="@id/center"
        android:text="@string/day02_values36" />

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_above="@id/center"
        android:layout_toRightOf="@id/center"
        android:text="@string/day02_values37" />

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@id/center"
        android:layout_toRightOf="@id/center"
        android:text="@string/day02_values38" />
</RelativeLayout>
```
5. RelativeLayoutDemoTwo
![截图](https://github.com/BruceAnda/Android52/blob/master/screenshot/day02/pic/pic6.png)
```
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="zhaoliang.com.android52.ui.day02.commonlayout.layout.RelativeLayoutDemoTwoActivity">

    <ImageView
        android:id="@+id/center"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerInParent="true"
        android:src="@mipmap/center" />

    <ImageView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_above="@id/center"
        android:layout_alignLeft="@id/center"
        android:src="@mipmap/up" />

    <ImageView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignLeft="@id/center"
        android:layout_below="@id/center"
        android:src="@mipmap/bottom" />

    <ImageView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignTop="@id/center"
        android:layout_toLeftOf="@id/center"
        android:src="@mipmap/left" />

    <ImageView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_above="@id/center"
        android:layout_toLeftOf="@id/center"
        android:src="@mipmap/leftup" />

    <ImageView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@id/center"
        android:layout_toLeftOf="@id/center"
        android:src="@mipmap/leftbottom" />

    <ImageView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignTop="@id/center"
        android:layout_toRightOf="@id/center"
        android:src="@mipmap/right" />

    <ImageView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_above="@id/center"
        android:layout_toRightOf="@id/center"
        android:src="@mipmap/rightup" />

    <ImageView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@id/center"
        android:layout_toRightOf="@id/center"
        android:src="@mipmap/rightbottom" />
</RelativeLayout>
```
6. FrameLayoutDemo
![截图](https://github.com/BruceAnda/Android52/blob/master/screenshot/day02/pic/pic7.png)
```
<?xml version="1.0" encoding="utf-8"?>
<FrameLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="zhaoliang.com.android52.ui.day02.commonlayout.layout.FrameLayoutDemoActivity">

    <TextView
        android:id="@+id/tv1"
        android:layout_width="300dp"
        android:layout_height="300dp"
        android:layout_gravity="center"
        android:background="@color/colorOne" />

    <TextView
        android:id="@+id/tv2"
        android:layout_width="270dp"
        android:layout_height="270dp"
        android:layout_gravity="center"
        android:background="@color/colorTwo" />

    <TextView
        android:id="@+id/tv3"
        android:layout_width="240dp"
        android:layout_height="240dp"
        android:layout_gravity="center"
        android:background="@color/colorThree" />

    <TextView
        android:id="@+id/tv4"
        android:layout_width="210dp"
        android:layout_height="210dp"
        android:layout_gravity="center"
        android:background="@color/colorFour" />

    <TextView
        android:id="@+id/tv5"
        android:layout_width="180dp"
        android:layout_height="180dp"
        android:layout_gravity="center"
        android:background="@color/colorFive" />

    <TextView
        android:id="@+id/tv6"
        android:layout_width="150dp"
        android:layout_height="150dp"
        android:layout_gravity="center"
        android:background="@color/colorSix" />

    <TextView
        android:id="@+id/tv7"
        android:layout_width="120dp"
        android:layout_height="120dp"
        android:layout_gravity="center"
        android:background="@color/colorSeven" />
</FrameLayout>
```
7. TableLayoutDemo
![截图](https://github.com/BruceAnda/Android52/blob/master/screenshot/day02/pic/pic8.png)
```
<?xml version="1.0" encoding="utf-8"?>
<TableLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:stretchColumns="0, 1, 2"
    tools:context="zhaoliang.com.android52.ui.day02.commonlayout.layout.FrameLayoutDemoActivity">

    <TableRow>

        <TextView
            android:gravity="center"
            android:text="@string/day03_values39" />

        <TextView
            android:gravity="center"
            android:text="@string/day02_values40" />

        <TextView
            android:gravity="center"
            android:text="@string/day02_values41" />
    </TableRow>

    <TableRow>

        <TextView
            android:gravity="center"
            android:text="@string/day02_values42" />

        <TextView
            android:gravity="center"
            android:text="@string/day02_values43" />

        <TextView
            android:gravity="center"
            android:text="@string/day02_values44" />
    </TableRow>

    <TableRow>

        <TextView
            android:gravity="center"
            android:text="@string/day02_values45" />

        <TextView
            android:gravity="center"
            android:text="@string/day02_values46" />

        <TextView
            android:gravity="center"
            android:text="@string/day02_values47" />
    </TableRow>

    <TableRow>

        <TextView
            android:gravity="center"
            android:text="@string/day02_values48" />

        <TextView
            android:gravity="center"
            android:text="@string/day02_values49" />

        <TextView
            android:gravity="center"
            android:text="@string/day02_values50" />
    </TableRow>
</TableLayout>
```
8. AbsoluteLayoutDemo
![截图](https://github.com/BruceAnda/Android52/blob/master/screenshot/day02/pic/pic9.png)
```
<?xml version="1.0" encoding="utf-8"?>
<AbsoluteLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="zhaoliang.com.android52.ui.day02.commonlayout.layout.AbsolueLayoutDemoActivity">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_x="100dp"
        android:layout_y="200dp"
        android:text="@string/day02_values51" />
</AbsoluteLayout>
```
### Java代码
1. 主界面
```
package zhaoliang.com.android52.ui.day02.commonlayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import zhaoliang.com.android52.R;
import zhaoliang.com.android52.ui.day02.commonlayout.layout.AbsolueLayoutDemoActivity;
import zhaoliang.com.android52.ui.day02.commonlayout.layout.FrameLayoutDemoActivity;
import zhaoliang.com.android52.ui.day02.commonlayout.layout.LinearLayoutDemoOneActivity;
import zhaoliang.com.android52.ui.day02.commonlayout.layout.LinearLayoutDemoTwoActivity;
import zhaoliang.com.android52.ui.day02.commonlayout.layout.RelativeLayoutDemoOneActivity;
import zhaoliang.com.android52.ui.day02.commonlayout.layout.RelativeLayoutDemoTwoActivity;
import zhaoliang.com.android52.ui.day02.commonlayout.layout.TableLayoutDemoActivity;

/**
 * 常用布局
 */
public class CommonLayoutActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common_layout);
    }

    /**
     * 点击按钮事件
     *
     * @param view
     */
    public void layout(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.layout1:
                intent = new Intent(this, LinearLayoutDemoOneActivity.class);
                break;
            case R.id.layout2:
                intent = new Intent(this, LinearLayoutDemoTwoActivity.class);
                break;
            case R.id.layout3:
                intent = new Intent(this, RelativeLayoutDemoOneActivity.class);
                break;
            case R.id.layout4:
                intent = new Intent(this, RelativeLayoutDemoTwoActivity.class);
                break;
            case R.id.layout5:
                intent = new Intent(this, FrameLayoutDemoActivity.class);
                break;
            case R.id.layout6:
                intent = new Intent(this, TableLayoutDemoActivity.class);
                break;
            case R.id.layout7:
                intent = new Intent(this, AbsolueLayoutDemoActivity.class);
                break;
        }
        if (intent != null)
            startActivity(intent);
    }
}
```
2. LinearLayoutDemoOne
```
package zhaoliang.com.android52.ui.day02.commonlayout.layout;

import android.app.Activity;
import android.os.Bundle;

import zhaoliang.com.android52.R;

/**
 * 线性布局
 */
public class LinearLayoutDemoOneActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout_demo_one);
    }
}
```
3. LinearLayoutDemoTwo
```
package zhaoliang.com.android52.ui.day02.commonlayout.layout;

import android.app.Activity;
import android.os.Bundle;

import zhaoliang.com.android52.R;

/**
 * 线性布局
 */
public class LinearLayoutDemoTwoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout_demo_two);
    }
}
```
4. RelativeLayoutDemoOne
```
package zhaoliang.com.android52.ui.day02.commonlayout.layout;

import android.app.Activity;
import android.os.Bundle;

import zhaoliang.com.android52.R;

/**
 * 相对布局
 */
public class RelativeLayoutDemoOneActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout_demo_one);
    }
}
```
5. RelativeLayoutDemoTwo
```
package zhaoliang.com.android52.ui.day02.commonlayout.layout;

import android.app.Activity;
import android.os.Bundle;

import zhaoliang.com.android52.R;

/**
 * 相对布局
 */
public class RelativeLayoutDemoTwoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout_demo_two);
    }
}
```
6. FrameLayoutDemo
```
package zhaoliang.com.android52.ui.day02.commonlayout.layout;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;

import zhaoliang.com.android52.R;

/**
 * 帧布局
 */
public class FrameLayoutDemoActivity extends Activity {

    // 界面上Widget的id
    private int[] mIds = {R.id.tv1, R.id.tv2, R.id.tv3, R.id.tv4, R.id.tv5, R.id.tv6, R.id.tv7};
    // 声明界面上的TextView Widget
    private TextView[] mTextViews = new TextView[mIds.length];
    // 需要用到的颜色
    private int[] mColors = new int[mIds.length];
    private int[] mColorsRes = {R.color.colorOne, R.color.colorTwo, R.color.colorThree, R.color.colorFour, R.color.colorFive, R.color.colorSix, R.color.colorSeven};
    // 当前颜色
    private int mCurrentColor;
    // 改变颜色的Handler
    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            for (int i = 0; i < mIds.length; i++) {
                mTextViews[i].setBackgroundColor(mColors[(mCurrentColor + i) % 7]);
            }
            mCurrentColor++;
            sendEmptyMessageDelayed(0, 40);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout_demo);

        for (int i = 0; i < mIds.length; i++) {
            mTextViews[i] = (TextView) findViewById(mIds[i]);
            mColors[i] = getResources().getColor(mColorsRes[i]);
        }

        mHandler.sendEmptyMessage(0);
    }
}
```
7. TableLayoutDemo
```
package zhaoliang.com.android52.ui.day02.commonlayout.layout;

import android.app.Activity;
import android.os.Bundle;

import zhaoliang.com.android52.R;

/**
 * 表格布局
 */
public class TableLayoutDemoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_layout_demo);
    }
}
```
8. AbsoluteLayoutDemo
```
package zhaoliang.com.android52.ui.day02.commonlayout.layout;

import android.app.Activity;
import android.os.Bundle;

import zhaoliang.com.android52.R;

/**
 * 绝对布局
 */
public class AbsolueLayoutDemoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_absolue_layout_demo);
    }
}
```