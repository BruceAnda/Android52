# ImageViewer

### 布局代码
![截图](https://github.com/BruceAnda/Android52/blob/master/screenshot/day04/pic/pic2.png)

1. ImageViewer
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context="zhaoliang.com.android52.ui.day04.imageviewer.ImageViewerActivity">

    <Button
        android:id="@+id/btn_customimageviewer"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:onClick="click"
        android:text="@string/day04_values1" />

    <Button
        android:id="@+id/btn_smartimageview"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:onClick="click"
        android:text="@string/day04_values2" />

    <Button
        android:id="@+id/btn_picasso"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:onClick="click"
        android:text="@string/day04_values3" />

    <Button
        android:id="@+id/btn_glide"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:onClick="click"
        android:text="@string/day04_values4" />

    <Button
        android:id="@+id/btn_fresco"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:onClick="click"
        android:text="@string/day04_values5" />
</LinearLayout>
```
![截图](https://github.com/BruceAnda/Android52/blob/master/screenshot/day04/pic/pic3.png)

2. CustomImageViewer
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context="zhaoliang.com.android52.ui.day04.imageviewer.customimageviewer.CustomImageViewerActivity">

    <EditText
        android:id="@+id/et_imageurl"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="@string/day04_values6" />

    <Button
        android:onClick="show"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="@string/day04_values7"/>

    <ImageView
        android:id="@+id/iv_image"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />
</LinearLayout>
```
![截图](https://github.com/BruceAnda/Android52/blob/master/screenshot/day04/pic/pic3.png)

3. SmartIamgeView
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context="zhaoliang.com.android52.ui.day04.imageviewer.customimageviewer.CustomImageViewerActivity">

    <EditText
        android:id="@+id/et_imageurl"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="@string/day04_values6" />

    <Button
        android:onClick="show"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="@string/day04_values7"/>

    <zhaoliang.com.android52.ui.day04.imageviewer.smartimageview.com.loopj.android.image.SmartImageView
        android:id="@+id/iv_image"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />
</LinearLayout>
```
![截图](https://github.com/BruceAnda/Android52/blob/master/screenshot/day04/pic/pic3.png)

4. Picasso
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context="zhaoliang.com.android52.ui.day04.imageviewer.customimageviewer.CustomImageViewerActivity">

    <EditText
        android:id="@+id/et_imageurl"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="@string/day04_values6" />

    <Button
        android:onClick="show"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="@string/day04_values7"/>

    <ImageView
        android:id="@+id/iv_image"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />
</LinearLayout>
```
![截图](https://github.com/BruceAnda/Android52/blob/master/screenshot/day04/pic/pic3.png)

5. Glide
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context="zhaoliang.com.android52.ui.day04.imageviewer.customimageviewer.CustomImageViewerActivity">

    <EditText
        android:id="@+id/et_imageurl"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="@string/day04_values6" />

    <Button
        android:onClick="show"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="@string/day04_values7"/>

    <ImageView
        android:id="@+id/iv_image"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />
</LinearLayout>
```
![截图](https://github.com/BruceAnda/Android52/blob/master/screenshot/day04/pic/pic3.png)

6. Fresco
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context="zhaoliang.com.android52.ui.day04.imageviewer.customimageviewer.CustomImageViewerActivity">

    <EditText
        android:id="@+id/et_imageurl"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="@string/day04_values6" />

    <Button
        android:onClick="show"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="@string/day04_values7"/>

    <com.facebook.drawee.view.SimpleDraweeView
        android:id="@+id/iv_image"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />
</LinearLayout>
```
### Java代码
1. ImageViewer
```
package zhaoliang.com.android52.ui.day04.imageviewer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import zhaoliang.com.android52.R;
import zhaoliang.com.android52.ui.day04.imageviewer.customimageviewer.CustomImageViewerActivity;
import zhaoliang.com.android52.ui.day04.imageviewer.fresco.FrescoActivity;
import zhaoliang.com.android52.ui.day04.imageviewer.glide.GlideActivity;
import zhaoliang.com.android52.ui.day04.imageviewer.picasso.PicassoActivity;
import zhaoliang.com.android52.ui.day04.imageviewer.smartimageview.SmartImageViewActivity;

/**
 * 网络图片查看器
 */
public class ImageViewerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_viewer);
    }

    /**
     * 按钮点击调用
     *
     * @param view
     */
    public void click(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.btn_customimageviewer:
                intent = new Intent(this, CustomImageViewerActivity.class);
                break;
            case R.id.btn_smartimageview:
                intent = new Intent(this, SmartImageViewActivity.class);
                break;
            case R.id.btn_picasso:
                intent = new Intent(this, PicassoActivity.class);
                break;
            case R.id.btn_glide:
                intent = new Intent(this, GlideActivity.class);
                break;
            case R.id.btn_fresco:
                intent = new Intent(this, FrescoActivity.class);
                break;
        }
        if (intent != null)
            startActivity(intent);
    }
}
```
2. CustomImageViewer
```
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
```
3. SmartIamgeView
```
package zhaoliang.com.android52.ui.day04.imageviewer.smartimageview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import zhaoliang.com.android52.R;
import zhaoliang.com.android52.ui.day04.imageviewer.smartimageview.com.loopj.android.image.SmartImageView;

/**
 * SmartImageView
 */
public class SmartImageViewActivity extends Activity {

    private EditText mEtImageUrl;
    private SmartImageView mSmartImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smart_image_view);

        mEtImageUrl = (EditText) findViewById(R.id.et_imageurl);
        mSmartImageView = (SmartImageView) findViewById(R.id.iv_image);
    }

    /**
     * 按钮点击调用
     *
     * @param view
     */
    public void show(View view) {
        mSmartImageView.setImageUrl(mEtImageUrl.getText().toString());
    }
}
```
4. Picasso
```
package zhaoliang.com.android52.ui.day04.imageviewer.picasso;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import zhaoliang.com.android52.R;

/**
 * Picasso
 */
public class PicassoActivity extends Activity {

    private EditText mEtImageUrl;
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picasso);

        mEtImageUrl = (EditText) findViewById(R.id.et_imageurl);
        mImageView = (ImageView) findViewById(R.id.iv_image);
    }

    /**
     * 按钮点击调用这个方法
     *
     * @param view
     */
    public void show(View view) {
        Picasso.with(this).load(mEtImageUrl.getText().toString()).into(mImageView);
    }
}
```
5. Glide
```
package zhaoliang.com.android52.ui.day04.imageviewer.glide;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import zhaoliang.com.android52.R;

/**
 * Glide
 */
public class GlideActivity extends Activity {

    private EditText mEtImageUrl;
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide);

        mEtImageUrl = (EditText) findViewById(R.id.et_imageurl);
        mImageView = (ImageView) findViewById(R.id.iv_image);
    }

    /**
     * 按钮点击调用
     *
     * @param view
     */
    public void show(View view) {
        Glide.with(this).load(mEtImageUrl.getText().toString()).into(mImageView);
    }
}
```
6. Fresco
```
package zhaoliang.com.android52.ui.day04.imageviewer.fresco;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.facebook.drawee.view.SimpleDraweeView;

import zhaoliang.com.android52.R;

/**
 * Fresco
 */
public class FrescoActivity extends Activity {

    private EditText mEtImageUrl;
    private SimpleDraweeView mSimpleDraweeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fresco);

        mEtImageUrl = (EditText) findViewById(R.id.et_imageurl);
        mSimpleDraweeView = (SimpleDraweeView) findViewById(R.id.iv_image);
    }

    /**
     * 按钮点击调用
     * @param view
     */
    public void show(View view) {
        mSimpleDraweeView.setImageURI(mEtImageUrl.getText().toString());
    }
}
```