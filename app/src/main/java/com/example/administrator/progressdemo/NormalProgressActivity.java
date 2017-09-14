package com.example.administrator.progressdemo;

/**
 * Created by Administrator on 2017/9/13.
 * 参考文章
 * http://blog.csdn.net/feng88724/article/details/7409032/
 */

public class NormalProgressActivity extends BaseActivity {
    @Override
    protected void initVariables() {

    }

    @Override
    protected void initViews() {
        setContentView(R.layout.activity_noramlprogress);
        SingleInstanceF instance = SingleInstanceF.getInstance(this);
    }

    @Override
    protected void loadData() {

    }
}
