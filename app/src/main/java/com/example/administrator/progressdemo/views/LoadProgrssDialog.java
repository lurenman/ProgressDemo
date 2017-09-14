package com.example.administrator.progressdemo.views;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.progressdemo.R;

/**
 * 弹出提示框
 */
public class LoadProgrssDialog extends Dialog {

    private static LoadProgrssDialog m_progrssDialog;
    private static Context mContext;

    private LoadProgrssDialog(Context context, int theme) {

        super(context, theme);

    }

    public static LoadProgrssDialog createProgrssDialog(Context context) {
        mContext = context;
        m_progrssDialog = new LoadProgrssDialog(context, R.style.SF_pressDialogCustom);

//        m_progrssDialog.setCanceledOnTouchOutside(true);
//        m_progrssDialog.setCancelable(true);
        m_progrssDialog.setContentView(R.layout.custom_progress_dialog);

        m_progrssDialog.getWindow().getAttributes().gravity = Gravity.CENTER;

        return m_progrssDialog;

    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {

        if (null == m_progrssDialog)
            return;

        ImageView loadingImageView = (ImageView) m_progrssDialog.findViewById(R.id.iv_load);

        Animation operatingAnim = AnimationUtils.loadAnimation(mContext, R.anim.progrssdialog);
        LinearInterpolator lin = new LinearInterpolator();
        operatingAnim.setInterpolator(lin);
        loadingImageView.startAnimation(operatingAnim);

    }

    public LoadProgrssDialog setMessage(String msg) {

        TextView loadingTextView = (TextView) m_progrssDialog.findViewById(R.id.tv_describe);

        if (!TextUtils.isEmpty(msg))
            loadingTextView.setText(msg);
        else
            loadingTextView.setText("加载中...");

        return m_progrssDialog;

    }

}
