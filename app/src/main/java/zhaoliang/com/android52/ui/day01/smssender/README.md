# SMSSender
### 截图
![截图](https://github.com/BruceAnda/Android52/blob/master/screenshot/day01/pic/pic4.png)

### 布局代码
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context="zhaoliang.com.android52.ui.day01.smssender.SmsSenderActivity">

    <!-- 输入电话好号码的编辑框 -->
    <EditText
        android:id="@+id/et_sms_phone_num"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="@string/day01_values2" />

    <!-- 输入短信内容的编辑框 -->
    <EditText
        android:id="@+id/et_sms_content"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1"
        android:gravity="top"
        android:hint="@string/day01_values4" />

    <!-- 发送按钮 -->
    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:onClick="send"
        android:text="@string/day01_values5" />
</LinearLayout>
```
### Java代码
```
package zhaoliang.com.android52.ui.day01.smssender;

import android.app.Activity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;

import zhaoliang.com.android52.R;

/**
 * <pre>
 *     需求：短信发送器
 *     思路：
 *          1. 需要有一个交互的界面，界面上有一个输入电话号码和短信内容的地方，有个发送按钮
 *          2. 点击发送按钮的时候把短信内容发送的输入的电话号码上
 *          3. 添加发送短信的权限
 * </pre>
 */
public class SmsSenderActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms_sender);
    }

    /**
     * 点击发送按钮调用这个方法
     *
     * @param view
     */
    public void send(View view) {
        // 1. 获取电话号码和短信内容
        EditText etPhoneNum = (EditText) findViewById(R.id.et_sms_phone_num);
        EditText etSmsContent = (EditText) findViewById(R.id.et_sms_content);
        String phoneNumStr = etPhoneNum.getText().toString();
        String smsContentStr = etSmsContent.getText().toString();
        // 2. 获取发送短信的api
        SmsManager smsManager = SmsManager.getDefault();
        // 3. 发送短信
        smsManager.sendMultipartTextMessage(phoneNumStr, null, smsManager.divideMessage(smsContentStr), null, null);
    }
}
```