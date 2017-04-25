package zhaoliang.com.android52.ui.day04.simplenewsclient;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.alibaba.fastjson.JSON;
import com.facebook.drawee.view.SimpleDraweeView;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import zhaoliang.com.android52.R;
import zhaoliang.com.android52.ui.day04.simplenewsclient.domain.NewsBean;

/**
 * 简易新闻客户端
 */
public class SimpleNewsClientActivity extends Activity {

    private String mNewsUrl = "https://newsapi.org/v1/articles?source=abc-news-au&sortBy=top&apiKey=5fd88c80e2aa4919b54b74e1c9a2f42e";
    private ListView mNewsList;
    private List<NewsBean.ArticlesBean> articles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_news_client);
        mNewsList = (ListView) findViewById(R.id.news_list);
        new DownloadTask().execute(mNewsUrl);
    }

    /**
     * 下载任务
     */
    class DownloadTask extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... params) {
            HttpURLConnection connection = null;
            try {
                URL url = new URL(mNewsUrl);
                connection = (HttpURLConnection) url.openConnection();
                connection.setConnectTimeout(5000);
                connection.setReadTimeout(5000);
                if (connection.getResponseCode() == 200) {
                    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                    InputStream inputStream = connection.getInputStream();
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
            NewsBean newsBean = JSON.parseObject(s, NewsBean.class);
            articles = newsBean.getArticles();
            mNewsList.setAdapter(new NewsAdapter());
        }
    }

    /**
     * 数据适配器
     */
    class NewsAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return articles.size();
        }

        @Override
        public NewsBean.ArticlesBean getItem(int position) {
            return articles.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder viewHolder = null;
            if (convertView == null) {
                convertView = LayoutInflater.from(SimpleNewsClientActivity.this).inflate(R.layout.news_item, null);
                viewHolder = new ViewHolder(convertView);
                convertView.setTag(viewHolder);
            } else {
                viewHolder = (ViewHolder) convertView.getTag();
            }
            NewsBean.ArticlesBean item = getItem(position);
            viewHolder.tvTitle.setText(item.getTitle());
            viewHolder.tvDescription.setText(item.getDescription());
            viewHolder.tvPublishedAt.setText(item.getPublishedAt());
            viewHolder.ivImage.setImageURI(item.getUrlToImage());
            return convertView;
        }

        class ViewHolder {
            TextView tvTitle;
            TextView tvDescription;
            TextView tvPublishedAt;
            SimpleDraweeView ivImage;

            public ViewHolder(View item) {
                tvTitle = (TextView) item.findViewById(R.id.tv_title);
                tvDescription = (TextView) item.findViewById(R.id.tv_description);
                tvPublishedAt = (TextView) item.findViewById(R.id.tv_publishedat);
                ivImage = (SimpleDraweeView) item.findViewById(R.id.news_image);
            }
        }
    }
}