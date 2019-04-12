package com.test.banner.demo;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.github.chrisbanes.photoview.PhotoView;
import com.loomis.banner.BannerConfig;
import com.loomis.banner.BannerNotCircle;
import com.test.banner.R;
import com.test.banner.loader.GlideImageLoader;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: Test
 * @Package: com.example.administrator.test.activity
 * @ClassName: BigImgActivity
 * @Description: java类作用描述
 * @Author: koo
 * @CreateDate: 2019/1/25 6:08 PM
 * @UpdateUser:
 * @UpdateDate: 2019/1/25 6:08 PM
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class BigImgActivity extends Activity {
    BannerNotCircle banner;
//    ImageView imageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_test);
        initView();
    }

    public void initView() {
        String       url     = "https://ws1.sinaimg.cn/large/0065oQSqgy1fze94uew3jj30qo10cdka.jpg";
        List<String> urlList = new ArrayList<>();
        urlList.add(url);
//        imageView = (ImageView) findViewById(R.id.banner_test);
//        imageView.setOnClickListener(view -> {
////                                         imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
//                                         finishAfterTransition();
//                                     });
//        Glide.with(this)com.github.abcdqianlei1990
////             .load("http://img.zcool.cn/community/01b72057a7e0790000018c1bf4fce0.png")
//             .load(url)
//             .into(imageView);
        banner = (BannerNotCircle) findViewById(R.id.banner_test);
        banner.setImages(urlList)
              .setBannerStyle(BannerConfig.NUM_INDICATOR)
              .setImageLoader(new GlideImageLoader())
              .setIndicatorGravity(BannerConfig.CENTER)
              .isAutoPlay(false)
              .start()
              .setCurPosition(0)
              .setOnBannerListener(position -> {
                  ((ImageView)banner.viewPager.getChildAt(0)).setScaleType(ImageView.ScaleType.CENTER_CROP);
                  finishAfterTransition();
              });


    }

    @Override
    public void onBackPressed() {
        finishAfterTransition();
    }
}
