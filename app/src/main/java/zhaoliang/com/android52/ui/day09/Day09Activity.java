package zhaoliang.com.android52.ui.day09;

import android.content.Intent;
import android.view.View;
import android.widget.ListView;

import zhaoliang.com.android52.R;
import zhaoliang.com.android52.ui.base.BaseListActivity;
import zhaoliang.com.android52.ui.day08.musicplayer.MusicPlayerActivity;
import zhaoliang.com.android52.ui.day09.Imagespecialeffects.ImageSpecialEffectsActivity;
import zhaoliang.com.android52.ui.day09.camera.CameraActivity;
import zhaoliang.com.android52.ui.day09.copybitmap.CopyBitmapActivity;
import zhaoliang.com.android52.ui.day09.drawingboard.DrawingBoardActivity;
import zhaoliang.com.android52.ui.day09.heartbeat.HeartBeatActivity;
import zhaoliang.com.android52.ui.day09.loadbigimage.LoadBigImageActivity;
import zhaoliang.com.android52.ui.day09.videoplayer.VideoPlayerActivity;

public class Day09Activity extends BaseListActivity {

    @Override
    protected String[] fillData() {
        return getResources().getStringArray(R.array.Day09);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent = null;
        switch (position) {
            case 0:
                intent = new Intent(this, LoadBigImageActivity.class);
                break;
            case 1:
                intent = new Intent(this, CopyBitmapActivity.class);
                break;
            case 2:
                intent = new Intent(this, ImageSpecialEffectsActivity.class);
                break;
            case 3:
                intent = new Intent(this, DrawingBoardActivity.class);
                break;
            case 4:
                intent = new Intent(this, HeartBeatActivity.class);
                break;
            case 5:
                intent = new Intent(this, MusicPlayerActivity.class);
                break;
            case 6:
                intent = new Intent(this, VideoPlayerActivity.class);
                break;
            case 7:
                intent = new Intent(this, CameraActivity.class);
                break;
        }
        if (intent != null)
            startActivity(intent);
    }
}
