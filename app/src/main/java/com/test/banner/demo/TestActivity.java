package com.test.banner.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.loomis.banner.view.TransferImage;
import com.test.banner.MainActivity2;
import com.test.banner.R;

/**
 * @ProjectName: banner
 * @Package: com.test.banner.demo
 * @ClassName: TestActivity
 * @Description: java类作用描述
 * @Author: koo
 * @CreateDate: 2019/1/28 1:04 PM
 * @UpdateUser:
 * @UpdateDate: 2019/1/28 1:04 PM
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class TestActivity extends Activity {
    ImageView imageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test0);
        String url = "https://ws1.sinaimg.cn/large/0065oQSqgy1fze94uew3jj30qo10cdka.jpg";
        imageView = (ImageView) findViewById(R.id.test0);
        Glide.with(this)
             .load(url)
             .into(imageView);
        imageView.setOnClickListener(view -> {
            Intent intent = new Intent(TestActivity.this, BigImgActivity.class);
            // 这里指定了共享的视图元素
            ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(TestActivity.this, imageView, "test");
            ActivityCompat.startActivity(TestActivity.this, intent, options.toBundle());
        });
    }
}
