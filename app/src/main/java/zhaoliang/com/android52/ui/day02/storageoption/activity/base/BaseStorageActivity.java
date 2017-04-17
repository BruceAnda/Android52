package zhaoliang.com.android52.ui.day02.storageoption.activity.base;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Map;

import zhaoliang.com.android52.R;

/**
 * 存储选项的基类
 */
public abstract class BaseStorageActivity extends Activity {

    // 声明界面上的控件
    private EditText mEtUsername, mEtPassword;
    private CheckBox mCbRemeber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_storage);

        // find view
        mEtUsername = (EditText) findViewById(R.id.et_username);
        mEtPassword = (EditText) findViewById(R.id.et_password);
        mCbRemeber = (CheckBox) findViewById(R.id.cb_remember);

        initData();
    }

    /**
     * 初始化数据
     */
    private void initData() {
        Map<String, String> account = readAccount();
        if (account != null) {
            mEtUsername.setText(account.get("username"));
            mEtPassword.setText(account.get("password"));
        }
    }

    /**
     * 读取账户信息
     *
     * @return
     */
    protected abstract Map<String, String> readAccount();

    /**
     * 点击登录按钮调用这个方法
     *
     * @param view
     */
    public void login(View view) {
        // 获取用户名和密码
        String usernameStr = mEtUsername.getText().toString();
        String passwordStr = mEtPassword.getText().toString();
        if (mCbRemeber.isChecked()) {
            boolean b = saveAccount(usernameStr, passwordStr);
            if (b)
                Toast.makeText(this, "保存成功！", Toast.LENGTH_SHORT).show();
        }
        Toast.makeText(this, "登录成功！", Toast.LENGTH_SHORT).show();
    }

    /**
     * 保存账户信息
     *
     * @param usernameStr
     * @param passwordStr
     * @return
     */
    protected abstract boolean saveAccount(String usernameStr, String passwordStr);
}
