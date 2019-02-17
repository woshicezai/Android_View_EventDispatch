package com.example.hll_mall.learnlayout;

import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.callback.NavCallback;
import com.alibaba.android.arouter.launcher.ARouter;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    public static final String TOUCH_LOG = "触发事件";
    private LinearLayout mParent;
    private LinearLayout mSub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mParent = findViewById(R.id.parent);
        mSub = findViewById(R.id.sub);
        initView();
    }

    public void initView(){

    }



}
