# GETAndPOST

### 布局代码
![截图](https://github.com/BruceAnda/Android52/blob/master/screenshot/day05/pic/pic2.png)
1. HttpClientAndAsyncHttpClient
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context="zhaoliang.com.android52.ui.day05.httpclientandasynchttpclient.HttpClientAndAsyncHttpClientActivity">

    <Button
        android:id="@+id/btn_http_client"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:onClick="click"
        android:text="@string/day05_values1" />

    <Button
        android:id="@+id/btn_asynchttpclient"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:onClick="click"
        android:text="@string/day05_values2" />
</LinearLayout>
```
![截图](https://github.com/BruceAnda/Android52/blob/master/screenshot/day05/pic/pic3.png)

2. HttpClient
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

![截图](https://github.com/BruceAnda/Android52/blob/master/screenshot/day05/pic/pic3.png)

3. AsyncHttpClient
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
1. HttpClientAndAsyncHttpClient
```
package zhaoliang.com.android52.ui.day05.httpclientandasynchttpclient;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import zhaoliang.com.android52.R;
import zhaoliang.com.android52.ui.day05.httpclientandasynchttpclient.activity.AsyncHttpClientActivity;
import zhaoliang.com.android52.ui.day05.httpclientandasynchttpclient.activity.HttpClientActivity;

/**
 * 网络框架
 */
public class HttpClientAndAsyncHttpClientActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_http_client_and_async_http_client);
    }

    /**
     * 按钮点击事件
     *
     * @param view
     */
    public void click(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.btn_http_client:
                intent = new Intent(this, HttpClientActivity.class);
                break;
            case R.id.btn_asynchttpclient:
                intent = new Intent(this, AsyncHttpClientActivity.class);
                break;
        }
        if (intent != null)
            startActivity(intent);
    }
}
```
2. HttpClient
```
package zhaoliang.com.android52.ui.day05.httpclientandasynchttpclient.activity;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import cz.msebera.android.httpclient.HttpResponse;
import cz.msebera.android.httpclient.NameValuePair;
import cz.msebera.android.httpclient.client.ClientProtocolException;
import cz.msebera.android.httpclient.client.HttpClient;
import cz.msebera.android.httpclient.client.entity.UrlEncodedFormEntity;
import cz.msebera.android.httpclient.client.methods.HttpGet;
import cz.msebera.android.httpclient.client.methods.HttpPost;
import cz.msebera.android.httpclient.impl.client.DefaultHttpClient;
import cz.msebera.android.httpclient.message.BasicNameValuePair;
import cz.msebera.android.httpclient.protocol.HTTP;
import cz.msebera.android.httpclient.util.EntityUtils;
import zhaoliang.com.android52.R;

/**
 * HttpClient
 */
public class HttpClientActivity extends Activity {

    private String mApi = "http://api.avatardata.cn/Weather/Query?";
    private String mParams = "key=1eff919c31ce4787ab230f6e26feef10&cityname=";

    private EditText mEtCityname;
    private TextView mTvResult;
    HttpClient httpClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_http_client);

        mEtCityname = (EditText) findViewById(R.id.et_city_name);
        mTvResult = (TextView) findViewById(R.id.tv_result);

        httpClient = new DefaultHttpClient();
    }

    /**
     * get方式获取数据
     *
     * @param view
     */
    public void get(View view) {
        new GETTask().execute(mApi + mParams + mEtCityname.getText().toString());
    }

    class GETTask extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... params) {
            HttpGet get = new HttpGet(params[0]);
            try {
                HttpResponse response = httpClient.execute(get);
                if (response.getStatusLine().getStatusCode() == 200) {
                    return EntityUtils.toString(response.getEntity());
                }
            } catch (IOException e) {
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
     * post方式获取数据
     *
     * @param view
     */
    public void post(View view) {
        new POSTTask().execute(mApi, mEtCityname.getText().toString());
    }

    class POSTTask extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... params) {
            HttpPost post = new HttpPost(params[0]);
            List<NameValuePair> pairs = new ArrayList<>();
            pairs.add(new BasicNameValuePair("key", "1eff919c31ce4787ab230f6e26feef10"));
            pairs.add(new BasicNameValuePair("cityname", params[1]));
            try {
                post.setEntity(new UrlEncodedFormEntity(pairs, HTTP.UTF_8));
                HttpResponse response = httpClient.execute(post);
                if (response.getStatusLine().getStatusCode() == 200) {
                    return EntityUtils.toString(response.getEntity());
                }
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (ClientProtocolException e) {
                e.printStackTrace();
            } catch (IOException e) {
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
3. AsyncHttpClient
```
package zhaoliang.com.android52.ui.day05.httpclientandasynchttpclient.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.RequestParams;
import com.loopj.android.http.TextHttpResponseHandler;

import cz.msebera.android.httpclient.Header;
import zhaoliang.com.android52.R;

/**
 * AsyncHttpClient
 */
public class AsyncHttpClientActivity extends Activity {

    private String mApi = "http://api.avatardata.cn/Weather/Query?";
    private String mParams = "key=1eff919c31ce4787ab230f6e26feef10&cityname=";

    private EditText mEtCityname;
    private TextView mTvResult;
    AsyncHttpClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_async_http_client);

        mEtCityname = (EditText) findViewById(R.id.et_city_name);
        mTvResult = (TextView) findViewById(R.id.tv_result);
        client = new AsyncHttpClient();
    }

    /**
     * get方式获取数据
     *
     * @param view
     */
    public void get(View view) {
        client.get(mApi + mParams + mEtCityname.getText().toString(), new TextHttpResponseHandler() {
            @Override
            public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {

            }

            @Override
            public void onSuccess(int statusCode, Header[] headers, String responseString) {
                mTvResult.setText("GET:" + responseString);
            }
        });
    }

    /**
     * post方式获取数据
     *
     * @param view
     */
    public void post(View view) {
        RequestParams params = new RequestParams();
        params.put("key", "1eff919c31ce4787ab230f6e26feef10");
        params.put("cityname", mEtCityname.getText().toString());
        client.post(mApi, params, new TextHttpResponseHandler() {
            @Override
            public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {

            }

            @Override
            public void onSuccess(int statusCode, Header[] headers, String responseString) {
                mTvResult.setText("POST:" + responseString);
            }
        });
    }
}
```