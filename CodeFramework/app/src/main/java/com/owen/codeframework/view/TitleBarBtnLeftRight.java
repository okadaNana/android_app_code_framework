package com.owen.codeframework.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.owen.codeframework.R;

/**
 * 有左右按钮的 TitleBar
 *
 * Created by Owen on 2015/11/3.
 */
public class TitleBarBtnLeftRight extends RelativeLayout {

    private ImageButton mIvBtnLeft;
    private ImageButton mIvBtnRight;
    private TextView mTvTitleText;

    private float mBtnLeftTextSize;
    private int mBtnLeftTextColor;
    private Drawable mBtnLeftBg;

    private float tvTitleTextSize;
    private int mTvTitleTextColor;
    private Drawable mTvTitleBg;

    private float mBtnRightTextSize;
    private int mBtnRightTextColor;
    private Drawable mBtnRightBg;

    public TitleBarBtnLeftRight(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.TitleBarBtnLeftRight);

        mBtnLeftTextSize = ta.getDimension(R.attr.btnLeftTextSize, 20f);
        mBtnLeftTextColor = ta.getColor(R.attr.btnLeftTextColor, context.getResources().getColor(android.R.color.black));
        mBtnLeftBg = ta.getDrawable(R.attr.btnLeftBackground);

        tvTitleTextSize = ta.getDimension(R.attr.tvTitleTextSize, 20f);
        mTvTitleTextColor = ta.getColor(R.attr.tvTitleTextColor, context.getResources().getColor(android.R.color.black));
        mTvTitleBg = ta.getDrawable(R.attr.tvTitleBackground);

        mBtnRightTextSize = ta.getDimension(R.attr.btnRightTextSize, 20f);
        mBtnRightTextColor = ta.getColor(R.attr.btnRightTextColor, context.getResources().getColor(android.R.color.black));
        mBtnRightBg = ta.getDrawable(R.attr.btnRightBackground);

        ta.recycle();

        mIvBtnLeft = new ImageButton(context);
        mIvBtnLeft.setImageDrawable(mBtnLeftBg);

        // TODO: 2015/11/3 待完成
    }

    public interface OnTitleBarClickListener {
        void onBtnLeftOnClick(View view);
        void onBtnRightOnClick(View view);
    }

}
