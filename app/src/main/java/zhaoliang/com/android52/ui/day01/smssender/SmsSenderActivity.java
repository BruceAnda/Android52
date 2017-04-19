package zhaoliang.com.android52.ui.day01.smssender;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;

import zhaoliang.com.android52.R;
import zhaoliang.com.android52.ui.ads.bannerads.BaseBannerAdActivity;

/**
 * <pre>
 *     需求：短信发送器
 *     思路：
 *          1. 需要有一个交互的界面，界面上有一个输入电话号码和短信内容的地方，有个发送按钮
 *          2. 点击发送按钮的时候把短信内容发送的输入的电话号码上
 *          3. 添加发送短信的权限
 * </pre>
 */
public class SmsSenderActivity extends BaseBannerAdActivity {

    @Override
    protected int setContentView() {
        return R.layout.activity_sms_sender;
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
