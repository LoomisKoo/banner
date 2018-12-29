package com.test.banner;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.loomis.banner.BannerConfig;
import com.loomis.banner.BannerNotCircle;
import com.loomis.banner.listener.OnBannerListener;
import com.test.banner.loader.GlideImageLoader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MainActivity2 extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener, OnBannerListener {
    static final int REFRESH_COMPLETE = 0X1112;
    SuperSwipeRefreshLayout mSwipeLayout;
    BannerNotCircle         banner;

    private Handler mHandler = new Handler() {
        public void handleMessage(android.os.Message msg) {
            switch (msg.what) {
                case REFRESH_COMPLETE:
                    String[] urls = getResources().getStringArray(R.array.url4);
                    List list = Arrays.asList(urls);
                    List arrayList = new ArrayList(list);
                    banner.update(arrayList);
                    mSwipeLayout.setRefreshing(false);
                    break;
                default:
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        banner = (BannerNotCircle) findViewById(R.id.banner_test);

        //简单使用
        banner.setImages(App.images)
              .setImageLoader(new GlideImageLoader())
              .setOnBannerListener(this)
              .setBannerStyle(BannerConfig.NUM_INDICATOR)
              .isAutoPlay(false)
              .start();
    }

    @Override
    public void OnBannerClick(int position) {
        Toast.makeText(getApplicationContext(), "你点击了：" + position, Toast.LENGTH_SHORT).show();
    }


    //如果你需要考虑更好的体验，可以这么操作
    @Override
    protected void onStart() {
        super.onStart();
        //开始轮播
        banner.startAutoPlay();
    }

    @Override
    protected void onStop() {
        super.onStop();
        //结束轮播
        banner.stopAutoPlay();
    }


    @Override
    public void onRefresh() {
        mHandler.sendEmptyMessageDelayed(REFRESH_COMPLETE, 2000);
    }

}
