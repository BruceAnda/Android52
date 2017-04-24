package zhaoliang.com.android52.ui.day02.storageoption;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import zhaoliang.com.android52.R;
import zhaoliang.com.android52.ui.ads.bannerads.BaseBannerAdActivity;
import zhaoliang.com.android52.ui.day02.storageoption.activity.ExternalStorageActivity;
import zhaoliang.com.android52.ui.day02.storageoption.activity.InternalStorageActivity;
import zhaoliang.com.android52.ui.day02.storageoption.activity.SharedPreferencesActivity;

/**
 * 存储选择
 */
public class StorageOptionActivity extends BaseBannerAdActivity {

    @Override
    protected int setContentView() {
        return R.layout.activity_storage_option;
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
