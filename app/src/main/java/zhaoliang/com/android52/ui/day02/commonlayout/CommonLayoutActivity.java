package zhaoliang.com.android52.ui.day02.commonlayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import zhaoliang.com.android52.R;
import zhaoliang.com.android52.ui.ads.bannerads.BaseBannerAdActivity;
import zhaoliang.com.android52.ui.day02.commonlayout.layout.AbsolueLayoutDemoActivity;
import zhaoliang.com.android52.ui.day02.commonlayout.layout.FrameLayoutDemoActivity;
import zhaoliang.com.android52.ui.day02.commonlayout.layout.LinearLayoutDemoOneActivity;
import zhaoliang.com.android52.ui.day02.commonlayout.layout.LinearLayoutDemoTwoActivity;
import zhaoliang.com.android52.ui.day02.commonlayout.layout.RelativeLayoutDemoOneActivity;
import zhaoliang.com.android52.ui.day02.commonlayout.layout.RelativeLayoutDemoTwoActivity;
import zhaoliang.com.android52.ui.day02.commonlayout.layout.TableLayoutDemoActivity;

/**
 * 常用布局
 */
public class CommonLayoutActivity extends BaseBannerAdActivity {

    @Override
    protected int setContentView() {
        return R.layout.activity_common_layout;
    }

    /**
     * 点击按钮事件
     *
     * @param view
     */
    public void layout(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.layout1:
                intent = new Intent(this, LinearLayoutDemoOneActivity.class);
                break;
            case R.id.layout2:
                intent = new Intent(this, LinearLayoutDemoTwoActivity.class);
                break;
            case R.id.layout3:
                intent = new Intent(this, RelativeLayoutDemoOneActivity.class);
                break;
            case R.id.layout4:
                intent = new Intent(this, RelativeLayoutDemoTwoActivity.class);
                break;
            case R.id.layout5:
                intent = new Intent(this, FrameLayoutDemoActivity.class);
                break;
            case R.id.layout6:
                intent = new Intent(this, TableLayoutDemoActivity.class);
                break;
            case R.id.layout7:
                intent = new Intent(this, AbsolueLayoutDemoActivity.class);
                break;
        }
        if (intent != null)
            startActivity(intent);
    }
}
