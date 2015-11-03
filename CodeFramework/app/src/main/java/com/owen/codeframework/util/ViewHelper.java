package com.owen.codeframework.util;

import android.view.View;

/**
 * View 帮助类
 *
 * Created by Owen on 2015/11/3.
 */
public class ViewHelper {

    /**
     * 设置View 是否显示
     *
     * @param view 需要设置的view对象
     * @param isGone 是否隐藏
     * @param <V> V
     * @return 当前view
     */
    public static <V extends View> V setGone(V view, boolean isGone) {
        if (view != null) {
            if (isGone) {
                if (View.GONE != view.getVisibility()) {
                    view.setVisibility(View.GONE);
                }
            } else {
                if (View.VISIBLE == view.getVisibility()) {
                    view.setVisibility(View.VISIBLE);
                }
            }
        }

        return view;
    }

    /**
     * 多个view设置隐藏或显示
     *
     * @param gone true 隐藏；false 显示
     * @param views 多个view对象
     */
    public static void setViewGone(boolean gone, View... views) {
        for (View view : views) {
            setGone(view, gone);
        }
    }

}
