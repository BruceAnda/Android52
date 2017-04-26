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
