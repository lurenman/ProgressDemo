package com.example.administrator.progressdemo;

import com.example.administrator.progressdemo.utils.LoadProgressUtil;

import java.util.logging.Handler;

/**
 * Created by Administrator on 2017/9/13.
 */

public class LoadProgressActivity extends BaseActivity {
    @Override
    protected void initVariables() {

    }

    @Override
    protected void initViews() {
        setContentView(R.layout.activity_loadprogress);
        LoadProgressUtil.showCustomProgrssDialog("加载中",this);
//        new android.os.Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                LoadProgressUtil.hideCustomProgressDialog();
//            }
//        }, 2000);
        SingleInstanceF instance = SingleInstanceF.getInstance(this);



    }

    @Override
    protected void loadData() {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //对于存在static声明的对话框，在activity销毁的时候要销毁
        LoadProgressUtil.hideCustomProgressDialog();
    }

}
