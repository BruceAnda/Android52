package zhaoliang.com.android52.ui.day02.commonlayout.layout;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;

import zhaoliang.com.android52.R;
import zhaoliang.com.android52.ui.ads.bannerads.BaseBannerAdActivity;

/**
 * 帧布局
 */
public class FrameLayoutDemoActivity extends BaseBannerAdActivity {

    // 界面上Widget的id
    private int[] mIds = {R.id.tv1, R.id.tv2, R.id.tv3, R.id.tv4, R.id.tv5, R.id.tv6, R.id.tv7};
    // 声明界面上的TextView Widget
    private TextView[] mTextViews = new TextView[mIds.length];
    // 需要用到的颜色
    private int[] mColors = new int[mIds.length];
    private int[] mColorsRes = {R.color.colorOne, R.color.colorTwo, R.color.colorThree, R.color.colorFour, R.color.colorFive, R.color.colorSix, R.color.colorSeven};
    // 当前颜色
    private int mCurrentColor;
    // 改变颜色的Handler
    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            for (int i = 0; i < mIds.length; i++) {
                mTextViews[i].setBackgroundColor(mColors[(mCurrentColor + i) % 7]);
            }
            mCurrentColor++;
            sendEmptyMessageDelayed(0, 40);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        for (int i = 0; i < mIds.length; i++) {
            mTextViews[i] = (TextView) findViewById(mIds[i]);
            mColors[i] = getResources().getColor(mColorsRes[i]);
        }

        mHandler.sendEmptyMessage(0);
    }

    @Override
    protected int setContentView() {
        return R.layout.activity_frame_layout_demo;
    }
}
