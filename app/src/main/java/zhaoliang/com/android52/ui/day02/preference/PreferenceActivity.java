package zhaoliang.com.android52.ui.day02.preference;

import android.os.Bundle;

import zhaoliang.com.android52.R;

/**
 * Preference 完成设置界面
 */
public class PreferenceActivity extends android.preference.PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_preference);
        addPreferencesFromResource(R.xml.my_settings);
    }
}
