package com.example.administrator.progressdemo.utils;

import android.content.Context;

import com.example.administrator.progressdemo.views.LoadProgrssDialog;

/**
 * Created by Administrator on 2017/9/13.
 */

public class LoadProgressUtil {
    private static LoadProgrssDialog m_customProgrssDialog;
    /**
     * 打开加载框
     */
    public static void showCustomProgrssDialog(String msg, Context mContext) {

        if (null == m_customProgrssDialog)
            m_customProgrssDialog = LoadProgrssDialog.createProgrssDialog(mContext);

        if (null != m_customProgrssDialog) {
            m_customProgrssDialog.setMessage(msg);
            m_customProgrssDialog.show();
            m_customProgrssDialog.setCancelable(true);
            m_customProgrssDialog.setCanceledOnTouchOutside(false);
        }
    }

    /**
     * 关闭加载框
     */
    public static void hideCustomProgressDialog() {

        if (null != m_customProgrssDialog) {
            m_customProgrssDialog.dismiss();
            m_customProgrssDialog = null;
        }

    }

}
