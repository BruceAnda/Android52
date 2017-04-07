package zhaoliang.com.android52.ui;

import android.Manifest;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.ListView;

import zhaoliang.com.android52.R;
import zhaoliang.com.android52.ui.base.BaseListActivity;
import zhaoliang.com.android52.ui.day01.Day01Activity;
import zhaoliang.com.android52.ui.day02.Day02Activity;
import zhaoliang.com.android52.ui.day03.Day03Activity;
import zhaoliang.com.android52.ui.day04.Day04Activity;
import zhaoliang.com.android52.ui.day05.Day05Activity;
import zhaoliang.com.android52.ui.day06.Day06Activity;
import zhaoliang.com.android52.ui.day07.Day07Activity;
import zhaoliang.com.android52.ui.day08.Day08Activity;
import zhaoliang.com.android52.ui.day09.Day09Activity;
import zhaoliang.com.android52.ui.day10.Day10Activity;
import zhaoliang.com.android52.ui.day11.Day11Activity;
import zhaoliang.com.android52.ui.day12.Day12Activity;

/**
 * 主界面列表Activity
 */
public class MainActivity extends BaseListActivity {

    private static final int MY_PERMISSIONS_REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Here, thisActivity is the current activity
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED
                || ContextCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS) != PackageManager.PERMISSION_GRANTED) {

            // Should we show an explanation?
            if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.CALL_PHONE) ||
                    ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.SEND_SMS)) {

                // Show an expanation to the user *asynchronously* -- don't block
                // this thread waiting for the user's response! After the user
                // sees the explanation, try again to request the permission.

            } else {

                // No explanation needed, we can request the permission.

                requstPermission();

                // MY_PERMISSIONS_REQUEST_READ_CONTACTS is an
                // app-defined int constant. The callback method gets the
                // result of the request.
            }
        }
    }

    /**
     * 动态请求权限
     */
    private void requstPermission() {
        ActivityCompat.requestPermissions(this,
                new String[]{
                        Manifest.permission.CALL_PHONE,
                        Manifest.permission.SEND_SMS
                },
                MY_PERMISSIONS_REQUEST_CODE);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           String permissions[], int[] grantResults) {
        switch (requestCode) {
            case MY_PERMISSIONS_REQUEST_CODE: {
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                    // permission was granted, yay! Do the
                    // contacts-related task you need to do.

                } else {
                    MyDialogFragment myDialogFragment = new MyDialogFragment();
                    myDialogFragment.show(getFragmentManager(), "permission_dialog");
                    // permission denied, boo! Disable the
                    // functionality that depends on this permission.
                }
                return;
            }

            // other 'case' lines to check for other
            // permissions this app might request
        }
    }

    /**
     * 填充数据
     *
     * @return
     */
    @Override
    protected String[] fillData() {
        return getResources().getStringArray(R.array.MainItem);
    }

    /**
     * 列表项点击事件
     *
     * @param l
     * @param v
     * @param position
     * @param id
     */
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent = null;
        switch (position) {
            case 0:
                intent = new Intent(this, Day01Activity.class);
                break;
            case 1:
                intent = new Intent(this, Day02Activity.class);
                break;
            case 2:
                intent = new Intent(this, Day03Activity.class);
                break;
            case 3:
                intent = new Intent(this, Day04Activity.class);
                break;
            case 4:
                intent = new Intent(this, Day05Activity.class);
                break;
            case 5:
                intent = new Intent(this, Day06Activity.class);
                break;
            case 6:
                intent = new Intent(this, Day07Activity.class);
                break;
            case 7:
                intent = new Intent(this, Day08Activity.class);
                break;
            case 8:
                intent = new Intent(this, Day09Activity.class);
                break;
            case 9:
                intent = new Intent(this, Day10Activity.class);
                break;
            case 10:
                intent = new Intent(this, Day11Activity.class);
                break;
            case 11:
                intent = new Intent(this, Day12Activity.class);
                break;
        }
        if (intent != null)
            startActivity(intent);
    }

    class MyDialogFragment extends DialogFragment {
        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            return new AlertDialog
                    .Builder(getActivity())
                    .setTitle("提示！")
                    .setMessage("请给我权限！")
                    .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            requstPermission();
                        }
                    })
                    .setCancelable(false)
                    .create();
        }
    }
}
