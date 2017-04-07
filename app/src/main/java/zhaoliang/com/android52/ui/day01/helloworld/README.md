# HelloWorld
### 效果图
![截图](https://github.com/BruceAnda/Android52/blob/master/screenshot/day01/pic/pic2.png)

### 布局代码
```
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="zhaoliang.com.android52.ui.day01.helloworld.HelloWorldActivity">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerInParent="true"
        android:text="@string/day01_values1"
        android:textSize="22sp" />
</RelativeLayout>
```

### Java代码
```
package zhaoliang.com.android52.ui.day01.helloworld;

import android.app.Activity;
import android.os.Bundle;

import zhaoliang.com.android52.R;

/**
 * <pre>
 *     需求：在屏幕上显示HelloWorld的字样
 *     思路：
 *          1. 在屏幕上显示文字的控件是TextView
 *          2. TextView有一个text的属性可以用来写文字
 * </pre>
 */
public class HelloWorldActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);
    }
}
```