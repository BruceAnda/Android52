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
