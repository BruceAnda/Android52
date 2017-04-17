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
