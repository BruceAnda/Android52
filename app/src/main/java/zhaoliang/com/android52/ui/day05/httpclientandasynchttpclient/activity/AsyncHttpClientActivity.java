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
