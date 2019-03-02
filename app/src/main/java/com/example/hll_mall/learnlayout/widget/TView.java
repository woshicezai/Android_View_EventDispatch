package com.example.hll_mall.learnlayout.widget;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.hll_mall.learnlayout.MainActivity;
import com.example.hll_mall.learnlayout.R;

public class TView extends AppCompatTextView {
    public TView(Context context) {
        super(context);
    }

    public TView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.d(MainActivity.TOUCH_LOG, "dispatchTouchEvent-view1");
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d(MainActivity.TOUCH_LOG, "onTouchEvent-view1");
        return super.onTouchEvent(event);
    }


}
