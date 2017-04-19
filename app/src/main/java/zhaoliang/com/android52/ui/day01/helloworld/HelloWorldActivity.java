package zhaoliang.com.android52.ui.day01.helloworld;

import zhaoliang.com.android52.R;
import zhaoliang.com.android52.ui.ads.bannerads.BaseBannerAdActivity;

/**
 * <pre>
 *     需求：在屏幕上显示HelloWorld的字样
 *     思路：
 *          1. 在屏幕上显示文字的控件是TextView
 *          2. TextView有一个text的属性可以用来写文字
 * </pre>
 */
public class HelloWorldActivity extends BaseBannerAdActivity {

    @Override
    protected int setContentView() {
        return R.layout.activity_hello_world;
    }
}
