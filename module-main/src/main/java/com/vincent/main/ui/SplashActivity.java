package com.vincent.main.ui;

import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.vincent.myapplication.R;


/**
 * 应用模块: 主业务模块
 * <p>
 * 类描述: 欢迎页面
 * <p>
 *
 * @author darryrzhoong
 * @since 2020-02-26
 */
public class SplashActivity extends AppCompatActivity {

    private Handler mHandler = new Handler();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        ScreenAutoAdapter.match(this, 375.0f);
        setContentView(R.layout.main_activity_splash);
//        ImmersionBar.with(this)
//                .titleBar(findViewById(R.id.top_view))
//                .hideBar(BarHide.FLAG_HIDE_NAVIGATION_BAR)
//                .init();
        mHandler.postDelayed(this::startToMain, 3000);
    }

    private void startToMain() {
        MainActivity.start(this);

    }

    @Override
    protected void onStop() {
        super.onStop();
        finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //activity销毁时移除所有消息,防止内存泄漏
        mHandler.removeCallbacksAndMessages(null);
    }
}
