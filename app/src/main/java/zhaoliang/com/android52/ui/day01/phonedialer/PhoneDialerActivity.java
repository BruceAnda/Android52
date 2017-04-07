package zhaoliang.com.android52.ui.day01.phonedialer;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import zhaoliang.com.android52.R;

/**
 * <pre>
 *     需求：电话拨号器
 *     思路：
 *          1. 界面编写。首先要有一个输入电话号码的控件EditText，然后要有一个拨打按钮Button
 *          2. 给按钮添加点击事件，点击的时候拨打电话
 *          3. 添加拨打电话的权限
 * </pre>
 */
public class PhoneDialerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_dialer);
    }

    /**
     * 拨打电话按钮点击的时候调用这个方法
     *
     * @param view
     */
    public void callPhone(View view) {
        // 1. 获取电话号码
        EditText editText = (EditText) findViewById(R.id.et_phone_num);
        String phoneNumStr = editText.getText().toString();
        // 2. 创建拨打电话的意图
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:" + phoneNumStr));
        // 3. 拨打电话
        startActivity(intent);
    }
}
