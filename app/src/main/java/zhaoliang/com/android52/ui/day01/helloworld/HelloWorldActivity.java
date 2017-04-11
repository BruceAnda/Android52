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

    /**
     * 当Activity创建的时候系统自动调用这个方法
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 设置显示的内容布局文件
        setContentView(R.layout.activity_hello_world);
    }
}
