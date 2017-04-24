# Junit
### 截图
![截图](https://github.com/BruceAnda/Android52/blob/master/screenshot/day03/pic/pic2.png)

### 布局代码
```
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="zhaoliang.com.android52.ui.day03.junit.JunitActivity">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerInParent="true"
        android:text="@string/day03_values1" />
</RelativeLayout>
```
### Java代码
1. JunitActivity
```
package zhaoliang.com.android52.ui.day03.junit;

import android.app.Activity;
import android.os.Bundle;

import zhaoliang.com.android52.R;

/**
 * 单元测试
 */
public class JunitActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_junit);
    }
}
```
2. UseJunit
```
package zhaoliang.com.android52.junit;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Created by zhaoliang on 2017/4/19.
 */
@RunWith(AndroidJUnit4.class)
public class UseJunit {

    @Test
    public void testAssert() {
        //assertEquals(3, 4);
        assertEquals(3, 3);
    }
}
```