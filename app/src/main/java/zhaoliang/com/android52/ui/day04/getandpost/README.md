# HelloWorld
### 截图
![截图](https://github.com/BruceAnda/Android52/blob/master/screenshot/day04/pic/pic6.png)

### 布局代码
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context="zhaoliang.com.android52.ui.day04.getandpost.GETAndPOSTActivity">

    <EditText
        android:id="@+id/et_city_name"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="@string/day04_values9" />

    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:onClick="get"
        android:text="@string/day04_values10" />

    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:onClick="post"
        android:text="@string/day04_values11" />

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
package zhaoliang.com.android52.ui.day04.getandpost;

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
 * GET和POST
 */
public class GETAndPOSTActivity extends Activity {

    private String mApi = "http://api.avatardata.cn/Weather/Query?";
    private String mParams = "key=1eff919c31ce4787ab230f6e26feef10&cityname=";

    private EditText mEtCityname;
    private TextView mTvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getand_post);

        mEtCityname = (EditText) findViewById(R.id.et_city_name);
        mTvResult = (TextView) findViewById(R.id.tv_result);
    }

    /**
     * GET方式获取数据
     *
     * @param view
     */
    public void get(View view) {
        new GETTask().execute(mApi + mParams + mEtCityname.getText().toString());
    }

    /**
     * POST方式获取数据
     *
     * @param view
     */
    public void post(View view) {
        new POSTTask().execute(mApi, mParams, mEtCityname.getText().toString());
    }

    /**
     * GET的方式获取网页数据
     */
    class GETTask extends AsyncTask<String, Void, String> {

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
            mTvResult.setText("GET:" + s);
        }
    }

    /**
     * POST的方式获取网页数据
     */
    class POSTTask extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... params) {
            HttpURLConnection connection = null;
            try {
                URL url = new URL(params[0]);
                connection = (HttpURLConnection) url.openConnection();
                connection.setReadTimeout(5000);
                connection.setReadTimeout(5000);
                connection.setRequestMethod("POST");
                connection.setDoOutput(true);
                connection.getOutputStream().write((params[1] + params[2]).getBytes());
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
            mTvResult.setText("POST:" + s);
        }
    }
}
```