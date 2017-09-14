package com.example.administrator.progressdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv_progress;
    private TextView tv_circle_progress;
    private TextView tv_CircleProgress;
    private TextView tv_loadProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initEvents();
        SingleInstanceF instanceF = SingleInstanceF.getInstance2();
    }


    private void initViews() {
        tv_progress = (TextView) findViewById(R.id.tv_progress);
        tv_circle_progress = (TextView) findViewById(R.id.tv_circle_progress);
        tv_CircleProgress = (TextView) findViewById(R.id.tv_CircleProgress);
        tv_loadProgress = (TextView) findViewById(R.id.tv_loadProgress);
    }
    private void initEvents() {
        tv_progress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,NormalProgressActivity.class);
                startActivity(intent);
            }
        });
        tv_circle_progress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,CustomCircleProgressActivity.class);
                startActivity(intent);
            }
        });
        tv_CircleProgress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,CustomCircleProgressActivity1.class);
                startActivity(intent);
            }
        });
        tv_loadProgress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,LoadProgressActivity.class);
                startActivity(intent);
            }
        });

    }

}
