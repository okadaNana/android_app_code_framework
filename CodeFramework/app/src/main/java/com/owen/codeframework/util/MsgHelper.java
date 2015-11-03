package com.owen.codeframework.util;

import android.app.Activity;
import android.view.Gravity;

import com.devspark.appmsg.AppMsg;

/**
 * 弹出信息提示工具类
 *
 * Created by Owen on 2015/11/3.
 */
public class MsgHelper {

    public static void showInfo(Activity context, String msg) {
       AppMsg.makeText(context, msg, AppMsg.STYLE_INFO).show();
    }

    public static void showInfo(Activity context, int resId) {
        AppMsg.makeText(context, resId, AppMsg.STYLE_INFO).show();
    }

    public static void showBottomInfo(Activity context, String msg) {
        AppMsg.makeText(context, msg, AppMsg.STYLE_INFO).setLayoutGravity(Gravity.BOTTOM).show();
    }

    public static void showBottomInfo(Activity context, int redId) {
        AppMsg.makeText(context, redId, AppMsg.STYLE_INFO).setLayoutGravity(Gravity.BOTTOM).show();
    }

    public static void showAlert(Activity context, String msg) {
        AppMsg.makeText(context, msg, AppMsg.STYLE_ALERT).show();
    }

    public static void showAlert(Activity context, int resId) {
        AppMsg.makeText(context, resId, AppMsg.STYLE_ALERT).show();
    }

    public static void showBottomAlert(Activity context, String msg) {
        AppMsg.makeText(context, msg, AppMsg.STYLE_ALERT).setLayoutGravity(Gravity.BOTTOM).show();
    }

    public static void showBottomAlert(Activity context, int resId) {
        AppMsg.makeText(context, resId, AppMsg.STYLE_ALERT).setLayoutGravity(Gravity.BOTTOM).show();
    }

    public static void showConfirm(Activity context, String msg) {
        AppMsg.makeText(context, msg, AppMsg.STYLE_CONFIRM).show();
    }

    public static void showConfirm(Activity context, int resId) {
        AppMsg.makeText(context, resId, AppMsg.STYLE_CONFIRM).show();
    }

    public static void showBottomConfirm(Activity context, String msg) {
        AppMsg.makeText(context, msg, AppMsg.STYLE_CONFIRM).setLayoutGravity(Gravity.BOTTOM).show();
    }

    public static void showBottomConfirm(Activity context, int resId) {
        AppMsg.makeText(context, resId, AppMsg.STYLE_CONFIRM).setLayoutGravity(Gravity.BOTTOM).show();
    }

    public static void showMsg(Activity context, String msg, AppMsg.Style style) {
        AppMsg.makeText(context, msg, style).show();
    }

    public static void showMsg(Activity context, int resId, AppMsg.Style style) {
        AppMsg.makeText(context, resId, style).show();
    }

    public static void showMsg(Activity context, String msg, AppMsg.Style style, int gravity) {
        AppMsg.makeText(context, msg, style).setLayoutGravity(gravity).show();
    }

    public static void showMsg(Activity context, int resId, AppMsg.Style style, int gravity) {
        AppMsg.makeText(context, resId, style).setLayoutGravity(gravity).show();
    }

}
