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
