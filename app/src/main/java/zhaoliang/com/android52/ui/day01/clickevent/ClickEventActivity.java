package zhaoliang.com.android52.ui.day01.clickevent;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import zhaoliang.com.android52.R;

/**
 * <pre>
 *     需求：Android中点击事件的写法
 *     思路：
 *          1. 界面编写。采用纵向的线性布局放置四个按钮，对应四种不同点击事件的写法
 *          2. 在Java代码中编写点击事件
 * </pre>
 */
public class ClickEventActivity extends Activity implements View.OnClickListener {

    private Button mBtnClickTwo, mBtnClickThree, mBtnClickFour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_event);

        mBtnClickTwo = (Button) findViewById(R.id.btn_click_two);
        mBtnClickThree = (Button) findViewById(R.id.btn_click_three);
        mBtnClickFour = (Button) findViewById(R.id.btn_click_four);

        mBtnClickTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ClickEventActivity.this, getString(R.string.day01_values7), Toast.LENGTH_SHORT).show();
            }
        });

        mBtnClickThree.setOnClickListener(new MyClickListener());
        mBtnClickFour.setOnClickListener(this);
    }

    /**
     * 第一种点击事件的写法
     *
     * @param view
     */
    public void click(View view) {
        Toast.makeText(this, getString(R.string.day01_values6), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, getString(R.string.day01_values9), Toast.LENGTH_SHORT).show();
    }

    class MyClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Toast.makeText(ClickEventActivity.this, getString(R.string.day01_values8), Toast.LENGTH_SHORT).show();
        }
    }
}
