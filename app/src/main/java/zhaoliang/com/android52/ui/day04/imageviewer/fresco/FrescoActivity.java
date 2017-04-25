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
