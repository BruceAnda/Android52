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
