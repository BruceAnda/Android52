# HelloWorld
### 截图
![截图](https://github.com/BruceAnda/Android52/blob/master/screenshot/day03/pic/pic4.png)

### 布局代码
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context="zhaoliang.com.android52.ui.day03.dialog.DialogActivity">

    <Button
        android:id="@+id/btn_dialog"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:onClick="dialog"
        android:text="@string/day03_values3" />

    <Button
        android:id="@+id/btn_single_dialog"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:onClick="dialog"
        android:text="@string/day03_values4" />

    <Button
        android:id="@+id/btn_mutiple_dialog"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:onClick="dialog"
        android:text="@string/day03_values5" />
</LinearLayout>
```
### Java代码
```
package zhaoliang.com.android52.ui.day03.dialog;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.Toast;

import zhaoliang.com.android52.R;

/**
 * 对话框
 */
public class DialogActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
    }

    /**
     * 点击按钮的时候调用这个方法
     *
     * @param view
     */
    public void dialog(View view) {
        switch (view.getId()) {
            case R.id.btn_dialog:
                new AlertDialog.Builder(this).setTitle("提示！").setMessage("欲练此功，必先自宫").setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(DialogActivity.this, "祝早日练成神功！", Toast.LENGTH_SHORT).show();
                    }
                }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(DialogActivity.this, "若不自宫，定不成功！", Toast.LENGTH_SHORT).show();
                    }
                }).show();
                break;
            case R.id.btn_single_dialog:
                final String[] items = {"男", "女", "保密"};
                int checkedItem = -1;
                new AlertDialog.Builder(this).setTitle("选择性别！").setSingleChoiceItems(items, checkedItem, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(DialogActivity.this, "你的性别是：" + items[which], Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                }).show();
                break;
            case R.id.btn_mutiple_dialog:
                final String[] items1 = {"苹果", "香蕉", "葡萄", "桔子"};
                final boolean[] checkedItems = {false, false, false, false};
                new AlertDialog.Builder(this).setTitle("选择你喜欢的水果！").setMultiChoiceItems(items1, checkedItems, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                        checkedItems[which] = isChecked;
                    }
                }).setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        StringBuilder stringBuilder = new StringBuilder();
                        for (int i = 0; i < items1.length; i++) {
                            if (checkedItems[i]) {
                                stringBuilder.append(items1[i] + ",");
                            }
                        }
                        Toast.makeText(DialogActivity.this, "你喜欢的水果有：" + stringBuilder.substring(0, stringBuilder.lastIndexOf(",")), Toast.LENGTH_SHORT).show();
                    }
                }).show();
                break;
        }
    }
}
```