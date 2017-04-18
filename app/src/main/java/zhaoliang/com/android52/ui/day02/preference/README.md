# HelloWorld
### 截图
![截图](https://github.com/BruceAnda/Android52/blob/master/screenshot/day02/pic/pic16.png)
![截图](https://github.com/BruceAnda/Android52/blob/master/screenshot/day02/pic/pic17.png)

### 布局代码
```
<?xml version="1.0" encoding="utf-8"?>
<PreferenceScreen xmlns:android="http://schemas.android.com/apk/res/android">

    <CheckBoxPreference
        android:summaryOff="@string/day02_values62"
        android:summaryOn="@string/day02_values63"
        android:title="@string/day02_values64" />
</PreferenceScreen>
```
### Java代码
```
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
```