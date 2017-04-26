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
