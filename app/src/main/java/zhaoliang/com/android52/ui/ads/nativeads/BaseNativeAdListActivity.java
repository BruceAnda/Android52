package zhaoliang.com.android52.ui.ads.nativeads;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.NativeExpressAdView;

import zhaoliang.com.android52.R;

/**
 * adlistActivity
 */
public abstract class BaseNativeAdListActivity extends Activity implements AdapterView.OnItemClickListener {

    private ListView mAdList;
    private String[] datas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_native_ad_list);

        mAdList = (ListView) findViewById(R.id.ad_list);
        datas = fillData();
        mAdList.setAdapter(new AdListAdapter());
        mAdList.setOnItemClickListener(this);
    }

    /**
     * 填充数据
     *
     * @return
     */
    protected abstract String[] fillData();

    /**
     * 数据适配器
     */
    class AdListAdapter extends BaseAdapter {

        private static final int TYPE_COUNT = 2;//item类型的总数
        private static final int TYPE_NORMAL = 0;//普通类型
        private static final int TYPE_AD = 1;//广告类型

        @Override
        public int getCount() {
            return datas.length;
        }

        @Override
        public String getItem(int position) {
            return datas[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            int itemViewType = getItemViewType(position);
            switch (itemViewType) {
                case TYPE_NORMAL:       // 普通列表
                    ViewHolder viewHolder = null;
                    if (convertView == null) {
                        convertView = View.inflate(BaseNativeAdListActivity.this, R.layout.list_item, null);
                        viewHolder = new ViewHolder(convertView);
                        convertView.setTag(viewHolder);
                    } else {
                        viewHolder = (ViewHolder) convertView.getTag();
                    }
                    viewHolder.textView.setText(getItem(position));
                    break;
                case TYPE_AD:       // 广告列表
                    AdViewHolder adViewHolder = null;
                    if (convertView == null) {
                        convertView = View.inflate(BaseNativeAdListActivity.this, R.layout.list_item_ad, null);
                        adViewHolder = new AdViewHolder(convertView);
                        convertView.setTag(adViewHolder);
                    } else {
                        adViewHolder = (AdViewHolder) convertView.getTag();
                    }
                    break;
            }
            return convertView;
        }

        class ViewHolder {
            TextView textView;

            public ViewHolder(View item) {
                textView = (TextView) item.findViewById(R.id.tv_content);
            }
        }

        class AdViewHolder {
            NativeExpressAdView nativeExpressAdView;

            public AdViewHolder(View item) {
                nativeExpressAdView = (NativeExpressAdView) item.findViewById(R.id.item_ad);
                nativeExpressAdView.loadAd(new AdRequest.Builder().build());
            }
        }

        @Override
        public int getViewTypeCount() {
            return TYPE_COUNT;
        }

        @Override
        public int getItemViewType(int position) {
            if (position % 2 == 0) {
                return TYPE_NORMAL;
            } else {
                return TYPE_AD;
            }
        }
    }
}
