package com.example.administrator.progressdemo;

import android.content.Context;

import com.example.administrator.progressdemo.utils.Logger;

/**
 * Created by Administrator on 2017/9/13.
 * 内存泄漏简单测试
 * http://www.jb51.net/article/92311.htm 这篇讲内存泄漏的不错
 */

public class SingleInstanceF {
    private SingleInstanceF() {

    }
    private static final String TAG = "SingleInstanceF";
    private static SingleInstanceF single;
    private Context context;

    private SingleInstanceF(Context context) {
        this.context = context;
        Logger.e(TAG, "1111111111");
    }

    public static SingleInstanceF getInstance(Context context) {
        if (single == null) {
            single = new SingleInstanceF(context);
            Logger.e(TAG, "222222222");
        }
        return single;
    }

    public static final class Holder {
        public static final SingleInstanceF INSTANCE = new SingleInstanceF();
    }

    public static SingleInstanceF getInstance2() {
        return Holder.INSTANCE;
    }
}
