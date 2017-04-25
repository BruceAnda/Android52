package zhaoliang.com.android52.ui.day04.imageviewer.customimageviewer;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import zhaoliang.com.android52.R;

/**
 * 自定义的网络图片查看器
 */
public class CustomImageViewerActivity extends Activity {

    private EditText mEtImageUrl;
    private ImageView mIvImage;
    private String mFilePath;
    private File mFile;
    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            mIvImage.setImageBitmap(BitmapFactory.decodeFile(mFilePath));
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_image_viewer);

        mEtImageUrl = (EditText) findViewById(R.id.et_imageurl);
        mIvImage = (ImageView) findViewById(R.id.iv_image);

        mFilePath = Environment.getExternalStorageDirectory() + File.separator + "temp.jpg";
        mFile = new File(mFilePath);

    }

    /**
     * 点击查看按钮调用
     *
     * @param view
     */
    public void show(View view) {
        if (mFile.exists()) {
            // 缓存
            mHandler.sendEmptyMessage(0);
        } else {
            // 网络下载
            new DownloadTask().execute(mEtImageUrl.getText().toString());
        }
    }

    /**
     * 从网络上下载图片
     */
    class DownloadTask extends AsyncTask<String, Void, Void> {

        @Override
        protected Void doInBackground(String... params) {
            HttpURLConnection connection = null;
            try {
                URL url = new URL(params[0]);
                connection = (HttpURLConnection) url.openConnection();
                connection.setConnectTimeout(5000);
                connection.setReadTimeout(5000);
                if (connection.getResponseCode() == 200) {
                    InputStream inputStream = connection.getInputStream();
                    FileOutputStream outputStream = new FileOutputStream(mFile);
                    int len = 0;
                    byte[] b = new byte[1024];
                    while ((len = inputStream.read(b)) != -1) {
                        outputStream.write(b, 0, len);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            mHandler.sendEmptyMessage(0);
        }
    }
}
