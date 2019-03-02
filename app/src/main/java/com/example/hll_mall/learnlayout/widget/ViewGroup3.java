package com.example.hll_mall.learnlayout.widget;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.hll_mall.learnlayout.MainActivity;
import com.example.hll_mall.learnlayout.R;

public class ViewGroup3 extends LinearLayout {
    public ViewGroup3(Context context, int width, int height) {
        super(context);
        initView(context);
    }

    private void initView(Context context) {
        ViewGroup viewGroup = (ViewGroup) View.inflate(context, R.layout.view_2, null);
        addView(viewGroup);
    }

    public ViewGroup3(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }

    public ViewGroup3(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    public ViewGroup3(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initView(context);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d(MainActivity.TOUCH_LOG, "onTouchEvent-3");
        return super.onTouchEvent(event);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d(MainActivity.TOUCH_LOG, "dispatchTouchEvent-3");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.d(MainActivity.TOUCH_LOG, "onInterceptTouchEvent-3");
        return super.onInterceptTouchEvent(ev);
    }
}
