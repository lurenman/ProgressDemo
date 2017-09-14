package com.example.administrator.progressdemo;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.ProgressBar;

import com.example.administrator.progressdemo.ArcProgresslibrary.ArcProgress;

/**
 * Created by Administrator on 2017/9/13.
 */

public class CustomCircleProgressActivity extends BaseActivity {
    private ArcProgress myProgress;


    @Override
    protected void initVariables() {

    }

    @Override
    protected void initViews() {
        setContentView(R.layout.activity_customcircleprogress);
        myProgress = (ArcProgress) findViewById(R.id.myProgress);
        myProgress.setProgress(70);


    }

    @Override
    protected void initEnvent() {
        super.initEnvent();
        myProgress.setOnCenterDraw(new ArcProgress.OnCenterDraw() {
            @Override
            public void draw(Canvas canvas, RectF rectF, float x, float y, float storkeWidth, int progress) {

            }
        });
    }

    @Override
    protected void loadData() {

    }
}
