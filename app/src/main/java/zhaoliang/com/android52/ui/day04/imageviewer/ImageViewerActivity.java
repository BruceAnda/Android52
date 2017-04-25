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
