# StorageOption
### 截图
![截图](https://github.com/BruceAnda/Android52/blob/master/screenshot/day02/pic/pic13.png)
![截图](https://github.com/BruceAnda/Android52/blob/master/screenshot/day02/pic/pic14.png)

### 布局代码
1. StorageOptionActivity
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context="zhaoliang.com.android52.ui.day02.storageoption.StorageOptionActivity">

    <Button
        android:id="@+id/btn_internal_storage"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:onClick="storage"
        android:text="@string/day02_values57" />

    <Button
        android:id="@+id/btn_external_storage"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:onClick="storage"
        android:text="@string/day02_values58" />

    <Button
        android:id="@+id/btn_shared_preferences"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:onClick="storage"
        android:text="@string/day02_values59" />
</LinearLayout>
```
2. BaseStorageActiity
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context="zhaoliang.com.android52.ui.day02.storageoption.activity.base.BaseStorageActivity">

    <EditText
        android:id="@+id/et_username"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="@android:drawable/editbox_background"
        android:hint="@string/day02_values53" />

    <EditText
        android:id="@+id/et_password"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="@android:drawable/editbox_background"
        android:hint="@string/day02_values54" />

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">

        <CheckBox
            android:id="@+id/cb_remember"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:checked="true"
            android:text="@string/day02_values55" />

        <Button
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:onClick="login"
            android:text="@string/day02_values56" />
    </LinearLayout>
</LinearLayout>
```
### Java代码
1. StorageOptionActivity
```
package zhaoliang.com.android52.ui.day02.storageoption;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import zhaoliang.com.android52.R;
import zhaoliang.com.android52.ui.day02.storageoption.activity.ExternalStorageActivity;
import zhaoliang.com.android52.ui.day02.storageoption.activity.InternalStorageActivity;
import zhaoliang.com.android52.ui.day02.storageoption.activity.SharedPreferencesActivity;

/**
 * 存储选择
 */
public class StorageOptionActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storage_option);
    }

    /**
     * 点击按钮调用
     *
     * @param view
     */
    public void storage(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.btn_internal_storage:
                intent = new Intent(this, InternalStorageActivity.class);
                break;
            case R.id.btn_external_storage:
                intent = new Intent(this, ExternalStorageActivity.class);
                break;
            case R.id.btn_shared_preferences:
                intent = new Intent(this, SharedPreferencesActivity.class);
                break;
        }
        if (intent != null)
            startActivity(intent);
    }
}
```
2. BaseStorageActivity
```
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
```
3. InternalStorageActivity
```
package zhaoliang.com.android52.ui.day02.storageoption.activity;

import android.os.Bundle;

import java.io.File;
import java.util.Map;

import zhaoliang.com.android52.ui.day02.storageoption.activity.base.BaseStorageActivity;
import zhaoliang.com.android52.ui.day02.storageoption.util.StorageUtil;

/**
 * 内部存储
 */
public class InternalStorageActivity extends BaseStorageActivity {

    private String mPath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mPath = getFilesDir() + File.separator + "account.txt";
        super.onCreate(savedInstanceState);
    }

    @Override
    protected Map<String, String> readAccount() {
        return StorageUtil.readAccount(mPath);
    }

    @Override
    protected boolean saveAccount(String usernameStr, String passwordStr) {
        return StorageUtil.saveAccount(mPath, usernameStr, passwordStr);
    }
}
```
4. ExternalStorageActivity
```
package zhaoliang.com.android52.ui.day02.storageoption.activity;

import android.os.Bundle;
import android.os.Environment;

import java.io.File;
import java.util.Map;

import zhaoliang.com.android52.ui.day02.storageoption.activity.base.BaseStorageActivity;
import zhaoliang.com.android52.ui.day02.storageoption.util.StorageUtil;

/**
 * 外部存储
 */
public class ExternalStorageActivity extends BaseStorageActivity {

    private String mPath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mPath = Environment.getExternalStorageDirectory() + File.separator + "account.txt";
        super.onCreate(savedInstanceState);
    }

    @Override
    protected Map<String, String> readAccount() {
        return StorageUtil.readAccount(mPath);
    }

    @Override
    protected boolean saveAccount(String usernameStr, String passwordStr) {
        return StorageUtil.saveAccount(mPath, usernameStr, passwordStr);
    }
}
```
5. SharePreferencesActivity
```
package zhaoliang.com.android52.ui.day02.storageoption.activity;

import android.content.SharedPreferences;
import android.os.Bundle;

import java.util.Map;

import zhaoliang.com.android52.ui.day02.storageoption.activity.base.BaseStorageActivity;
import zhaoliang.com.android52.ui.day02.storageoption.util.StorageUtil;

/**
 * SharedPreferences
 */
public class SharedPreferencesActivity extends BaseStorageActivity {

    private SharedPreferences mSharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mSharedPreferences = getSharedPreferences("account", MODE_PRIVATE);
        super.onCreate(savedInstanceState);
    }

    @Override
    protected Map<String, String> readAccount() {
        return StorageUtil.readAccount(mSharedPreferences);
    }

    @Override
    protected boolean saveAccount(String usernameStr, String passwordStr) {
        return StorageUtil.saveAccount(mSharedPreferences, usernameStr, passwordStr);
    }
}
```
6. StorageUtil
```
package zhaoliang.com.android52.ui.day02.storageoption.util;

import android.content.SharedPreferences;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * 存储工具类
 * Created by zhaoliang on 2017/4/17.
 */

public class StorageUtil {

    /**
     * 保存账户信息到文件
     *
     * @param path
     * @param username
     * @param password
     * @return
     */
    public static boolean saveAccount(String path, String username, String password) {
        FileOutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(path);
            outputStream.write((username + "##" + password).getBytes());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }

    /**
     * 读取账户信息
     *
     * @param path
     * @return
     */
    public static Map<String, String> readAccount(String path) {
        Map<String, String> account = new HashMap<>();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
            String readLine = reader.readLine();
            String[] split = readLine.split("##");
            account.put("username", split[0]);
            account.put("password", split[1]);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return account;
    }

    /**
     * 保存账户信息
     *
     * @param sharedPreferences
     * @param username
     * @param password
     * @return
     */
    public static boolean saveAccount(SharedPreferences sharedPreferences, String username, String password) {
        sharedPreferences.edit().putString("username", username).putString("password", password).commit();
        return true;
    }

    /**
     * 读取账户信息
     *
     * @param sharedPreferences
     * @return
     */
    public static Map<String, String> readAccount(SharedPreferences sharedPreferences) {
        Map<String, String> account = new HashMap<>();
        account.put("username", sharedPreferences.getString("username", ""));
        account.put("password", sharedPreferences.getString("password", ""));
        return account;
    }
}
```