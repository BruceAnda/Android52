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
