# HTMLViewer
### 截图
![截图](https://github.com/BruceAnda/Android52/blob/master/screenshot/day04/pic/pic4.png)

### 布局代码
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context="zhaoliang.com.android52.ui.day04.htmlviewer.HTMLViewerActivity">

    <EditText
        android:id="@+id/et_htmlurl"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="@string/day04_values8" />

    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:onClick="show"
        android:text="@string/day04_values7" />

    <ScrollView
        android:layout_width="match_parent"
        android:layout_height="match_parent">

        <TextView
            android:id="@+id/tv_result"
            android:layout_width="match_parent"
            android:layout_height="match_parent" />
    </ScrollView>
</LinearLayout>
```
### Java代码
```
package zhaoliang.com.android52.ui.day04.htmlviewer;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import zhaoliang.com.android52.R;

/**
 * 网页源码查看器
 */
public class HTMLViewerActivity extends Activity {

    // 声明控件
    private EditText mEtHtmlUrl;
    private TextView mTvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_htmlviewer);

        mEtHtmlUrl = (EditText) findViewById(R.id.et_htmlurl);
        mTvResult = (TextView) findViewById(R.id.tv_result);
    }

    /**
     * 按钮点击调用
     *
     * @param view
     */
    public void show(View view) {
        new DonwloadTask().execute(mEtHtmlUrl.getText().toString());
    }

    /**
     * 下载任务
     */
    class DonwloadTask extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... params) {
            HttpURLConnection connection = null;
            try {
                URL url = new URL(params[0]);
                connection = (HttpURLConnection) url.openConnection();
                connection.setConnectTimeout(5000);
                connection.setReadTimeout(5000);
                if (connection.getResponseCode() == 200) {
                    InputStream inputStream = connection.getInputStream();
                    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                    int len = 0;
                    byte[] b = new byte[1024];
                    while ((len = inputStream.read(b)) != -1) {
                        outputStream.write(b, 0, len);
                    }
                    return new String(outputStream.toByteArray());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            mTvResult.setText(s);
        }
    }
}
```